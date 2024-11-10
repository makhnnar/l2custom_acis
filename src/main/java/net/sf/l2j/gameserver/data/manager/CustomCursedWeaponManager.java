package net.sf.l2j.gameserver.data.manager;

import net.sf.l2j.Config;
import net.sf.l2j.commons.data.StatSet;
import net.sf.l2j.commons.data.xml.IXmlReader;
import net.sf.l2j.gameserver.model.actor.Attackable;
import net.sf.l2j.gameserver.model.actor.Creature;
import net.sf.l2j.gameserver.model.actor.Player;
import net.sf.l2j.gameserver.model.entity.CustomCursedWeapon;
import net.sf.l2j.gameserver.model.item.instance.ItemInstance;
import org.w3c.dom.Document;

import java.nio.file.Path;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CustomCursedWeaponManager implements IXmlReader
{
    private final Map<Integer, CustomCursedWeapon> _cursedWeapons = new HashMap<>();

    public CustomCursedWeaponManager()
    {
        if (!Config.ALLOW_CURSED_WEAPONS)
        {
            LOGGER.info("Cursed weapons loading is skipped.");
            return;
        }
        load();
    }

    @Override
    public void load()
    {
        parseFile("./data/xml/customCursedWeapons.xml");
        LOGGER.info("Loaded {} custom cursed weapons.", _cursedWeapons.size());
    }

    @Override
    public void parseDocument(Document doc, Path path)
    {
        forEach(doc, "list", listNode -> forEach(listNode, "item", itemNode -> {
            final StatSet set = parseAttributes(itemNode);
            _cursedWeapons.put(set.getInteger("id"), new CustomCursedWeapon(set));
        }));
    }

    /**
     * End the life of existing {@link CustomCursedWeapon}s, clear the map, and reload content.
     */
    public void reload()
    {
        for (CustomCursedWeapon cw : _cursedWeapons.values())
            cw.endOfLife();

        _cursedWeapons.clear();

        load();
    }

    public boolean isCursed(int itemId)
    {
        return _cursedWeapons.containsKey(itemId);
    }

    public Collection<CustomCursedWeapon> getCursedWeapons()
    {
        return _cursedWeapons.values();
    }

    public Set<Integer> getCursedWeaponsIds()
    {
        return _cursedWeapons.keySet();
    }

    public CustomCursedWeapon getCursedWeapon(int itemId)
    {
        return _cursedWeapons.get(itemId);
    }

    /**
     * Check if a {@link CustomCursedWeapon} can drop, verifying if it is already active and if the killed {@link Attackable} is a valid candidate.
     * @param attackable : The {@link Attackable} to test.
     * @param player : The {@link Player} who killed the {@link Attackable}.
     */
    public synchronized void checkDrop(Attackable attackable, Player player)
    {
        if (attackable!=null && attackable.isChampion()){
            for (CustomCursedWeapon cw : _cursedWeapons.values()) {
                if (cw.isActive())
                    continue;

                if (cw.checkDrop(attackable, player))
                    break;
            }
        }

    }

    /**
     * Assimilate a {@link CustomCursedWeapon} if the {@link Player} set as parameter already possesses one (which ranks up possessed weapon), or activate it otherwise.
     * @param player : The {@link Player} to test.
     * @param item : The picked up {@link ItemInstance}.
     */
    public void activate(Player player, ItemInstance item)
    {
        final CustomCursedWeapon cw = _cursedWeapons.get(item.getItemId());
        if (cw == null)
            return;

        // Can't own 2 cursed swords ; ranks the existing one, and ends the life of the newly obtained cursed weapon.
        if (player.isCursedWeaponEquipped()) {
            // Ranks up the existing cursed weapon.
            _cursedWeapons.get(player.getCursedWeaponEquippedId()).rankUp();

            // Setup the player in order to drop the weapon from inventory.
            cw.setPlayer(player);

            // Erase the newly obtained cursed weapon.
            cw.endOfLife();
        }
        else{
            cw.activate(player, item);
        }
    }

    /**
     * Retrieve the {@link CustomCursedWeapon} based on its itemId and handle the drop process.
     * @param itemId : The cursed weapon itemId.
     * @param creature : The {@link Creature} who killed the {@link CustomCursedWeapon} holder.
     */
    public void drop(int itemId, Creature creature)
    {
        final CustomCursedWeapon cw = _cursedWeapons.get(itemId);
        if (cw == null)
            return;

        cw.dropIt(creature);
    }

    /**
     * Retrieve the {@link CustomCursedWeapon} based on its itemId and increase its kills.
     * @param itemId : The cursed weapon itemId.
     */
    public void increaseKills(int itemId)
    {
        final CustomCursedWeapon cw = _cursedWeapons.get(itemId);
        if (cw == null)
            return;

        cw.increaseKills();
    }

    public int getCurrentStage(int itemId)
    {
        final CustomCursedWeapon cw = _cursedWeapons.get(itemId);
        return (cw == null) ? 0 : cw.getCurrentStage();
    }

    /**
     * Check if the {@link Player} is equipped with a {@link CustomCursedWeapon} on EnterWorld.<br>
     * <br>
     * If so, we set the {@link Player} and item references on the {@link CustomCursedWeapon}, then we reward associated skills to that {@link Player}.
     * @param player : The {@link Player} to test.
     */
    public void checkPlayer(Player player)
    {
        if (player == null)
            return;

        for (CustomCursedWeapon cw : _cursedWeapons.values())
        {
            if (cw.isActivated() && player.getObjectId() == cw.getPlayerId())
            {
                cw.setPlayer(player);
                cw.setItem(player.getInventory().getItemByItemId(cw.getItemId()));
                cw.giveDemonicSkills();

                player.setCursedWeaponEquippedId(cw.getItemId());
                break;
            }
        }
    }

    public static final CustomCursedWeaponManager getInstance()
    {
        return CustomCursedWeaponManager.SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder
    {
        protected static final CustomCursedWeaponManager INSTANCE = new CustomCursedWeaponManager();
    }

}
