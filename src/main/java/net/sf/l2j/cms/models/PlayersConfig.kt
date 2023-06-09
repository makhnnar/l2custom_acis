package net.sf.l2j.cms.models

import kotlinx.serialization.Serializable
import net.sf.l2j.Config
@Serializable
data class PlayersConfig(
    val party: PartyConfig = PartyConfig(),
    val gmAdmin: GmAdminConfig = GmAdminConfig(),
    val petition: PetitionConfig = PetitionConfig(),
    val crafting: CraftingConfig = CraftingConfig(),
    val skillsClasses: SkillsClassesConfig = SkillsClassesConfig(),
    val buffs: BuffsConfig = BuffsConfig(),
    val misc: MiscConfig = MiscConfig(),
    val inventory: InventoryConfig = InventoryConfig(),
    val enchant: EnchantConfig = EnchantConfig(),
    val augmentation: AugmentationConfig = AugmentationConfig(),
    val karmaPvP: KarmaPvPConfig = KarmaPvPConfig()
)
@Serializable
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
@Serializable
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
@Serializable
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
@Serializable
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
@Serializable
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
    var KARMA_NONDROPPABLE_PET_ITEMS: String? = Config.KARMA_NONDROPPABLE_PET_ITEMS,
    var KARMA_NONDROPPABLE_ITEMS: String? = Config.KARMA_NONDROPPABLE_ITEMS,
    var KARMA_LIST_NONDROPPABLE_PET_ITEMS: IntArray? = Config.KARMA_LIST_NONDROPPABLE_PET_ITEMS,
    var KARMA_LIST_NONDROPPABLE_ITEMS: IntArray? = Config.KARMA_LIST_NONDROPPABLE_ITEMS,
    var PVP_NORMAL_TIME: Int = Config.PVP_NORMAL_TIME,
    var PVP_PVP_TIME: Int = Config.PVP_PVP_TIME
)
@Serializable
data class PartyConfig(
    val PARTY_XP_CUTOFF_METHOD: String? = Config.PARTY_XP_CUTOFF_METHOD,
    val PARTY_XP_CUTOFF_LEVEL: Int = Config.PARTY_XP_CUTOFF_LEVEL,
    val PARTY_XP_CUTOFF_PERCENT: Double = Config.PARTY_XP_CUTOFF_PERCENT,
    val PARTY_RANGE: Int = Config.PARTY_RANGE
)
@Serializable
data class GmAdminConfig(
    val DEFAULT_ACCESS_LEVEL: Int = Config.DEFAULT_ACCESS_LEVEL,
    val GM_HERO_AURA: Boolean = Config.GM_HERO_AURA,
    val GM_STARTUP_INVULNERABLE: Boolean = Config.GM_STARTUP_INVULNERABLE,
    val GM_STARTUP_INVISIBLE: Boolean = Config.GM_STARTUP_INVISIBLE,
    val GM_STARTUP_SILENCE: Boolean = Config.GM_STARTUP_SILENCE,
    val GM_STARTUP_AUTO_LIST: Boolean = Config.GM_STARTUP_AUTO_LIST
)
@Serializable
data class PetitionConfig(
    val PETITIONING_ALLOWED: Boolean = Config.PETITIONING_ALLOWED,
    val MAX_PETITIONS_PER_PLAYER: Int = Config.MAX_PETITIONS_PER_PLAYER,
    val MAX_PETITIONS_PENDING: Int = Config.MAX_PETITIONS_PENDING
)
@Serializable
data class CraftingConfig(
    val IS_CRAFTING_ENABLED: Boolean = Config.IS_CRAFTING_ENABLED,
    val DWARF_RECIPE_LIMIT: Int = Config.DWARF_RECIPE_LIMIT,
    val COMMON_RECIPE_LIMIT: Int = Config.COMMON_RECIPE_LIMIT,
    val ALT_BLACKSMITH_USE_RECIPES: Boolean = Config.ALT_BLACKSMITH_USE_RECIPES
)
@Serializable
data class SkillsClassesConfig(
    val AUTO_LEARN_SKILLS: Boolean = Config.AUTO_LEARN_SKILLS,
    val MAGIC_FAILURES: Boolean = Config.MAGIC_FAILURES,
    val PERFECT_SHIELD_BLOCK_RATE: Int = Config.PERFECT_SHIELD_BLOCK_RATE,
    val LIFE_CRYSTAL_NEEDED: Boolean = Config.LIFE_CRYSTAL_NEEDED,
    val SP_BOOK_NEEDED: Boolean = Config.SP_BOOK_NEEDED,
    val ES_SP_BOOK_NEEDED: Boolean = Config.ES_SP_BOOK_NEEDED,
    val DIVINE_SP_BOOK_NEEDED: Boolean = Config.DIVINE_SP_BOOK_NEEDED,
    val SUBCLASS_WITHOUT_QUESTS: Boolean = Config.SUBCLASS_WITHOUT_QUESTS
)
@Serializable
data class BuffsConfig(
    val STORE_SKILL_COOLTIME: Boolean = Config.STORE_SKILL_COOLTIME,
    val MAX_BUFFS_AMOUNT: Int = Config.MAX_BUFFS_AMOUNT
)