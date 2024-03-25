package com.github.gustavobarbosab.navrouter.routes

import com.github.gustavobarbosab.navrouter.type.ComposeScreen
import com.github.gustavobarbosab.navrouter.type.RouteType

object HomeRoute : Route {

    override val name: String = "com.github.gustavobarbosab.home"

    override val type: RouteType = ComposeScreen
}
