package cn.com.misakanetwork.plugins

import io.ktor.server.application.*
import io.ktor.server.plugins.conditionalheaders.*
import io.ktor.server.plugins.defaultheaders.*
import io.ktor.server.plugins.partialcontent.*

fun Application.configureHTTP() {
	install(ConditionalHeaders)
	install(DefaultHeaders) {
		header("X-Engine", "Ktor") // will send this header with each response
	}
	install(PartialContent) {
		// Maximum number of ranges that will be accepted from a HTTP request.
		// If the HTTP request specifies more ranges, they will all be merged into a single range.
		maxRangeCount = 10
	}

}
