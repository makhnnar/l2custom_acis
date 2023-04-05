package net.sf.l2j.cms.models

import net.sf.l2j.Config

data class WeddingConfig(
    // --------------------------------------------------
    // Events settings
    // --------------------------------------------------
    /** Wedding system */
    var ALLOW_WEDDING: Boolean = Config.ALLOW_WEDDING,
    var WEDDING_PRICE: Int = Config.WEDDING_PRICE,
    var WEDDING_SAMESEX: Boolean = Config.WEDDING_SAMESEX,
    var WEDDING_FORMALWEAR: Boolean = Config.WEDDING_FORMALWEAR
) {
    companion object {
        val FIELD_MAP = mapOf(
            "ALLOW_WEDDING" to Config::ALLOW_WEDDING,
            "WEDDING_PRICE" to Config::WEDDING_PRICE,
            "WEDDING_SAMESEX" to Config::WEDDING_SAMESEX,
            "WEDDING_FORMALWEAR" to Config::WEDDING_FORMALWEAR
        )
    }
}

data class LoterryConfig(
    // --------------------------------------------------
    // Events settings
    // --------------------------------------------------
    /** Lottery */
    var ALT_LOTTERY_PRIZE: Int = Config.ALT_LOTTERY_PRIZE,
    var ALT_LOTTERY_TICKET_PRICE: Int = Config.ALT_LOTTERY_TICKET_PRICE,
    var ALT_LOTTERY_5_NUMBER_RATE: Double = Config.ALT_LOTTERY_5_NUMBER_RATE,
    var ALT_LOTTERY_4_NUMBER_RATE: Double = Config.ALT_LOTTERY_4_NUMBER_RATE,
    var ALT_LOTTERY_3_NUMBER_RATE: Double = Config.ALT_LOTTERY_3_NUMBER_RATE,
    var ALT_LOTTERY_2_AND_1_NUMBER_PRIZE: Int = Config.ALT_LOTTERY_2_AND_1_NUMBER_PRIZE
) {
    companion object {
        val FIELD_MAP = mapOf(
            "ALT_LOTTERY_PRIZE" to Config::ALT_LOTTERY_PRIZE,
            "ALT_LOTTERY_TICKET_PRICE" to Config::ALT_LOTTERY_TICKET_PRICE,
            "ALT_LOTTERY_5_NUMBER_RATE" to Config::ALT_LOTTERY_5_NUMBER_RATE,
            "ALT_LOTTERY_4_NUMBER_RATE" to Config::ALT_LOTTERY_4_NUMBER_RATE,
            "ALT_LOTTERY_3_NUMBER_RATE" to Config::ALT_LOTTERY_3_NUMBER_RATE,
            "ALT_LOTTERY_2_AND_1_NUMBER_PRIZE" to Config::ALT_LOTTERY_2_AND_1_NUMBER_PRIZE
        )
    }
}

data class FishingConfig(
    // --------------------------------------------------
    // Events settings
    // --------------------------------------------------
    /** Fishing tournament */
    var ALT_FISH_CHAMPIONSHIP_ENABLED: Boolean = Config.ALT_FISH_CHAMPIONSHIP_ENABLED,
    var ALT_FISH_CHAMPIONSHIP_REWARD_ITEM: Int = Config.ALT_FISH_CHAMPIONSHIP_REWARD_ITEM,
    var ALT_FISH_CHAMPIONSHIP_REWARD_1: Int = Config.ALT_FISH_CHAMPIONSHIP_REWARD_1,
    var ALT_FISH_CHAMPIONSHIP_REWARD_2: Int = Config.ALT_FISH_CHAMPIONSHIP_REWARD_2,
    var ALT_FISH_CHAMPIONSHIP_REWARD_3: Int = Config.ALT_FISH_CHAMPIONSHIP_REWARD_3,
    var ALT_FISH_CHAMPIONSHIP_REWARD_4: Int = Config.ALT_FISH_CHAMPIONSHIP_REWARD_4,
    var ALT_FISH_CHAMPIONSHIP_REWARD_5: Int = Config.ALT_FISH_CHAMPIONSHIP_REWARD_5
) {
    companion object {
        val FIELD_MAP = mapOf(
            "ALT_FISH_CHAMPIONSHIP_ENABLED" to Config::ALT_FISH_CHAMPIONSHIP_ENABLED,
            "ALT_FISH_CHAMPIONSHIP_REWARD_ITEM" to Config::ALT_FISH_CHAMPIONSHIP_REWARD_ITEM,
            "ALT_FISH_CHAMPIONSHIP_REWARD_1" to Config::ALT_FISH_CHAMPIONSHIP_REWARD_1,
            "ALT_FISH_CHAMPIONSHIP_REWARD_2" to Config::ALT_FISH_CHAMPIONSHIP_REWARD_2,
            "ALT_FISH_CHAMPIONSHIP_REWARD_3" to Config::ALT_FISH_CHAMPIONSHIP_REWARD_3,
            "ALT_FISH_CHAMPIONSHIP_REWARD_4" to Config::ALT_FISH_CHAMPIONSHIP_REWARD_4,
            "ALT_FISH_CHAMPIONSHIP_REWARD_5" to Config::ALT_FISH_CHAMPIONSHIP_REWARD_5
        )
    }
}
