package net.sf.l2j.gameserver.skills.effects;


import net.sf.l2j.Config;
import net.sf.l2j.gameserver.enums.skills.EffectType;
import net.sf.l2j.gameserver.model.actor.Creature;
import net.sf.l2j.gameserver.model.actor.status.IHpChangeListener;
import net.sf.l2j.gameserver.skills.AbstractEffect;
import net.sf.l2j.gameserver.skills.L2Skill;

public final class EffectTriggerSkillByDamage extends AbstractEffect implements IHpChangeListener {

    public EffectTriggerSkillByDamage(
            EffectTemplate template,
            L2Skill skill,
            Creature effected,
            Creature effector
    ) {
        super(template, skill, effected, effector);
    }

    @Override
    public void onExit() {
        Config.LOGGER.info("onExit Trigger Skill by Damage: " + getSkill().getId() + " on actor: " + getEffected().getName());
        getEffected().getStatus().setHpChangeListener(null);
        super.onExit();
    }

    @Override
    public boolean onStart() {
        Config.LOGGER.info("onStart Trigger Skill by Damage: " + getSkill().getId() + " on actor: " + getEffected().getName());
        getEffected().getStatus().setHpChangeListener(this);
        return super.onStart();
    }

    @Override
    public EffectType getEffectType() {
        return EffectType.TRIGGER_SKILL_BY_DAMAGE;
    }

    @Override
    public boolean onActionTime() {
        if (getEffected().isDead())
            return false;
        Config.LOGGER.info("onActionTime Trigger Skill by Damage: " + getSkill().getId() + " on actor: " + getEffected().getName());
        getEffected().getAI().notifyEvent();
        return true;
    }

    @Override
    public void onHpReduceChanged(Creature actor, double reducedHp) {
        double multiplier = getTemplate().getValue();
        if(multiplier > 1){
            multiplier = 2;
        } else {
            multiplier += 1;
        }
        Config.LOGGER.info("Triggering skill by damage: " + getSkill().getId() + " on actor: " + actor.getName() + " with reduced HP: " + reducedHp);
        actor.getStatus().addHp(reducedHp * multiplier);
    }

}