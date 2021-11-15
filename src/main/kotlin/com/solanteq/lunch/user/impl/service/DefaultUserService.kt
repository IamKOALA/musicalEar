package com.solanteq.lunch.user.impl.service

import com.solanteq.lunch.user.api.model.UserModel
import com.solanteq.lunch.user.api.service.UserService
import com.solanteq.lunch.user.impl.entity.RegistrationRequest
import com.solanteq.lunch.user.impl.entity.User
import com.solanteq.lunch.user.impl.repository.UserRepository
import com.solanteq.lunch.user.impl.util.toModel
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Suppress("UnstableApiUsage")
@Service
class DefaultUserService(private val userRepository: UserRepository): UserService {

    override fun findByLogin(login: String): UserModel? = userRepository
        .findByLogin(login)?.toModel()

    override fun deleteUser(id: Long) {
        TODO("Not yet implemented")
    }

    override fun saveUser(registrationRequest: RegistrationRequest): UserModel = userRepository.save(registrationRequest.toEntity()).toModel()

    override fun findAll(): List<UserModel> = userRepository.findAll().map {it.toModel()}

    fun RegistrationRequest.toEntity(): User =
        User(
            login = this.login,
            email = this.email,
            password = this.password
        )
}