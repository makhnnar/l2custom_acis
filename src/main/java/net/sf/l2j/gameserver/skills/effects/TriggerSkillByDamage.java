package net.sf.l2j.gameserver.skills.effects;


import net.sf.l2j.gameserver.enums.skills.EffectType;
import net.sf.l2j.gameserver.enums.skills.SkillTargetType;
import net.sf.l2j.gameserver.skills.AbstractEffect;
import net.sf.l2j.gameserver.skills.conditions.Condition;

public final class TriggerSkillByDamage extends AbstractEffect {
    private final int _minAttackerLevel;
    private final int _maxAttackerLevel;
    private final int _minDamage;
    private final int _chance;
    private final SkillHolder _skill;
    private final SkillTargetType _targetType;
    private final InstanceType _attackerType;

    public TriggerSkillByDamage(
            Condition attachCond,
            Condition applyCond,
            StatsSet set,
            StatsSet params
    ) {
        super(attachCond, applyCond, set, params);

        _minAttackerLevel = params.getInt("minAttackerLevel", 1);
        _maxAttackerLevel = params.getInt("maxAttackerLevel", 100);
        _minDamage = params.getInt("minDamage", 1);
        _chance = params.getInt("chance", 100);
        _skill = new SkillHolder(params.getInt("skillId"), params.getInt("skillLevel", 1));
        _targetType = params.getEnum("targetType", L2TargetType.class, L2TargetType.SELF);
        _attackerType = params.getEnum("attackerType", InstanceType.class, InstanceType.L2Character);
    }

    public void onDamageReceivedEvent(OnCreatureDamageReceived event) {
        if (event.isDamageOverTime() || (_chance == 0) || (_skill.getSkillLvl() == 0)) {
            return;
        }

        if (((_targetType == L2TargetType.SELF) && (_skill.getSkill().getCastRange() > 0)) && (Util.calculateDistance(event.getAttacker(), event.getTarget(), true, false) > _skill.getSkill().getCastRange())) {
            return;
        }

        final ITargetTypeHandler targetHandler = TargetHandler.getInstance().getHandler(_targetType);
        if (targetHandler == null) {
            _log.warning("Handler for target type: " + _targetType + " does not exist.");
            return;
        }

        if (event.getAttacker() == event.getTarget()) {
            return;
        }

        if ((event.getAttacker().getLevel() < _minAttackerLevel) || (event.getAttacker().getLevel() > _maxAttackerLevel)) {
            return;
        }

        if ((event.getDamage() < _minDamage) || (Rnd.get(100) > _chance) || !event.getAttacker().getInstanceType().isType(_attackerType)) {
            return;
        }

        final Skill triggerSkill = _skill.getSkill();
        final L2Object[] targets = targetHandler.getTargetList(triggerSkill, event.getTarget(), false, event.getAttacker());
        for (L2Object triggerTarget : targets) {
            if ((triggerTarget == null) || !triggerTarget.isCharacter()) {
                continue;
            }

            final L2Character targetChar = (L2Character) triggerTarget;
            if (!targetChar.isInvul()) {
                event.getTarget().makeTriggerCast(triggerSkill, targetChar);
            }
        }
    }

    @Override
    public void onExit(BuffInfo info) {
        info.getEffected().removeListenerIf(EventType.ON_CREATURE_DAMAGE_RECEIVED, listener -> listener.getOwner() == this);
    }

    @Override
    public void onStart(BuffInfo info) {
        info.getEffected().addListener(new ConsumerEventListener(info.getEffected(), EventType.ON_CREATURE_DAMAGE_RECEIVED, (OnCreatureDamageReceived event) -> onDamageReceivedEvent(event), this));
    }

    @Override
    public EffectType getEffectType() {
        return null;
    }

    @Override
    public boolean onActionTime() {
        return false;
    }
}