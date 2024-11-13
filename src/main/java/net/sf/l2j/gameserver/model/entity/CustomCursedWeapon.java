package net.sf.l2j.gameserver.model.entity;

import net.sf.l2j.commons.data.StatSet;
import net.sf.l2j.commons.logging.CLogger;
import net.sf.l2j.commons.pool.ConnectionPool;
import net.sf.l2j.commons.random.Rnd;
import net.sf.l2j.gameserver.data.SkillTable;
import net.sf.l2j.gameserver.enums.MessageType;
import net.sf.l2j.gameserver.model.World;
import net.sf.l2j.gameserver.model.actor.Attackable;
import net.sf.l2j.gameserver.model.actor.Creature;
import net.sf.l2j.gameserver.model.actor.Player;
import net.sf.l2j.gameserver.model.item.instance.ItemInstance;
import net.sf.l2j.gameserver.model.location.Location;
import net.sf.l2j.gameserver.network.SystemMessageId;
import net.sf.l2j.gameserver.network.serverpackets.*;
import net.sf.l2j.gameserver.skills.AbstractEffect;
import net.sf.l2j.gameserver.skills.L2Skill;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CustomCursedWeapon {

    protected static final CLogger LOGGER = new CLogger(CustomCursedWeapon.class.getName());

    private static final String LOAD_CW = "SELECT * FROM custom_cursed_weapons WHERE itemId=?";
    private static final String DELETE_ITEM = "DELETE FROM items WHERE owner_id=? AND item_id=?";
    private static final String UPDATE_PLAYER = "UPDATE characters SET karma=?, pkkills=? WHERE obj_id=?";
    private static final String INSERT_CW = "INSERT INTO custom_cursed_weapons (itemId, playerId, playerKarma, playerPkKills, nbKills, currentStage, numberBeforeNextStage) VALUES (?, ?, ?, ?, ?, ?, ?)";
    private static final String DELETE_CW = "DELETE FROM custom_cursed_weapons WHERE itemId = ?";

    private final String _name;

    protected final int _itemId;
    private ItemInstance _item = null;

    private int _playerId = 0;

    protected Player _player = null;

    // Skill id and max level. Max level is took from skillid (allow custom skills).
    private final int _skillId;
    private final int _skillMaxLevel;

    // Drop rate (when a mob is killed) and chance of dissapear (when a CW owner dies).
    private int _dropRate;
    private int _dissapearChance;

    // Basic number used to calculate next number of needed victims for a stage (50% to 150% the given value).
    private int _stageKills;

    private boolean _isDropped = false;
    private boolean _isActivated = false;

    private int _playerKarma = 0;
    private int _playerPkKills = 0;

    // Number of current killed, current stage of weapon (1 by default, max is _skillMaxLevel), and number of victims needed for next stage.
    protected int _nbKills = 0;
    protected int _currentStage = 1;
    protected int _numberBeforeNextStage = 0;


    public CustomCursedWeapon(StatSet set) {
        _name = set.getString("name");
        _itemId = set.getInteger("id");
        _skillId = set.getInteger("skillId");
        _dropRate = set.getInteger("dropRate");
        _dissapearChance = set.getInteger("dissapearChance");
        _stageKills = set.getInteger("stageKills");

        _skillMaxLevel = SkillTable.getInstance().getMaxLevel(_skillId);

        try (Connection con = ConnectionPool.getConnection()) {
            try (PreparedStatement ps = con.prepareStatement(LOAD_CW)) {
                ps.setInt(1, _itemId);

                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        _playerId = rs.getInt("playerId");
                        _playerKarma = rs.getInt("playerKarma");
                        _playerPkKills = rs.getInt("playerPkKills");
                        _nbKills = rs.getInt("nbKills");
                        _currentStage = rs.getInt("currentStage");
                        _numberBeforeNextStage = rs.getInt("numberBeforeNextStage");
                    }
                }
            }
        } catch (Exception e) {
            LOGGER.error("Couldn't restore cursed weapons data.", e);
        }
    }

    public void setPlayer(Player player)
    {
        _player = player;
    }

    public void setItem(ItemInstance item)
    {
        _item = item;
    }

    public boolean isActivated()
    {
        return _isActivated;
    }

    public boolean isDropped()
    {
        return _isDropped;
    }

    public String getName()
    {
        return _name;
    }

    public int getItemId()
    {
        return _itemId;
    }

    public int getSkillId()
    {
        return _skillId;
    }

    public int getPlayerId()
    {
        return _playerId;
    }

    public Player getPlayer()
    {
        return _player;
    }

    public int getPlayerKarma()
    {
        return _playerKarma;
    }

    public int getPlayerPkKills()
    {
        return _playerPkKills;
    }

    public int getNbKills()
    {
        return _nbKills;
    }

    public int getStageKills()
    {
        return _stageKills;
    }

    public boolean isActive()
    {
        return _isActivated || _isDropped;
    }

    public int getCurrentStage()
    {
        return _currentStage;
    }

    public int getNumberBeforeNextStage()
    {
        return _numberBeforeNextStage;
    }

    /**
     * This method is used to destroy a {@link CursedWeapon}.<br>
     * It manages following states :
     * <ul>
     * <li><u>item on a online player</u> : drops the cursed weapon from inventory, and set back ancient pk/karma values.</li>
     * <li><u>item on a offline player</u> : make SQL operations in order to drop item from database.</li>
     * <li><u>item on ground</u> : destroys the item directly.</li>
     * </ul>
     * For all cases, a message is broadcasted, and the different states are reinitialized.
     */
    public void endOfLife()
    {
        if (_isActivated) {
            // Player is online ; unequip weapon && destroy it.
            if (_player != null && _player.isOnline()) {
                LOGGER.info("{} is being removed online.", _name);

                _player.getAttack().stop();

                _player.setKarma(_playerKarma);
                _player.setPkKills(_playerPkKills);
                //_player.setCursedWeaponEquippedId(0);
                removeDemonicSkills();

                // Unequip && remove.
                _player.useEquippableItem(_item, true);
                _player.destroyItemByItemId("Destroy", _itemId, 1, _player, false);

                _player.broadcastUserInfo();

                _player.store();
            }
            // Player is offline ; make only SQL operations.
            else {
                LOGGER.info("{} is being removed offline.", _name);

                try (Connection con = ConnectionPool.getConnection())
                {
                    // Delete the item
                    try (PreparedStatement ps = con.prepareStatement(DELETE_ITEM))
                    {
                        ps.setInt(1, _playerId);
                        ps.setInt(2, _itemId);
                    }

                    // Restore the karma and PK kills.
                    try (PreparedStatement ps = con.prepareStatement(UPDATE_PLAYER))
                    {
                        ps.setInt(1, _playerKarma);
                        ps.setInt(2, _playerPkKills);
                        ps.setInt(3, _playerId);
                    }
                }
                catch (Exception e)
                {
                    LOGGER.error("Couldn't cleanup {} from offline player {}.", e, _name, _playerId);
                }
            }
        } else {
            // This CW is in the inventory of someone who has another cursed weapon equipped.
            if (_player != null && _player.getInventory().getItemByItemId(_itemId) != null) {
                _player.destroyItemByItemId("Destroy", _itemId, 1, _player, false);
                LOGGER.info("{} has been assimilated.", _name);
            }
            // This CW is on the ground.
            else if (_item != null)
            {
                _item.decayMe();
                LOGGER.info("{} has been removed from world.", _name);
            }
        }

        // Delete infos from table, if any.
        removeFromDb();

        // Inform all ppl.
        World.toAllOnlinePlayers(
                SystemMessage.getSystemMessage(SystemMessageId.S1_HAS_DISAPPEARED)
                        .addItemName(_itemId)
        );

        // Reset state.
        _player = null;
        _item = null;

        _isActivated = false;
        _isDropped = false;

        _nbKills = 0;
        _currentStage = 1;
        _numberBeforeNextStage = 0;

        _playerId = 0;
        _playerKarma = 0;
        _playerPkKills = 0;
    }

    /**
     * This method is used to drop the {@link CustomCursedWeapon} from its {@link Player} owner.<br>
     * It drops the item on ground, and reset player stats and skills. Finally it broadcasts a message to all online players.
     * @param killer : The creature who killed the cursed weapon owner.
     */
    private void dropFromPlayer(Creature killer)
    {
        _player.getAttack().stop();

        // Prevent item from being removed by ItemsAutoDestroy.
        _item.setDestroyProtected(true);
        _player.dropItem("DieDrop", _item, killer, true);

        _isActivated = false;
        _isDropped = true;

        _player.setKarma(_playerKarma);
        _player.setPkKills(_playerPkKills);
        //_player.setCursedWeaponEquippedId(0);
        removeDemonicSkills();

        // Reset current stage to 1.
        _currentStage = 1;

        // Drop infos from database.
        removeFromDb();

        // Broadcast a message to all online players.
        World.toAllOnlinePlayers(
                SystemMessage.getSystemMessage(SystemMessageId.S2_WAS_DROPPED_IN_THE_S1_REGION)
                        .addZoneName(_player.getPosition())
                        .addItemName(_itemId)
        );
    }

    /**
     * This method is used to drop the {@link CursedWeapon} from a {@link Attackable} monster.<br>
     * It drops the item on ground, and broadcast earthquake && red sky animations. Finally it broadcasts a message to all online players.
     * @param attackable : The monster who dropped the cursed weapon.
     * @param player : The player who killed the monster.
     */
    private void dropFromMob(Attackable attackable, Player player)
    {
        _isActivated = false;

        // Create item and drop it.
        _item = ItemInstance.create(_itemId, 1, player, attackable);
        _item.setDestroyProtected(true);
        _item.dropMe(attackable, 70);

        // RedSky and Earthquake
        World.toAllOnlinePlayers(new ExRedSky(10));
        World.toAllOnlinePlayers(new Earthquake(_item, 14, 3));

        _isDropped = true;

        // Broadcast a message to all online players.
        World.toAllOnlinePlayers(
                SystemMessage.getSystemMessage(SystemMessageId.S2_WAS_DROPPED_IN_THE_S1_REGION)
                        .addZoneName(player.getPosition())
                        .addItemName(_itemId)
        );
    }

    /**
     * Method used to send messages :<br>
     * <ul>
     * <li>one is broadcasted to warn players than {@link CursedWeapon} owner is online.</li>
     * <li>the other shows left timer for the cursed weapon owner (either in hours or minutes).</li>
     * </ul>
     */
    public void cursedOnLogin()
    {
        SystemMessage sm = SystemMessage.getSystemMessage(SystemMessageId.S2_OWNER_HAS_LOGGED_INTO_THE_S1_REGION);
        sm.addZoneName(_player.getPosition());
        //sm.addItemName(_player.getCursedWeaponEquippedId());
        World.toAllOnlinePlayers(sm);
        _player.sendPacket(sm);
    }

    /**
     * Rebind the passive skill belonging to the {@link CursedWeapon} owner. Invoke this method if the weapon owner switches to a subclass.
     */
    public void giveDemonicSkills()
    {
        final L2Skill skill = SkillTable.getInstance().getInfo(_skillId, _currentStage);
        if (skill != null) {
            _player.addSkill(skill, false);
            _player.sendSkillList();
        }
    }

    private void removeDemonicSkills() {
        _player.removeSkill(_skillId, false);
        _player.sendSkillList();
    }

    /**
     * Handles the drop rate of a {@link CustomCursedWeapon}. If successful, launches the different associated tasks (end, overall and drop timers).
     * @param attackable : The monster who drops the cursed weapon.
     * @param player : The player who killed the monster.
     * @return true if the drop rate is a success.
     */
    public boolean checkDrop(Attackable attackable, Player player) {
        if (Rnd.get(100) < _dropRate) {
            // Drop the item.
            dropFromMob(attackable, player);
            return true;
        }
        return false;
    }

    /**
     * Activate the {@link CustomCursedWeapon}. We refresh {@link Player} owner, store related infos, save references, activate cursed weapon skills, expell him from the party (if any).<br>
     * <br>
     * Finally it broadcasts a message to all online players.
     * @param player : The player who pickup the cursed weapon.
     * @param item : The item used as reference.
     */
    public void activate(Player player, ItemInstance item)
    {
        // If the Player is mounted, unmount him first.
        if (player.isMounted())
            player.dismount();

        _isActivated = true;

        // Hold player data.
        _player = player;
        _playerId = _player.getObjectId();
        _playerKarma = _player.getKarma();
        _playerPkKills = _player.getPkKills();

        _item = item;

        // Generate a random number for next stage.
        _numberBeforeNextStage = Rnd.get((int) Math.round(_stageKills * 0.5), (int) Math.round(_stageKills * 1.5));

        // Save data on database.
        try (Connection con = ConnectionPool.getConnection()) {
            try (PreparedStatement ps = con.prepareStatement(INSERT_CW))
            {
                ps.setInt(1, _itemId);
                ps.setInt(2, _playerId);
                ps.setInt(3, _playerKarma);
                ps.setInt(4, _playerPkKills);
                ps.setInt(5, _nbKills);
                ps.setInt(6, _currentStage);
                ps.setInt(7, _numberBeforeNextStage);
                ps.executeUpdate();
            }
        } catch (Exception e) {
            LOGGER.error("Failed to insert cursed weapon data.", e);
        }

        // Change player stats
        //_player.setCursedWeaponEquippedId(_itemId);
        _player.setKarma(9999999);
        _player.setPkKills(0);

        if (_player.isInParty())
            _player.getParty().removePartyMember(_player, MessageType.EXPELLED);

        // Disable active toggles
        for (AbstractEffect effect : _player.getAllEffects()) {
            if (effect.getSkill().isToggle())
                effect.exit();
        }

        // Add CW skills
        giveDemonicSkills();

        // Equip the weapon
        _player.useEquippableItem(_item, true);

        // Fully heal player
        _player.getStatus().setMaxCpHpMp();

        // Refresh player stats
        _player.broadcastUserInfo();

        World.toAllOnlinePlayers(
                SystemMessage.getSystemMessage(SystemMessageId.THE_OWNER_OF_S2_HAS_APPEARED_IN_THE_S1_REGION)
                        .addZoneName(_player.getPosition())
                        .addItemName(_item.getItemId())
        );
    }

    /**
     * Drop dynamic infos regarding {@link CursedWeapon} for the given itemId. Used in endOfLife() method.
     */
    private void removeFromDb()
    {
        try (Connection con = ConnectionPool.getConnection())
        {
            try (PreparedStatement ps = con.prepareStatement(DELETE_CW))
            {
                ps.setInt(1, _itemId);
                ps.executeUpdate();
            }
        }
        catch (Exception e)
        {
            LOGGER.error("Failed to remove cursed weapon data.", e);
        }
    }

    /**
     * This method checks if the {@link CursedWeapon} is dropped or simply dissapears.
     * @param killer : The killer of cursed weapon owner.
     */
    public void dropIt(Creature killer)
    {
        // Remove it
        if (Rnd.get(100) <= _dissapearChance)
            endOfLife();
            // Unequip & Drop
        else
            dropFromPlayer(killer);
    }

    /**
     * Increase the number of kills. If actual counter reaches the number generated to reach next stage, than rank up the {@link CursedWeapon}.
     */
    public void increaseKills()
    {
        if (_player != null && _player.isOnline())
        {
            _nbKills++;

            _player.setPkKills(_player.getPkKills() + 1);
            _player.sendPacket(new UserInfo(_player));

            // If current number of kills is >= to the given number, than rankUp the weapon.
            if (_nbKills >= _numberBeforeNextStage)
            {
                // Reset the number of kills to 0.
                _nbKills = 0;

                // Setup the new random number.
                _numberBeforeNextStage = Rnd.get((int) Math.round(_stageKills * 0.5), (int) Math.round(_stageKills * 1.5));

                // Rank up the CW.
                rankUp();
            }
        }
    }

    /**
     * This method is used to rank up a CW.
     */
    public void rankUp()
    {
        if (_currentStage >= _skillMaxLevel)
            return;

        // Rank up current stage.
        _currentStage++;

        // Reward skills for that CW.
        giveDemonicSkills();

        // Send level up animation.
        //_player.broadcastPacket(new SocialAction(_player, 17));
    }

    public void teleportTo(Player player)
    {
        if (player == null)
            return;

        // Go to player holding the weapon
        if (_isActivated)
            player.teleportTo(_player.getX(), _player.getY(), _player.getZ(), 0);
            // Go to item on the ground
        else if (_isDropped)
            player.teleportTo(_item.getX(), _item.getY(), _item.getZ(), 0);
        else
            player.sendMessage(_name + " isn't in the world.");
    }

    public Location getWorldPosition()
    {
        if (_isActivated && _player != null)
            return _player.getPosition();

        if (_isDropped && _item != null)
            return _item.getPosition();

        return null;
    }

}
