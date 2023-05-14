package net.sf.l2j.cms.models

import kotlinx.serialization.Serializable
import net.sf.l2j.Config

@Serializable
data class ClanConfig(
    val generalClanConfig: GeneralClanConfig = GeneralClanConfig(),
    val manorConfig: ManorConfig = ManorConfig()
)
@Serializable
data class GeneralClanConfig(
    val ALT_CLAN_JOIN_DAYS: Int = Config.ALT_CLAN_JOIN_DAYS,
    val ALT_CLAN_CREATE_DAYS: Int = Config.ALT_CLAN_CREATE_DAYS,
    val ALT_CLAN_DISSOLVE_DAYS: Int = Config.ALT_CLAN_DISSOLVE_DAYS,
    val ALT_ALLY_JOIN_DAYS_WHEN_LEAVED: Int = Config.ALT_ALLY_JOIN_DAYS_WHEN_LEAVED,
    val ALT_ALLY_JOIN_DAYS_WHEN_DISMISSED: Int = Config.ALT_ALLY_JOIN_DAYS_WHEN_DISMISSED,
    val ALT_ACCEPT_CLAN_DAYS_WHEN_DISMISSED: Int = Config.ALT_ACCEPT_CLAN_DAYS_WHEN_DISMISSED,
    val ALT_CREATE_ALLY_DAYS_WHEN_DISSOLVED: Int = Config.ALT_CREATE_ALLY_DAYS_WHEN_DISSOLVED,
    val ALT_MAX_NUM_OF_CLANS_IN_ALLY: Int = Config.ALT_MAX_NUM_OF_CLANS_IN_ALLY,
    val ALT_CLAN_MEMBERS_FOR_WAR: Int = Config.ALT_CLAN_MEMBERS_FOR_WAR,
    val ALT_CLAN_WAR_PENALTY_WHEN_ENDED: Int = Config.ALT_CLAN_WAR_PENALTY_WHEN_ENDED,
    val ALT_MEMBERS_CAN_WITHDRAW_FROM_CLANWH: Boolean = Config.ALT_MEMBERS_CAN_WITHDRAW_FROM_CLANWH
)
@Serializable
data class ManorConfig(
    val ALT_MANOR_REFRESH_TIME: Int = Config.ALT_MANOR_REFRESH_TIME,
    val ALT_MANOR_REFRESH_MIN: Int = Config.ALT_MANOR_REFRESH_MIN,
    val ALT_MANOR_APPROVE_TIME: Int = Config.ALT_MANOR_APPROVE_TIME,
    val ALT_MANOR_APPROVE_MIN: Int = Config.ALT_MANOR_APPROVE_MIN,
    val ALT_MANOR_MAINTENANCE_MIN: Int = Config.ALT_MANOR_MAINTENANCE_MIN,
    val ALT_MANOR_SAVE_PERIOD_RATE: Int = Config.ALT_MANOR_SAVE_PERIOD_RATE
)