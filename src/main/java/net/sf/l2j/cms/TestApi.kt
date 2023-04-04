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

lateinit var testApi : TestApi

class TestApi {

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
            testApi = TestApi()
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
        route("/config") {
            val configFields = Config::class.java.fields

            configFields.forEach { field ->
                get("/${field.name}") {
                    val fieldValue = field.getInt(Config)
                    call.respond(mapOf(field.name to fieldValue))
                }
            }
        }

        // Routes to set values of Config fields
        route("/config") {
            val configFields = Config::class.java.fields

            configFields.forEach { field ->
                post("/${field.name}") {
                    val fieldValue = call.receive<Int>()
                    field.setInt(Config, fieldValue)
                    call.respond(mapOf(field.name to fieldValue))
                }
            }
        }
    }
}
