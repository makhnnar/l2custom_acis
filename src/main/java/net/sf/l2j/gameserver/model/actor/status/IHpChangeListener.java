package net.sf.l2j.gameserver.model.actor.status;

import net.sf.l2j.gameserver.model.actor.Creature;

public interface IHpChangeListener {

    /**
     * Called when the HP of an actor changes.
     *
     * @param actor The actor whose HP has changed.
     * @param reducedHp The new HP value of the actor.
     */
    void onHpReduceChanged(Creature actor, double reducedHp);

}
