package net.sf.l2j.gameserver.model.skill;

public enum CommonSkill {

    SKILL_LUCKY(194),
    SKILL_EXPERTISE( 239),
    SKILL_SHADOW_SENSE(294),
    SKILL_CREATE_COMMON(1320),
    SKILL_CREATE_DWARVEN(172),
    SKILL_CRYSTALLIZE(248),
    SKILL_DIVINE_INSPIRATION(1405),
    SKILL_NPC_RACE(4416);

    public int id = 0;

    CommonSkill(int id){
        this.id = id;
    }

}
