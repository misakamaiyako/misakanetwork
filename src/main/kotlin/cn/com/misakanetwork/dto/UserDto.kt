package cn.com.misakanetwork.dto

import cn.com.misakanetwork.plugins.AuthenticationException
import kotlinx.serialization.Serializable

@Serializable
data class UserDto(val id: Int?, val name: String?) {
    init {
        if (id == null || name == null) {
            throw AuthenticationException()
        }
    }
}

@Serializable
data class LoginDTO(val name:String,val password:String)
