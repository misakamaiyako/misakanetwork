package cn.com.misakanetwork.dto

import kotlinx.serialization.Serializable

@Serializable
data class UserDto(val id: Int?, val name: String?)

@Serializable
data class LoginDTO(val name:String,val password:String)
