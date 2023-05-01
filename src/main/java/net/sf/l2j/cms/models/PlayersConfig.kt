package net.sf.l2j.cms.models

import net.sf.l2j.Config

val playersConfigMap = mapOf(
    "ATTACK_FROM_MOUNTS" to Config::ATTACK_FROM_MOUNTS,
    "NO_GRADE_PENALTY" to Config::NO_GRADE_PENALTY,
    "EFFECT_CANCELING" to Config::EFFECT_CANCELING,
    "HP_REGEN_MULTIPLIER" to Config::HP_REGEN_MULTIPLIER,
    "MP_REGEN_MULTIPLIER" to Config::MP_REGEN_MULTIPLIER,
    "CP_REGEN_MULTIPLIER" to Config::CP_REGEN_MULTIPLIER,
    "PLAYER_SPAWN_PROTECTION" to Config::PLAYER_SPAWN_PROTECTION,
    "PLAYER_FAKEDEATH_UP_PROTECTION" to Config::PLAYER_FAKEDEATH_UP_PROTECTION,
    "RESPAWN_RESTORE_HP" to Config::RESPAWN_RESTORE_HP,
    "MAX_PVTSTORE_SLOTS_DWARF" to Config::MAX_PVTSTORE_SLOTS_DWARF,
    "MAX_PVTSTORE_SLOTS_OTHER" to Config::MAX_PVTSTORE_SLOTS_OTHER,
    "DEEPBLUE_DROP_RULES" to Config::DEEPBLUE_DROP_RULES,
    "ALT_GAME_DELEVEL" to Config::ALT_GAME_DELEVEL,
    "DEATH_PENALTY_CHANCE" to Config::DEATH_PENALTY_CHANCE,
    "INVENTORY_MAXIMUM_NO_DWARF" to Config::INVENTORY_MAXIMUM_NO_DWARF,
    "INVENTORY_MAXIMUM_DWARF" to Config::INVENTORY_MAXIMUM_DWARF,
    "INVENTORY_MAXIMUM_QUEST_ITEMS" to Config::INVENTORY_MAXIMUM_QUEST_ITEMS,
    "INVENTORY_MAXIMUM_PET" to Config::INVENTORY_MAXIMUM_PET,
    "MAX_ITEM_IN_PACKET" to Config::MAX_ITEM_IN_PACKET,
    "ALT_WEIGHT_LIMIT" to Config::ALT_WEIGHT_LIMIT,
    "WAREHOUSE_SLOTS_NO_DWARF" to Config::WAREHOUSE_SLOTS_NO_DWARF,
    "WAREHOUSE_SLOTS_DWARF" to Config::WAREHOUSE_SLOTS_DWARF,
    "WAREHOUSE_SLOTS_CLAN" to Config::WAREHOUSE_SLOTS_CLAN,
    "FREIGHT_SLOTS" to Config::FREIGHT_SLOTS,
    "ALT_GAME_FREIGHTS" to Config::ALT_GAME_FREIGHTS,
    "ALT_GAME_FREIGHT_PRICE" to Config::ALT_GAME_FREIGHT_PRICE,
    "ENCHANT_CHANCE_WEAPON_MAGIC" to Config::ENCHANT_CHANCE_WEAPON_MAGIC,
    "ENCHANT_CHANCE_WEAPON_MAGIC_15PLUS" to Config::ENCHANT_CHANCE_WEAPON_MAGIC_15PLUS,
    "ENCHANT_CHANCE_WEAPON_NONMAGIC" to Config::ENCHANT_CHANCE_WEAPON_NONMAGIC,
    "ENCHANT_CHANCE_WEAPON_NONMAGIC_15PLUS" to Config::ENCHANT_CHANCE_WEAPON_NONMAGIC_15PLUS,
    "ENCHANT_CHANCE_ARMOR" to Config::ENCHANT_CHANCE_ARMOR,
    "ENCHANT_MAX_WEAPON" to Config::ENCHANT_MAX_WEAPON,
    "ENCHANT_MAX_ARMOR" to Config::ENCHANT_MAX_ARMOR,
    "ENCHANT_SAFE_MAX" to Config::ENCHANT_SAFE_MAX,
    "ENCHANT_SAFE_MAX_FULL" to Config::ENCHANT_SAFE_MAX_FULL,
    "AUGMENTATION_NG_SKILL_CHANCE" to Config::AUGMENTATION_NG_SKILL_CHANCE,
    "AUGMENTATION_NG_GLOW_CHANCE" to Config::AUGMENTATION_NG_GLOW_CHANCE,
    "AUGMENTATION_MID_SKILL_CHANCE" to Config::AUGMENTATION_MID_SKILL_CHANCE,
    "AUGMENTATION_MID_SKILL_CHANCE" to Config.AUGMENTATION_MID_SKILL_CHANCE,
    "AUGMENTATION_MID_GLOW_CHANCE" to Config.AUGMENTATION_MID_GLOW_CHANCE,
    "AUGMENTATION_HIGH_SKILL_CHANCE" to Config.AUGMENTATION_HIGH_SKILL_CHANCE,
    "AUGMENTATION_HIGH_GLOW_CHANCE" to Config.AUGMENTATION_HIGH_GLOW_CHANCE,
    "AUGMENTATION_TOP_SKILL_CHANCE" to Config.AUGMENTATION_TOP_SKILL_CHANCE,
    "AUGMENTATION_TOP_GLOW_CHANCE" to Config.AUGMENTATION_TOP_GLOW_CHANCE,
    "AUGMENTATION_BASESTAT_CHANCE" to Config.AUGMENTATION_BASESTAT_CHANCE,
    "KARMA_PLAYER_CAN_BE_KILLED_IN_PZ" to Config.KARMA_PLAYER_CAN_BE_KILLED_IN_PZ,
    "KARMA_PLAYER_CAN_SHOP" to Config.KARMA_PLAYER_CAN_SHOP,
    "KARMA_PLAYER_CAN_USE_GK" to Config.KARMA_PLAYER_CAN_USE_GK,
    "KARMA_PLAYER_CAN_TELEPORT" to Config.KARMA_PLAYER_CAN_TELEPORT,
    "KARMA_PLAYER_CAN_TRADE" to Config.KARMA_PLAYER_CAN_TRADE,
    "KARMA_PLAYER_CAN_USE_WH" to Config.KARMA_PLAYER_CAN_USE_WH,
    "KARMA_DROP_GM" to Config.KARMA_DROP_GM,
    "KARMA_AWARD_PK_KILL" to Config.KARMA_AWARD_PK_KILL,
    "KARMA_PK_LIMIT" to Config.KARMA_PK_LIMIT,
    "KARMA_NONDROPPABLE_PET_ITEMS" to Config.KARMA_NONDROPPABLE_PET_ITEMS,
    "KARMA_NONDROPPABLE_ITEMS" to Config.KARMA_NONDROPPABLE_ITEMS,
    "KARMA_LIST_NONDROPPABLE_PET_ITEMS" to Config.KARMA_LIST_NONDROPPABLE_PET_ITEMS,
    "KARMA_LIST_NONDROPPABLE_ITEMS" to Config.KARMA_LIST_NONDROPPABLE_ITEMS,
    "PVP_NORMAL_TIME" to Config.PVP_NORMAL_TIME,
    "PVP_PVP_TIME" to Config.PVP_PVP_TIME,
    "PARTY_XP_CUTOFF_METHOD" to Config.PARTY_XP_CUTOFF_METHOD,
    "PARTY_XP_CUTOFF_LEVEL" to Config.PARTY_XP_CUTOFF_LEVEL,
    "PARTY_XP_CUTOFF_PERCENT" to Config.PARTY_XP_CUTOFF_PERCENT,
    "PARTY_RANGE" to Config.PARTY_RANGE,
    "DEFAULT_ACCESS_LEVEL" to Config.DEFAULT_ACCESS_LEVEL,
    "GM_HERO_AURA" to Config.GM_HERO_AURA,
    "GM_STARTUP_INVULNERABLE" to Config.GM_STARTUP_INVULNERABLE,
    "GM_STARTUP_INVISIBLE" to Config.GM_STARTUP_INVISIBLE,
    "GM_STARTUP_SILENCE" to Config.GM_STARTUP_SILENCE,
    "GM_STARTUP_AUTO_LIST" to Config.GM_STARTUP_AUTO_LIST,
    "PETITIONING_ALLOWED" to Config.PETITIONING_ALLOWED,
    "MAX_PETITIONS_PER_PLAYER" to Config.MAX_PETITIONS_PER_PLAYER,
    "MAX_PETITIONS_PENDING" to Config.MAX_PETITIONS_PENDING,
    "IS_CRAFTING_ENABLED" to Config.IS_CRAFTING_ENABLED,
    "DWARF_RECIPE_LIMIT" to Config.DWARF_RECIPE_LIMIT,
    "COMMON_RECIPE_LIMIT" to Config.COMMON_RECIPE_LIMIT,
    "ALT_BLACKSMITH_USE_RECIPES" to Config.ALT_BLACKSMITH_USE_RECIPES,
    "AUTO_LEARN_SKILLS" to Config.AUTO_LEARN_SKILLS,
    "MAGIC_FAILURES" to Config.MAGIC_FAILURES,
    "PERFECT_SHIELD_BLOCK_RATE" to Config.PERFECT_SHIELD_BLOCK_RATE,
    "LIFE_CRYSTAL_NEEDED" to Config.LIFE_CRYSTAL_NEEDED,
    "SP_BOOK_NEEDED" to Config.SP_BOOK_NEEDED,
    "ES_SP_BOOK_NEEDED" to Config.ES_SP_BOOK_NEEDED,
    "DIVINE_SP_BOOK_NEEDED" to Config.DIVINE_SP_BOOK_NEEDED,
    "SUBCLASS_WITHOUT_QUESTS" to Config.SUBCLASS_WITHOUT_QUESTS,
    "STORE_SKILL_COOLTIME" to Config.STORE_SKILL_COOLTIME,
    "MAX_BUFFS_AMOUNT" to Config.MAX_BUFFS_AMOUNT
)

data class PlayersConfig(
    val party: PartyConfig,
    val gmAdmin: GmAdminConfig,
    val petition: PetitionConfig,
    val crafting: CraftingConfig,
    val skillsClasses: SkillsClassesConfig,
    val buffs: BuffsConfig,
    val misc: MiscConfig,
    val inventory: InventoryConfig,
    val enchant: EnchantConfig,
    val augmentation: AugmentationConfig,
    val karmaPvP: KarmaPvPConfig
)

data class MiscConfig(
    var ATTACK_FROM_MOUNTS: Boolean = Config.ATTACK_FROM_MOUNTS,
    var NO_GRADE_PENALTY: Boolean = Config.NO_GRADE_PENALTY,
    var EFFECT_CANCELING: Boolean = Config.EFFECT_CANCELING,
    var HP_REGEN_MULTIPLIER: Double = Config.HP_REGEN_MULTIPLIER,
    var MP_REGEN_MULTIPLIER: Double = Config.MP_REGEN_MULTIPLIER,
    var CP_REGEN_MULTIPLIER: Double = Config.CP_REGEN_MULTIPLIER,
    var PLAYER_SPAWN_PROTECTION: Int = Config.PLAYER_SPAWN_PROTECTION,
    var PLAYER_FAKEDEATH_UP_PROTECTION: Int = Config.PLAYER_FAKEDEATH_UP_PROTECTION,
    var RESPAWN_RESTORE_HP: Double = Config.RESPAWN_RESTORE_HP,
    var MAX_PVTSTORE_SLOTS_DWARF: Int = Config.MAX_PVTSTORE_SLOTS_DWARF,
    var MAX_PVTSTORE_SLOTS_OTHER: Int = Config.MAX_PVTSTORE_SLOTS_OTHER,
    var DEEPBLUE_DROP_RULES: Boolean = Config.DEEPBLUE_DROP_RULES,
    var ALT_GAME_DELEVEL: Boolean = Config.ALT_GAME_DELEVEL,
    var DEATH_PENALTY_CHANCE: Int = Config.DEATH_PENALTY_CHANCE
)

data class InventoryConfig(
    var INVENTORY_MAXIMUM_NO_DWARF: Int = Config.INVENTORY_MAXIMUM_NO_DWARF,
    var INVENTORY_MAXIMUM_DWARF: Int = Config.INVENTORY_MAXIMUM_DWARF,
    var INVENTORY_MAXIMUM_QUEST_ITEMS: Int = Config.INVENTORY_MAXIMUM_QUEST_ITEMS,
    var INVENTORY_MAXIMUM_PET: Int = Config.INVENTORY_MAXIMUM_PET,
    var MAX_ITEM_IN_PACKET: Int = Config.MAX_ITEM_IN_PACKET,
    var ALT_WEIGHT_LIMIT: Double = Config.ALT_WEIGHT_LIMIT,
    var WAREHOUSE_SLOTS_NO_DWARF: Int = Config.WAREHOUSE_SLOTS_NO_DWARF,
    var WAREHOUSE_SLOTS_DWARF: Int = Config.WAREHOUSE_SLOTS_DWARF,
    var WAREHOUSE_SLOTS_CLAN: Int = Config.WAREHOUSE_SLOTS_CLAN,
    var FREIGHT_SLOTS: Int = Config.FREIGHT_SLOTS,
    var ALT_GAME_FREIGHTS: Boolean = Config.ALT_GAME_FREIGHTS,
    var ALT_GAME_FREIGHT_PRICE: Int = Config.ALT_GAME_FREIGHT_PRICE
)

data class EnchantConfig(
    var ENCHANT_CHANCE_WEAPON_MAGIC: Double = Config.ENCHANT_CHANCE_WEAPON_MAGIC,
    var ENCHANT_CHANCE_WEAPON_MAGIC_15PLUS: Double = Config.ENCHANT_CHANCE_WEAPON_MAGIC_15PLUS,
    var ENCHANT_CHANCE_WEAPON_NONMAGIC: Double = Config.ENCHANT_CHANCE_WEAPON_NONMAGIC,
    var ENCHANT_CHANCE_WEAPON_NONMAGIC_15PLUS: Double = Config.ENCHANT_CHANCE_WEAPON_NONMAGIC_15PLUS,
    var ENCHANT_CHANCE_ARMOR: Double = Config.ENCHANT_CHANCE_ARMOR,
    var ENCHANT_MAX_WEAPON: Int = Config.ENCHANT_MAX_WEAPON,
    var ENCHANT_MAX_ARMOR: Int = Config.ENCHANT_MAX_ARMOR,
    var ENCHANT_SAFE_MAX: Int = Config.ENCHANT_SAFE_MAX,
    var ENCHANT_SAFE_MAX_FULL: Int = Config.ENCHANT_SAFE_MAX_FULL
)

data class AugmentationConfig(
    var AUGMENTATION_NG_SKILL_CHANCE: Int = Config.AUGMENTATION_NG_SKILL_CHANCE,
    var AUGMENTATION_NG_GLOW_CHANCE: Int = Config.AUGMENTATION_NG_GLOW_CHANCE,
    var AUGMENTATION_MID_SKILL_CHANCE: Int = Config.AUGMENTATION_MID_SKILL_CHANCE,
    var AUGMENTATION_MID_GLOW_CHANCE: Int = Config.AUGMENTATION_MID_GLOW_CHANCE,
    var AUGMENTATION_HIGH_SKILL_CHANCE: Int = Config.AUGMENTATION_HIGH_SKILL_CHANCE,
    var AUGMENTATION_HIGH_GLOW_CHANCE: Int = Config.AUGMENTATION_HIGH_GLOW_CHANCE,
    var AUGMENTATION_TOP_SKILL_CHANCE: Int = Config.AUGMENTATION_TOP_SKILL_CHANCE,
    var AUGMENTATION_TOP_GLOW_CHANCE: Int = Config.AUGMENTATION_TOP_GLOW_CHANCE,
    var AUGMENTATION_BASESTAT_CHANCE: Int = Config.AUGMENTATION_BASESTAT_CHANCE
)

data class KarmaPvPConfig(
    var KARMA_PLAYER_CAN_BE_KILLED_IN_PZ: Boolean = Config.KARMA_PLAYER_CAN_BE_KILLED_IN_PZ,
    var KARMA_PLAYER_CAN_SHOP: Boolean = Config.KARMA_PLAYER_CAN_SHOP,
    var KARMA_PLAYER_CAN_USE_GK: Boolean = Config.KARMA_PLAYER_CAN_USE_GK,
    var KARMA_PLAYER_CAN_TELEPORT: Boolean = Config.KARMA_PLAYER_CAN_TELEPORT,
    var KARMA_PLAYER_CAN_TRADE: Boolean = Config.KARMA_PLAYER_CAN_TRADE,
    var KARMA_PLAYER_CAN_USE_WH: Boolean = Config.KARMA_PLAYER_CAN_USE_WH,
    var KARMA_DROP_GM: Boolean = Config.KARMA_DROP_GM,
    var KARMA_AWARD_PK_KILL: Boolean = Config.KARMA_AWARD_PK_KILL,
    var KARMA_PK_LIMIT: Int = Config.KARMA_PK_LIMIT,
    var KARMA_NONDROPPABLE_PET_ITEMS: String = Config.KARMA_NONDROPPABLE_PET_ITEMS,
    var KARMA_NONDROPPABLE_ITEMS: String = Config.KARMA_NONDROPPABLE_ITEMS,
    var KARMA_LIST_NONDROPPABLE_PET_ITEMS: IntArray = Config.KARMA_LIST_NONDROPPABLE_PET_ITEMS,
    var KARMA_LIST_NONDROPPABLE_ITEMS: IntArray = Config.KARMA_LIST_NONDROPPABLE_ITEMS,
    var PVP_NORMAL_TIME: Int = Config.PVP_NORMAL_TIME,
    var PVP_PVP_TIME: Int = Config.PVP_PVP_TIME
)

data class PartyConfig(
    val xpCutoffMethod: String = Config.PARTY_XP_CUTOFF_METHOD,
    val xpCutoffLevel: Int = Config.PARTY_XP_CUTOFF_LEVEL,
    val xpCutoffPercent: Double = Config.PARTY_XP_CUTOFF_PERCENT,
    val range: Int = Config.PARTY_RANGE
)

data class GmAdminConfig(
    val defaultAccessLevel: Int = Config.DEFAULT_ACCESS_LEVEL,
    val gmHeroAura: Boolean = Config.GM_HERO_AURA,
    val gmStartupInvulnerable: Boolean = Config.GM_STARTUP_INVULNERABLE,
    val gmStartupInvisible: Boolean = Config.GM_STARTUP_INVISIBLE,
    val gmStartupSilence: Boolean = Config.GM_STARTUP_SILENCE,
    val gmStartupAutoList: Boolean = Config.GM_STARTUP_AUTO_LIST
)

data class PetitionConfig(
    val petitioningAllowed: Boolean = Config.PETITIONING_ALLOWED,
    val maxPetitionsPerPlayer: Int = Config.MAX_PETITIONS_PER_PLAYER,
    val maxPetitionsPending: Int = Config.MAX_PETITIONS_PENDING
)

data class CraftingConfig(
    val isCraftingEnabled: Boolean = Config.IS_CRAFTING_ENABLED,
    val dwarfRecipeLimit: Int = Config.DWARF_RECIPE_LIMIT,
    val commonRecipeLimit: Int = Config.COMMON_RECIPE_LIMIT,
    val altBlacksmithUseRecipes: Boolean = Config.ALT_BLACKSMITH_USE_RECIPES
)

data class SkillsClassesConfig(
    val autoLearnSkills: Boolean = Config.AUTO_LEARN_SKILLS,
    val magicFailures: Boolean = Config.MAGIC_FAILURES,
    val perfectShieldBlockRate: Int = Config.PERFECT_SHIELD_BLOCK_RATE,
    val lifeCrystalNeeded: Boolean = Config.LIFE_CRYSTAL_NEEDED,
    val spBookNeeded: Boolean = Config.SP_BOOK_NEEDED,
    val esSpBookNeeded: Boolean = Config.ES_SP_BOOK_NEEDED,
    val divineSpBookNeeded: Boolean = Config.DIVINE_SP_BOOK_NEEDED,
    val subclassWithoutQuests: Boolean = Config.SUBCLASS_WITHOUT_QUESTS
)

data class BuffsConfig(
    val storeSkillCooltime: Boolean = Config.STORE_SKILL_COOLTIME,
    val maxBuffsAmount: Int = Config.MAX_BUFFS_AMOUNT
)

