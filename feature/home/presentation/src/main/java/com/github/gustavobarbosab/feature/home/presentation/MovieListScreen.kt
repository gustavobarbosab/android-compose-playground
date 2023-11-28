package com.github.gustavobarbosab.feature.home.presentation

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.gustavobarbosab.ui.theme.MovieTimeTheme

@Composable
fun HomeScreen(modifier: Modifier) {
    Row {
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
        HomeScreen(Modifier.padding(10.dp))
    }
}