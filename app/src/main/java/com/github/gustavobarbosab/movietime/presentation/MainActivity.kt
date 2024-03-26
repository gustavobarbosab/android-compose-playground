package com.github.gustavobarbosab.movietime.presentation

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.fragment.app.FragmentActivity
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.github.gustavobarbosab.navrouter.routes.MainRoute
import com.github.gustavobarbosab.ui.theme.MovieTimeTheme

class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            MovieTimeTheme {
                NavHost(navController = navController, startDestination = MainRoute.name) {
                    composable(MainRoute.name) { MainScreen(parentNavController = navController) }
                }
            }
        }
    }
}