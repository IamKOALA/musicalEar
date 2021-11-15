package com.solanteq.lunch.user.api.controller

import com.solanteq.lunch.user.api.model.UserModel
import com.solanteq.lunch.user.api.service.UserService
import com.solanteq.lunch.user.impl.entity.RegistrationRequest
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/users")
class UserController(private val userService: UserService) {
    @PostMapping("/save")
    fun register(@RequestBody request: RegistrationRequest) = userService.saveUser(request)

    @GetMapping("/")
    fun getAllUsers(): List<UserModel> = userService.findAll()
}