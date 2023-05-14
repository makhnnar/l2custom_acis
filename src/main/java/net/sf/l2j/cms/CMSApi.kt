package net.sf.l2j.cms

import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import net.sf.l2j.Config
import net.sf.l2j.cms.models.*

lateinit var cmsApi : CMSApi

class CMSApi {

    init {
        embeddedServer(
            Netty,
            port = 8080,
            host = "0.0.0.0",
            module = Application::module
        ).start(wait = true)
    }

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            cmsApi = CMSApi()
        }

    }

}

fun Application.module() {
    configureRouting()
    configureSerialization()
}

fun Application.configureSerialization() {
    install(ContentNegotiation) {
        json()
    }
}

fun Application.configureRouting() {
    routing {
        route("/serverConfig") {
            val serverConfig = ServerConfig()
            get {
                call.respond(serverConfig)
            }
            post {
                val body = call.receive<ServerConfig>()
                println("received : $body")
                Config.setServerConfig(body)
                call.respond(
                    mapOf(
                        "response" to "all the field for server configs were updated",
                    )
                )
            }
        }
        route("/playersConfig") {
            val playersConfig = PlayersConfig()
            get {
                call.respond(playersConfig)
            }
            post {
                val body = call.receive<PlayersConfig>()
                println("received : $body")
                Config.setPlayersConfig(body)
                call.respond(
                    mapOf(
                        "response" to "all the field for Player configs were updated",
                    )
                )
            }
        }
        route("/npcsConfig") {
            val npcsConfig = NpcsConfig()
            get {
                call.respond(npcsConfig)
            }
            post {
                val body = call.receive<NpcsConfig>()
                println("received : $body")
                Config.setNpcsConfig(body)
                call.respond(
                    mapOf(
                        "response" to "all the field for Npcs configs were updated",
                    )
                )
            }
        }
        route("/loginServerConfig") {
            val loginServerConfig = LoginServerConfig()
            get {
                call.respond(loginServerConfig)
            }
            post {
                val body = call.receive<LoginServerConfig>()
                println("received : $body")
                Config.setLoginServerConfig(body)
                call.respond(
                    mapOf(
                        "response" to "all the field for Login Server configs were updated",
                    )
                )
            }
        }
        route("/clanConfig") {
            val clanConfig = ClanConfig()
            get {
                call.respond(clanConfig)
            }
            post {
                val body = call.receive<ClanConfig>()
                println("received : $body")
                Config.setClanConfig(body)
                call.respond(
                    mapOf(
                        "response" to "all the field for Clan configs were updated",
                    )
                )
            }
        }
        route("/eventConfig") {
            val eventConfig = EventConfig()
            get {
                call.respond(eventConfig)
            }
            post {
                val body = call.receive<EventConfig>()
                println("received : $body")
                Config.setEventConfig(body)
                call.respond(
                    mapOf(
                        "response" to "all the field for Event configs were updated",
                    )
                )
            }
        }
    }
}
