package com.github.gustavobarbosab.navrouter.routes

import com.github.gustavobarbosab.navrouter.type.ComposeScreen
import com.github.gustavobarbosab.navrouter.type.RouteType

object MainRoute : Route {

    override val name: String = "com.github.gustavobarbosab.main"

    override val type: RouteType = ComposeScreen
}
