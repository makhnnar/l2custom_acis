package net.sf.l2j.gameserver.handler.targethandlers;

import net.sf.l2j.gameserver.enums.skills.SkillTargetType;
import net.sf.l2j.gameserver.enums.skills.SkillType;
import net.sf.l2j.gameserver.handler.ITargetHandler;
import net.sf.l2j.gameserver.model.actor.Creature;
import net.sf.l2j.gameserver.model.actor.Playable;
import net.sf.l2j.gameserver.model.actor.instance.Monster;
import net.sf.l2j.gameserver.model.actor.instance.Servitor;
import net.sf.l2j.gameserver.network.SystemMessageId;
import net.sf.l2j.gameserver.network.serverpackets.SystemMessage;
import net.sf.l2j.gameserver.skills.AbstractEffect;
import net.sf.l2j.gameserver.skills.L2Skill;
import net.sf.l2j.gameserver.skills.effects.EffectSlow;

import java.util.List;

public class TargetUndead implements ITargetHandler
{
	@Override
	public SkillTargetType getTargetType()
	{
		return SkillTargetType.UNDEAD;
	}
	
	@Override
	public Creature[] getTargetList(Creature caster, Creature target, L2Skill skill)
	{
		return new Creature[]
		{
			target
		};
	}
	
	@Override
	public Creature getFinalTarget(Creature caster, Creature target, L2Skill skill)
	{
		return target;
	}
	
	@Override
	public boolean meetCastConditions(Playable caster, Creature target, L2Skill skill, boolean isCtrlPressed)
	{
		if ((!(target instanceof Monster) && !(target instanceof Servitor)) || target.isDead())
		{
			caster.sendPacket(SystemMessageId.INVALID_TARGET);
			return false;
		}
		
		/*if (!target.isUndead())
		{
			caster.sendPacket(SystemMessage.getSystemMessage(SystemMessageId.S1_CANNOT_BE_USED).addSkillName(skill));
			return false;
		}*/
		//add an slow effect to the target if the target is undead don't use the effects of the skill. Build a new effect instead
		if (target.isUndead()) {
			EffectSlow slow = new EffectSlow(
					skill.getEffectTemplates().get(0),
					skill,
					target,
					caster
			);
			target.addEffect(slow);
			target.updateAbnormalEffect();
		}

		return true;
	}
}