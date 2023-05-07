package net.sf.l2j.cms.models

import net.sf.l2j.Config

val serverConfigMap = mapOf<String, Any>(
    "SIEGE_LENGTH" to Config.SIEGE_LENGTH,
    "MINIMUM_CLAN_LEVEL" to Config.MINIMUM_CLAN_LEVEL,
    "MAX_ATTACKERS_NUMBER" to Config.MAX_ATTACKERS_NUMBER,
    "MAX_DEFENDERS_NUMBER" to Config.MAX_DEFENDERS_NUMBER,
    "ATTACKERS_RESPAWN_DELAY" to Config.ATTACKERS_RESPAWN_DELAY,
    "DELETE_DAYS" to Config.DELETE_DAYS,
    "MAXIMUM_ONLINE_USERS" to Config.MAXIMUM_ONLINE_USERS,
    "AUTO_LOOT" to Config.AUTO_LOOT,
    "AUTO_LOOT_HERBS" to Config.AUTO_LOOT_HERBS,
    "AUTO_LOOT_RAID" to Config.AUTO_LOOT_RAID,
    "ALLOW_DISCARDITEM" to Config.ALLOW_DISCARDITEM,
    "MULTIPLE_ITEM_DROP" to Config.MULTIPLE_ITEM_DROP,
    "HERB_AUTO_DESTROY_TIME" to Config.HERB_AUTO_DESTROY_TIME,
    "ITEM_AUTO_DESTROY_TIME" to Config.ITEM_AUTO_DESTROY_TIME,
    "EQUIPABLE_ITEM_AUTO_DESTROY_TIME" to Config.EQUIPABLE_ITEM_AUTO_DESTROY_TIME,
    "SPECIAL_ITEM_DESTROY_TIME" to Config.SPECIAL_ITEM_DESTROY_TIME,
    "PLAYER_DROPPED_ITEM_MULTIPLIER" to Config.PLAYER_DROPPED_ITEM_MULTIPLIER,
    "RATE_XP" to Config.RATE_XP,
    "RATE_SP" to Config.RATE_SP,
    "RATE_PARTY_XP" to Config.RATE_PARTY_XP,
    "RATE_PARTY_SP" to Config.RATE_PARTY_SP,
    "RATE_DROP_ADENA" to Config.RATE_DROP_ADENA,
    "RATE_DROP_ITEMS" to Config.RATE_DROP_ITEMS,
    "RATE_DROP_ITEMS_BY_RAID" to Config.RATE_DROP_ITEMS_BY_RAID,
    "RATE_DROP_SPOIL" to Config.RATE_DROP_SPOIL,
    "RATE_DROP_MANOR" to Config.RATE_DROP_MANOR,
    "RATE_QUEST_DROP" to Config.RATE_QUEST_DROP,
    "RATE_QUEST_REWARD" to Config.RATE_QUEST_REWARD,
    "RATE_QUEST_REWARD_XP" to Config.RATE_QUEST_REWARD_XP,
    "RATE_QUEST_REWARD_SP" to Config.RATE_QUEST_REWARD_SP,
    "RATE_QUEST_REWARD_ADENA" to Config.RATE_QUEST_REWARD_ADENA,
    "RATE_KARMA_EXP_LOST" to Config.RATE_KARMA_EXP_LOST,
    "RATE_SIEGE_GUARDS_PRICE" to Config.RATE_SIEGE_GUARDS_PRICE,
    "PLAYER_DROP_LIMIT" to Config.PLAYER_DROP_LIMIT,
    "PLAYER_RATE_DROP" to Config.PLAYER_RATE_DROP,
    "PLAYER_RATE_DROP_ITEM" to Config.PLAYER_RATE_DROP_ITEM,
    "PLAYER_RATE_DROP_EQUIP" to Config.PLAYER_RATE_DROP_EQUIP,
    "PLAYER_RATE_DROP_EQUIP_WEAPON" to Config.PLAYER_RATE_DROP_EQUIP_WEAPON,
    "KARMA_DROP_LIMIT" to Config.KARMA_DROP_LIMIT,
    "KARMA_RATE_DROP" to Config.KARMA_RATE_DROP,
    "KARMA_RATE_DROP_ITEM" to Config.KARMA_RATE_DROP_ITEM,
    "KARMA_RATE_DROP_EQUIP" to Config.KARMA_RATE_DROP_EQUIP,
    "KARMA_RATE_DROP_EQUIP_WEAPON" to Config.KARMA_RATE_DROP_EQUIP_WEAPON,
    "PET_XP_RATE" to Config.PET_XP_RATE,
    "PET_FOOD_RATE" to Config.PET_FOOD_RATE,
    "SINEATER_XP_RATE" to Config.SINEATER_XP_RATE,
    "RATE_DROP_COMMON_HERBS" to Config.RATE_DROP_COMMON_HERBS,
    "RATE_DROP_HP_HERBS" to Config.RATE_DROP_HP_HERBS,
    "RATE_DROP_MP_HERBS" to Config.RATE_DROP_MP_HERBS,
    "RATE_DROP_SPECIAL_HERBS" to Config.RATE_DROP_SPECIAL_HERBS,
    "ALLOW_FREIGHT" to Config.ALLOW_FREIGHT,
    "ALLOW_WAREHOUSE" to Config.ALLOW_WAREHOUSE,
    "ALLOW_WEAR" to Config.ALLOW_WEAR,
    "WEAR_DELAY" to Config.WEAR_DELAY,
    "WEAR_PRICE" to Config.WEAR_PRICE,
    "ALLOW_LOTTERY" to Config.ALLOW_LOTTERY,
    "ALLOW_WATER" to Config.ALLOW_WATER,
    "ALLOW_BOAT" to Config.ALLOW_BOAT,
    "ALLOW_CURSED_WEAPONS" to Config.ALLOW_CURSED_WEAPONS,
    "ALLOW_MANOR" to Config.ALLOW_MANOR,
    "ENABLE_FALLING_DAMAGE" to Config.ENABLE_FALLING_DAMAGE,
    "LOG_CHAT" to Config.LOG_CHAT,
    "LOG_ITEMS" to Config.LOG_ITEMS,
    "GMAUDIT" to Config.GMAUDIT,
    "ENABLE_COMMUNITY_BOARD" to Config.ENABLE_COMMUNITY_BOARD,
    "BBS_DEFAULT" to Config.BBS_DEFAULT,
    "ROLL_DICE_TIME" to Config.ROLL_DICE_TIME,
    "HERO_VOICE_TIME" to Config.HERO_VOICE_TIME,
    "SUBCLASS_TIME" to Config.SUBCLASS_TIME,
    "DROP_ITEM_TIME" to Config.DROP_ITEM_TIME,
    "SERVER_BYPASS_TIME" to Config.SERVER_BYPASS_TIME,
    "MULTISELL_TIME" to Config.MULTISELL_TIME,
    "MANUFACTURE_TIME" to Config.MANUFACTURE_TIME,
    "MANOR_TIME" to Config.MANOR_TIME,
    "SENDMAIL_TIME" to Config.SENDMAIL_TIME,
    "CHARACTER_SELECT_TIME" to Config.CHARACTER_SELECT_TIME,
    "GLOBAL_CHAT_TIME" to Config.GLOBAL_CHAT_TIME,
    "TRADE_CHAT_TIME" to Config.TRADE_CHAT_TIME,
    "SOCIAL_TIME" to Config.SOCIAL_TIME,
    "L2WALKER_PROTECTION" to Config.L2WALKER_PROTECTION,
    "SERVER_NEWS" to Config.SERVER_NEWS,
    "ZONE_TOWN" to Config.ZONE_TOWN,
    "DISABLE_TUTORIAL" to Config.DISABLE_TUTORIAL
)

data class ServerConfig (
    var configSieges: ConfigSieges = ConfigSieges(),
    var configClients: ConfigClients = ConfigClients(),
    var configAutoLoot: ConfigAutoLoot = ConfigAutoLoot(),
    var configItemsManagement: ConfigItemsManagement = ConfigItemsManagement(),
    var configRateControl: ConfigRateControl = ConfigRateControl(),
    var configAllowTypes: ConfigAllowTypes = ConfigAllowTypes(),
    var configLogs: ConfigLogs = ConfigLogs(),
    var configCommunityBoard: ConfigCommunityBoard = ConfigCommunityBoard(),
    var configFloodProtectors: ConfigFloodProtectors = ConfigFloodProtectors(),
    var configMisc: ConfigMisc = ConfigMisc()
)

data class ConfigSieges(
    var siegeLength: Int = Config.SIEGE_LENGTH,
    var minimumClanLevel: Int = Config.MINIMUM_CLAN_LEVEL,
    var maxAttackersNumber: Int = Config.MAX_ATTACKERS_NUMBER,
    var maxDefendersNumber: Int = Config.MAX_DEFENDERS_NUMBER,
    var attackersRespawnDelay: Int = Config.ATTACKERS_RESPAWN_DELAY
)

data class ConfigClients(
    var deleteDays: Int = Config.DELETE_DAYS,
    var maximumOnlineUsers: Int = Config.MAXIMUM_ONLINE_USERS
)

data class ConfigAutoLoot(
    var autoLoot: Boolean = Config.AUTO_LOOT,
    var autoLootHerbs: Boolean = Config.AUTO_LOOT_HERBS,
    var autoLootRaid: Boolean = Config.AUTO_LOOT_RAID
)

data class ConfigItemsManagement(
    var allowDiscardItem: Boolean = Config.ALLOW_DISCARDITEM,
    var multipleItemDrop: Boolean = Config.MULTIPLE_ITEM_DROP,
    var herbAutoDestroyTime: Int = Config.HERB_AUTO_DESTROY_TIME,
    var itemAutoDestroyTime: Int = Config.ITEM_AUTO_DESTROY_TIME,
    var equipableItemAutoDestroyTime: Int = Config.EQUIPABLE_ITEM_AUTO_DESTROY_TIME,
    var specialItemDestroyTime: Map<Int, Int> = Config.SPECIAL_ITEM_DESTROY_TIME,
    var playerDroppedItemMultiplier: Int = Config.PLAYER_DROPPED_ITEM_MULTIPLIER
)

data class ConfigRateControl(
    var rateXp: Double = Config.RATE_XP,
    var rateSp: Double = Config.RATE_SP,
    var ratePartyXp: Double = Config.RATE_PARTY_XP,
    var ratePartySp: Double = Config.RATE_PARTY_SP,
    var rateDropAdena: Double = Config.RATE_DROP_ADENA,
    var rateDropItems: Double = Config.RATE_DROP_ITEMS,
    var rateDropItemsByRaid: Double = Config.RATE_DROP_ITEMS_BY_RAID,
    var rateDropSpoil: Double = Config.RATE_DROP_SPOIL,
    var rateDropManor: Int = Config.RATE_DROP_MANOR,
    var rateQuestDrop: Double = Config.RATE_QUEST_DROP,
    var rateQuestReward: Double = Config.RATE_QUEST_REWARD,
    var rateQuestRewardXp: Double = Config.RATE_QUEST_REWARD_XP,
    var rateQuestRewardSp: Double = Config.RATE_QUEST_REWARD_SP,
    var rateQuestRewardAdena: Double = Config.RATE_QUEST_REWARD_ADENA,
    var rateKarmaExpLost: Double = Config.RATE_KARMA_EXP_LOST,
    var rateSiegeGuardsPrice: Double = Config.RATE_SIEGE_GUARDS_PRICE,
    var playerDropLimit: Int = Config.PLAYER_DROP_LIMIT,
    var playerRateDrop: Int = Config.PLAYER_RATE_DROP,
    var playerRateDropItem: Int = Config.PLAYER_RATE_DROP_ITEM,
    var playerRateDropEquip: Int = Config.PLAYER_RATE_DROP_EQUIP,
    var playerRateDropEquipWeapon: Int = Config.PLAYER_RATE_DROP_EQUIP_WEAPON,
    var karmaDropLimit: Int = Config.KARMA_DROP_LIMIT,
    var karmaRateDrop: Int = Config.KARMA_RATE_DROP,
    var karmaRateDropItem: Int = Config.KARMA_RATE_DROP_ITEM,
    var karmaRateDropEquip: Int = Config.KARMA_RATE_DROP_EQUIP,
    var karmaRateDropEquipWeapon: Int = Config.KARMA_RATE_DROP_EQUIP_WEAPON,
    var petXpRate: Double = Config.PET_XP_RATE,
    var petFoodRate: Int = Config.PET_FOOD_RATE,
    var sinEaterXpRate: Double = Config.SINEATER_XP_RATE,
    var rateDropCommonHerbs: Double = Config.RATE_DROP_COMMON_HERBS,
    var rateDropHpHerbs: Double = Config.RATE_DROP_HP_HERBS,
    var rateDropMpHerbs: Double = Config.RATE_DROP_MP_HERBS,
    var rateDropSpecialHerbs: Double = Config.RATE_DROP_SPECIAL_HERBS
)

data class ConfigAllowTypes(
    var allowFreight: Boolean = Config.ALLOW_FREIGHT,
    var allowWarehouse: Boolean = Config.ALLOW_WAREHOUSE,
    var allowWear: Boolean = Config.ALLOW_WEAR,
    var wearDelay: Int = Config.WEAR_DELAY,
    var wearPrice: Int = Config.WEAR_PRICE,
    var allowLottery: Boolean = Config.ALLOW_LOTTERY,
    var allowWater: Boolean = Config.ALLOW_WATER,
    var allowBoat: Boolean = Config.ALLOW_BOAT,
    var allowCursedWeapons: Boolean = Config.ALLOW_CURSED_WEAPONS,
    var allowManor: Boolean = Config.ALLOW_MANOR,
    var enableFallingDamage: Boolean = Config.ENABLE_FALLING_DAMAGE
)

data class ConfigLogs(
    var logChat: Boolean = Config.LOG_CHAT,
    var logItems: Boolean = Config.LOG_ITEMS,
    var gmAudit: Boolean = Config.GMAUDIT
)

data class ConfigCommunityBoard(
    var enableCommunityBoard: Boolean = Config.ENABLE_COMMUNITY_BOARD,
    var bbsDefault: String = Config.BBS_DEFAULT
)

data class ConfigFloodProtectors(
    var rollDiceTime: Int = Config.ROLL_DICE_TIME,
    var heroVoiceTime: Int = Config.HERO_VOICE_TIME,
    var subclassTime: Int = Config.SUBCLASS_TIME,
    var dropItemTime: Int = Config.DROP_ITEM_TIME,
    var serverBypassTime: Int = Config.SERVER_BYPASS_TIME,
    var multisellTime: Int = Config.MULTISELL_TIME,
    var manufactureTime: Int = Config.MANUFACTURE_TIME,
    var manorTime: Int = Config.MANOR_TIME,
    var sendMailTime: Int = Config.SENDMAIL_TIME,
    var characterSelectTime: Int = Config.CHARACTER_SELECT_TIME,
    var globalChatTime: Int = Config.GLOBAL_CHAT_TIME,
    var tradeChatTime: Int = Config.TRADE_CHAT_TIME,
    var socialTime: Int = Config.SOCIAL_TIME
)

data class ConfigMisc(
    var l2WalkerProtection: Boolean = Config.L2WALKER_PROTECTION,
    var serverNews: Boolean = Config.SERVER_NEWS,
    var zoneTown: Int = Config.ZONE_TOWN,
    var disableTutorial: Boolean = Config.DISABLE_TUTORIAL
)