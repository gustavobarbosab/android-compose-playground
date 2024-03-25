package com.github.gustavobarbosab.navrouter.routes

interface Route {
    val name: String
    val dynamic: Boolean
        get() = false
}
