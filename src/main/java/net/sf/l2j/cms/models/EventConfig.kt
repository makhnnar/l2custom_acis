package net.sf.l2j.cms.models

import kotlinx.serialization.Serializable
import net.sf.l2j.Config
import net.sf.l2j.gameserver.model.holder.IntIntHolder

@Serializable
data class EventConfig(
    val weddingConfig: WeddingConfig = WeddingConfig(),
    val loterryConfig: LoterryConfig = LoterryConfig(),
    val fishingConfig: FishingConfig = FishingConfig(),
    val fourSepulchersConfig: FourSepulchersConfig = FourSepulchersConfig(),
    val olympiadConfig: OlympiadConfig = OlympiadConfig(),
    val sevenSignsConfig: SevenSignsConfig = SevenSignsConfig(),
    val dimensionalRiftConfig: DimensionalRiftConfig = DimensionalRiftConfig()
)

@Serializable
data class WeddingConfig(
    var ALLOW_WEDDING: Boolean = Config.ALLOW_WEDDING,
    var WEDDING_PRICE: Int = Config.WEDDING_PRICE,
    var WEDDING_SAMESEX: Boolean = Config.WEDDING_SAMESEX,
    var WEDDING_FORMALWEAR: Boolean = Config.WEDDING_FORMALWEAR
)
@Serializable
data class LoterryConfig(
    var ALT_LOTTERY_PRIZE: Int = 0,
    /*var ALT_LOTTERY_PRIZE: Int = Config.ALT_LOTTERY_PRIZE,
    var ALT_LOTTERY_TICKET_PRICE: Int = Config.ALT_LOTTERY_TICKET_PRICE,
    var ALT_LOTTERY_5_NUMBER_RATE: Double = Config.ALT_LOTTERY_5_NUMBER_RATE,
    var ALT_LOTTERY_4_NUMBER_RATE: Double = Config.ALT_LOTTERY_4_NUMBER_RATE,
    var ALT_LOTTERY_3_NUMBER_RATE: Double = Config.ALT_LOTTERY_3_NUMBER_RATE,
    var ALT_LOTTERY_2_AND_1_NUMBER_PRIZE: Int = Config.ALT_LOTTERY_2_AND_1_NUMBER_PRIZE*/
)
@Serializable
data class FishingConfig(
    var ALT_FISH_CHAMPIONSHIP_ENABLED: Boolean = false,
    /*var ALT_FISH_CHAMPIONSHIP_ENABLED: Boolean = Config.ALT_FISH_CHAMPIONSHIP_ENABLED,
    var ALT_FISH_CHAMPIONSHIP_REWARD_ITEM: Int = Config.ALT_FISH_CHAMPIONSHIP_REWARD_ITEM,
    var ALT_FISH_CHAMPIONSHIP_REWARD_1: Int = Config.ALT_FISH_CHAMPIONSHIP_REWARD_1,
    var ALT_FISH_CHAMPIONSHIP_REWARD_2: Int = Config.ALT_FISH_CHAMPIONSHIP_REWARD_2,
    var ALT_FISH_CHAMPIONSHIP_REWARD_3: Int = Config.ALT_FISH_CHAMPIONSHIP_REWARD_3,
    var ALT_FISH_CHAMPIONSHIP_REWARD_4: Int = Config.ALT_FISH_CHAMPIONSHIP_REWARD_4,
    var ALT_FISH_CHAMPIONSHIP_REWARD_5: Int = Config.ALT_FISH_CHAMPIONSHIP_REWARD_5*/
)
@Serializable
data class FourSepulchersConfig(
    var FS_TIME_ENTRY: Int = Config.FS_TIME_ENTRY,
    var FS_TIME_END: Int = Config.FS_TIME_END,
    var FS_PARTY_MEMBER_COUNT: Int = Config.FS_PARTY_MEMBER_COUNT
)
@Serializable
data class OlympiadConfig(
    var altOlyStartTime: Int = 0,
    /*var altOlyStartTime: Int = Config.ALT_OLY_START_TIME,
    var altOlyMin: Int = Config.ALT_OLY_MIN,
    var altOlyCPeriod: Long = Config.ALT_OLY_CPERIOD,
    var altOlyBattle: Long = Config.ALT_OLY_BATTLE,
    var altOlyWPeriod: Long = Config.ALT_OLY_WPERIOD,
    var altOlyVPeriod: Long = Config.ALT_OLY_VPERIOD,
    var altOlyWaitTime: Int = Config.ALT_OLY_WAIT_TIME,
    var altOlyWaitBattle: Int = Config.ALT_OLY_WAIT_BATTLE,
    var altOlyWaitEnd: Int = Config.ALT_OLY_WAIT_END,
    var altOlyStartPoints: Int = Config.ALT_OLY_START_POINTS,
    var altOlyWeeklyPoints: Int = Config.ALT_OLY_WEEKLY_POINTS,
    var altOlyMinMatches: Int = Config.ALT_OLY_MIN_MATCHES,
    var altOlyClassed: Int = Config.ALT_OLY_CLASSED,
    var altOlyNonClassed: Int = Config.ALT_OLY_NONCLASSED,
    var altOlyClassedReward: List<RewardHolder>? = Config.ALT_OLY_CLASSED_REWARD?.map {
        it.intIntHolderToRewardHolder()
    },
    var altOlyNonClassedReward: List<RewardHolder>? = Config.ALT_OLY_NONCLASSED_REWARD?.map {
        it.intIntHolderToRewardHolder()
    },
    var altOlyGpPerPoint: Int = Config.ALT_OLY_GP_PER_POINT,
    var altOlyHeroPoints: Int = Config.ALT_OLY_HERO_POINTS,
    var altOlyRank1Points: Int = Config.ALT_OLY_RANK1_POINTS,
    var altOlyRank2Points: Int = Config.ALT_OLY_RANK2_POINTS,
    var altOlyRank3Points: Int = Config.ALT_OLY_RANK3_POINTS,
    var altOlyRank4Points: Int = Config.ALT_OLY_RANK4_POINTS,
    var altOlyRank5Points: Int = Config.ALT_OLY_RANK5_POINTS,
    var altOlyMaxPoints: Int = Config.ALT_OLY_MAX_POINTS,
    var altOlyDividerClassed: Int = Config.ALT_OLY_DIVIDER_CLASSED,
    var altOlyDividerNonClassed: Int = Config.ALT_OLY_DIVIDER_NON_CLASSED,
    var altOlyAnnounceGames: Boolean = Config.ALT_OLY_ANNOUNCE_GAMES*/
)
@Serializable
data class SevenSignsConfig(
    var ALT_GAME_CASTLE_DAWN: Boolean = false,
    /*var ALT_GAME_CASTLE_DAWN: Boolean = Config.ALT_GAME_CASTLE_DAWN,
    var ALT_GAME_CASTLE_DUSK: Boolean = Config.ALT_GAME_CASTLE_DUSK,
    var ALT_FESTIVAL_MIN_PLAYER: Int = Config.ALT_FESTIVAL_MIN_PLAYER,
    var ALT_MAXIMUM_PLAYER_CONTRIB: Int = Config.ALT_MAXIMUM_PLAYER_CONTRIB,
    var ALT_FESTIVAL_MANAGER_START: Long = Config.ALT_FESTIVAL_MANAGER_START,
    var ALT_FESTIVAL_LENGTH: Long = Config.ALT_FESTIVAL_LENGTH,
    var ALT_FESTIVAL_CYCLE_LENGTH: Long = Config.ALT_FESTIVAL_CYCLE_LENGTH,
    var ALT_FESTIVAL_FIRST_SPAWN: Long = Config.ALT_FESTIVAL_FIRST_SPAWN,
    var ALT_FESTIVAL_FIRST_SWARM: Long = Config.ALT_FESTIVAL_FIRST_SWARM,
    var ALT_FESTIVAL_SECOND_SPAWN: Long = Config.ALT_FESTIVAL_SECOND_SPAWN,
    var ALT_FESTIVAL_SECOND_SWARM: Long = Config.ALT_FESTIVAL_SECOND_SWARM,
    var ALT_FESTIVAL_CHEST_SPAWN: Long = Config.ALT_FESTIVAL_CHEST_SPAWN*/
)
@Serializable
data class DimensionalRiftConfig(
    var RIFT_MIN_PARTY_SIZE: Int = Config.RIFT_MIN_PARTY_SIZE,
    var RIFT_SPAWN_DELAY: Int = Config.RIFT_SPAWN_DELAY,
    var RIFT_MAX_JUMPS: Int = Config.RIFT_MAX_JUMPS,
    var RIFT_AUTO_JUMPS_TIME_MIN: Int = Config.RIFT_AUTO_JUMPS_TIME_MIN,
    var RIFT_AUTO_JUMPS_TIME_MAX: Int = Config.RIFT_AUTO_JUMPS_TIME_MAX,
    var RIFT_ENTER_COST_RECRUIT: Int = Config.RIFT_ENTER_COST_RECRUIT,
    var RIFT_ENTER_COST_SOLDIER: Int = Config.RIFT_ENTER_COST_SOLDIER,
    var RIFT_ENTER_COST_OFFICER: Int = Config.RIFT_ENTER_COST_OFFICER,
    var RIFT_ENTER_COST_CAPTAIN: Int = Config.RIFT_ENTER_COST_CAPTAIN,
    var RIFT_ENTER_COST_COMMANDER: Int = Config.RIFT_ENTER_COST_COMMANDER,
    var RIFT_ENTER_COST_HERO: Int = Config.RIFT_ENTER_COST_HERO,
    //var RIFT_BOSS_ROOM_TIME_MUTIPLY: Double = Config.RIFT_BOSS_ROOM_TIME_MUTIPLY
)

@Serializable
class RewardHolder(
    val id: Int = 0,
    val value:Int = 0
){
    fun rewardHolderToIntIntHolder(): IntIntHolder {
        return IntIntHolder(id, value)
    }
}

fun IntIntHolder.intIntHolderToRewardHolder(): RewardHolder {
    return RewardHolder(id, value)
}