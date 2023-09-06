package net.sf.l2j.cms.models

import kotlinx.serialization.Serializable
import net.sf.l2j.Config

@Serializable
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

@Serializable
data class ConfigSieges(
    var siegeLength: Int = Config.SIEGE_LENGTH,
    var minimumClanLevel: Int = Config.MINIMUM_CLAN_LEVEL,
    var maxAttackersNumber: Int = Config.MAX_ATTACKERS_NUMBER,
    var maxDefendersNumber: Int = Config.MAX_DEFENDERS_NUMBER,
    var attackersRespawnDelay: Int = Config.ATTACKERS_RESPAWN_DELAY
)

@Serializable
data class ConfigClients(
    var deleteDays: Int = Config.DELETE_DAYS,
    var maximumOnlineUsers: Int = Config.MAXIMUM_ONLINE_USERS
)

@Serializable
data class ConfigAutoLoot(
    var autoLoot: Boolean = Config.AUTO_LOOT,
    var autoLootHerbs: Boolean = Config.AUTO_LOOT_HERBS,
    var autoLootRaid: Boolean = Config.AUTO_LOOT_RAID
)

@Serializable
data class ConfigItemsManagement(
    var allowDiscardItem: Boolean = Config.ALLOW_DISCARDITEM,
    var multipleItemDrop: Boolean = Config.MULTIPLE_ITEM_DROP,
    var herbAutoDestroyTime: Int = Config.HERB_AUTO_DESTROY_TIME,
    var itemAutoDestroyTime: Int = Config.ITEM_AUTO_DESTROY_TIME,
    var equipableItemAutoDestroyTime: Int = Config.EQUIPABLE_ITEM_AUTO_DESTROY_TIME,
    var specialItemDestroyTime: Map<Int, Int>? = Config.SPECIAL_ITEM_DESTROY_TIME,
    var playerDroppedItemMultiplier: Int = Config.PLAYER_DROPPED_ITEM_MULTIPLIER
)

@Serializable
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

@Serializable
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

@Serializable
data class ConfigLogs(
    var logChat: Boolean = Config.LOG_CHAT,
    var logItems: Boolean = Config.LOG_ITEMS,
    var gmAudit: Boolean = Config.GMAUDIT
)

@Serializable
data class ConfigCommunityBoard(
    var enableCommunityBoard: Boolean = Config.ENABLE_COMMUNITY_BOARD,
    var bbsDefault: String? = Config.BBS_DEFAULT
)

@Serializable
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

@Serializable
data class ConfigMisc(
    var l2WalkerProtection: Boolean = Config.L2WALKER_PROTECTION,
    var serverNews: Boolean = Config.SERVER_NEWS,
    var zoneTown: Int = Config.ZONE_TOWN,
    //var disableTutorial: Boolean = Config.DISABLE_TUTORIAL
)