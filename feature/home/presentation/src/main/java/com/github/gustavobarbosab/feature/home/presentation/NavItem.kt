package com.github.gustavobarbosab.feature.home.presentation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.List
import androidx.compose.material.icons.outlined.Person
import androidx.compose.ui.graphics.vector.ImageVector

sealed class NavItem(
    val route: String,
    val icon: ImageVector,
    val label: String
) {
    data object Home : NavItem(
        "home",
        Icons.Outlined.Home,
        "Home"
    )

    data object Favorites : NavItem(
        "list",
        Icons.Outlined.List,
        "List"
    )

    data object Profile : NavItem(
        "profile",
        Icons.Outlined.Person,
        "Profile"
    )

    companion object {
        val items = listOf(Home, Favorites, Profile)
    }
}
