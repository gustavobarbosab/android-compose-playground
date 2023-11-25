package com.github.gustavobarbosab.feature.home.presentation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector

sealed class NavItem(
    val route: String,
    val icon: ImageVector,
    val label: String
) {
    data object Home : NavItem(
        "home",
        Icons.Default.Home,
        "Home"
    )

    data object Favorites : NavItem(
        "favorites",
        Icons.Default.Home,
        "Favorites"
    )

    data object Profile : NavItem(
        "profile",
        Icons.Default.Home,
        "Profile"
    )

    companion object {
        val items = listOf(Home, Favorites, Profile)
    }
}
