package net.sf.l2j.cms.models

import kotlinx.serialization.Serializable
import net.sf.l2j.Config

@Serializable
data class LoginServerConfig(
    var LOGIN_BIND_ADDRESS: String = Config.LOGIN_BIND_ADDRESS,
    var PORT_LOGIN: Int = Config.PORT_LOGIN,
    var LOGIN_TRY_BEFORE_BAN: Int = Config.LOGIN_TRY_BEFORE_BAN,
    var LOGIN_BLOCK_AFTER_BAN: Int = Config.LOGIN_BLOCK_AFTER_BAN,
    var ACCEPT_NEW_GAMESERVER: Boolean = Config.ACCEPT_NEW_GAMESERVER,
    var SHOW_LICENCE: Boolean = Config.SHOW_LICENCE,
    var AUTO_CREATE_ACCOUNTS: Boolean = Config.AUTO_CREATE_ACCOUNTS,
    var LOG_LOGIN_CONTROLLER: Boolean = Config.LOG_LOGIN_CONTROLLER,
    var FLOOD_PROTECTION: Boolean = Config.FLOOD_PROTECTION,
    var FAST_CONNECTION_LIMIT: Int = Config.FAST_CONNECTION_LIMIT,
    var NORMAL_CONNECTION_TIME: Int = Config.NORMAL_CONNECTION_TIME,
    var FAST_CONNECTION_TIME: Int = Config.FAST_CONNECTION_TIME,
    var MAX_CONNECTION_PER_IP: Int = Config.MAX_CONNECTION_PER_IP
)
