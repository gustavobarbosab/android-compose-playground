package com.github.gustavobarbosab.navrouter.routes

import com.github.gustavobarbosab.navrouter.type.ComposeScreen
import com.github.gustavobarbosab.navrouter.type.RouteType

object FavoritesRoute : Route {
    override val name: String = "com.github.gustavobarbosab.favorites"

    override val type: RouteType = ComposeScreen

    override val dynamic: Boolean = true
}