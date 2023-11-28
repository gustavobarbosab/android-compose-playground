package com.github.gustavobarbosab.feature.home.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.fragment.app.Fragment
import com.github.gustavobarbosab.ui.createComposeView
import com.github.gustavobarbosab.ui.theme.MovieTimeTheme

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = createComposeView {
        MovieTimeTheme {
            Scaffold(
                modifier = Modifier.fillMaxSize(),
                bottomBar = { MoviesBottomNavigation() },
                content = { HomeScreen(Modifier.padding(it)) }
            )
        }
    }
}

@Composable
fun MoviesBottomNavigation() {
    val context = LocalContext.current
    NavigationBar {
        NavItem.items.forEachIndexed { index, navItem ->
            NavigationBarItem(
                selected = false,
                label = { Text(navItem.label) },
                icon = { Icon(navItem.icon, navItem.label) },
                onClick = {
                    Toast.makeText(context, "Teste", Toast.LENGTH_SHORT).show()
                }
            )
        }
    }
}