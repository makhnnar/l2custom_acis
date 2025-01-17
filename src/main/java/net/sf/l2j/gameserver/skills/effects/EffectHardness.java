package net.sf.l2j.gameserver.skills.effects;

import net.sf.l2j.gameserver.enums.skills.EffectType;
import net.sf.l2j.gameserver.model.actor.Creature;
import net.sf.l2j.gameserver.model.actor.Player;
import net.sf.l2j.gameserver.skills.AbstractEffect;
import net.sf.l2j.gameserver.skills.L2Skill;

import java.util.Objects;

/**
 * this skills will increase the damage that the effected gets while is moving it. If the user stops the movement won't take
 * any damage
 * **/
public class EffectHardness extends AbstractEffect {

    private boolean changStatus = false;
    private boolean checkAgain = false;

    public EffectHardness(EffectTemplate template, L2Skill skill, Creature effected, Creature effector) {
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

        if(Objects.equals(getTemplate().getPlayerState().toLowerCase(), "moving") && getEffected().isMoving()){
            checkAgain = true;
        }

        if(Objects.equals(getTemplate().getPlayerState().toLowerCase(), "moving") && checkAgain && !getEffected().isMoving()){
            changStatus = true;
            checkAgain = false;
        }

        if(changStatus){
            ((Player)getEffected()).updateAndBroadcastStatus(1);
            changStatus = false;
        }

        return true;
    }
}
