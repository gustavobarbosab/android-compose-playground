package com.github.gustavobarbosab.movietime.presentation.navbar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.List
import androidx.compose.material.icons.outlined.Person
import androidx.compose.ui.graphics.vector.ImageVector
import com.github.gustavobarbosab.navrouter.routes.FavoritesRoute
import com.github.gustavobarbosab.navrouter.routes.HomeRoute
import com.github.gustavobarbosab.navrouter.routes.ProfileRoute
import com.github.gustavobarbosab.navrouter.routes.Route

sealed class NavBarItems(
    val route: Route,
    val icon: ImageVector,
    val label: String
) {
    val routeName
        get() = route.name

    data object Home : NavBarItems(
        HomeRoute,
        Icons.Outlined.Home,
        "Home"
    )

    data object Favorites : NavBarItems(
        FavoritesRoute,
        Icons.Outlined.List,
        "Favorites"
    )

    data object Profile : NavBarItems(
        ProfileRoute,
        Icons.Outlined.Person,
        "Profile"
    )

    companion object {
        val items = listOf(Home, Favorites, Profile)
    }
}
