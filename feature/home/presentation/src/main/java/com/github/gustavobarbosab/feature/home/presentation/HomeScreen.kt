package com.github.gustavobarbosab.feature.home.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.github.gustavobarbosab.ui.theme.MovieTimeTheme
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun HomeScreen(
    parentNavController: NavController,
    viewModel: HomeViewModel = viewModel()
) {
    Column {
        Text(
            text = "Teste 123",
            color = Color.Black
        )
    }
}


@Preview(showBackground = true)
@Composable
fun HomeMoviesListPreview() {
    MovieTimeTheme {
//        HomeScreen()
    }
}