package com.solanteq.lunch.view.api.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class ViewController {
    @RequestMapping("/signUp")
    fun signUp(): String? {
        return "signUp"
    }
}