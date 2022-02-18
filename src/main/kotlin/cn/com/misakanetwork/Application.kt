package cn.com.misakanetwork

import cn.com.misakanetwork.plugins.*
import cn.com.misakanetwork.route.router
import io.ktor.application.*
import io.ktor.features.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.util.pipeline.*


fun main(args: Array<String>) = io.ktor.server.netty.EngineMain.main(args)


@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    statusPages()
    configureRouting()
    configureHTTP()
    configureMonitoring()
    configureSerialization()
    session()
    router()
    install(Helmet)
    val beforeFallback = PipelinePhase("")
    insertPhaseBefore(ApplicationCallPipeline.Fallback, beforeFallback)
    intercept(beforeFallback) {
        if (call.response.status() == null) {
            throw NotFoundException()
        }
    }
}
