package com.sirmeowingtons5.coffeecapsuletracker.ui.screen.details

import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun DetailsScreen(id: String?) {
    //TODO: error screen when id == null
    require(id != null)

    Text(text = "Details screen for $id")
}