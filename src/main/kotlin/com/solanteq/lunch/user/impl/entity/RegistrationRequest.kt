package com.solanteq.lunch.user.impl.entity

data class RegistrationRequest(
    val login: String,
    val email: String,
    val password: String
)
