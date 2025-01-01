package net.sf.l2j.gameserver.skills.effects;

import net.sf.l2j.gameserver.enums.skills.EffectType;
import net.sf.l2j.gameserver.model.actor.Creature;
import net.sf.l2j.gameserver.skills.AbstractEffect;
import net.sf.l2j.gameserver.skills.L2Skill;

import java.util.Objects;

/**
 * this skills will increase the damage that the effected gets while is moving it. If the user stops the movement won't take
 * any damage
 * **/
public class EffectDamOverTimeIncreases extends AbstractEffect {

    private double damage = 0;

    public EffectDamOverTimeIncreases(EffectTemplate template, L2Skill skill, Creature effected, Creature effector) {
        super(template, skill, effected, effector);
    }

    @Override
    public EffectType getEffectType() {
        return EffectType.DMG_OVER_MOVE;
    }

    @Override
    public boolean onActionTime() {
        if (getEffected().isDead())
            return false;

        if(Objects.equals(getTemplate().getPlayerState().toLowerCase(), "moving") && !getEffected().isMoving())
            return true;

        if(Objects.equals(getTemplate().getPlayerState().toLowerCase(), "casting") && !getEffected().getCast().isCastingNow())
            return true;

        damage += getTemplate().getValue();

        if (damage >= getEffected().getStatus().getHp()) {
            // For DOT skills that will not kill effected player.
            if (!getSkill().killByDOT()) {
                // Fix for players dying by DOTs if HP < 1 since reduceCurrentHP method will kill them
                if (getEffected().getStatus().getHp() <= 1)
                    return true;

                damage = getEffected().getStatus().getHp() - 1;
            }
        }

        getEffected().reduceCurrentHpByDOT(damage, getEffector(), getSkill());

        return true;
    }
}
