package net.sf.l2j;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.StringTokenizer;

import net.sf.l2j.cms.models.*;
import net.sf.l2j.commons.config.ExProperties;
import net.sf.l2j.commons.logging.CLogger;
import net.sf.l2j.commons.math.MathUtil;

import net.sf.l2j.gameserver.enums.GeoType;
import net.sf.l2j.gameserver.model.holder.IntIntHolder;

/**
 * This class contains global server configuration.<br>
 * It has static final fields initialized from configuration files.
 */
public final class Config
{
	public static final CLogger LOGGER = new CLogger(Config.class.getName());
	
	public static final String CLANS_FILE = "./config/clans.properties";
	public static final String EVENTS_FILE = "./config/events.properties";
	public static final String GEOENGINE_FILE = "./config/geoengine.properties";
	public static final String HEXID_FILE = "./config/hexid.txt";
	public static final String LOGINSERVER_FILE = "./config/loginserver.properties";
	public static final String NPCS_FILE = "./config/npcs.properties";
	public static final String PLAYERS_FILE = "./config/players.properties";
	public static final String SERVER_FILE = "./config/server.properties";
	public static final String SIEGE_FILE = "./config/siege.properties";
	
	// --------------------------------------------------
	// Clans settings
	// --------------------------------------------------
	
	/** Clans */
	public static int CLAN_JOIN_DAYS;
	public static int CLAN_CREATE_DAYS;
	public static int CLAN_DISSOLVE_DAYS;
	public static int ALLY_JOIN_DAYS_WHEN_LEAVED;
	public static int ALLY_JOIN_DAYS_WHEN_DISMISSED;
	public static int ACCEPT_CLAN_DAYS_WHEN_DISMISSED;
	public static int CREATE_ALLY_DAYS_WHEN_DISSOLVED;
	public static int MAX_NUM_OF_CLANS_IN_ALLY;
	public static int CLAN_MEMBERS_FOR_WAR;
	public static int CLAN_WAR_PENALTY_WHEN_ENDED;
	public static boolean MEMBERS_CAN_WITHDRAW_FROM_CLANWH;
	
	/** Manor */
	public static int MANOR_REFRESH_TIME;
	public static int MANOR_REFRESH_MIN;
	public static int MANOR_APPROVE_TIME;
	public static int MANOR_APPROVE_MIN;
	public static int MANOR_MAINTENANCE_MIN;
	public static int MANOR_SAVE_PERIOD_RATE;
	
	/** Clan Hall function */
	public static long CH_TELE_FEE_RATIO;
	public static int CH_TELE1_FEE;
	public static int CH_TELE2_FEE;
	public static long CH_SUPPORT_FEE_RATIO;
	public static int CH_SUPPORT1_FEE;
	public static int CH_SUPPORT2_FEE;
	public static int CH_SUPPORT3_FEE;
	public static int CH_SUPPORT4_FEE;
	public static int CH_SUPPORT5_FEE;
	public static int CH_SUPPORT6_FEE;
	public static int CH_SUPPORT7_FEE;
	public static int CH_SUPPORT8_FEE;
	public static long CH_MPREG_FEE_RATIO;
	public static int CH_MPREG1_FEE;
	public static int CH_MPREG2_FEE;
	public static int CH_MPREG3_FEE;
	public static int CH_MPREG4_FEE;
	public static int CH_MPREG5_FEE;
	public static long CH_HPREG_FEE_RATIO;
	public static int CH_HPREG1_FEE;
	public static int CH_HPREG2_FEE;
	public static int CH_HPREG3_FEE;
	public static int CH_HPREG4_FEE;
	public static int CH_HPREG5_FEE;
	public static int CH_HPREG6_FEE;
	public static int CH_HPREG7_FEE;
	public static int CH_HPREG8_FEE;
	public static int CH_HPREG9_FEE;
	public static int CH_HPREG10_FEE;
	public static int CH_HPREG11_FEE;
	public static int CH_HPREG12_FEE;
	public static int CH_HPREG13_FEE;
	public static long CH_EXPREG_FEE_RATIO;
	public static int CH_EXPREG1_FEE;
	public static int CH_EXPREG2_FEE;
	public static int CH_EXPREG3_FEE;
	public static int CH_EXPREG4_FEE;
	public static int CH_EXPREG5_FEE;
	public static int CH_EXPREG6_FEE;
	public static int CH_EXPREG7_FEE;
	public static long CH_ITEM_FEE_RATIO;
	public static int CH_ITEM1_FEE;
	public static int CH_ITEM2_FEE;
	public static int CH_ITEM3_FEE;
	public static long CH_CURTAIN_FEE_RATIO;
	public static int CH_CURTAIN1_FEE;
	public static int CH_CURTAIN2_FEE;
	public static long CH_FRONT_FEE_RATIO;
	public static int CH_FRONT1_FEE;
	public static int CH_FRONT2_FEE;
	
	// --------------------------------------------------
	// Events settings
	// --------------------------------------------------
	
	/** Olympiad */
	public static int OLY_START_TIME;
	public static int OLY_MIN;
	public static long OLY_CPERIOD;
	public static long OLY_BATTLE;
	public static long OLY_WPERIOD;
	public static long OLY_VPERIOD;
	public static int OLY_WAIT_TIME;
	public static int OLY_WAIT_BATTLE;
	public static int OLY_WAIT_END;
	public static int OLY_START_POINTS;
	public static int OLY_WEEKLY_POINTS;
	public static int OLY_MIN_MATCHES;
	public static int OLY_CLASSED;
	public static int OLY_NONCLASSED;
	public static IntIntHolder[] OLY_CLASSED_REWARD;
	public static IntIntHolder[] OLY_NONCLASSED_REWARD;
	public static int OLY_GP_PER_POINT;
	public static int OLY_HERO_POINTS;
	public static int OLY_RANK1_POINTS;
	public static int OLY_RANK2_POINTS;
	public static int OLY_RANK3_POINTS;
	public static int OLY_RANK4_POINTS;
	public static int OLY_RANK5_POINTS;
	public static int OLY_MAX_POINTS;
	public static int OLY_DIVIDER_CLASSED;
	public static int OLY_DIVIDER_NON_CLASSED;
	public static boolean OLY_ANNOUNCE_GAMES;
	
	/** SevenSigns Festival */
	public static boolean SEVEN_SIGNS_BYPASS_PREREQUISITES;
	public static int FESTIVAL_MIN_PLAYER;
	public static int MAXIMUM_PLAYER_CONTRIB;
	public static long FESTIVAL_MANAGER_START;
	public static long FESTIVAL_LENGTH;
	public static long FESTIVAL_CYCLE_LENGTH;
	public static long FESTIVAL_FIRST_SPAWN;
	public static long FESTIVAL_FIRST_SWARM;
	public static long FESTIVAL_SECOND_SPAWN;
	public static long FESTIVAL_SECOND_SWARM;
	public static long FESTIVAL_CHEST_SPAWN;
	
	/** Four Sepulchers */
	public static int FS_TIME_ENTRY;
	public static int FS_TIME_END;
	public static int FS_PARTY_MEMBER_COUNT;
	
	/** dimensional rift */
	public static int RIFT_MIN_PARTY_SIZE;
	public static int RIFT_SPAWN_DELAY;
	public static int RIFT_MAX_JUMPS;
	public static int RIFT_AUTO_JUMPS_TIME_MIN;
	public static int RIFT_AUTO_JUMPS_TIME_MAX;
	public static int RIFT_ENTER_COST_RECRUIT;
	public static int RIFT_ENTER_COST_SOLDIER;
	public static int RIFT_ENTER_COST_OFFICER;
	public static int RIFT_ENTER_COST_CAPTAIN;
	public static int RIFT_ENTER_COST_COMMANDER;
	public static int RIFT_ENTER_COST_HERO;
	public static double RIFT_BOSS_ROOM_TIME_MULTIPLY;
	
	/** Wedding system */
	public static boolean ALLOW_WEDDING;
	public static int WEDDING_PRICE;
	public static boolean WEDDING_SAMESEX;
	public static boolean WEDDING_FORMALWEAR;
	
	/** Lottery */
	public static int LOTTERY_PRIZE;
	public static int LOTTERY_TICKET_PRICE;
	public static double LOTTERY_5_NUMBER_RATE;
	public static double LOTTERY_4_NUMBER_RATE;
	public static double LOTTERY_3_NUMBER_RATE;
	public static int LOTTERY_2_AND_1_NUMBER_PRIZE;
	
	/** Fishing tournament */
	public static boolean ALLOW_FISH_CHAMPIONSHIP;
	public static int FISH_CHAMPIONSHIP_REWARD_ITEM;
	public static int FISH_CHAMPIONSHIP_REWARD_1;
	public static int FISH_CHAMPIONSHIP_REWARD_2;
	public static int FISH_CHAMPIONSHIP_REWARD_3;
	public static int FISH_CHAMPIONSHIP_REWARD_4;
	public static int FISH_CHAMPIONSHIP_REWARD_5;
	
	// --------------------------------------------------
	// GeoEngine
	// --------------------------------------------------
	
	/** Geodata */
	public static String GEODATA_PATH;
	public static GeoType GEODATA_TYPE;
	
	/** Path checking */
	public static int PART_OF_CHARACTER_HEIGHT;
	public static int MAX_OBSTACLE_HEIGHT;
	
	/** Path finding */
	public static String PATHFIND_BUFFERS;
	public static int MOVE_WEIGHT;
	public static int MOVE_WEIGHT_DIAG;
	public static int OBSTACLE_WEIGHT;
	public static int OBSTACLE_WEIGHT_DIAG;
	public static int HEURISTIC_WEIGHT;
	public static int HEURISTIC_WEIGHT_DIAG;
	public static int MAX_ITERATIONS;
	
	// --------------------------------------------------
	// HexID
	// --------------------------------------------------
	
	public static int SERVER_ID;
	public static byte[] HEX_ID;
	
	// --------------------------------------------------
	// Loginserver
	// --------------------------------------------------
	
	public static String LOGINSERVER_HOSTNAME;
	public static int LOGINSERVER_PORT;
	
	public static int LOGIN_TRY_BEFORE_BAN;
	public static int LOGIN_BLOCK_AFTER_BAN;
	public static boolean ACCEPT_NEW_GAMESERVER;
	
	public static boolean SHOW_LICENCE;
	
	public static boolean AUTO_CREATE_ACCOUNTS;
	
	public static boolean FLOOD_PROTECTION;
	public static int FAST_CONNECTION_LIMIT;
	public static int NORMAL_CONNECTION_TIME;
	public static int FAST_CONNECTION_TIME;
	public static int MAX_CONNECTION_PER_IP;
	
	// --------------------------------------------------
	// NPCs / Monsters
	// --------------------------------------------------

	/** Champion Mod */
	public static int CHAMPION_FREQUENCY;
	public static int CHAMP_MIN_LVL;
	public static int CHAMP_MAX_LVL;
	public static int CHAMPION_HP;
	public static int CHAMPION_REWARDS;
	public static int CHAMPION_ADENAS_REWARDS;
	public static double CHAMPION_HP_REGEN;

	public static double CHAMPION_MP_REGEN;
	public static double CHAMPION_ATK;
	public static double CHAMPION_SPD_ATK;
	public static int CHAMPION_REWARD;
	public static int CHAMPION_REWARD_ID;
	public static int CHAMPION_REWARD_QTY;
	
	/** Buffer */
	public static int BUFFER_MAX_SCHEMES;
	public static int BUFFER_STATIC_BUFF_COST;
	
	/** Class Master */
	public static boolean ALLOW_CLASS_MASTERS;
	public static boolean ALLOW_ENTIRE_TREE;
	public static ClassMasterSettings CLASS_MASTER_SETTINGS;
	
	/** Misc */
	public static boolean FREE_TELEPORT;
	public static boolean ANNOUNCE_MAMMON_SPAWN;
	public static boolean MOB_AGGRO_IN_PEACEZONE;
	public static boolean SHOW_NPC_LVL;
	public static boolean SHOW_NPC_CREST;
	public static boolean SHOW_SUMMON_CREST;
	
	/** Wyvern Manager */
	public static boolean WYVERN_ALLOW_UPGRADER;
	public static int WYVERN_REQUIRED_LEVEL;
	public static int WYVERN_REQUIRED_CRYSTALS;
	
	/** Raid Boss */
	public static double RAID_HP_REGEN_MULTIPLIER;
	public static double RAID_MP_REGEN_MULTIPLIER;
	public static double RAID_DEFENCE_MULTIPLIER;
	public static int RAID_MINION_RESPAWN_TIMER;
	
	public static boolean RAID_DISABLE_CURSE;
	
	/** Grand Boss */
	public static int SPAWN_INTERVAL_AQ;
	public static int RANDOM_SPAWN_TIME_AQ;
	
	public static int SPAWN_INTERVAL_ANTHARAS;
	public static int RANDOM_SPAWN_TIME_ANTHARAS;
	public static int WAIT_TIME_ANTHARAS;
	
	public static int SPAWN_INTERVAL_BAIUM;
	public static int RANDOM_SPAWN_TIME_BAIUM;
	
	public static int SPAWN_INTERVAL_CORE;
	public static int RANDOM_SPAWN_TIME_CORE;
	
	public static int SPAWN_INTERVAL_FRINTEZZA;
	public static int RANDOM_SPAWN_TIME_FRINTEZZA;
	public static int WAIT_TIME_FRINTEZZA;
	
	public static int SPAWN_INTERVAL_ORFEN;
	public static int RANDOM_SPAWN_TIME_ORFEN;
	
	public static int SPAWN_INTERVAL_SAILREN;
	public static int RANDOM_SPAWN_TIME_SAILREN;
	public static int WAIT_TIME_SAILREN;
	
	public static int SPAWN_INTERVAL_VALAKAS;
	public static int RANDOM_SPAWN_TIME_VALAKAS;
	public static int WAIT_TIME_VALAKAS;
	
	public static int SPAWN_INTERVAL_ZAKEN;
	public static int RANDOM_SPAWN_TIME_ZAKEN;
	
	/** AI */
	public static boolean GUARD_ATTACK_AGGRO_MOB;
	public static int RANDOM_WALK_RATE;
	public static int MAX_DRIFT_RANGE;
	public static int MIN_NPC_ANIMATION;
	public static int MAX_NPC_ANIMATION;
	public static int MIN_MONSTER_ANIMATION;
	public static int MAX_MONSTER_ANIMATION;
	
	// --------------------------------------------------
	// Players
	// --------------------------------------------------

	/** Misc */
	public static boolean ATTACK_FROM_MOUNTS;

	public static boolean NO_GRADE_PENALTY;

	public static boolean NO_WEIGHT_PENALTY;

	public static boolean NO_PENALTIES_ON_DIFF_LVL_FOR_MOUNTS;

	public static boolean ALLOW_STACK_BUFFS_OF_SAME_EFFECT;

	public static int MAX_RUN_SPD;

	public static boolean EFFECT_CANCELING;
	public static double HP_REGEN_MULTIPLIER;
	public static double MP_REGEN_MULTIPLIER;
	public static double CP_REGEN_MULTIPLIER;
	public static int PLAYER_SPAWN_PROTECTION;
	public static int PLAYER_FAKEDEATH_UP_PROTECTION;
	public static double RESPAWN_RESTORE_HP;
	public static int MAX_PVTSTORE_SLOTS_DWARF;
	public static int MAX_PVTSTORE_SLOTS_OTHER;
	public static boolean DEEPBLUE_DROP_RULES;
	public static boolean ALLOW_DELEVEL;
	public static int DEATH_PENALTY_CHANCE;
	
	/** Inventory & WH */
	public static int INVENTORY_MAXIMUM_NO_DWARF;
	public static int INVENTORY_MAXIMUM_DWARF;
	public static int INVENTORY_MAXIMUM_PET;
	public static int MAX_ITEM_IN_PACKET;
	public static double WEIGHT_LIMIT;
	public static int WAREHOUSE_SLOTS_NO_DWARF;
	public static int WAREHOUSE_SLOTS_DWARF;
	public static int WAREHOUSE_SLOTS_CLAN;
	public static int FREIGHT_SLOTS;
	public static boolean REGION_BASED_FREIGHT;
	public static int FREIGHT_PRICE;
	
	/** Enchant */
	public static double ENCHANT_CHANCE_WEAPON_MAGIC;
	public static double ENCHANT_CHANCE_WEAPON_MAGIC_15PLUS;
	public static double ENCHANT_CHANCE_WEAPON_NONMAGIC;
	public static double ENCHANT_CHANCE_WEAPON_NONMAGIC_15PLUS;
	public static double ENCHANT_CHANCE_ARMOR;
	public static int ENCHANT_MAX_WEAPON;
	public static int ENCHANT_MAX_ARMOR;
	public static int ENCHANT_SAFE_MAX;
	public static int ENCHANT_SAFE_MAX_FULL;
	
	/** Augmentations */
	public static int AUGMENTATION_NG_SKILL_CHANCE;
	public static int AUGMENTATION_NG_GLOW_CHANCE;
	public static int AUGMENTATION_MID_SKILL_CHANCE;
	public static int AUGMENTATION_MID_GLOW_CHANCE;
	public static int AUGMENTATION_HIGH_SKILL_CHANCE;
	public static int AUGMENTATION_HIGH_GLOW_CHANCE;
	public static int AUGMENTATION_TOP_SKILL_CHANCE;
	public static int AUGMENTATION_TOP_GLOW_CHANCE;
	public static int AUGMENTATION_BASESTAT_CHANCE;
	
	/** Karma & PvP */
	public static boolean KARMA_PLAYER_CAN_SHOP;
	public static boolean KARMA_PLAYER_CAN_USE_GK;
	public static boolean KARMA_PLAYER_CAN_TELEPORT;
	public static boolean KARMA_PLAYER_CAN_TRADE;
	public static boolean KARMA_PLAYER_CAN_USE_WH;
	
	public static boolean KARMA_DROP_GM;
	public static boolean KARMA_AWARD_PK_KILL;
	public static int KARMA_PK_LIMIT;
	
	public static int[] KARMA_NONDROPPABLE_PET_ITEMS;
	public static int[] KARMA_NONDROPPABLE_ITEMS;
	
	public static int PVP_NORMAL_TIME;
	public static int PVP_PVP_TIME;
	
	/** Party */
	public static String PARTY_XP_CUTOFF_METHOD;
	public static int PARTY_XP_CUTOFF_LEVEL;
	public static double PARTY_XP_CUTOFF_PERCENT;
	public static int PARTY_RANGE;
	
	/** GMs & Admin Stuff */
	public static int DEFAULT_ACCESS_LEVEL;
	public static boolean GM_HERO_AURA;
	public static boolean GM_STARTUP_INVULNERABLE;
	public static boolean GM_STARTUP_INVISIBLE;
	public static boolean GM_STARTUP_BLOCK_ALL;
	public static boolean GM_STARTUP_AUTO_LIST;
	
	/** petitions */
	public static boolean PETITIONING_ALLOWED;
	public static int MAX_PETITIONS_PER_PLAYER;
	public static int MAX_PETITIONS_PENDING;
	
	/** Crafting **/
	public static boolean IS_CRAFTING_ENABLED;
	public static int DWARF_RECIPE_LIMIT;
	public static int COMMON_RECIPE_LIMIT;
	public static boolean BLACKSMITH_USE_RECIPES;
	
	/** Skills & Classes **/
	public static boolean AUTO_LEARN_SKILLS;
	public static boolean MAGIC_FAILURES;
	public static int PERFECT_SHIELD_BLOCK_RATE;
	public static boolean LIFE_CRYSTAL_NEEDED;
	public static boolean SP_BOOK_NEEDED;
	public static boolean ES_SP_BOOK_NEEDED;
	public static boolean DIVINE_SP_BOOK_NEEDED;
	public static boolean SUBCLASS_WITHOUT_QUESTS;
	
	/** Buffs */
	public static boolean STORE_SKILL_COOLTIME;
	public static int MAX_BUFFS_AMOUNT;
	
	// --------------------------------------------------
	// Sieges
	// --------------------------------------------------
	
	public static int SIEGE_LENGTH;
	public static int MINIMUM_CLAN_LEVEL;
	public static int MAX_ATTACKERS_NUMBER;
	public static int MAX_DEFENDERS_NUMBER;
	public static int ATTACKERS_RESPAWN_DELAY;
	
	public static int CH_MINIMUM_CLAN_LEVEL;
	public static int CH_MAX_ATTACKERS_NUMBER;
	
	// --------------------------------------------------
	// Server
	// --------------------------------------------------
	
	public static String HOSTNAME;
	public static String GAMESERVER_HOSTNAME;
	public static int GAMESERVER_PORT;
	public static String GAMESERVER_LOGIN_HOSTNAME;
	public static int GAMESERVER_LOGIN_PORT;
	public static int REQUEST_ID;
	public static boolean ACCEPT_ALTERNATE_ID;
	public static boolean USE_BLOWFISH_CIPHER;
	
	/** Access to database */
	public static String DATABASE_URL;
	public static String DATABASE_LOGIN;
	public static String DATABASE_PASSWORD;
	public static int DATABASE_MAX_CONNECTIONS;
	
	/** serverList & Test */
	public static boolean SERVER_LIST_BRACKET;
	public static boolean SERVER_LIST_CLOCK;
	public static int SERVER_LIST_AGE;
	public static boolean SERVER_LIST_TESTSERVER;
	public static boolean SERVER_LIST_PVPSERVER;
	public static boolean SERVER_GMONLY;
	
	/** clients related */
	public static int DELETE_DAYS;
	public static int MAXIMUM_ONLINE_USERS;
	
	/** Auto-loot */
	public static boolean AUTO_LOOT;
	public static boolean AUTO_LOOT_HERBS;
	public static boolean AUTO_LOOT_RAID;
	
	/** Items Management */
	public static boolean ALLOW_DISCARDITEM;
	public static boolean MULTIPLE_ITEM_DROP;
	public static int HERB_AUTO_DESTROY_TIME;
	public static int ITEM_AUTO_DESTROY_TIME;
	public static int EQUIPABLE_ITEM_AUTO_DESTROY_TIME;
	public static Map<Integer, Integer> SPECIAL_ITEM_DESTROY_TIME;
	public static int PLAYER_DROPPED_ITEM_MULTIPLIER;
	
	/** Rate control */
	public static double RATE_XP;
	public static double RATE_SP;
	public static double RATE_PARTY_XP;
	public static double RATE_PARTY_SP;
	public static double RATE_DROP_ADENA;
	public static double RATE_DROP_ITEMS;
	public static double RATE_DROP_ITEMS_BY_RAID;
	public static double RATE_DROP_SPOIL;
	public static int RATE_DROP_MANOR;
	
	public static double RATE_QUEST_DROP;
	public static double RATE_QUEST_REWARD;
	public static double RATE_QUEST_REWARD_XP;
	public static double RATE_QUEST_REWARD_SP;
	public static double RATE_QUEST_REWARD_ADENA;
	
	public static double RATE_KARMA_EXP_LOST;
	public static double RATE_SIEGE_GUARDS_PRICE;
	
	public static int PLAYER_DROP_LIMIT;
	public static int PLAYER_RATE_DROP;
	public static int PLAYER_RATE_DROP_ITEM;
	public static int PLAYER_RATE_DROP_EQUIP;
	public static int PLAYER_RATE_DROP_EQUIP_WEAPON;
	
	public static int KARMA_DROP_LIMIT;
	public static int KARMA_RATE_DROP;
	public static int KARMA_RATE_DROP_ITEM;
	public static int KARMA_RATE_DROP_EQUIP;
	public static int KARMA_RATE_DROP_EQUIP_WEAPON;
	
	public static double PET_XP_RATE;
	public static int PET_FOOD_RATE;
	public static double SINEATER_XP_RATE;
	
	public static double RATE_DROP_COMMON_HERBS;
	public static double RATE_DROP_HP_HERBS;
	public static double RATE_DROP_MP_HERBS;
	public static double RATE_DROP_SPECIAL_HERBS;
	
	/** Allow types */
	public static boolean ALLOW_FREIGHT;
	public static boolean ALLOW_WAREHOUSE;
	public static boolean ALLOW_WEAR;
	public static int WEAR_DELAY;
	public static int WEAR_PRICE;
	public static boolean ALLOW_LOTTERY;
	public static boolean ALLOW_WATER;
	public static boolean ALLOW_BOAT;
	public static boolean ALLOW_CURSED_WEAPONS;
	public static boolean ALLOW_MANOR;
	public static boolean ENABLE_FALLING_DAMAGE;
	
	/** Debug & Dev */
	public static boolean NO_SPAWNS;
	public static boolean DEVELOPER;
	public static boolean PACKET_HANDLER_DEBUG;
	
	/** Deadlock Detector */
	public static boolean DEADLOCK_DETECTOR;
	public static int DEADLOCK_CHECK_INTERVAL;
	public static boolean RESTART_ON_DEADLOCK;
	
	/** Logs */
	public static boolean LOG_CHAT;
	public static boolean LOG_ITEMS;
	public static boolean GMAUDIT;
	
	/** Community Board */
	public static boolean ENABLE_COMMUNITY_BOARD;
	public static String BBS_DEFAULT;
	
	/** Flood Protectors */
	public static int ROLL_DICE_TIME;
	public static int HERO_VOICE_TIME;
	public static int SUBCLASS_TIME;
	public static int DROP_ITEM_TIME;
	public static int SERVER_BYPASS_TIME;
	public static int MULTISELL_TIME;
	public static int MANUFACTURE_TIME;
	public static int MANOR_TIME;
	public static int SENDMAIL_TIME;
	public static int CHARACTER_SELECT_TIME;
	public static int GLOBAL_CHAT_TIME;
	public static int TRADE_CHAT_TIME;
	public static int SOCIAL_TIME;
	public static int MOVE_TIME;
	
	/** ThreadPool */
	public static int SCHEDULED_THREAD_POOL_COUNT;
	public static int THREADS_PER_SCHEDULED_THREAD_POOL;
	public static int INSTANT_THREAD_POOL_COUNT;
	public static int THREADS_PER_INSTANT_THREAD_POOL;
	
	/** Misc */
	public static boolean L2WALKER_PROTECTION;
	public static boolean SERVER_NEWS;
	public static int ZONE_TOWN;
	
	// --------------------------------------------------
	// Those "hidden" settings haven't configs to avoid admins to fuck their server
	// You still can experiment changing values here. But don't say I didn't warn you.
	// --------------------------------------------------
	
	/** Reserve Host on LoginServerThread */
	public static boolean RESERVE_HOST_ON_LOGIN = false; // default false
	
	/** MMO settings */
	public static int MMO_SELECTOR_SLEEP_TIME = 20; // default 20
	public static int MMO_MAX_SEND_PER_PASS = 80; // default 80
	public static int MMO_MAX_READ_PER_PASS = 80; // default 80
	public static int MMO_HELPER_BUFFER_COUNT = 20; // default 20
	
	/** Client Packets Queue settings */
	public static int CLIENT_PACKET_QUEUE_SIZE = MMO_MAX_READ_PER_PASS + 2; // default MMO_MAX_READ_PER_PASS + 2
	public static int CLIENT_PACKET_QUEUE_MAX_BURST_SIZE = MMO_MAX_READ_PER_PASS + 1; // default MMO_MAX_READ_PER_PASS + 1
	public static int CLIENT_PACKET_QUEUE_MAX_PACKETS_PER_SECOND = 160; // default 160
	public static int CLIENT_PACKET_QUEUE_MEASURE_INTERVAL = 5; // default 5
	public static int CLIENT_PACKET_QUEUE_MAX_AVERAGE_PACKETS_PER_SECOND = 80; // default 80
	public static int CLIENT_PACKET_QUEUE_MAX_FLOODS_PER_MIN = 2; // default 2
	public static int CLIENT_PACKET_QUEUE_MAX_OVERFLOWS_PER_MIN = 1; // default 1
	public static int CLIENT_PACKET_QUEUE_MAX_UNDERFLOWS_PER_MIN = 1; // default 1
	public static int CLIENT_PACKET_QUEUE_MAX_UNKNOWN_PER_MIN = 5; // default 5
	
	// --------------------------------------------------
	
	/**
	 * Initialize {@link ExProperties} from specified configuration file.
	 * @param filename : File name to be loaded.
	 * @return ExProperties : Initialized {@link ExProperties}.
	 */
	public static final ExProperties initProperties(String filename)
	{
		final ExProperties result = new ExProperties();
		
		try
		{
			result.load(new File(filename));
		}
		catch (Exception e)
		{
			LOGGER.error("An error occured loading '{}' config.", e, filename);
		}
		
		return result;
	}
	
	/**
	 * Loads clan and clan hall settings.
	 */
	private static final void loadClans()
	{
		final ExProperties clans = initProperties(CLANS_FILE);
		
		CLAN_JOIN_DAYS = clans.getProperty("DaysBeforeJoinAClan", 5);
		CLAN_CREATE_DAYS = clans.getProperty("DaysBeforeCreateAClan", 10);
		MAX_NUM_OF_CLANS_IN_ALLY = clans.getProperty("MaxNumOfClansInAlly", 3);
		CLAN_MEMBERS_FOR_WAR = clans.getProperty("ClanMembersForWar", 15);
		CLAN_WAR_PENALTY_WHEN_ENDED = clans.getProperty("ClanWarPenaltyWhenEnded", 5);
		CLAN_DISSOLVE_DAYS = clans.getProperty("DaysToPassToDissolveAClan", 7);
		ALLY_JOIN_DAYS_WHEN_LEAVED = clans.getProperty("DaysBeforeJoinAllyWhenLeaved", 1);
		ALLY_JOIN_DAYS_WHEN_DISMISSED = clans.getProperty("DaysBeforeJoinAllyWhenDismissed", 1);
		ACCEPT_CLAN_DAYS_WHEN_DISMISSED = clans.getProperty("DaysBeforeAcceptNewClanWhenDismissed", 1);
		CREATE_ALLY_DAYS_WHEN_DISSOLVED = clans.getProperty("DaysBeforeCreateNewAllyWhenDissolved", 10);
		MEMBERS_CAN_WITHDRAW_FROM_CLANWH = clans.getProperty("MembersCanWithdrawFromClanWH", false);
		
		MANOR_REFRESH_TIME = clans.getProperty("ManorRefreshTime", 20);
		MANOR_REFRESH_MIN = clans.getProperty("ManorRefreshMin", 0);
		MANOR_APPROVE_TIME = clans.getProperty("ManorApproveTime", 6);
		MANOR_APPROVE_MIN = clans.getProperty("ManorApproveMin", 0);
		MANOR_MAINTENANCE_MIN = clans.getProperty("ManorMaintenanceMin", 6);
		MANOR_SAVE_PERIOD_RATE = clans.getProperty("ManorSavePeriodRate", 2) * 3600000;
		
		CH_TELE_FEE_RATIO = clans.getProperty("ClanHallTeleportFunctionFeeRatio", 86400000L);
		CH_TELE1_FEE = clans.getProperty("ClanHallTeleportFunctionFeeLvl1", 7000);
		CH_TELE2_FEE = clans.getProperty("ClanHallTeleportFunctionFeeLvl2", 14000);
		CH_SUPPORT_FEE_RATIO = clans.getProperty("ClanHallSupportFunctionFeeRatio", 86400000L);
		CH_SUPPORT1_FEE = clans.getProperty("ClanHallSupportFeeLvl1", 17500);
		CH_SUPPORT2_FEE = clans.getProperty("ClanHallSupportFeeLvl2", 35000);
		CH_SUPPORT3_FEE = clans.getProperty("ClanHallSupportFeeLvl3", 49000);
		CH_SUPPORT4_FEE = clans.getProperty("ClanHallSupportFeeLvl4", 77000);
		CH_SUPPORT5_FEE = clans.getProperty("ClanHallSupportFeeLvl5", 147000);
		CH_SUPPORT6_FEE = clans.getProperty("ClanHallSupportFeeLvl6", 252000);
		CH_SUPPORT7_FEE = clans.getProperty("ClanHallSupportFeeLvl7", 259000);
		CH_SUPPORT8_FEE = clans.getProperty("ClanHallSupportFeeLvl8", 364000);
		CH_MPREG_FEE_RATIO = clans.getProperty("ClanHallMpRegenerationFunctionFeeRatio", 86400000L);
		CH_MPREG1_FEE = clans.getProperty("ClanHallMpRegenerationFeeLvl1", 14000);
		CH_MPREG2_FEE = clans.getProperty("ClanHallMpRegenerationFeeLvl2", 26250);
		CH_MPREG3_FEE = clans.getProperty("ClanHallMpRegenerationFeeLvl3", 45500);
		CH_MPREG4_FEE = clans.getProperty("ClanHallMpRegenerationFeeLvl4", 96250);
		CH_MPREG5_FEE = clans.getProperty("ClanHallMpRegenerationFeeLvl5", 140000);
		CH_HPREG_FEE_RATIO = clans.getProperty("ClanHallHpRegenerationFunctionFeeRatio", 86400000L);
		CH_HPREG1_FEE = clans.getProperty("ClanHallHpRegenerationFeeLvl1", 4900);
		CH_HPREG2_FEE = clans.getProperty("ClanHallHpRegenerationFeeLvl2", 5600);
		CH_HPREG3_FEE = clans.getProperty("ClanHallHpRegenerationFeeLvl3", 7000);
		CH_HPREG4_FEE = clans.getProperty("ClanHallHpRegenerationFeeLvl4", 8166);
		CH_HPREG5_FEE = clans.getProperty("ClanHallHpRegenerationFeeLvl5", 10500);
		CH_HPREG6_FEE = clans.getProperty("ClanHallHpRegenerationFeeLvl6", 12250);
		CH_HPREG7_FEE = clans.getProperty("ClanHallHpRegenerationFeeLvl7", 14000);
		CH_HPREG8_FEE = clans.getProperty("ClanHallHpRegenerationFeeLvl8", 15750);
		CH_HPREG9_FEE = clans.getProperty("ClanHallHpRegenerationFeeLvl9", 17500);
		CH_HPREG10_FEE = clans.getProperty("ClanHallHpRegenerationFeeLvl10", 22750);
		CH_HPREG11_FEE = clans.getProperty("ClanHallHpRegenerationFeeLvl11", 26250);
		CH_HPREG12_FEE = clans.getProperty("ClanHallHpRegenerationFeeLvl12", 29750);
		CH_HPREG13_FEE = clans.getProperty("ClanHallHpRegenerationFeeLvl13", 36166);
		CH_EXPREG_FEE_RATIO = clans.getProperty("ClanHallExpRegenerationFunctionFeeRatio", 86400000L);
		CH_EXPREG1_FEE = clans.getProperty("ClanHallExpRegenerationFeeLvl1", 21000);
		CH_EXPREG2_FEE = clans.getProperty("ClanHallExpRegenerationFeeLvl2", 42000);
		CH_EXPREG3_FEE = clans.getProperty("ClanHallExpRegenerationFeeLvl3", 63000);
		CH_EXPREG4_FEE = clans.getProperty("ClanHallExpRegenerationFeeLvl4", 105000);
		CH_EXPREG5_FEE = clans.getProperty("ClanHallExpRegenerationFeeLvl5", 147000);
		CH_EXPREG6_FEE = clans.getProperty("ClanHallExpRegenerationFeeLvl6", 163331);
		CH_EXPREG7_FEE = clans.getProperty("ClanHallExpRegenerationFeeLvl7", 210000);
		CH_ITEM_FEE_RATIO = clans.getProperty("ClanHallItemCreationFunctionFeeRatio", 86400000L);
		CH_ITEM1_FEE = clans.getProperty("ClanHallItemCreationFunctionFeeLvl1", 210000);
		CH_ITEM2_FEE = clans.getProperty("ClanHallItemCreationFunctionFeeLvl2", 490000);
		CH_ITEM3_FEE = clans.getProperty("ClanHallItemCreationFunctionFeeLvl3", 980000);
		CH_CURTAIN_FEE_RATIO = clans.getProperty("ClanHallCurtainFunctionFeeRatio", 86400000L);
		CH_CURTAIN1_FEE = clans.getProperty("ClanHallCurtainFunctionFeeLvl1", 2002);
		CH_CURTAIN2_FEE = clans.getProperty("ClanHallCurtainFunctionFeeLvl2", 2625);
		CH_FRONT_FEE_RATIO = clans.getProperty("ClanHallFrontPlatformFunctionFeeRatio", 86400000L);
		CH_FRONT1_FEE = clans.getProperty("ClanHallFrontPlatformFunctionFeeLvl1", 3031);
		CH_FRONT2_FEE = clans.getProperty("ClanHallFrontPlatformFunctionFeeLvl2", 9331);
	}
	
	/**
	 * Loads event settings.<br>
	 * Such as olympiad, seven signs festival, four sepulchures, dimensional rift, weddings, lottery, fishing championship.
	 */
	private static final void loadEvents()
	{
		final ExProperties events = initProperties(EVENTS_FILE);
		
		OLY_START_TIME = events.getProperty("OlyStartTime", 18);
		OLY_MIN = events.getProperty("OlyMin", 0);
		OLY_CPERIOD = events.getProperty("OlyCPeriod", 21600000L);
		OLY_BATTLE = events.getProperty("OlyBattle", 180000L);
		OLY_WPERIOD = events.getProperty("OlyWPeriod", 604800000L);
		OLY_VPERIOD = events.getProperty("OlyVPeriod", 86400000L);
		OLY_WAIT_TIME = events.getProperty("OlyWaitTime", 30);
		OLY_WAIT_BATTLE = events.getProperty("OlyWaitBattle", 60);
		OLY_WAIT_END = events.getProperty("OlyWaitEnd", 40);
		OLY_START_POINTS = events.getProperty("OlyStartPoints", 18);
		OLY_WEEKLY_POINTS = events.getProperty("OlyWeeklyPoints", 3);
		OLY_MIN_MATCHES = events.getProperty("OlyMinMatchesToBeClassed", 5);
		OLY_CLASSED = events.getProperty("OlyClassedParticipants", 5);
		OLY_NONCLASSED = events.getProperty("OlyNonClassedParticipants", 9);
		OLY_CLASSED_REWARD = events.parseIntIntList("OlyClassedReward", "6651-50");
		OLY_NONCLASSED_REWARD = events.parseIntIntList("OlyNonClassedReward", "6651-30");
		OLY_GP_PER_POINT = events.getProperty("OlyGPPerPoint", 1000);
		OLY_HERO_POINTS = events.getProperty("OlyHeroPoints", 300);
		OLY_RANK1_POINTS = events.getProperty("OlyRank1Points", 100);
		OLY_RANK2_POINTS = events.getProperty("OlyRank2Points", 75);
		OLY_RANK3_POINTS = events.getProperty("OlyRank3Points", 55);
		OLY_RANK4_POINTS = events.getProperty("OlyRank4Points", 40);
		OLY_RANK5_POINTS = events.getProperty("OlyRank5Points", 30);
		OLY_MAX_POINTS = events.getProperty("OlyMaxPoints", 10);
		OLY_DIVIDER_CLASSED = events.getProperty("OlyDividerClassed", 3);
		OLY_DIVIDER_NON_CLASSED = events.getProperty("OlyDividerNonClassed", 5);
		OLY_ANNOUNCE_GAMES = events.getProperty("OlyAnnounceGames", true);
		
		SEVEN_SIGNS_BYPASS_PREREQUISITES = events.getProperty("SevenSignsBypassPrerequisites", false);
		FESTIVAL_MIN_PLAYER = MathUtil.limit(events.getProperty("FestivalMinPlayer", 5), 2, 9);
		MAXIMUM_PLAYER_CONTRIB = events.getProperty("MaxPlayerContrib", 1000000);
		FESTIVAL_MANAGER_START = events.getProperty("FestivalManagerStart", 120000L);
		FESTIVAL_LENGTH = events.getProperty("FestivalLength", 1080000L);
		FESTIVAL_CYCLE_LENGTH = events.getProperty("FestivalCycleLength", 2280000L);
		FESTIVAL_FIRST_SPAWN = events.getProperty("FestivalFirstSpawn", 120000L);
		FESTIVAL_FIRST_SWARM = events.getProperty("FestivalFirstSwarm", 300000L);
		FESTIVAL_SECOND_SPAWN = events.getProperty("FestivalSecondSpawn", 540000L);
		FESTIVAL_SECOND_SWARM = events.getProperty("FestivalSecondSwarm", 720000L);
		FESTIVAL_CHEST_SPAWN = events.getProperty("FestivalChestSpawn", 900000L);
		
		FS_TIME_ENTRY = events.getProperty("EntryTime", 55);
		FS_TIME_END = events.getProperty("EndTime", 50);
		FS_PARTY_MEMBER_COUNT = MathUtil.limit(events.getProperty("NeededPartyMembers", 4), 2, 9);
		
		RIFT_MIN_PARTY_SIZE = events.getProperty("RiftMinPartySize", 2);
		RIFT_MAX_JUMPS = events.getProperty("MaxRiftJumps", 4);
		RIFT_SPAWN_DELAY = events.getProperty("RiftSpawnDelay", 10000);
		RIFT_AUTO_JUMPS_TIME_MIN = events.getProperty("AutoJumpsDelayMin", 480);
		RIFT_AUTO_JUMPS_TIME_MAX = events.getProperty("AutoJumpsDelayMax", 600);
		RIFT_ENTER_COST_RECRUIT = events.getProperty("RecruitCost", 18);
		RIFT_ENTER_COST_SOLDIER = events.getProperty("SoldierCost", 21);
		RIFT_ENTER_COST_OFFICER = events.getProperty("OfficerCost", 24);
		RIFT_ENTER_COST_CAPTAIN = events.getProperty("CaptainCost", 27);
		RIFT_ENTER_COST_COMMANDER = events.getProperty("CommanderCost", 30);
		RIFT_ENTER_COST_HERO = events.getProperty("HeroCost", 33);
		RIFT_BOSS_ROOM_TIME_MULTIPLY = events.getProperty("BossRoomTimeMultiply", 1.);
		
		ALLOW_WEDDING = events.getProperty("AllowWedding", false);
		WEDDING_PRICE = events.getProperty("WeddingPrice", 1000000);
		WEDDING_SAMESEX = events.getProperty("WeddingAllowSameSex", false);
		WEDDING_FORMALWEAR = events.getProperty("WeddingFormalWear", true);
		
		LOTTERY_PRIZE = events.getProperty("LotteryPrize", 50000);
		LOTTERY_TICKET_PRICE = events.getProperty("LotteryTicketPrice", 2000);
		LOTTERY_5_NUMBER_RATE = events.getProperty("Lottery5NumberRate", 0.6);
		LOTTERY_4_NUMBER_RATE = events.getProperty("Lottery4NumberRate", 0.2);
		LOTTERY_3_NUMBER_RATE = events.getProperty("Lottery3NumberRate", 0.2);
		LOTTERY_2_AND_1_NUMBER_PRIZE = events.getProperty("Lottery2and1NumberPrize", 200);
		
		ALLOW_FISH_CHAMPIONSHIP = events.getProperty("AllowFishChampionship", true);
		FISH_CHAMPIONSHIP_REWARD_ITEM = events.getProperty("FishChampionshipRewardItemId", 57);
		FISH_CHAMPIONSHIP_REWARD_1 = events.getProperty("FishChampionshipReward1", 800000);
		FISH_CHAMPIONSHIP_REWARD_2 = events.getProperty("FishChampionshipReward2", 500000);
		FISH_CHAMPIONSHIP_REWARD_3 = events.getProperty("FishChampionshipReward3", 300000);
		FISH_CHAMPIONSHIP_REWARD_4 = events.getProperty("FishChampionshipReward4", 200000);
		FISH_CHAMPIONSHIP_REWARD_5 = events.getProperty("FishChampionshipReward5", 100000);
	}
	
	/**
	 * Loads geoengine settings.
	 */
	private static final void loadGeoengine()
	{
		final ExProperties geoengine = initProperties(GEOENGINE_FILE);
		
		GEODATA_PATH = geoengine.getProperty("GeoDataPath", "./data/geodata/");
		GEODATA_TYPE = Enum.valueOf(GeoType.class, geoengine.getProperty("GeoDataType", "L2OFF"));
		
		PART_OF_CHARACTER_HEIGHT = geoengine.getProperty("PartOfCharacterHeight", 75);
		MAX_OBSTACLE_HEIGHT = geoengine.getProperty("MaxObstacleHeight", 32);
		
		PATHFIND_BUFFERS = geoengine.getProperty("PathFindBuffers", "500x10;1000x10;3000x5;5000x3;10000x3");
		MOVE_WEIGHT = geoengine.getProperty("MoveWeight", 10);
		MOVE_WEIGHT_DIAG = geoengine.getProperty("MoveWeightDiag", 14);
		OBSTACLE_WEIGHT = geoengine.getProperty("ObstacleWeight", 30);
		OBSTACLE_WEIGHT_DIAG = (int) (OBSTACLE_WEIGHT * Math.sqrt(2));
		HEURISTIC_WEIGHT = geoengine.getProperty("HeuristicWeight", 12);
		HEURISTIC_WEIGHT_DIAG = geoengine.getProperty("HeuristicWeightDiag", 18);
		MAX_ITERATIONS = geoengine.getProperty("MaxIterations", 3500);
	}
	
	/**
	 * Loads hex ID settings.
	 */
	private static final void loadHexID()
	{
		final ExProperties hexid = initProperties(HEXID_FILE);
		
		SERVER_ID = Integer.parseInt(hexid.getProperty("ServerID"));
		HEX_ID = new BigInteger(hexid.getProperty("HexID"), 16).toByteArray();
	}
	
	/**
	 * Saves hex ID file.
	 * @param serverId : The ID of server.
	 * @param hexId : The hex ID of server.
	 */
	public static final void saveHexid(int serverId, String hexId)
	{
		saveHexid(serverId, hexId, HEXID_FILE);
	}
	
	/**
	 * Saves hexID file.
	 * @param serverId : The ID of server.
	 * @param hexId : The hexID of server.
	 * @param filename : The file name.
	 */
	public static final void saveHexid(int serverId, String hexId, String filename)
	{
		try
		{
			final File file = new File(filename);
			file.createNewFile();
			
			final Properties hexSetting = new Properties();
			hexSetting.setProperty("ServerID", String.valueOf(serverId));
			hexSetting.setProperty("HexID", hexId);
			
			try (OutputStream out = new FileOutputStream(file))
			{
				hexSetting.store(out, "the hexID to auth into login");
			}
		}
		catch (Exception e)
		{
			LOGGER.error("Failed to save hex ID to '{}' file.", e, filename);
		}
	}
	
	/**
	 * Loads NPC settings.<br>
	 * Such as champion monsters, NPC buffer, class master, wyvern, raid bosses and grand bosses, AI.
	 */
	private static final void loadNpcs()
	{
		final ExProperties npcs = initProperties(NPCS_FILE);

		CHAMPION_FREQUENCY = npcs.getProperty("ChampionFrequency", 0);
		CHAMP_MIN_LVL = npcs.getProperty("ChampionMinLevel", 20);
		CHAMP_MAX_LVL = npcs.getProperty("ChampionMaxLevel", 70);
		CHAMPION_HP = npcs.getProperty("ChampionHp", 8);
		CHAMPION_HP_REGEN = npcs.getProperty("ChampionHpRegen", 1.);
		CHAMPION_MP_REGEN = npcs.getProperty("ChampionMpRegen", 1.);
		CHAMPION_REWARDS = npcs.getProperty("ChampionRewards", 8);
		CHAMPION_ADENAS_REWARDS = npcs.getProperty("ChampionAdenasRewards", 1);
		CHAMPION_ATK = npcs.getProperty("ChampionAtk", 1.);
		CHAMPION_SPD_ATK = npcs.getProperty("ChampionSpdAtk", 1.);
		CHAMPION_REWARD = npcs.getProperty("ChampionRewardItem", 0);
		CHAMPION_REWARD_ID = npcs.getProperty("ChampionRewardItemID", 6393);
		CHAMPION_REWARD_QTY = npcs.getProperty("ChampionRewardItemQty", 1);
		
		BUFFER_MAX_SCHEMES = npcs.getProperty("BufferMaxSchemesPerChar", 4);
		BUFFER_STATIC_BUFF_COST = npcs.getProperty("BufferStaticCostPerBuff", -1);
		
		ALLOW_CLASS_MASTERS = npcs.getProperty("AllowClassMasters", false);
		ALLOW_ENTIRE_TREE = npcs.getProperty("AllowEntireTree", false);
		if (ALLOW_CLASS_MASTERS)
			CLASS_MASTER_SETTINGS = new ClassMasterSettings(npcs.getProperty("ConfigClassMaster"));
		
		FREE_TELEPORT = npcs.getProperty("FreeTeleport", false);
		ANNOUNCE_MAMMON_SPAWN = npcs.getProperty("AnnounceMammonSpawn", true);
		MOB_AGGRO_IN_PEACEZONE = npcs.getProperty("MobAggroInPeaceZone", true);
		SHOW_NPC_LVL = npcs.getProperty("ShowNpcLevel", false);
		SHOW_NPC_CREST = npcs.getProperty("ShowNpcCrest", false);
		SHOW_SUMMON_CREST = npcs.getProperty("ShowSummonCrest", false);
		
		WYVERN_ALLOW_UPGRADER = npcs.getProperty("AllowWyvernUpgrader", true);
		WYVERN_REQUIRED_LEVEL = npcs.getProperty("RequiredStriderLevel", 55);
		WYVERN_REQUIRED_CRYSTALS = npcs.getProperty("RequiredCrystalsNumber", 10);
		
		RAID_HP_REGEN_MULTIPLIER = npcs.getProperty("RaidHpRegenMultiplier", 1.);
		RAID_MP_REGEN_MULTIPLIER = npcs.getProperty("RaidMpRegenMultiplier", 1.);
		RAID_DEFENCE_MULTIPLIER = npcs.getProperty("RaidDefenceMultiplier", 1.);
		RAID_MINION_RESPAWN_TIMER = npcs.getProperty("RaidMinionRespawnTime", 300000);
		
		RAID_DISABLE_CURSE = npcs.getProperty("DisableRaidCurse", false);
		
		SPAWN_INTERVAL_AQ = npcs.getProperty("AntQueenSpawnInterval", 36);
		RANDOM_SPAWN_TIME_AQ = npcs.getProperty("AntQueenRandomSpawn", 17);
		
		SPAWN_INTERVAL_ANTHARAS = npcs.getProperty("AntharasSpawnInterval", 264);
		RANDOM_SPAWN_TIME_ANTHARAS = npcs.getProperty("AntharasRandomSpawn", 72);
		WAIT_TIME_ANTHARAS = npcs.getProperty("AntharasWaitTime", 30) * 60000;
		
		SPAWN_INTERVAL_BAIUM = npcs.getProperty("BaiumSpawnInterval", 168);
		RANDOM_SPAWN_TIME_BAIUM = npcs.getProperty("BaiumRandomSpawn", 48);
		
		SPAWN_INTERVAL_CORE = npcs.getProperty("CoreSpawnInterval", 60);
		RANDOM_SPAWN_TIME_CORE = npcs.getProperty("CoreRandomSpawn", 23);
		
		SPAWN_INTERVAL_FRINTEZZA = npcs.getProperty("FrintezzaSpawnInterval", 48);
		RANDOM_SPAWN_TIME_FRINTEZZA = npcs.getProperty("FrintezzaRandomSpawn", 8);
		WAIT_TIME_FRINTEZZA = npcs.getProperty("FrintezzaWaitTime", 1) * 60000;
		
		SPAWN_INTERVAL_ORFEN = npcs.getProperty("OrfenSpawnInterval", 48);
		RANDOM_SPAWN_TIME_ORFEN = npcs.getProperty("OrfenRandomSpawn", 20);
		
		SPAWN_INTERVAL_SAILREN = npcs.getProperty("SailrenSpawnInterval", 36);
		RANDOM_SPAWN_TIME_SAILREN = npcs.getProperty("SailrenRandomSpawn", 24);
		WAIT_TIME_SAILREN = npcs.getProperty("SailrenWaitTime", 5) * 60000;
		
		SPAWN_INTERVAL_VALAKAS = npcs.getProperty("ValakasSpawnInterval", 264);
		RANDOM_SPAWN_TIME_VALAKAS = npcs.getProperty("ValakasRandomSpawn", 72);
		WAIT_TIME_VALAKAS = npcs.getProperty("ValakasWaitTime", 30) * 60000;
		
		SPAWN_INTERVAL_ZAKEN = npcs.getProperty("ZakenSpawnInterval", 60);
		RANDOM_SPAWN_TIME_ZAKEN = npcs.getProperty("ZakenRandomSpawn", 20);
		
		GUARD_ATTACK_AGGRO_MOB = npcs.getProperty("GuardAttackAggroMob", false);
		RANDOM_WALK_RATE = npcs.getProperty("RandomWalkRate", 30);
		MAX_DRIFT_RANGE = npcs.getProperty("MaxDriftRange", 200);
		MIN_NPC_ANIMATION = npcs.getProperty("MinNPCAnimation", 20);
		MAX_NPC_ANIMATION = npcs.getProperty("MaxNPCAnimation", 40);
		MIN_MONSTER_ANIMATION = npcs.getProperty("MinMonsterAnimation", 10);
		MAX_MONSTER_ANIMATION = npcs.getProperty("MaxMonsterAnimation", 40);
	}
	
	/**
	 * Loads player settings.<br>
	 * Such as stats, inventory/warehouse, enchant, augmentation, karma, party, admin, petition, skill learn.
	 */
	private static final void loadPlayers()
	{
		final ExProperties players = initProperties(PLAYERS_FILE);

		ATTACK_FROM_MOUNTS = players.getProperty("AttackFromMounts", false);
		NO_GRADE_PENALTY = players.getProperty("NoGradePenalty", false);
		NO_WEIGHT_PENALTY = players.getProperty("NoWeightPenalty", false);
		NO_PENALTIES_ON_DIFF_LVL_FOR_MOUNTS = players.getProperty("NoPenaltiesOnDiffLvlForMounts", false);
		ALLOW_STACK_BUFFS_OF_SAME_EFFECT = players.getProperty("AllowStackBuffsOfSameEffect", false);
		MAX_RUN_SPD = players.getProperty("MaxRunSpd", 0);

		LOGGER.info("======== Custom Features ========= ");
		LOGGER.info("AttackFromMounts: "+ATTACK_FROM_MOUNTS);
		LOGGER.info("NoGradePenalty: "+NO_GRADE_PENALTY);
		LOGGER.info("NoWeightPenalty: "+NO_WEIGHT_PENALTY);
		LOGGER.info("NoPenaltiesOnDiffLvlForMounts: "+NO_PENALTIES_ON_DIFF_LVL_FOR_MOUNTS);
		LOGGER.info("AllowStackBuffsOfSameEffect: "+ALLOW_STACK_BUFFS_OF_SAME_EFFECT);
		LOGGER.info("MaxRunSpd: "+(MAX_RUN_SPD==0?"no limit":MAX_RUN_SPD));
		LOGGER.info("=================================== ");

		EFFECT_CANCELING = players.getProperty("CancelLesserEffect", true);
		HP_REGEN_MULTIPLIER = players.getProperty("HpRegenMultiplier", 1.);
		MP_REGEN_MULTIPLIER = players.getProperty("MpRegenMultiplier", 1.);
		CP_REGEN_MULTIPLIER = players.getProperty("CpRegenMultiplier", 1.);
		PLAYER_SPAWN_PROTECTION = players.getProperty("PlayerSpawnProtection", 0);
		PLAYER_FAKEDEATH_UP_PROTECTION = players.getProperty("PlayerFakeDeathUpProtection", 0);
		RESPAWN_RESTORE_HP = players.getProperty("RespawnRestoreHP", 0.7);
		MAX_PVTSTORE_SLOTS_DWARF = players.getProperty("MaxPvtStoreSlotsDwarf", 5);
		MAX_PVTSTORE_SLOTS_OTHER = players.getProperty("MaxPvtStoreSlotsOther", 4);
		DEEPBLUE_DROP_RULES = players.getProperty("UseDeepBlueDropRules", true);
		ALLOW_DELEVEL = players.getProperty("AllowDelevel", true);
		DEATH_PENALTY_CHANCE = players.getProperty("DeathPenaltyChance", 20);
		
		INVENTORY_MAXIMUM_NO_DWARF = players.getProperty("MaximumSlotsForNoDwarf", 80);
		INVENTORY_MAXIMUM_DWARF = players.getProperty("MaximumSlotsForDwarf", 100);
		INVENTORY_MAXIMUM_PET = players.getProperty("MaximumSlotsForPet", 12);
		MAX_ITEM_IN_PACKET = Math.max(INVENTORY_MAXIMUM_NO_DWARF, INVENTORY_MAXIMUM_DWARF);
		WEIGHT_LIMIT = players.getProperty("WeightLimit", 1.);
		WAREHOUSE_SLOTS_NO_DWARF = players.getProperty("MaximumWarehouseSlotsForNoDwarf", 100);
		WAREHOUSE_SLOTS_DWARF = players.getProperty("MaximumWarehouseSlotsForDwarf", 120);
		WAREHOUSE_SLOTS_CLAN = players.getProperty("MaximumWarehouseSlotsForClan", 150);
		FREIGHT_SLOTS = players.getProperty("MaximumFreightSlots", 20);
		REGION_BASED_FREIGHT = players.getProperty("RegionBasedFreight", true);
		FREIGHT_PRICE = players.getProperty("FreightPrice", 1000);
		
		ENCHANT_CHANCE_WEAPON_MAGIC = players.getProperty("EnchantChanceMagicWeapon", 0.4);
		ENCHANT_CHANCE_WEAPON_MAGIC_15PLUS = players.getProperty("EnchantChanceMagicWeapon15Plus", 0.2);
		ENCHANT_CHANCE_WEAPON_NONMAGIC = players.getProperty("EnchantChanceNonMagicWeapon", 0.7);
		ENCHANT_CHANCE_WEAPON_NONMAGIC_15PLUS = players.getProperty("EnchantChanceNonMagicWeapon15Plus", 0.35);
		ENCHANT_CHANCE_ARMOR = players.getProperty("EnchantChanceArmor", 0.66);
		ENCHANT_MAX_WEAPON = players.getProperty("EnchantMaxWeapon", 0);
		ENCHANT_MAX_ARMOR = players.getProperty("EnchantMaxArmor", 0);
		ENCHANT_SAFE_MAX = players.getProperty("EnchantSafeMax", 3);
		ENCHANT_SAFE_MAX_FULL = players.getProperty("EnchantSafeMaxFull", 4);
		
		AUGMENTATION_NG_SKILL_CHANCE = players.getProperty("AugmentationNGSkillChance", 15);
		AUGMENTATION_NG_GLOW_CHANCE = players.getProperty("AugmentationNGGlowChance", 0);
		AUGMENTATION_MID_SKILL_CHANCE = players.getProperty("AugmentationMidSkillChance", 30);
		AUGMENTATION_MID_GLOW_CHANCE = players.getProperty("AugmentationMidGlowChance", 40);
		AUGMENTATION_HIGH_SKILL_CHANCE = players.getProperty("AugmentationHighSkillChance", 45);
		AUGMENTATION_HIGH_GLOW_CHANCE = players.getProperty("AugmentationHighGlowChance", 70);
		AUGMENTATION_TOP_SKILL_CHANCE = players.getProperty("AugmentationTopSkillChance", 60);
		AUGMENTATION_TOP_GLOW_CHANCE = players.getProperty("AugmentationTopGlowChance", 100);
		AUGMENTATION_BASESTAT_CHANCE = players.getProperty("AugmentationBaseStatChance", 1);
		
		KARMA_PLAYER_CAN_SHOP = players.getProperty("KarmaPlayerCanShop", false);
		KARMA_PLAYER_CAN_USE_GK = players.getProperty("KarmaPlayerCanUseGK", false);
		KARMA_PLAYER_CAN_TELEPORT = players.getProperty("KarmaPlayerCanTeleport", true);
		KARMA_PLAYER_CAN_TRADE = players.getProperty("KarmaPlayerCanTrade", true);
		KARMA_PLAYER_CAN_USE_WH = players.getProperty("KarmaPlayerCanUseWareHouse", true);
		KARMA_DROP_GM = players.getProperty("CanGMDropEquipment", false);
		KARMA_AWARD_PK_KILL = players.getProperty("AwardPKKillPVPPoint", true);
		KARMA_PK_LIMIT = players.getProperty("MinimumPKRequiredToDrop", 5);
		KARMA_NONDROPPABLE_PET_ITEMS = players.getProperty("ListOfPetItems", new int[]
		{
			2375,
			3500,
			3501,
			3502,
			4422,
			4423,
			4424,
			4425,
			6648,
			6649,
			6650
		});
		KARMA_NONDROPPABLE_ITEMS = players.getProperty("ListOfNonDroppableItemsForPK", new int[]
		{
			1147,
			425,
			1146,
			461,
			10,
			2368,
			7,
			6,
			2370,
			2369
		});
		
		PVP_NORMAL_TIME = players.getProperty("PvPVsNormalTime", 40000);
		PVP_PVP_TIME = players.getProperty("PvPVsPvPTime", 20000);
		
		PARTY_XP_CUTOFF_METHOD = players.getProperty("PartyXpCutoffMethod", "level");
		PARTY_XP_CUTOFF_PERCENT = players.getProperty("PartyXpCutoffPercent", 3.);
		PARTY_XP_CUTOFF_LEVEL = players.getProperty("PartyXpCutoffLevel", 20);
		PARTY_RANGE = players.getProperty("PartyRange", 1500);
		
		DEFAULT_ACCESS_LEVEL = players.getProperty("DefaultAccessLevel", 0);
		GM_HERO_AURA = players.getProperty("GMHeroAura", false);
		GM_STARTUP_INVULNERABLE = players.getProperty("GMStartupInvulnerable", false);
		GM_STARTUP_INVISIBLE = players.getProperty("GMStartupInvisible", false);
		GM_STARTUP_BLOCK_ALL = players.getProperty("GMStartupBlockAll", false);
		GM_STARTUP_AUTO_LIST = players.getProperty("GMStartupAutoList", true);
		
		PETITIONING_ALLOWED = players.getProperty("PetitioningAllowed", true);
		MAX_PETITIONS_PER_PLAYER = players.getProperty("MaxPetitionsPerPlayer", 5);
		MAX_PETITIONS_PENDING = players.getProperty("MaxPetitionsPending", 25);
		
		IS_CRAFTING_ENABLED = players.getProperty("CraftingEnabled", true);
		DWARF_RECIPE_LIMIT = players.getProperty("DwarfRecipeLimit", 50);
		COMMON_RECIPE_LIMIT = players.getProperty("CommonRecipeLimit", 50);
		BLACKSMITH_USE_RECIPES = players.getProperty("BlacksmithUseRecipes", true);
		
		AUTO_LEARN_SKILLS = players.getProperty("AutoLearnSkills", false);
		MAGIC_FAILURES = players.getProperty("MagicFailures", true);
		PERFECT_SHIELD_BLOCK_RATE = players.getProperty("PerfectShieldBlockRate", 5);
		LIFE_CRYSTAL_NEEDED = players.getProperty("LifeCrystalNeeded", true);
		SP_BOOK_NEEDED = players.getProperty("SpBookNeeded", true);
		ES_SP_BOOK_NEEDED = players.getProperty("EnchantSkillSpBookNeeded", true);
		DIVINE_SP_BOOK_NEEDED = players.getProperty("DivineInspirationSpBookNeeded", true);
		SUBCLASS_WITHOUT_QUESTS = players.getProperty("SubClassWithoutQuests", false);
		
		MAX_BUFFS_AMOUNT = players.getProperty("MaxBuffsAmount", 20);
		STORE_SKILL_COOLTIME = players.getProperty("StoreSkillCooltime", true);
	}
	
	/**
	 * Loads siege settings.
	 */
	private static final void loadSieges()
	{
		final ExProperties sieges = initProperties(Config.SIEGE_FILE);
		
		SIEGE_LENGTH = sieges.getProperty("SiegeLength", 120);
		MINIMUM_CLAN_LEVEL = sieges.getProperty("SiegeClanMinLevel", 4);
		MAX_ATTACKERS_NUMBER = sieges.getProperty("AttackerMaxClans", 10);
		MAX_DEFENDERS_NUMBER = sieges.getProperty("DefenderMaxClans", 10);
		ATTACKERS_RESPAWN_DELAY = sieges.getProperty("AttackerRespawn", 10000);
		
		CH_MINIMUM_CLAN_LEVEL = sieges.getProperty("ChSiegeClanMinLevel", 4);
		CH_MAX_ATTACKERS_NUMBER = sieges.getProperty("ChAttackerMaxClans", 10);
	}
	
	/**
	 * Loads gameserver settings.<br>
	 * IP addresses, database, rates, feature enabled/disabled, misc.
	 */
	private static final void loadServer()
	{
		final ExProperties server = initProperties(SERVER_FILE);
		
		HOSTNAME = server.getProperty("Hostname", "*");
		GAMESERVER_HOSTNAME = server.getProperty("GameserverHostname");
		GAMESERVER_PORT = server.getProperty("GameserverPort", 7777);
		GAMESERVER_LOGIN_HOSTNAME = server.getProperty("LoginHost", "127.0.0.1");
		GAMESERVER_LOGIN_PORT = server.getProperty("LoginPort", 9014);
		REQUEST_ID = server.getProperty("RequestServerID", 0);
		ACCEPT_ALTERNATE_ID = server.getProperty("AcceptAlternateID", true);
		USE_BLOWFISH_CIPHER = server.getProperty("UseBlowfishCipher", true);
		
		DATABASE_URL = server.getProperty("URL", "jdbc:mariadb://localhost/acis");
		DATABASE_LOGIN = server.getProperty("Login", "root");
		DATABASE_PASSWORD = server.getProperty("Password", "");
		DATABASE_MAX_CONNECTIONS = server.getProperty("MaximumDbConnections", 10);
		
		SERVER_LIST_BRACKET = server.getProperty("ServerListBrackets", false);
		SERVER_LIST_CLOCK = server.getProperty("ServerListClock", false);
		SERVER_GMONLY = server.getProperty("ServerGMOnly", false);
		SERVER_LIST_AGE = server.getProperty("ServerListAgeLimit", 0);
		SERVER_LIST_TESTSERVER = server.getProperty("TestServer", false);
		SERVER_LIST_PVPSERVER = server.getProperty("PvpServer", true);
		
		DELETE_DAYS = server.getProperty("DeleteCharAfterDays", 7);
		MAXIMUM_ONLINE_USERS = server.getProperty("MaximumOnlineUsers", 100);
		
		AUTO_LOOT = server.getProperty("AutoLoot", false);
		AUTO_LOOT_HERBS = server.getProperty("AutoLootHerbs", false);
		AUTO_LOOT_RAID = server.getProperty("AutoLootRaid", false);
		
		ALLOW_DISCARDITEM = server.getProperty("AllowDiscardItem", true);
		MULTIPLE_ITEM_DROP = server.getProperty("MultipleItemDrop", true);
		HERB_AUTO_DESTROY_TIME = server.getProperty("AutoDestroyHerbTime", 15) * 1000;
		ITEM_AUTO_DESTROY_TIME = server.getProperty("AutoDestroyItemTime", 600) * 1000;
		EQUIPABLE_ITEM_AUTO_DESTROY_TIME = server.getProperty("AutoDestroyEquipableItemTime", 0) * 1000;
		SPECIAL_ITEM_DESTROY_TIME = new HashMap<>();
		String[] data = server.getProperty("AutoDestroySpecialItemTime", (String[]) null, ",");
		if (data != null)
		{
			for (String itemData : data)
			{
				String[] item = itemData.split("-");
				SPECIAL_ITEM_DESTROY_TIME.put(Integer.parseInt(item[0]), Integer.parseInt(item[1]) * 1000);
			}
		}
		PLAYER_DROPPED_ITEM_MULTIPLIER = server.getProperty("PlayerDroppedItemMultiplier", 1);
		
		RATE_XP = server.getProperty("RateXp", 1.);
		RATE_SP = server.getProperty("RateSp", 1.);
		RATE_PARTY_XP = server.getProperty("RatePartyXp", 1.);
		RATE_PARTY_SP = server.getProperty("RatePartySp", 1.);
		RATE_DROP_ADENA = server.getProperty("RateDropAdena", 1.);
		RATE_DROP_ITEMS = server.getProperty("RateDropItems", 1.);
		RATE_DROP_ITEMS_BY_RAID = server.getProperty("RateRaidDropItems", 1.);
		RATE_DROP_SPOIL = server.getProperty("RateDropSpoil", 1.);
		RATE_DROP_MANOR = server.getProperty("RateDropManor", 1);
		RATE_QUEST_DROP = server.getProperty("RateQuestDrop", 1.);
		RATE_QUEST_REWARD = server.getProperty("RateQuestReward", 1.);
		RATE_QUEST_REWARD_XP = server.getProperty("RateQuestRewardXP", 1.);
		RATE_QUEST_REWARD_SP = server.getProperty("RateQuestRewardSP", 1.);
		RATE_QUEST_REWARD_ADENA = server.getProperty("RateQuestRewardAdena", 1.);
		RATE_KARMA_EXP_LOST = server.getProperty("RateKarmaExpLost", 1.);
		RATE_SIEGE_GUARDS_PRICE = server.getProperty("RateSiegeGuardsPrice", 1.);
		RATE_DROP_COMMON_HERBS = server.getProperty("RateCommonHerbs", 1.);
		RATE_DROP_HP_HERBS = server.getProperty("RateHpHerbs", 1.);
		RATE_DROP_MP_HERBS = server.getProperty("RateMpHerbs", 1.);
		RATE_DROP_SPECIAL_HERBS = server.getProperty("RateSpecialHerbs", 1.);
		PLAYER_DROP_LIMIT = server.getProperty("PlayerDropLimit", 3);
		PLAYER_RATE_DROP = server.getProperty("PlayerRateDrop", 5);
		PLAYER_RATE_DROP_ITEM = server.getProperty("PlayerRateDropItem", 70);
		PLAYER_RATE_DROP_EQUIP = server.getProperty("PlayerRateDropEquip", 25);
		PLAYER_RATE_DROP_EQUIP_WEAPON = server.getProperty("PlayerRateDropEquipWeapon", 5);
		PET_XP_RATE = server.getProperty("PetXpRate", 1.);
		PET_FOOD_RATE = server.getProperty("PetFoodRate", 1);
		SINEATER_XP_RATE = server.getProperty("SinEaterXpRate", 1.);
		KARMA_DROP_LIMIT = server.getProperty("KarmaDropLimit", 10);
		KARMA_RATE_DROP = server.getProperty("KarmaRateDrop", 70);
		KARMA_RATE_DROP_ITEM = server.getProperty("KarmaRateDropItem", 50);
		KARMA_RATE_DROP_EQUIP = server.getProperty("KarmaRateDropEquip", 40);
		KARMA_RATE_DROP_EQUIP_WEAPON = server.getProperty("KarmaRateDropEquipWeapon", 10);
		
		ALLOW_FREIGHT = server.getProperty("AllowFreight", true);
		ALLOW_WAREHOUSE = server.getProperty("AllowWarehouse", true);
		ALLOW_WEAR = server.getProperty("AllowWear", true);
		WEAR_DELAY = server.getProperty("WearDelay", 5);
		WEAR_PRICE = server.getProperty("WearPrice", 10);
		ALLOW_LOTTERY = server.getProperty("AllowLottery", true);
		ALLOW_WATER = server.getProperty("AllowWater", true);
		ALLOW_MANOR = server.getProperty("AllowManor", true);
		ALLOW_BOAT = server.getProperty("AllowBoat", true);
		ALLOW_CURSED_WEAPONS = server.getProperty("AllowCursedWeapons", true);
		
		ENABLE_FALLING_DAMAGE = server.getProperty("EnableFallingDamage", true);
		
		NO_SPAWNS = server.getProperty("NoSpawns", false);
		DEVELOPER = server.getProperty("Developer", false);
		PACKET_HANDLER_DEBUG = server.getProperty("PacketHandlerDebug", false);
		
		DEADLOCK_DETECTOR = server.getProperty("DeadLockDetector", false);
		DEADLOCK_CHECK_INTERVAL = server.getProperty("DeadLockCheckInterval", 20);
		RESTART_ON_DEADLOCK = server.getProperty("RestartOnDeadlock", false);
		
		LOG_CHAT = server.getProperty("LogChat", false);
		LOG_ITEMS = server.getProperty("LogItems", false);
		GMAUDIT = server.getProperty("GMAudit", false);
		
		ENABLE_COMMUNITY_BOARD = server.getProperty("EnableCommunityBoard", false);
		BBS_DEFAULT = server.getProperty("BBSDefault", "_bbshome");
		
		ROLL_DICE_TIME = server.getProperty("RollDiceTime", 4200);
		HERO_VOICE_TIME = server.getProperty("HeroVoiceTime", 10000);
		SUBCLASS_TIME = server.getProperty("SubclassTime", 2000);
		DROP_ITEM_TIME = server.getProperty("DropItemTime", 1000);
		SERVER_BYPASS_TIME = server.getProperty("ServerBypassTime", 100);
		MULTISELL_TIME = server.getProperty("MultisellTime", 100);
		MANUFACTURE_TIME = server.getProperty("ManufactureTime", 300);
		MANOR_TIME = server.getProperty("ManorTime", 3000);
		SENDMAIL_TIME = server.getProperty("SendMailTime", 10000);
		CHARACTER_SELECT_TIME = server.getProperty("CharacterSelectTime", 3000);
		GLOBAL_CHAT_TIME = server.getProperty("GlobalChatTime", 0);
		TRADE_CHAT_TIME = server.getProperty("TradeChatTime", 0);
		SOCIAL_TIME = server.getProperty("SocialTime", 2000);
		MOVE_TIME = server.getProperty("MoveTime", 100);
		
		SCHEDULED_THREAD_POOL_COUNT = server.getProperty("ScheduledThreadPoolCount", -1);
		THREADS_PER_SCHEDULED_THREAD_POOL = server.getProperty("ThreadsPerScheduledThreadPool", 4);
		INSTANT_THREAD_POOL_COUNT = server.getProperty("InstantThreadPoolCount", -1);
		THREADS_PER_INSTANT_THREAD_POOL = server.getProperty("ThreadsPerInstantThreadPool", 2);
		
		L2WALKER_PROTECTION = server.getProperty("L2WalkerProtection", false);
		ZONE_TOWN = server.getProperty("ZoneTown", 0);
		SERVER_NEWS = server.getProperty("ShowServerNews", false);
	}
	
	/**
	 * Loads loginserver settings.<br>
	 * IP addresses, database, account, misc.
	 */
	private static final void loadLogin()
	{
		final ExProperties server = initProperties(LOGINSERVER_FILE);
		
		HOSTNAME = server.getProperty("Hostname", "localhost");
		LOGINSERVER_HOSTNAME = server.getProperty("LoginserverHostname", "*");
		LOGINSERVER_PORT = server.getProperty("LoginserverPort", 2106);
		GAMESERVER_LOGIN_HOSTNAME = server.getProperty("LoginHostname", "*");
		GAMESERVER_LOGIN_PORT = server.getProperty("LoginPort", 9014);
		LOGIN_TRY_BEFORE_BAN = server.getProperty("LoginTryBeforeBan", 3);
		LOGIN_BLOCK_AFTER_BAN = server.getProperty("LoginBlockAfterBan", 600);
		ACCEPT_NEW_GAMESERVER = server.getProperty("AcceptNewGameServer", false);
		SHOW_LICENCE = server.getProperty("ShowLicence", true);
		
		DATABASE_URL = server.getProperty("URL", "jdbc:mariadb://localhost/acis");
		DATABASE_LOGIN = server.getProperty("Login", "root");
		DATABASE_PASSWORD = server.getProperty("Password", "");
		DATABASE_MAX_CONNECTIONS = server.getProperty("MaximumDbConnections", 5);
		
		AUTO_CREATE_ACCOUNTS = server.getProperty("AutoCreateAccounts", true);
		
		FLOOD_PROTECTION = server.getProperty("EnableFloodProtection", true);
		FAST_CONNECTION_LIMIT = server.getProperty("FastConnectionLimit", 15);
		NORMAL_CONNECTION_TIME = server.getProperty("NormalConnectionTime", 700);
		FAST_CONNECTION_TIME = server.getProperty("FastConnectionTime", 350);
		MAX_CONNECTION_PER_IP = server.getProperty("MaxConnectionPerIP", 50);
	}
	
	public static final void loadGameServer()
	{
		LOGGER.info("Loading gameserver configuration files.");
		
		// clans settings
		loadClans();
		
		// events settings
		loadEvents();
		
		// geoengine settings
		loadGeoengine();
		
		// hexID
		loadHexID();
		
		// NPCs/monsters settings
		loadNpcs();
		
		// players settings
		loadPlayers();
		
		// siege settings
		loadSieges();
		
		// server settings
		loadServer();
	}
	
	public static final void loadLoginServer()
	{
		LOGGER.info("Loading loginserver configuration files.");
		
		// login settings
		loadLogin();
	}
	
	public static final void loadAccountManager()
	{
		LOGGER.info("Loading account manager configuration files.");
		
		// login settings
		loadLogin();
	}
	
	public static final void loadGameServerRegistration()
	{
		LOGGER.info("Loading gameserver registration configuration files.");
		
		// login settings
		loadLogin();
	}
	
	public static final class ClassMasterSettings
	{
		private final Map<Integer, Boolean> _allowedClassChange;
		private final Map<Integer, List<IntIntHolder>> _claimItems;
		private final Map<Integer, List<IntIntHolder>> _rewardItems;
		
		public ClassMasterSettings(String configLine)
		{
			_allowedClassChange = new HashMap<>(3);
			_claimItems = new HashMap<>(3);
			_rewardItems = new HashMap<>(3);
			
			if (configLine != null)
				parseConfigLine(configLine.trim());
		}
		
		private void parseConfigLine(String configLine)
		{
			StringTokenizer st = new StringTokenizer(configLine, ";");
			while (st.hasMoreTokens())
			{
				// Get allowed class change.
				int job = Integer.parseInt(st.nextToken());
				
				_allowedClassChange.put(job, true);
				
				List<IntIntHolder> items = new ArrayList<>();
				
				// Parse items needed for class change.
				if (st.hasMoreTokens())
				{
					StringTokenizer st2 = new StringTokenizer(st.nextToken(), "[],");
					while (st2.hasMoreTokens())
					{
						StringTokenizer st3 = new StringTokenizer(st2.nextToken(), "()");
						items.add(new IntIntHolder(Integer.parseInt(st3.nextToken()), Integer.parseInt(st3.nextToken())));
					}
				}
				
				// Feed the map, and clean the list.
				_claimItems.put(job, items);
				items = new ArrayList<>();
				
				// Parse gifts after class change.
				if (st.hasMoreTokens())
				{
					StringTokenizer st2 = new StringTokenizer(st.nextToken(), "[],");
					while (st2.hasMoreTokens())
					{
						StringTokenizer st3 = new StringTokenizer(st2.nextToken(), "()");
						items.add(new IntIntHolder(Integer.parseInt(st3.nextToken()), Integer.parseInt(st3.nextToken())));
					}
				}
				
				_rewardItems.put(job, items);
			}
		}
		
		public boolean isAllowed(int job)
		{
			if (_allowedClassChange == null)
				return false;
			
			if (_allowedClassChange.containsKey(job))
				return _allowedClassChange.get(job);
			
			return false;
		}
		
		public List<IntIntHolder> getRewardItems(int job)
		{
			return _rewardItems.get(job);
		}
		
		public List<IntIntHolder> getRequiredItems(int job)
		{
			return _claimItems.get(job);
		}
	}

	public static void setServerConfig(ServerConfig serverConfig) {
		SIEGE_LENGTH = serverConfig.getConfigSieges().getSiegeLength();
		MINIMUM_CLAN_LEVEL = serverConfig.getConfigSieges().getMinimumClanLevel();
		MAX_ATTACKERS_NUMBER = serverConfig.getConfigSieges().getMaxAttackersNumber();
		MAX_DEFENDERS_NUMBER = serverConfig.getConfigSieges().getMaxDefendersNumber();
		ATTACKERS_RESPAWN_DELAY = serverConfig.getConfigSieges().getAttackersRespawnDelay();
		DELETE_DAYS = serverConfig.getConfigClients().getDeleteDays();
		MAXIMUM_ONLINE_USERS = serverConfig.getConfigClients().getMaximumOnlineUsers();
		AUTO_LOOT = serverConfig.getConfigAutoLoot().getAutoLoot();
		AUTO_LOOT_HERBS = serverConfig.getConfigAutoLoot().getAutoLootHerbs();
		AUTO_LOOT_RAID = serverConfig.getConfigAutoLoot().getAutoLootRaid();
		ALLOW_DISCARDITEM = serverConfig.getConfigItemsManagement().getAllowDiscardItem();
		MULTIPLE_ITEM_DROP = serverConfig.getConfigItemsManagement().getMultipleItemDrop();
		HERB_AUTO_DESTROY_TIME = serverConfig.getConfigItemsManagement().getHerbAutoDestroyTime();
		ITEM_AUTO_DESTROY_TIME = serverConfig.getConfigItemsManagement().getItemAutoDestroyTime();
		EQUIPABLE_ITEM_AUTO_DESTROY_TIME = serverConfig.getConfigItemsManagement().getEquipableItemAutoDestroyTime();
		SPECIAL_ITEM_DESTROY_TIME = serverConfig.getConfigItemsManagement().getSpecialItemDestroyTime();
		PLAYER_DROPPED_ITEM_MULTIPLIER = serverConfig.getConfigItemsManagement().getPlayerDroppedItemMultiplier();
		RATE_XP = serverConfig.getConfigRateControl().getRateXp();
		RATE_SP = serverConfig.getConfigRateControl().getRateSp();
		RATE_PARTY_XP = serverConfig.getConfigRateControl().getRatePartyXp();
		RATE_PARTY_SP = serverConfig.getConfigRateControl().getRatePartySp();
		RATE_DROP_ADENA = serverConfig.getConfigRateControl().getRateDropAdena();
		RATE_DROP_ITEMS = serverConfig.getConfigRateControl().getRateDropItems();
		RATE_DROP_ITEMS_BY_RAID = serverConfig.getConfigRateControl().getRateDropItemsByRaid();
		RATE_DROP_SPOIL = serverConfig.getConfigRateControl().getRateDropSpoil();
		RATE_DROP_MANOR = serverConfig.getConfigRateControl().getRateDropManor();
		RATE_QUEST_DROP = serverConfig.getConfigRateControl().getRateQuestDrop();
		RATE_QUEST_REWARD = serverConfig.getConfigRateControl().getRateQuestReward();
		RATE_QUEST_REWARD_XP = serverConfig.getConfigRateControl().getRateQuestRewardXp();
		RATE_QUEST_REWARD_SP = serverConfig.getConfigRateControl().getRateQuestRewardSp();
		RATE_QUEST_REWARD_ADENA = serverConfig.getConfigRateControl().getRateQuestRewardAdena();
		RATE_KARMA_EXP_LOST = serverConfig.getConfigRateControl().getRateKarmaExpLost();
		RATE_SIEGE_GUARDS_PRICE = serverConfig.getConfigRateControl().getRateSiegeGuardsPrice();
		PLAYER_DROP_LIMIT = serverConfig.getConfigRateControl().getPlayerDropLimit();
		PLAYER_RATE_DROP = serverConfig.getConfigRateControl().getPlayerRateDrop();
		PLAYER_RATE_DROP_ITEM = serverConfig.getConfigRateControl().getPlayerRateDropItem();
		PLAYER_RATE_DROP_EQUIP = serverConfig.getConfigRateControl().getPlayerRateDropEquip();
		PLAYER_RATE_DROP_EQUIP_WEAPON = serverConfig.getConfigRateControl().getPlayerRateDropEquipWeapon();
		KARMA_DROP_LIMIT = serverConfig.getConfigRateControl().getKarmaDropLimit();
		KARMA_RATE_DROP = serverConfig.getConfigRateControl().getKarmaRateDrop();
		KARMA_RATE_DROP_ITEM = serverConfig.getConfigRateControl().getKarmaRateDropItem();
		KARMA_RATE_DROP_EQUIP = serverConfig.getConfigRateControl().getKarmaRateDropEquip();
		KARMA_RATE_DROP_EQUIP_WEAPON = serverConfig.getConfigRateControl().getKarmaRateDropEquipWeapon();
		PET_XP_RATE = serverConfig.getConfigRateControl().getPetXpRate();
		PET_FOOD_RATE = serverConfig.getConfigRateControl().getPetFoodRate();SINEATER_XP_RATE = serverConfig.getConfigRateControl().getSinEaterXpRate();
		RATE_DROP_COMMON_HERBS = serverConfig.getConfigRateControl().getRateDropCommonHerbs();
		RATE_DROP_HP_HERBS = serverConfig.getConfigRateControl().getRateDropHpHerbs();
		RATE_DROP_MP_HERBS = serverConfig.getConfigRateControl().getRateDropMpHerbs();
		RATE_DROP_SPECIAL_HERBS = serverConfig.getConfigRateControl().getRateDropSpecialHerbs();
		ALLOW_FREIGHT = serverConfig.getConfigAllowTypes().getAllowFreight();
		ALLOW_WAREHOUSE = serverConfig.getConfigAllowTypes().getAllowWarehouse();
		ALLOW_WEAR = serverConfig.getConfigAllowTypes().getAllowWear();
		WEAR_DELAY = serverConfig.getConfigAllowTypes().getWearDelay();
		WEAR_PRICE = serverConfig.getConfigAllowTypes().getWearPrice();
		ALLOW_LOTTERY = serverConfig.getConfigAllowTypes().getAllowLottery();
		ALLOW_WATER = serverConfig.getConfigAllowTypes().getAllowWater();
		ALLOW_BOAT = serverConfig.getConfigAllowTypes().getAllowBoat();
		ALLOW_CURSED_WEAPONS = serverConfig.getConfigAllowTypes().getAllowCursedWeapons();
		ALLOW_MANOR = serverConfig.getConfigAllowTypes().getAllowManor();
		ENABLE_FALLING_DAMAGE = serverConfig.getConfigAllowTypes().getEnableFallingDamage();
		LOG_CHAT = serverConfig.getConfigLogs().getLogChat();
		LOG_ITEMS = serverConfig.getConfigLogs().getLogItems();
		GMAUDIT = serverConfig.getConfigLogs().getGmAudit();
		ENABLE_COMMUNITY_BOARD = serverConfig.getConfigCommunityBoard().getEnableCommunityBoard();
		BBS_DEFAULT = serverConfig.getConfigCommunityBoard().getBbsDefault();
		ROLL_DICE_TIME = serverConfig.getConfigFloodProtectors().getRollDiceTime();
		HERO_VOICE_TIME = serverConfig.getConfigFloodProtectors().getHeroVoiceTime();
		SUBCLASS_TIME = serverConfig.getConfigFloodProtectors().getSubclassTime();
		DROP_ITEM_TIME = serverConfig.getConfigFloodProtectors().getDropItemTime();
		SERVER_BYPASS_TIME = serverConfig.getConfigFloodProtectors().getServerBypassTime();
		MULTISELL_TIME = serverConfig.getConfigFloodProtectors().getMultisellTime();
		SENDMAIL_TIME = serverConfig.getConfigFloodProtectors().getSendMailTime();
		CHARACTER_SELECT_TIME = serverConfig.getConfigFloodProtectors().getCharacterSelectTime();
		GLOBAL_CHAT_TIME = serverConfig.getConfigFloodProtectors().getGlobalChatTime();
		TRADE_CHAT_TIME = serverConfig.getConfigFloodProtectors().getTradeChatTime();
		SOCIAL_TIME = serverConfig.getConfigFloodProtectors().getSocialTime();
		L2WALKER_PROTECTION = serverConfig.getConfigMisc().getL2WalkerProtection();
		SERVER_NEWS = serverConfig.getConfigMisc().getServerNews();
		ZONE_TOWN = serverConfig.getConfigMisc().getZoneTown();
		//DISABLE_TUTORIAL = serverConfig.getConfigMisc().getDisableTutorial();
	}

	public static void setPlayersConfig(PlayersConfig playersConfig) {
		/*ATTACK_FROM_MOUNTS = playersConfig.getMisc().getATTACK_FROM_MOUNTS();
		NO_GRADE_PENALTY = playersConfig.getMisc().getNO_GRADE_PENALTY();*/
		EFFECT_CANCELING = playersConfig.getMisc().getEFFECT_CANCELING();
		HP_REGEN_MULTIPLIER = playersConfig.getMisc().getHP_REGEN_MULTIPLIER();
		MP_REGEN_MULTIPLIER = playersConfig.getMisc().getMP_REGEN_MULTIPLIER();
		CP_REGEN_MULTIPLIER = playersConfig.getMisc().getCP_REGEN_MULTIPLIER();
		PLAYER_SPAWN_PROTECTION = playersConfig.getMisc().getPLAYER_SPAWN_PROTECTION();
		PLAYER_FAKEDEATH_UP_PROTECTION = playersConfig.getMisc().getPLAYER_FAKEDEATH_UP_PROTECTION();
		RESPAWN_RESTORE_HP = playersConfig.getMisc().getRESPAWN_RESTORE_HP();
		MAX_PVTSTORE_SLOTS_DWARF = playersConfig.getMisc().getMAX_PVTSTORE_SLOTS_DWARF();
		MAX_PVTSTORE_SLOTS_OTHER = playersConfig.getMisc().getMAX_PVTSTORE_SLOTS_OTHER();
		DEEPBLUE_DROP_RULES = playersConfig.getMisc().getDEEPBLUE_DROP_RULES();
		//ALT_GAME_DELEVEL = playersConfig.getMisc().getALT_GAME_DELEVEL();
		DEATH_PENALTY_CHANCE = playersConfig.getMisc().getDEATH_PENALTY_CHANCE();
		INVENTORY_MAXIMUM_NO_DWARF = playersConfig.getInventory().getINVENTORY_MAXIMUM_NO_DWARF();
		INVENTORY_MAXIMUM_DWARF = playersConfig.getInventory().getINVENTORY_MAXIMUM_DWARF();
		//INVENTORY_MAXIMUM_QUEST_ITEMS = playersConfig.getInventory().getINVENTORY_MAXIMUM_QUEST_ITEMS();
		INVENTORY_MAXIMUM_PET = playersConfig.getInventory().getINVENTORY_MAXIMUM_PET();
		MAX_ITEM_IN_PACKET = playersConfig.getInventory().getMAX_ITEM_IN_PACKET();
		//ALT_WEIGHT_LIMIT = playersConfig.getInventory().getALT_WEIGHT_LIMIT();
		WAREHOUSE_SLOTS_NO_DWARF = playersConfig.getInventory().getWAREHOUSE_SLOTS_NO_DWARF();
		WAREHOUSE_SLOTS_DWARF = playersConfig.getInventory().getWAREHOUSE_SLOTS_DWARF();
		WAREHOUSE_SLOTS_CLAN = playersConfig.getInventory().getWAREHOUSE_SLOTS_CLAN();
		FREIGHT_SLOTS = playersConfig.getInventory().getFREIGHT_SLOTS();
		/*ALT_GAME_FREIGHTS = playersConfig.getInventory().getALT_GAME_FREIGHTS();
		ALT_GAME_FREIGHT_PRICE = playersConfig.getInventory().getALT_GAME_FREIGHT_PRICE();*/
		ENCHANT_CHANCE_WEAPON_MAGIC = playersConfig.getEnchant().getENCHANT_CHANCE_WEAPON_MAGIC();
		ENCHANT_CHANCE_WEAPON_MAGIC_15PLUS = playersConfig.getEnchant().getENCHANT_CHANCE_WEAPON_MAGIC_15PLUS();
		ENCHANT_CHANCE_WEAPON_NONMAGIC = playersConfig.getEnchant().getENCHANT_CHANCE_WEAPON_NONMAGIC();
		ENCHANT_CHANCE_WEAPON_NONMAGIC_15PLUS = playersConfig.getEnchant().getENCHANT_CHANCE_WEAPON_NONMAGIC_15PLUS();
		ENCHANT_CHANCE_ARMOR = playersConfig.getEnchant().getENCHANT_CHANCE_ARMOR();
		ENCHANT_MAX_WEAPON = playersConfig.getEnchant().getENCHANT_MAX_WEAPON();
		ENCHANT_MAX_ARMOR = playersConfig.getEnchant().getENCHANT_MAX_ARMOR();
		ENCHANT_SAFE_MAX = playersConfig.getEnchant().getENCHANT_SAFE_MAX();
		ENCHANT_SAFE_MAX_FULL = playersConfig.getEnchant().getENCHANT_SAFE_MAX_FULL();
		AUGMENTATION_NG_SKILL_CHANCE = playersConfig.getAugmentation().getAUGMENTATION_NG_SKILL_CHANCE();
		AUGMENTATION_NG_GLOW_CHANCE = playersConfig.getAugmentation().getAUGMENTATION_NG_GLOW_CHANCE();
		AUGMENTATION_MID_SKILL_CHANCE = playersConfig.getAugmentation().getAUGMENTATION_MID_SKILL_CHANCE();
		AUGMENTATION_MID_GLOW_CHANCE = playersConfig.getAugmentation().getAUGMENTATION_MID_GLOW_CHANCE();
		AUGMENTATION_HIGH_SKILL_CHANCE = playersConfig.getAugmentation().getAUGMENTATION_HIGH_SKILL_CHANCE();
		AUGMENTATION_HIGH_GLOW_CHANCE = playersConfig.getAugmentation().getAUGMENTATION_HIGH_GLOW_CHANCE();
		AUGMENTATION_TOP_SKILL_CHANCE = playersConfig.getAugmentation().getAUGMENTATION_TOP_SKILL_CHANCE();
		AUGMENTATION_TOP_GLOW_CHANCE = playersConfig.getAugmentation().getAUGMENTATION_TOP_GLOW_CHANCE();
		AUGMENTATION_BASESTAT_CHANCE = playersConfig.getAugmentation().getAUGMENTATION_BASESTAT_CHANCE();
		//KARMA_PLAYER_CAN_BE_KILLED_IN_PZ = playersConfig.getKarmaPvP().getKARMA_PLAYER_CAN_BE_KILLED_IN_PZ();
		KARMA_PLAYER_CAN_SHOP = playersConfig.getKarmaPvP().getKARMA_PLAYER_CAN_SHOP();
		KARMA_PLAYER_CAN_USE_GK = playersConfig.getKarmaPvP().getKARMA_PLAYER_CAN_USE_GK();
		KARMA_PLAYER_CAN_TELEPORT = playersConfig.getKarmaPvP().getKARMA_PLAYER_CAN_TELEPORT();
		KARMA_PLAYER_CAN_TRADE = playersConfig.getKarmaPvP().getKARMA_PLAYER_CAN_TRADE();
		KARMA_PLAYER_CAN_USE_WH = playersConfig.getKarmaPvP().getKARMA_PLAYER_CAN_USE_WH();
		KARMA_DROP_GM = playersConfig.getKarmaPvP().getKARMA_DROP_GM();
		KARMA_AWARD_PK_KILL = playersConfig.getKarmaPvP().getKARMA_AWARD_PK_KILL();
		KARMA_PK_LIMIT = playersConfig.getKarmaPvP().getKARMA_PK_LIMIT();
		/*KARMA_NONDROPPABLE_PET_ITEMS = playersConfig.getKarmaPvP().getKARMA_NONDROPPABLE_PET_ITEMS();
		KARMA_NONDROPPABLE_ITEMS = playersConfig.getKarmaPvP().getKARMA_NONDROPPABLE_ITEMS();
		KARMA_LIST_NONDROPPABLE_PET_ITEMS = playersConfig.getKarmaPvP().getKARMA_LIST_NONDROPPABLE_PET_ITEMS();
		KARMA_LIST_NONDROPPABLE_ITEMS = playersConfig.getKarmaPvP().getKARMA_LIST_NONDROPPABLE_ITEMS();*/
		PVP_NORMAL_TIME = playersConfig.getKarmaPvP().getPVP_NORMAL_TIME();
		PVP_PVP_TIME = playersConfig.getKarmaPvP().getPVP_PVP_TIME();
		PARTY_XP_CUTOFF_METHOD = playersConfig.getParty().getPARTY_XP_CUTOFF_METHOD();
		PARTY_XP_CUTOFF_LEVEL = playersConfig.getParty().getPARTY_XP_CUTOFF_LEVEL();
		PARTY_XP_CUTOFF_PERCENT = playersConfig.getParty().getPARTY_XP_CUTOFF_PERCENT();
		PARTY_RANGE = playersConfig.getParty().getPARTY_RANGE();
		DEFAULT_ACCESS_LEVEL = playersConfig.getGmAdmin().getDEFAULT_ACCESS_LEVEL();
		GM_HERO_AURA = playersConfig.getGmAdmin().getGM_HERO_AURA();
		GM_STARTUP_INVULNERABLE = playersConfig.getGmAdmin().getGM_STARTUP_INVULNERABLE();
		GM_STARTUP_INVISIBLE = playersConfig.getGmAdmin().getGM_STARTUP_INVISIBLE();
		//GM_STARTUP_SILENCE = playersConfig.getGmAdmin().getGM_STARTUP_SILENCE();
		GM_STARTUP_AUTO_LIST = playersConfig.getGmAdmin().getGM_STARTUP_AUTO_LIST();
		PETITIONING_ALLOWED = playersConfig.getPetition().getPETITIONING_ALLOWED();
		MAX_PETITIONS_PER_PLAYER = playersConfig.getPetition().getMAX_PETITIONS_PER_PLAYER();
		MAX_PETITIONS_PENDING = playersConfig.getPetition().getMAX_PETITIONS_PENDING();
		IS_CRAFTING_ENABLED = playersConfig.getCrafting().getIS_CRAFTING_ENABLED();
		DWARF_RECIPE_LIMIT = playersConfig.getCrafting().getDWARF_RECIPE_LIMIT();
		COMMON_RECIPE_LIMIT = playersConfig.getCrafting().getCOMMON_RECIPE_LIMIT();
		//ALT_BLACKSMITH_USE_RECIPES = playersConfig.getCrafting().getALT_BLACKSMITH_USE_RECIPES();
		AUTO_LEARN_SKILLS = playersConfig.getSkillsClasses().getAUTO_LEARN_SKILLS();
		MAGIC_FAILURES = playersConfig.getSkillsClasses().getMAGIC_FAILURES();
		PERFECT_SHIELD_BLOCK_RATE = playersConfig.getSkillsClasses().getPERFECT_SHIELD_BLOCK_RATE();
		LIFE_CRYSTAL_NEEDED = playersConfig.getSkillsClasses().getLIFE_CRYSTAL_NEEDED();
		SP_BOOK_NEEDED = playersConfig.getSkillsClasses().getSP_BOOK_NEEDED();
		ES_SP_BOOK_NEEDED = playersConfig.getSkillsClasses().getES_SP_BOOK_NEEDED();
		DIVINE_SP_BOOK_NEEDED = playersConfig.getSkillsClasses().getDIVINE_SP_BOOK_NEEDED();
		SUBCLASS_WITHOUT_QUESTS = playersConfig.getSkillsClasses().getSUBCLASS_WITHOUT_QUESTS();
		STORE_SKILL_COOLTIME = playersConfig.getBuffs().getSTORE_SKILL_COOLTIME();
		MAX_BUFFS_AMOUNT = playersConfig.getBuffs().getMAX_BUFFS_AMOUNT();
	}

	public static void setNpcsConfig(NpcsConfig npcsConfig) {
		/*CHAMPION_FREQUENCY = npcsConfig.getChampionSettings().getFrequency();
		CHAMP_MIN_LVL = npcsConfig.getChampionSettings().getMinLvl();
		CHAMP_MAX_LVL = npcsConfig.getChampionSettings().getMaxLvl();
		CHAMPION_HP = npcsConfig.getChampionSettings().getHp();
		CHAMPION_REWARDS = npcsConfig.getChampionSettings().getRewards();
		CHAMPION_ADENAS_REWARDS = npcsConfig.getChampionSettings().getAdenasRewards();
		CHAMPION_HP_REGEN = npcsConfig.getChampionSettings().getHpRegen();
		CHAMPION_ATK = npcsConfig.getChampionSettings().getAttack();
		CHAMPION_SPD_ATK = npcsConfig.getChampionSettings().getSpeedAttack();
		CHAMPION_REWARD = npcsConfig.getChampionSettings().getReward();
		CHAMPION_REWARD_ID = npcsConfig.getChampionSettings().getRewardId();
		CHAMPION_REWARD_QTY = npcsConfig.getChampionSettings().getRewardQty();*/
		ALLOW_CLASS_MASTERS = npcsConfig.getClassMasterSettings().getAllowClassMasters();
		ALLOW_ENTIRE_TREE = npcsConfig.getClassMasterSettings().getAllowEntireTree();
		BUFFER_MAX_SCHEMES = npcsConfig.getClassMasterSettings().getBufferSettings().getMaxSchemes();
		BUFFER_STATIC_BUFF_COST = npcsConfig.getClassMasterSettings().getBufferSettings().getStaticBuffCost();
		WYVERN_ALLOW_UPGRADER = npcsConfig.getWyvernManagerSettings().getAllowUpgrader();
		WYVERN_REQUIRED_LEVEL = npcsConfig.getWyvernManagerSettings().getRequiredLevel();
		WYVERN_REQUIRED_CRYSTALS = npcsConfig.getWyvernManagerSettings().getRequiredCrystals();
		RAID_HP_REGEN_MULTIPLIER = npcsConfig.getRaidBossSettings().getHpRegenMultiplier();
		RAID_MP_REGEN_MULTIPLIER = npcsConfig.getRaidBossSettings().getMpRegenMultiplier();
		RAID_DEFENCE_MULTIPLIER = npcsConfig.getRaidBossSettings().getDefenceMultiplier();
		RAID_MINION_RESPAWN_TIMER = npcsConfig.getRaidBossSettings().getMinionRespawnTimer();
		RAID_DISABLE_CURSE = npcsConfig.getRaidBossSettings().getDisableCurse();
		SPAWN_INTERVAL_AQ = npcsConfig.getGrandBossSettings().getSpawnIntervalAQ();
		RANDOM_SPAWN_TIME_AQ = npcsConfig.getGrandBossSettings().getRandomSpawnTimeAQ();
		SPAWN_INTERVAL_ANTHARAS = npcsConfig.getGrandBossSettings().getSpawnIntervalAntharas();
		RANDOM_SPAWN_TIME_ANTHARAS = npcsConfig.getGrandBossSettings().getRandomSpawnTimeAntharas();
		WAIT_TIME_ANTHARAS = npcsConfig.getGrandBossSettings().getWaitTimeAntharas();
		SPAWN_INTERVAL_BAIUM = npcsConfig.getGrandBossSettings().getSpawnIntervalBaium();
		RANDOM_SPAWN_TIME_BAIUM = npcsConfig.getGrandBossSettings().getRandomSpawnTimeBaium();
		SPAWN_INTERVAL_CORE = npcsConfig.getGrandBossSettings().getSpawnIntervalCore();
		RANDOM_SPAWN_TIME_CORE = npcsConfig.getGrandBossSettings().getRandomSpawnTimeCore();
		SPAWN_INTERVAL_FRINTEZZA = npcsConfig.getGrandBossSettings().getSpawnIntervalFrintezza();
		RANDOM_SPAWN_TIME_FRINTEZZA = npcsConfig.getGrandBossSettings().getRandomSpawnTimeFrintezza();
		WAIT_TIME_FRINTEZZA = npcsConfig.getGrandBossSettings().getWaitTimeFrintezza();
		GUARD_ATTACK_AGGRO_MOB = npcsConfig.getAiSettings().getGuardAttackAggroMob();
		MAX_DRIFT_RANGE = npcsConfig.getAiSettings().getMaxDriftRange();
		MIN_NPC_ANIMATION = npcsConfig.getAiSettings().getMinNPCAnimation();
		MAX_NPC_ANIMATION = npcsConfig.getAiSettings().getMaxNPCAnimation();
		MIN_MONSTER_ANIMATION = npcsConfig.getAiSettings().getMinMonsterAnimation();
		MAX_MONSTER_ANIMATION = npcsConfig.getAiSettings().getMaxMonsterAnimation();
	}

	public static void setLoginServerConfig(LoginServerConfig loginServerConfig) {
		/*LOGIN_BIND_ADDRESS = loginServerConfig.getLOGIN_BIND_ADDRESS();
		PORT_LOGIN = loginServerConfig.getPORT_LOGIN();*/
		LOGIN_TRY_BEFORE_BAN = loginServerConfig.getLOGIN_TRY_BEFORE_BAN();
		LOGIN_BLOCK_AFTER_BAN = loginServerConfig.getLOGIN_BLOCK_AFTER_BAN();
		ACCEPT_NEW_GAMESERVER = loginServerConfig.getACCEPT_NEW_GAMESERVER();
		SHOW_LICENCE = loginServerConfig.getSHOW_LICENCE();
		AUTO_CREATE_ACCOUNTS = loginServerConfig.getAUTO_CREATE_ACCOUNTS();
		//LOG_LOGIN_CONTROLLER = loginServerConfig.getLOG_LOGIN_CONTROLLER();
		FLOOD_PROTECTION = loginServerConfig.getFLOOD_PROTECTION();
		FAST_CONNECTION_LIMIT = loginServerConfig.getFAST_CONNECTION_LIMIT();
		NORMAL_CONNECTION_TIME = loginServerConfig.getNORMAL_CONNECTION_TIME();
		FAST_CONNECTION_TIME = loginServerConfig.getFAST_CONNECTION_TIME();
		MAX_CONNECTION_PER_IP = loginServerConfig.getMAX_CONNECTION_PER_IP();
	}

	public static void setClanConfig(ClanConfig clanConfig) {
		/*ALT_CLAN_JOIN_DAYS = clanConfig.getGeneralClanConfig().getALT_CLAN_JOIN_DAYS();
		ALT_CLAN_CREATE_DAYS = clanConfig.getGeneralClanConfig().getALT_CLAN_CREATE_DAYS();
		ALT_CLAN_DISSOLVE_DAYS = clanConfig.getGeneralClanConfig().getALT_CLAN_DISSOLVE_DAYS();
		ALT_ALLY_JOIN_DAYS_WHEN_LEAVED = clanConfig.getGeneralClanConfig().getALT_ALLY_JOIN_DAYS_WHEN_LEAVED();
		ALT_ALLY_JOIN_DAYS_WHEN_DISMISSED = clanConfig.getGeneralClanConfig().getALT_ALLY_JOIN_DAYS_WHEN_DISMISSED();
		ALT_ACCEPT_CLAN_DAYS_WHEN_DISMISSED = clanConfig.getGeneralClanConfig().getALT_ACCEPT_CLAN_DAYS_WHEN_DISMISSED();
		ALT_CREATE_ALLY_DAYS_WHEN_DISSOLVED = clanConfig.getGeneralClanConfig().getALT_CREATE_ALLY_DAYS_WHEN_DISSOLVED();
		ALT_MAX_NUM_OF_CLANS_IN_ALLY = clanConfig.getGeneralClanConfig().getALT_MAX_NUM_OF_CLANS_IN_ALLY();
		ALT_CLAN_MEMBERS_FOR_WAR = clanConfig.getGeneralClanConfig().getALT_CLAN_MEMBERS_FOR_WAR();
		ALT_CLAN_WAR_PENALTY_WHEN_ENDED = clanConfig.getGeneralClanConfig().getALT_CLAN_WAR_PENALTY_WHEN_ENDED();
		ALT_MEMBERS_CAN_WITHDRAW_FROM_CLANWH = clanConfig.getGeneralClanConfig().getALT_MEMBERS_CAN_WITHDRAW_FROM_CLANWH();
		ALT_MANOR_REFRESH_TIME = clanConfig.getManorConfig().getALT_MANOR_REFRESH_TIME();
		ALT_MANOR_REFRESH_MIN = clanConfig.getManorConfig().getALT_MANOR_REFRESH_MIN();
		ALT_MANOR_APPROVE_TIME = clanConfig.getManorConfig().getALT_MANOR_APPROVE_TIME();
		ALT_MANOR_APPROVE_MIN = clanConfig.getManorConfig().getALT_MANOR_APPROVE_MIN();
		ALT_MANOR_MAINTENANCE_MIN = clanConfig.getManorConfig().getALT_MANOR_MAINTENANCE_MIN();
		ALT_MANOR_SAVE_PERIOD_RATE = clanConfig.getManorConfig().getALT_MANOR_SAVE_PERIOD_RATE();*/
	}

	public static void setEventConfig(EventConfig eventConfig) {
		ALLOW_WEDDING = eventConfig.getWeddingConfig().getALLOW_WEDDING();
		WEDDING_PRICE = eventConfig.getWeddingConfig().getWEDDING_PRICE();
		WEDDING_SAMESEX = eventConfig.getWeddingConfig().getWEDDING_SAMESEX();
		WEDDING_FORMALWEAR = eventConfig.getWeddingConfig().getWEDDING_FORMALWEAR();
		/*ALT_LOTTERY_PRIZE = eventConfig.getLoterryConfig().getALT_LOTTERY_PRIZE();
		ALT_LOTTERY_TICKET_PRICE = eventConfig.getLoterryConfig().getALT_LOTTERY_TICKET_PRICE();
		ALT_LOTTERY_5_NUMBER_RATE = eventConfig.getLoterryConfig().getALT_LOTTERY_5_NUMBER_RATE();
		ALT_LOTTERY_4_NUMBER_RATE = eventConfig.getLoterryConfig().getALT_LOTTERY_4_NUMBER_RATE();
		ALT_LOTTERY_3_NUMBER_RATE = eventConfig.getLoterryConfig().getALT_LOTTERY_3_NUMBER_RATE();
		ALT_LOTTERY_2_AND_1_NUMBER_PRIZE = eventConfig.getLoterryConfig().getALT_LOTTERY_2_AND_1_NUMBER_PRIZE();
		ALT_FISH_CHAMPIONSHIP_REWARD_ITEM = eventConfig.getFishingConfig().getALT_FISH_CHAMPIONSHIP_REWARD_ITEM();
		ALT_FISH_CHAMPIONSHIP_REWARD_1 = eventConfig.getFishingConfig().getALT_FISH_CHAMPIONSHIP_REWARD_1();
		ALT_FISH_CHAMPIONSHIP_REWARD_2 = eventConfig.getFishingConfig().getALT_FISH_CHAMPIONSHIP_REWARD_2();
		ALT_FISH_CHAMPIONSHIP_REWARD_3 = eventConfig.getFishingConfig().getALT_FISH_CHAMPIONSHIP_REWARD_3();
		ALT_FISH_CHAMPIONSHIP_REWARD_4 = eventConfig.getFishingConfig().getALT_FISH_CHAMPIONSHIP_REWARD_4();
		ALT_FISH_CHAMPIONSHIP_REWARD_5 = eventConfig.getFishingConfig().getALT_FISH_CHAMPIONSHIP_REWARD_5();*/
		RIFT_MIN_PARTY_SIZE = eventConfig.getDimensionalRiftConfig().getRIFT_MIN_PARTY_SIZE();
		RIFT_SPAWN_DELAY = eventConfig.getDimensionalRiftConfig().getRIFT_SPAWN_DELAY();
		RIFT_MAX_JUMPS = eventConfig.getDimensionalRiftConfig().getRIFT_MAX_JUMPS();
		RIFT_AUTO_JUMPS_TIME_MIN = eventConfig.getDimensionalRiftConfig().getRIFT_AUTO_JUMPS_TIME_MIN();
		RIFT_AUTO_JUMPS_TIME_MAX = eventConfig.getDimensionalRiftConfig().getRIFT_AUTO_JUMPS_TIME_MAX();
		RIFT_ENTER_COST_RECRUIT = eventConfig.getDimensionalRiftConfig().getRIFT_ENTER_COST_RECRUIT();
		RIFT_ENTER_COST_SOLDIER = eventConfig.getDimensionalRiftConfig().getRIFT_ENTER_COST_SOLDIER();
		RIFT_ENTER_COST_OFFICER = eventConfig.getDimensionalRiftConfig().getRIFT_ENTER_COST_OFFICER();
		RIFT_ENTER_COST_CAPTAIN = eventConfig.getDimensionalRiftConfig().getRIFT_ENTER_COST_CAPTAIN();
		RIFT_ENTER_COST_COMMANDER = eventConfig.getDimensionalRiftConfig().getRIFT_ENTER_COST_COMMANDER();
		FS_TIME_ENTRY = eventConfig.getFourSepulchersConfig().getFS_TIME_ENTRY();
		FS_TIME_END = eventConfig.getFourSepulchersConfig().getFS_TIME_END();
		FS_PARTY_MEMBER_COUNT = eventConfig.getFourSepulchersConfig().getFS_PARTY_MEMBER_COUNT();
		/*ALT_OLY_START_TIME = eventConfig.getOlympiadConfig().getAltOlyStartTime();
		ALT_OLY_MIN = eventConfig.getOlympiadConfig().getAltOlyMin();
		ALT_OLY_CPERIOD = eventConfig.getOlympiadConfig().getAltOlyCPeriod();
		ALT_OLY_BATTLE = eventConfig.getOlympiadConfig().getAltOlyBattle();
		ALT_OLY_WPERIOD = eventConfig.getOlympiadConfig().getAltOlyWPeriod();
		ALT_OLY_VPERIOD = eventConfig.getOlympiadConfig().getAltOlyVPeriod();
		ALT_OLY_WAIT_TIME = eventConfig.getOlympiadConfig().getAltOlyWaitTime();
		ALT_OLY_WAIT_BATTLE = eventConfig.getOlympiadConfig().getAltOlyWaitBattle();
		ALT_OLY_WAIT_END = eventConfig.getOlympiadConfig().getAltOlyWaitEnd();
		ALT_OLY_START_POINTS = eventConfig.getOlympiadConfig().getAltOlyStartPoints();
		ALT_OLY_WEEKLY_POINTS = eventConfig.getOlympiadConfig().getAltOlyWeeklyPoints();
		ALT_OLY_MIN_MATCHES = eventConfig.getOlympiadConfig().getAltOlyMinMatches();
		ALT_OLY_CLASSED = eventConfig.getOlympiadConfig().getAltOlyClassed();
		ALT_OLY_NONCLASSED = eventConfig.getOlympiadConfig().getAltOlyNonClassed();

		ALT_OLY_CLASSED_REWARD = extractedList(
				eventConfig.getOlympiadConfig().getAltOlyClassedReward()
		);
		ALT_OLY_NONCLASSED_REWARD = extractedList(
				eventConfig.getOlympiadConfig().getAltOlyNonClassedReward()
		);
		ALT_OLY_GP_PER_POINT = eventConfig.getOlympiadConfig().getAltOlyGpPerPoint();
		ALT_OLY_HERO_POINTS = eventConfig.getOlympiadConfig().getAltOlyHeroPoints();
		ALT_OLY_RANK1_POINTS = eventConfig.getOlympiadConfig().getAltOlyRank1Points();
		ALT_OLY_RANK2_POINTS = eventConfig.getOlympiadConfig().getAltOlyRank2Points();
		ALT_OLY_RANK3_POINTS = eventConfig.getOlympiadConfig().getAltOlyRank3Points();
		ALT_OLY_RANK4_POINTS = eventConfig.getOlympiadConfig().getAltOlyRank4Points();
		ALT_OLY_RANK5_POINTS = eventConfig.getOlympiadConfig().getAltOlyRank5Points();
		ALT_OLY_MAX_POINTS = eventConfig.getOlympiadConfig().getAltOlyMaxPoints();
		ALT_OLY_DIVIDER_CLASSED = eventConfig.getOlympiadConfig().getAltOlyDividerClassed();
		ALT_OLY_DIVIDER_NON_CLASSED = eventConfig.getOlympiadConfig().getAltOlyDividerNonClassed();
		ALT_OLY_ANNOUNCE_GAMES = eventConfig.getOlympiadConfig().getAltOlyAnnounceGames();*/
	}

	private static IntIntHolder[] extractedList(List<RewardHolder> listOfElements) {
		IntIntHolder[] temp =  new IntIntHolder[listOfElements.size()];
		for (int i = 0; i< listOfElements.size(); i++){
			temp[i] = listOfElements.get(i).rewardHolderToIntIntHolder();
		}
		return temp;
	}

}