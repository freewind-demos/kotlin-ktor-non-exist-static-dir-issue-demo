package example

import io.ktor.content.default
import io.ktor.content.static
import io.ktor.content.staticRootFolder
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import java.io.File

fun main(args: Array<String>) {
    val server = embeddedServer(Netty, port = 8080) {
        routing {
            static("/") {
                staticRootFolder = File("./non-existent-static")
                default("index.html")
            }
        }
    }
    server.start(wait = true)
}
