package cn.com.misakanetwork.plugins

import io.ktor.server.application.*
import io.ktor.server.locations.*
import io.ktor.server.plugins.autohead.*

@OptIn(KtorExperimentalLocationsAPI::class)
fun Application.configureRouting() {
	install(AutoHeadResponse)
	install(Locations)
}
