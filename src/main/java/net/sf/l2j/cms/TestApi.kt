package net.sf.l2j.cms

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
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
}

fun Application.configureRouting() {
    routing {
        get("/playerConfigs") {
            call.respondText("ATTACK_FROM_MOUNTS = ${Config.ATTACK_FROM_MOUNTS}")
        }
    }
}
