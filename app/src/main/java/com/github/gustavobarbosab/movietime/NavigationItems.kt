package com.github.gustavobarbosab.movietime

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.List
import androidx.compose.material.icons.outlined.Person
import androidx.compose.ui.graphics.vector.ImageVector
import com.github.gustavobarbosab.navrouter.routes.FavoritesRoute
import com.github.gustavobarbosab.navrouter.routes.HomeRoute
import com.github.gustavobarbosab.navrouter.routes.ProfileRoute
import com.github.gustavobarbosab.navrouter.routes.Route

sealed class NavigationItems(
    val route: Route,
    val icon: ImageVector,
    val label: String
) {
    data object Home : NavigationItems(
        HomeRoute,
        Icons.Outlined.Home,
        "Home"
    )

    data object Favorites : NavigationItems(
        FavoritesRoute,
        Icons.Outlined.List,
        "Favorites"
    )

    data object Profile : NavigationItems(
        ProfileRoute,
        Icons.Outlined.Person,
        "Profile"
    )

    companion object {
        val items = listOf(Home, Favorites, Profile)
    }
}
