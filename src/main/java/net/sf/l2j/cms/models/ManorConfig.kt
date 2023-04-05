package net.sf.l2j.cms.models

import net.sf.l2j.Config

data class ManorConfig(
    val ALT_MANOR_REFRESH_TIME: Int = Config.ALT_MANOR_REFRESH_TIME,
    val ALT_MANOR_REFRESH_MIN: Int = Config.ALT_MANOR_REFRESH_MIN,
    val ALT_MANOR_APPROVE_TIME: Int = Config.ALT_MANOR_APPROVE_TIME,
    val ALT_MANOR_APPROVE_MIN: Int = Config.ALT_MANOR_APPROVE_MIN,
    val ALT_MANOR_MAINTENANCE_MIN: Int = Config.ALT_MANOR_MAINTENANCE_MIN,
    val ALT_MANOR_SAVE_PERIOD_RATE: Int = Config.ALT_MANOR_SAVE_PERIOD_RATE
) {
    companion object {
        val map: Map<String, Any> by lazy {
            mapOf(
                "ALT_MANOR_REFRESH_TIME" to Config::ALT_MANOR_REFRESH_TIME,
                "ALT_MANOR_REFRESH_MIN" to Config::ALT_MANOR_REFRESH_MIN,
                "ALT_MANOR_APPROVE_TIME" to Config::ALT_MANOR_APPROVE_TIME,
                "ALT_MANOR_APPROVE_MIN" to Config::ALT_MANOR_APPROVE_MIN,
                "ALT_MANOR_MAINTENANCE_MIN" to Config::ALT_MANOR_MAINTENANCE_MIN,
                "ALT_MANOR_SAVE_PERIOD_RATE" to Config::ALT_MANOR_SAVE_PERIOD_RATE
            )
        }
    }
}





