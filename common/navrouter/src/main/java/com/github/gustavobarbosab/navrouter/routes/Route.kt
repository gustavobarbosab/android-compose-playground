package com.github.gustavobarbosab.navrouter.routes

import com.github.gustavobarbosab.navrouter.type.RouteType

interface Route {
    val name: String
    val type: RouteType
    val dynamic: Boolean
        get() = false
}
