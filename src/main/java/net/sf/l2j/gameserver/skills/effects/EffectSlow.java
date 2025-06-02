package net.sf.l2j.gameserver.skills.effects;

import net.sf.l2j.Config;
import net.sf.l2j.gameserver.enums.skills.EffectType;
import net.sf.l2j.gameserver.enums.skills.Stats;
import net.sf.l2j.gameserver.model.actor.Creature;
import net.sf.l2j.gameserver.skills.AbstractEffect;
import net.sf.l2j.gameserver.skills.L2Skill;
import net.sf.l2j.gameserver.skills.basefuncs.Func;

import java.util.*;

public class EffectSlow extends AbstractEffect
{
    public EffectSlow(
            EffectTemplate template,
            L2Skill skill,
            Creature effected,
            Creature effector
    ) {
        super(template, skill, effected, effector);
    }

    @Override
    public EffectType getEffectType() {
        return EffectType.DEBUFF;
    }

    @Override
    public boolean onActionTime() {
        Config.LOGGER.info("EffectSlow: onActionTime called for skill: " + getSkill().getName() + " on effected: " + getEffected().getName());
        if (getEffected().isDead()) {
            return false;
        }
        return true;
    }

    @Override
    public boolean onStart() {
        Config.LOGGER.info("EffectSlow: onStart called for skill: " + getSkill().getName() + " on effected: " + getEffected().getName() + " with value: " + getTemplate().getValue());
        //create an instance of the abstract class Func not using the static method
        if (getEffected().isDead()) {
            return false;
        }
        ArrayList<Func> funcs = new ArrayList<>();
        funcs.add(
            new Func(
                getEffected(),
                Stats.RUN_SPEED,
                10,
                getTemplate().getValue(),
                null
            ) {
                @Override
                public double calc(
                    Creature effector,
                    Creature effected,
                    L2Skill skill,
                    double base,
                    double value
                ) {
                    Config.LOGGER.info("EffectSlow: current runSpd: " + ((Creature)getFuncOwner()).getStatus().getBaseRunSpeed());
                    Config.LOGGER.info("EffectSlow: modified runSpd: " + ((Creature)getFuncOwner()).getStatus().getBaseRunSpeed() * getValue());
                    return ((Creature)getFuncOwner()).getStatus().getBaseRunSpeed() * getValue();
                }
            }
        );
        getEffected().addStatFuncs(funcs);
        return true;
    }

    @Override
    public void onExit() {
        Config.LOGGER.info("EffectSlow: onExit called for skill: " + getSkill().getName() + " on effected: " + getEffected().getName());
        // check what hapenb with this code section
        ArrayList<Func> funcs = new ArrayList<>();
        /*funcs.add(
                new Func(
                        getEffected(),
                        Stats.RUN_SPEED,
                        10,
                        getEffected().getStatus().getBaseRunSpeed() * (1/getTemplate().getValue()),
                        null
                ) {
                    @Override
                    public double calc(
                            Creature effector,
                            Creature effected,
                            L2Skill skill,
                            double base,
                            double value
                    ) {
                        return ((Creature)getFuncOwner()).getStatus().getRealMoveSpeed(false) * getValue();
                    }
                }
        );
        getEffected().addStatFuncs(funcs);*/
    }
}
