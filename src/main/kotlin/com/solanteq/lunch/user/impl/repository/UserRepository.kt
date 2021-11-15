package com.solanteq.lunch.user.impl.repository

import com.solanteq.lunch.user.impl.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long> {
    fun findByLogin(login: String?): User?
}
