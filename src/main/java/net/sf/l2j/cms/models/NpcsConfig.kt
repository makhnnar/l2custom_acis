package net.sf.l2j.cms.models

import net.sf.l2j.Config

data class ChampionSettings(
    var frequency: Int = Config.CHAMPION_FREQUENCY,
    var minLvl: Int = Config.CHAMP_MIN_LVL,
    var maxLvl: Int = Config.CHAMP_MAX_LVL,
    var hp: Int = Config.CHAMPION_HP,
    var rewards: Int = Config.CHAMPION_REWARDS,
    var adenasRewards: Int = Config.CHAMPION_ADENAS_REWARDS,
    var hpRegen: Double = Config.CHAMPION_HP_REGEN,
    var attack: Double = Config.CHAMPION_ATK,
    var speedAttack: Double = Config.CHAMPION_SPD_ATK,
    var reward: Int = Config.CHAMPION_REWARD,
    var rewardId: Int = Config.CHAMPION_REWARD_ID,
    var rewardQty: Int = Config.CHAMPION_REWARD_QTY
)

data class BufferSettings(
    var maxSchemes: Int = Config.BUFFER_MAX_SCHEMES,
    var staticBuffCost: Int = Config.BUFFER_STATIC_BUFF_COST
)

data class ClassMasterSettings(
    var allowClassMasters: Boolean = Config.ALLOW_CLASS_MASTERS,
    var bufferSettings: BufferSettings = BufferSettings(),
    var allowEntireTree: Boolean = Config.ALLOW_ENTIRE_TREE
)

data class WyvernManagerSettings(
    var allowUpgrader: Boolean = Config.WYVERN_ALLOW_UPGRADER,
    var requiredLevel: Int = Config.WYVERN_REQUIRED_LEVEL,
    var requiredCrystals: Int = Config.WYVERN_REQUIRED_CRYSTALS
)

data class RaidBossSettings(
    var hpRegenMultiplier: Double = Config.RAID_HP_REGEN_MULTIPLIER,
    var mpRegenMultiplier: Double = Config.RAID_MP_REGEN_MULTIPLIER,
    var defenceMultiplier: Double = Config.RAID_DEFENCE_MULTIPLIER,
    var minionRespawnTimer: Int = Config.RAID_MINION_RESPAWN_TIMER,
    var disableCurse: Boolean = Config.RAID_DISABLE_CURSE
)

data class GrandBossSettings(
    var spawnIntervalAQ: Int = Config.SPAWN_INTERVAL_AQ,
    var randomSpawnTimeAQ: Int = Config.RANDOM_SPAWN_TIME_AQ,
    var spawnIntervalAntharas: Int = Config.SPAWN_INTERVAL_ANTHARAS,
    var randomSpawnTimeAntharas: Int = Config.RANDOM_SPAWN_TIME_ANTHARAS,
    var waitTimeAntharas: Int = Config.WAIT_TIME_ANTHARAS,
    var spawnIntervalBaium: Int = Config.SPAWN_INTERVAL_BAIUM,
    var randomSpawnTimeBaium: Int = Config.RANDOM_SPAWN_TIME_BAIUM,
    var spawnIntervalCore: Int = Config.SPAWN_INTERVAL_CORE,
    var randomSpawnTimeCore: Int = Config.RANDOM_SPAWN_TIME_CORE,
    var spawnIntervalFrintezza: Int = Config.SPAWN_INTERVAL_FRINTEZZA,
    var randomSpawnTimeFrintezza: Int = Config.RANDOM_SPAWN_TIME_FRINTEZZA,
    var waitTimeFrintezza: Int = Config.WAIT_TIME_FRINTEZZA,
    var spawnIntervalOrfen: Int = Config.SPAWN_INTERVAL_ORFEN,
    var randomSpawnTimeOrfen: Int = Config.RANDOM_SPAWN_TIME_ORFEN,
    var spawnIntervalSailren: Int = Config.SPAWN_INTERVAL_SAILREN,
    var randomSpawnTimeSailren: Int = Config.RANDOM_SPAWN_TIME_SAILREN,
    var waitTimeSailren: Int = Config.WAIT_TIME_SAILREN,
    var spawnIntervalValakas: Int = Config.SPAWN_INTERVAL_VALAKAS,
    var randomSpawnTimeValakas: Int = Config.RANDOM_SPAWN_TIME_VALAKAS,
    var waitTimeValakas: Int = Config.WAIT_TIME_VALAKAS,
    var spawnIntervalZaken: Int = Config.SPAWN_INTERVAL_ZAKEN,
    var randomSpawnTimeZaken: Int = Config.RANDOM_SPAWN_TIME_ZAKEN
)

data class AISettings(
    var guardAttackAggroMob: Boolean = Config.GUARD_ATTACK_AGGRO_MOB,
    var maxDriftRange: Int = Config.MAX_DRIFT_RANGE,
    var minNPCAnimation: Int = Config.MIN_NPC_ANIMATION,
    var maxNPCAnimation: Int = Config.MIN_NPC_ANIMATION,
    var minMonsterAnimation: Int = Config.MIN_MONSTER_ANIMATION,
    var maxMonsterAnimation: Int = Config.MAX_MONSTER_ANIMATION
)

data class NpcsConfig(
    var championSettings: ChampionSettings = ChampionSettings(),
    var classMasterSettings: ClassMasterSettings = ClassMasterSettings(),
    var wyvernManagerSettings: WyvernManagerSettings = WyvernManagerSettings(),
    var raidBossSettings: RaidBossSettings = RaidBossSettings(),
    var grandBossSettings: GrandBossSettings = GrandBossSettings(),
    var aiSettings: AISettings = AISettings()
) {
    companion object {

        val configMap = mapOf(
            "CHAMPION_FREQUENCY" to Config::CHAMPION_FREQUENCY,
            "CHAMP_MIN_LVL" to Config::CHAMP_MIN_LVL,
            "CHAMP_MAX_LVL" to Config::CHAMP_MAX_LVL,
            "CHAMPION_HP" to Config::CHAMPION_HP,
            "CHAMPION_REWARDS" to Config::CHAMPION_REWARDS,
            "CHAMPION_ADENAS_REWARDS" to Config::CHAMPION_ADENAS_REWARDS,
            "CHAMPION_HP_REGEN" to Config::CHAMPION_HP_REGEN,
            "CHAMPION_ATK" to Config::CHAMPION_ATK,
            "CHAMPION_SPD_ATK" to Config::CHAMPION_SPD_ATK,
            "CHAMPION_REWARD" to Config::CHAMPION_REWARD,
            "CHAMPION_REWARD_ID" to Config::CHAMPION_REWARD_ID,
            "CHAMPION_REWARD_QTY" to Config::CHAMPION_REWARD_QTY,
            "BUFFER_MAX_SCHEMES" to Config::BUFFER_MAX_SCHEMES,
            "BUFFER_STATIC_BUFF_COST" to Config::BUFFER_STATIC_BUFF_COST,
            "ALLOW_CLASS_MASTERS" to Config::ALLOW_CLASS_MASTERS,
            "CLASS_MASTER_SETTINGS" to Config::CLASS_MASTER_SETTINGS,
            "ALLOW_ENTIRE_TREE" to Config::ALLOW_ENTIRE_TREE,
            "ANNOUNCE_MAMMON_SPAWN" to Config::ANNOUNCE_MAMMON_SPAWN,
            "ALT_MOB_AGRO_IN_PEACEZONE" to Config::ALT_MOB_AGRO_IN_PEACEZONE,
            "SHOW_NPC_LVL" to Config::SHOW_NPC_LVL,
            "SHOW_NPC_CREST" to Config::SHOW_NPC_CREST,
            "SHOW_SUMMON_CREST" to Config::SHOW_SUMMON_CREST,
            "WYVERN_ALLOW_UPGRADER" to Config::WYVERN_ALLOW_UPGRADER,
            "WYVERN_REQUIRED_LEVEL" to Config::WYVERN_REQUIRED_LEVEL,
            "WYVERN_REQUIRED_CRYSTALS" to Config::WYVERN_REQUIRED_CRYSTALS,
            "RAID_HP_REGEN_MULTIPLIER" to Config::RAID_HP_REGEN_MULTIPLIER,
            "RAID_MP_REGEN_MULTIPLIER" to Config::RAID_MP_REGEN_MULTIPLIER,
            "RAID_DEFENCE_MULTIPLIER" to Config::RAID_DEFENCE_MULTIPLIER,
            "RAID_MINION_RESPAWN_TIMER" to Config::RAID_MINION_RESPAWN_TIMER,
            "RAID_DISABLE_CURSE" to Config::RAID_DISABLE_CURSE,
            "SPAWN_INTERVAL_AQ" to Config::SPAWN_INTERVAL_AQ,
            "RANDOM_SPAWN_TIME_AQ" to Config::RANDOM_SPAWN_TIME_AQ,
            "SPAWN_INTERVAL_ANTHARAS" to Config::SPAWN_INTERVAL_ANTHARAS,
            "RANDOM_SPAWN_TIME_ANTHARAS" to Config::RANDOM_SPAWN_TIME_ANTHARAS,
            "WAIT_TIME_ANTHARAS" to Config::WAIT_TIME_ANTHARAS,
            "SPAWN_INTERVAL_BAIUM" to Config::SPAWN_INTERVAL_BAIUM,
            "RANDOM_SPAWN_TIME_BAIUM" to Config::RANDOM_SPAWN_TIME_BAIUM,
            "SPAWN_INTERVAL_CORE" to Config::SPAWN_INTERVAL_CORE,
            "RANDOM_SPAWN_TIME_CORE" to Config::RANDOM_SPAWN_TIME_CORE,
            "SPAWN_INTERVAL_FRINTEZZA" to Config::RANDOM_SPAWN_TIME_CORE,
            "spawnIntervalFrintezza" to Config::SPAWN_INTERVAL_FRINTEZZA,
            "randomSpawnTimeFrintezza" to Config::RANDOM_SPAWN_TIME_FRINTEZZA,
            "waitTimeFrintezza" to Config::WAIT_TIME_FRINTEZZA,
            "spawnIntervalOrfen" to Config::SPAWN_INTERVAL_ORFEN,
            "randomSpawnTimeOrfen" to Config::RANDOM_SPAWN_TIME_ORFEN,
            "spawnIntervalSailren" to Config::SPAWN_INTERVAL_SAILREN,
            "randomSpawnTimeSailren" to Config::RANDOM_SPAWN_TIME_SAILREN,
            "waitTimeSailren" to Config::WAIT_TIME_SAILREN,
            "spawnIntervalValakas" to Config::SPAWN_INTERVAL_VALAKAS,
            "randomSpawnTimeValakas" to Config::RANDOM_SPAWN_TIME_VALAKAS,
            "waitTimeValakas" to Config::WAIT_TIME_VALAKAS,
            "spawnIntervalZaken" to Config::SPAWN_INTERVAL_ZAKEN,
            "randomSpawnTimeZaken" to Config::RANDOM_SPAWN_TIME_ZAKEN,
            "guardAttackAggroMob" to Config::GUARD_ATTACK_AGGRO_MOB,
            "maxDriftRange" to Config::MAX_DRIFT_RANGE,
            "minNPCAnimation" to Config::MIN_NPC_ANIMATION,
            "maxNPCAnimation" to Config::MIN_NPC_ANIMATION,
            "minMonsterAnimation" to Config::MIN_MONSTER_ANIMATION,
            "maxMonsterAnimation" to Config::MAX_MONSTER_ANIMATION
        )

    }
}
