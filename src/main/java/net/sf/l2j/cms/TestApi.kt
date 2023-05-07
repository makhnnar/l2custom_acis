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
import net.sf.l2j.cms.models.ServerConfig

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

//todo: buscar una forma de manejar los tipos de forma dinamica. 1 usar directamente el objeto de consulta, o
// retornar un json con un campo de tipo, o detectar el tipo a travez del map

fun Application.configureRouting() {
    routing {
        route("/serverConfig") {
            val serverConfig = ServerConfig()
            get("/all") {
                call.respond(serverConfig)
            }
            post("/{value}") {
                val configFields = Config::class.java.fields
                val fieldName = call.parameters["value"]
                val fieldValue = call.receive<String>()
                val clazz = Config::class.java
                val field = clazz.getDeclaredField(fieldName)
                println("$fieldName : ${field.type.cast(fieldValue)}")
                field.isAccessible = true
                field.set(null, field.type.cast(fieldValue))
                configFields.find {
                    it.name == fieldName
                }?.let {
                    call.respond(
                        mapOf(
                            "fieldName" to "it.get(Config::class)",
                            fieldName to it.get(Config::class)
                        )
                    )
                }
                call.respond(
                    mapOf(
                        "fieldName" to "fieldValue",
                        fieldName to fieldValue
                    )
                )
            }
        }

        // Routes to set values of Config fields
        route("/config") {
            val configFields = Config::class.java.fields
            configFields.forEach { field ->
                post("/${field.name}") {
                    val fieldValue = call.receive<String>()
                    println("${field.name} : $fieldValue")
                    field.set(Config::class, fieldValue)
                    call.respond(
                        mapOf(field.name to fieldValue)
                    )
                }
            }
        }
    }
}
