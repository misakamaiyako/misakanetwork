package cn.com.misakanetwork.plugins

import io.ktor.server.application.*
import io.ktor.server.plugins.autohead.*

fun Application.configureRouting() {
    install(AutoHeadResponse)
}
