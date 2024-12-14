package net.sf.l2j.gameserver.skills.effects;

import net.sf.l2j.Config;
import net.sf.l2j.gameserver.enums.skills.EffectFlag;
import net.sf.l2j.gameserver.enums.skills.EffectType;
import net.sf.l2j.gameserver.model.actor.Creature;
import net.sf.l2j.gameserver.model.actor.Player;
import net.sf.l2j.gameserver.network.SystemMessageId;
import net.sf.l2j.gameserver.network.serverpackets.SystemMessage;
import net.sf.l2j.gameserver.skills.AbstractEffect;
import net.sf.l2j.gameserver.skills.L2Skill;

public class EffectBurningSilence extends AbstractEffect {

    public EffectBurningSilence(EffectTemplate template, L2Skill skill, Creature effected, Creature effector) {
        super(template, skill, effected, effector);
    }

    @Override
    public EffectType getEffectType() {
        return EffectType.BURNING_SILENCE;
    }

    @Override
    public boolean onStart() {
        // Abort cast.
        if(getEffected() instanceof Player) {
            Config.LOGGER.info("onStart Burning Silence");
        }
        getEffected().getCast().stop();

        // Refresh abnormal effects.
        getEffected().updateAbnormalEffect();

        return super.onStart();
    }

    @Override
    public boolean onActionTime()
    {
        if(getEffected() instanceof Player) {
            Config.LOGGER.info("onActionTime Burning Silence");
        }
        if (getEffected().isDead())
            return false;

        double damage = getTemplate().getValue();
        if (damage >= getEffected().getStatus().getHp())
        {
            if (getSkill().isToggle())
            {
                getEffected().sendPacket(SystemMessage.getSystemMessage(SystemMessageId.SKILL_REMOVED_DUE_LACK_HP));
                return false;
            }

            // For DOT skills that will not kill effected player.
            if (!getSkill().killByDOT())
            {
                // Fix for players dying by DOTs if HP < 1 since reduceCurrentHP method will kill them
                if (getEffected().getStatus().getHp() <= 1)
                    return true;

                damage = getEffected().getStatus().getHp() - 1;
            }
        }
        getEffected().reduceCurrentHpByDOT(damage, getEffector(), getSkill());

        return true;
    }

    @Override
    public void onExit() {
        // Refresh abnormal effects.
        getEffected().updateAbnormalEffect();
    }

    @Override
    public int getEffectFlags() {
        return EffectFlag.MUTED.getMask() | EffectFlag.PHYSICAL_MUTED.getMask();
    }
}