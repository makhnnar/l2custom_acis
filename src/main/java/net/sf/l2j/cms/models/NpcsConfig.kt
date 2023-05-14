package net.sf.l2j.cms.models

import kotlinx.serialization.Serializable
import net.sf.l2j.Config
@Serializable
data class NpcsConfig(
    var championSettings: ChampionSettings = ChampionSettings(),
    var classMasterSettings: ClassMasterSettings = ClassMasterSettings(),
    var wyvernManagerSettings: WyvernManagerSettings = WyvernManagerSettings(),
    var raidBossSettings: RaidBossSettings = RaidBossSettings(),
    var grandBossSettings: GrandBossSettings = GrandBossSettings(),
    var aiSettings: AISettings = AISettings()
)
@Serializable
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
@Serializable
data class BufferSettings(
    var maxSchemes: Int = Config.BUFFER_MAX_SCHEMES,
    var staticBuffCost: Int = Config.BUFFER_STATIC_BUFF_COST
)
@Serializable
data class ClassMasterSettings(
    var allowClassMasters: Boolean = Config.ALLOW_CLASS_MASTERS,
    var bufferSettings: BufferSettings = BufferSettings(),
    var allowEntireTree: Boolean = Config.ALLOW_ENTIRE_TREE
)
@Serializable
data class WyvernManagerSettings(
    var allowUpgrader: Boolean = Config.WYVERN_ALLOW_UPGRADER,
    var requiredLevel: Int = Config.WYVERN_REQUIRED_LEVEL,
    var requiredCrystals: Int = Config.WYVERN_REQUIRED_CRYSTALS
)
@Serializable
data class RaidBossSettings(
    var hpRegenMultiplier: Double = Config.RAID_HP_REGEN_MULTIPLIER,
    var mpRegenMultiplier: Double = Config.RAID_MP_REGEN_MULTIPLIER,
    var defenceMultiplier: Double = Config.RAID_DEFENCE_MULTIPLIER,
    var minionRespawnTimer: Int = Config.RAID_MINION_RESPAWN_TIMER,
    var disableCurse: Boolean = Config.RAID_DISABLE_CURSE
)
@Serializable
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
@Serializable
data class AISettings(
    var guardAttackAggroMob: Boolean = Config.GUARD_ATTACK_AGGRO_MOB,
    var maxDriftRange: Int = Config.MAX_DRIFT_RANGE,
    var minNPCAnimation: Int = Config.MIN_NPC_ANIMATION,
    var maxNPCAnimation: Int = Config.MAX_NPC_ANIMATION,
    var minMonsterAnimation: Int = Config.MIN_MONSTER_ANIMATION,
    var maxMonsterAnimation: Int = Config.MAX_MONSTER_ANIMATION
)

