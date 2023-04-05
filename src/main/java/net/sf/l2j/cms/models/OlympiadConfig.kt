package net.sf.l2j.cms.models

import net.sf.l2j.Config
import net.sf.l2j.gameserver.model.holder.IntIntHolder

data class OlympiadConfig(
    // Olympiad settings
    var altOlyStartTime: Int = Config.ALT_OLY_START_TIME,
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
    var altOlyClassedReward: Array<IntIntHolder> = Config.ALT_OLY_CLASSED_REWARD,
    var altOlyNonClassedReward: Array<IntIntHolder> = Config.ALT_OLY_NONCLASSED_REWARD,
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
    var altOlyAnnounceGames: Boolean = Config.ALT_OLY_ANNOUNCE_GAMES
) {
    companion object {
        // Map to access the reference of each singleton field using a string key
        val fieldMap = mapOf(
            "altOlyStartTime" to Config::ALT_OLY_START_TIME,
            "altOlyMin" to Config::ALT_OLY_MIN,
            "altOlyCPeriod" to Config::ALT_OLY_CPERIOD,
            "altOlyBattle" to Config::ALT_OLY_BATTLE,
            "altOlyWPeriod" to Config::ALT_OLY_WPERIOD,
            "altOlyVPeriod" to Config::ALT_OLY_VPERIOD,
            "altOlyWaitTime" to Config::ALT_OLY_WAIT_TIME,
            "altOlyWaitBattle" to Config.ALT_OLY_WAIT_BATTLE,
            "altOlyWaitEnd" to Config.ALT_OLY_WAIT_END,
            "altOlyStartPoints" to Config.ALT_OLY_START_POINTS,
            "altOlyWeeklyPoints" to Config.ALT_OLY_WEEKLY_POINTS,
            "altOlyMinMatches" to Config.ALT_OLY_MIN_MATCHES,
            "altOlyClassed" to Config.ALT_OLY_CLASSED,
            "altOlyNonClassed" to Config.ALT_OLY_NONCLASSED,
            "altOlyClassedReward" to Config.ALT_OLY_CLASSED_REWARD,
            "altOlyNonClassedReward" to Config.ALT_OLY_NONCLASSED_REWARD,
            "altOlyGpPerPoint" to Config.ALT_OLY_GP_PER_POINT,
            "altOlyHeroPoints" to Config.ALT_OLY_HERO_POINTS,
            "altOlyRank1Points" to Config.ALT_OLY_RANK1_POINTS,
            "altOlyRank2Points" to Config.ALT_OLY_RANK2_POINTS,
            "altOlyRank3Points" to Config.ALT_OLY_RANK3_POINTS,
            "altOlyRank4Points" to Config.ALT_OLY_RANK4_POINTS,
            "altOlyRank5Points" to Config.ALT_OLY_RANK5_POINTS,
            "altOlyMaxPoints" to Config.ALT_OLY_MAX_POINTS,
            "altOlyDividerClassed" to Config.ALT_OLY_DIVIDER_CLASSED,
            "altOlyDividerNonClassed" to Config.ALT_OLY_DIVIDER_NON_CLASSED,
            "altOlyAnnounceGames" to Config.ALT_OLY_ANNOUNCE_GAMES
        )
    }
}