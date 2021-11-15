package com.solanteq.lunch.user.impl.util

import com.solanteq.lunch.user.api.model.UserModel
import com.solanteq.lunch.user.impl.entity.User

fun User.toModel(): UserModel = kotlin.runCatching {
    UserModel(
        id = this.id!!,
        login = this.login!!,
        email = this.email!!,
        password = this.password!!
    )
}.getOrElse { exception -> throw IllegalStateException("Some of user fields are null", exception) }
