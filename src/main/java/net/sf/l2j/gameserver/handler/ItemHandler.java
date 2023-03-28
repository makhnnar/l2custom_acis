package net.sf.l2j.gameserver.handler;

import net.sf.l2j.gameserver.handler.itemhandlers.*;
import net.sf.l2j.gameserver.model.item.kind.EtcItem;

import java.util.HashMap;
import java.util.Map;

public class ItemHandler
{
	private final Map<Integer, IItemHandler> _entries = new HashMap<>();
	
	protected ItemHandler()
	{
		registerHandler(new BeastSoulShot());
		registerHandler(new BeastSpice());
		registerHandler(new BeastSpiritShot());
		registerHandler(new BlessedSpiritShot());
		registerHandler(new Book());
		registerHandler(new Calculator());
		registerHandler(new Elixir());
		registerHandler(new EnchantScrolls());
		registerHandler(new FishShots());
		registerHandler(new Harvester());
		registerHandler(new ItemSkills());
		registerHandler(new Keys());
		registerHandler(new Maps());
		registerHandler(new MercTicket());
		registerHandler(new PaganKeys());
		registerHandler(new PetFood());
		registerHandler(new Recipes());
		registerHandler(new RollingDice());
		registerHandler(new ScrollOfResurrection());
		registerHandler(new SeedHandler());
		registerHandler(new SevenSignsRecord());
		registerHandler(new SoulShots());
		registerHandler(new SpecialXMas());
		registerHandler(new SoulCrystals());
		registerHandler(new SpiritShot());
		registerHandler(new SummonItems());
	}
	
	private void registerHandler(IItemHandler handler)
	{
		_entries.put(handler.getClass().getSimpleName().intern().hashCode(), handler);
	}
	
	public IItemHandler getHandler(EtcItem item)
	{
		if (item == null || item.getHandlerName() == null)
			return null;
		
		return _entries.get(item.getHandlerName().hashCode());
	}
	
	public int size()
	{
		return _entries.size();
	}
	
	public static ItemHandler getInstance()
	{
		return SingletonHolder.INSTANCE;
	}
	
	private static class SingletonHolder
	{
		protected static final ItemHandler INSTANCE = new ItemHandler();
	}
}