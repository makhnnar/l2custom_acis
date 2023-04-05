package net.sf.l2j.cms.models

import net.sf.l2j.Config

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
) {
    companion object {
        private val fieldMap = mapOf(
            "LOGIN_BIND_ADDRESS" to Config::LOGIN_BIND_ADDRESS,
            "PORT_LOGIN" to Config::PORT_LOGIN,
            "LOGIN_TRY_BEFORE_BAN" to Config::LOGIN_TRY_BEFORE_BAN,
            "LOGIN_BLOCK_AFTER_BAN" to Config::LOGIN_BLOCK_AFTER_BAN,
            "ACCEPT_NEW_GAMESERVER" to Config::ACCEPT_NEW_GAMESERVER,
            "SHOW_LICENCE" to Config::SHOW_LICENCE,
            "AUTO_CREATE_ACCOUNTS" to Config::AUTO_CREATE_ACCOUNTS,
            "LOG_LOGIN_CONTROLLER" to Config::LOG_LOGIN_CONTROLLER,
            "FLOOD_PROTECTION" to Config::FLOOD_PROTECTION,
            "FAST_CONNECTION_LIMIT" to Config::FAST_CONNECTION_LIMIT,
            "NORMAL_CONNECTION_TIME" to Config::NORMAL_CONNECTION_TIME,
            "FAST_CONNECTION_TIME" to Config::FAST_CONNECTION_TIME,
            "MAX_CONNECTION_PER_IP" to Config::MAX_CONNECTION_PER_IP
        )
    }
}
