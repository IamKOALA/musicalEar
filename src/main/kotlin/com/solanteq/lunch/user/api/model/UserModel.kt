package com.solanteq.lunch.user.api.model

import com.fasterxml.jackson.annotation.JsonIgnore
import java.util.*

data class UserModel (
    val id: Long,
    val login: String,
    val email: String,
    @JsonIgnore
    val password: String)
