package com.github.gustavobarbosab.movietime.presentation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.github.gustavobarbosab.feature.home.presentation.HomeScreen
import com.github.gustavobarbosab.movietime.presentation.navbar.MoviesBottomNavigation
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