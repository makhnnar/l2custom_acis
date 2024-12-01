package net.sf.l2j.gameserver.skills.l2skills;

import net.sf.l2j.commons.data.StatSet;
import net.sf.l2j.gameserver.enums.items.ShotType;
import net.sf.l2j.gameserver.enums.skills.EffectType;
import net.sf.l2j.gameserver.enums.skills.ShieldDefense;
import net.sf.l2j.gameserver.enums.skills.SkillTargetType;
import net.sf.l2j.gameserver.model.WorldObject;
import net.sf.l2j.gameserver.model.actor.Creature;
import net.sf.l2j.gameserver.model.actor.Player;
import net.sf.l2j.gameserver.network.SystemMessageId;
import net.sf.l2j.gameserver.network.serverpackets.SystemMessage;
import net.sf.l2j.gameserver.skills.AbstractEffect;
import net.sf.l2j.gameserver.skills.Formulas;
import net.sf.l2j.gameserver.skills.L2Skill;

public class L2SkillManaDrain extends L2Skill
{
    private final float _absorbPart;
    private final int _absorbAbs;

    public L2SkillManaDrain(StatSet set)
    {
        super(set);

        _absorbPart = set.getFloat("absorbPart", 0.f);
        _absorbAbs = set.getInteger("absorbAbs", 0);
    }

    @Override
    public void useSkill(Creature activeChar, WorldObject[] targets)
    {
        if (activeChar.isAlikeDead())
            return;

        final boolean sps = activeChar.isChargedShot(ShotType.SPIRITSHOT);
        final boolean bsps = activeChar.isChargedShot(ShotType.BLESSED_SPIRITSHOT);

        for (WorldObject obj : targets)
        {
            if (!(obj instanceof Creature))
                continue;

            final Creature target = ((Creature) obj);
            if (target.isAlikeDead() && getTargetType() != SkillTargetType.CORPSE_MOB)
                continue;

            if (activeChar != target && target.isInvul())
                continue; // No effect on invulnerable chars unless they cast it themselves.

            /*
            definition from the normal drain
            final boolean isCrit = Formulas.calcMCrit(activeChar, target, this);
            final ShieldDefense sDef = Formulas.calcShldUse(activeChar, target, this, false);
            final int damage = (int) Formulas.calcMagicDam(activeChar, target, this, sDef, sps, bsps, isCrit);
            */

            final ShieldDefense sDef = Formulas.calcShldUse(activeChar, target, this, false);
            final int damage = (int) Formulas.calcManaDam(activeChar, target, this, sps, bsps);

            if (damage > 0) {

                final int targetMp = (int) target.getStatus().getMp();

                int drainedMana = Math.min(damage, targetMp);

                activeChar.getStatus().addMp(_absorbAbs + _absorbPart * drainedMana);

                // That section is launched for drain skills made on ALIVE targets.
                if (!target.isDead() || getTargetType() != SkillTargetType.CORPSE_MOB) {
                    // Manage cast break of the target (calculating rate, sending message...)
                    Formulas.calcCastBreak(target, damage);

                    if (target instanceof Player)
                        target.sendPacket(SystemMessage.getSystemMessage(SystemMessageId.S2_MP_HAS_BEEN_DRAINED_BY_S1).addCharName(activeChar).addNumber((int) drainedMana));

                    if (activeChar instanceof Player)
                        activeChar.sendPacket(SystemMessage.getSystemMessage(SystemMessageId.YOUR_OPPONENTS_MP_WAS_REDUCED_BY_S1).addNumber((int) drainedMana));

                    target.stopEffects(EffectType.SLEEP);
                    target.stopEffects(EffectType.IMMOBILE_UNTIL_ATTACKED);

                    if (hasEffects() && getTargetType() != SkillTargetType.CORPSE_MOB) {
                        // ignoring vengance-like reflections
                        if ((Formulas.calcSkillReflect(target, this) & Formulas.SKILL_REFLECT_SUCCEED) > 0) {
                            activeChar.stopSkillEffects(getId());
                            getEffects(target, activeChar);
                        } else {
                            // activate attacked effects, if any
                            target.stopSkillEffects(getId());
                            if (Formulas.calcSkillSuccess(activeChar, target, this, sDef, bsps))
                                getEffects(activeChar, target);
                            else
                                activeChar.sendPacket(SystemMessage.getSystemMessage(SystemMessageId.S1_RESISTED_YOUR_S2).addCharName(target).addSkillName(getId()));
                        }
                    }
                    target.getStatus().reduceMp(drainedMana);
                }
            }
        }

        if (hasSelfEffects())
        {
            final AbstractEffect effect = activeChar.getFirstEffect(getId());
            if (effect != null && effect.isSelfEffect())
                effect.exit();

            getEffectsSelf(activeChar);
        }

        activeChar.setChargedShot(bsps ? ShotType.BLESSED_SPIRITSHOT : ShotType.SPIRITSHOT, isStaticReuse());
    }

    public float getAbsorbPart()
    {
        return _absorbPart;
    }

    public int getAbsorbAbs()
    {
        return _absorbAbs;
    }
}