package net.sf.l2j.gameserver.network.serverpackets;

import net.sf.l2j.gameserver.enums.actors.HennaType;
import net.sf.l2j.gameserver.model.actor.Player;
import net.sf.l2j.gameserver.model.actor.player.HennaList;
import net.sf.l2j.gameserver.model.item.Henna;

import java.util.List;

public final class HennaInfo extends L2GameServerPacket
{
	private final HennaList _hennaList;
	
	public HennaInfo(Player player)
	{
		_hennaList = player.getHennaList();
	}
	
	@Override
	protected final void writeImpl()
	{
		writeC(0xe4);
		
		writeC(_hennaList.getStat(HennaType.INT));
		writeC(_hennaList.getStat(HennaType.STR));
		writeC(_hennaList.getStat(HennaType.CON));
		writeC(_hennaList.getStat(HennaType.MEN));
		writeC(_hennaList.getStat(HennaType.DEX));
		writeC(_hennaList.getStat(HennaType.WIT));
		
		writeD(_hennaList.getMaxSize());
		
		final List<Henna> hennas = _hennaList.getHennas();
		writeD(hennas.size());
		for (Henna h : hennas)
		{
			writeD(h.getSymbolId());
			writeD(_hennaList.canBeUsedBy(h) ? h.getSymbolId() : 0);
		}
	}
}