package com.github.gustavobarbosab.movietime

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.github.gustavobarbosab.feature.home.presentation.HomeScreen
import com.github.gustavobarbosab.navrouter.routes.FavoritesRoute
import com.github.gustavobarbosab.navrouter.routes.HomeRoute
import com.github.gustavobarbosab.navrouter.routes.ProfileRoute

@Composable
fun MainScreen(parentNavController: NavController) {
    val navController = rememberNavController()
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = { MoviesBottomNavigation(navController) },
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = HomeRoute.name,
            Modifier.padding(innerPadding)
        ) {
            composable(HomeRoute.name) {
                HomeScreen(parentNavController = parentNavController)
            }
            composable(FavoritesRoute.name) {
                Text(text = "Favoritos")
            }
            composable(ProfileRoute.name) {
                Text(text = "Perfil")
            }
        }
    }

}

@Composable
fun MoviesBottomNavigation(navController: NavController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination
    NavigationBar {
        NavigationItems.items.forEach { navItem ->
            NavigationBarItem(
                selected = currentDestination?.hierarchy?.any { it.route == navItem.route.name } == true,
                label = { Text(navItem.label) },
                icon = { Icon(navItem.icon, navItem.label) },
                onClick = {
                    navController.navigate(navItem.route.name) {
                        popUpTo(navController.graph.findStartDestination().id) { saveState = true }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}