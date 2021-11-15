package com.solanteq.lunch.user.impl.entity

import javax.persistence.*

@Entity
@Table(name = "users")
public class User(login: String, password: String, email: String) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id : Long? = null

    @Column(nullable = false)
    var login : String? = login

    @Column(nullable = false)
    var password : String? = password

    @Column(nullable = true)
    var email : String? = email

}