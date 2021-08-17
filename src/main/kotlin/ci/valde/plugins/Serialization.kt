package ci.valde.plugins

import ci.valde.XmlConverter
import io.ktor.gson.*
import io.ktor.features.*
import io.ktor.jackson.*
import com.fasterxml.jackson.databind.*
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.request.*
import io.ktor.routing.*

fun Application.configureSerialization() {
    install(ContentNegotiation) {
        gson {
        }
        register(ContentType.Application.Xml, XmlConverter())
    }

    routing {
        get("/json/gson") {
            call.respond(mapOf("hello" to "world"))
        }
        get("/json/jackson") {
            call.respond(mapOf("hello" to "world"))
        }
        get("/car"){
            call.respond(Car("Nissan Kicks", "Gray", 88))
        }
    }
}

data class Car(val name: String, val color: String, val fuel: Int)
