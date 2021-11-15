package com.solanteq.lunch.user.api.service

import com.solanteq.lunch.user.api.model.UserModel
import com.solanteq.lunch.user.impl.entity.RegistrationRequest

interface UserService {
    fun findByLogin(login: String): UserModel?
    fun deleteUser(id: Long)
    fun saveUser(registrationRequest: RegistrationRequest): UserModel
    fun findAll(): List<UserModel>
}