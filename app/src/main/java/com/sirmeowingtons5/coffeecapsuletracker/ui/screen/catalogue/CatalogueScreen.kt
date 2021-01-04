package com.sirmeowingtons5.coffeecapsuletracker.ui.screen.catalogue

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import com.sirmeowingtons5.coffeecapsuletracker.presentation.CatalogueViewModel
import com.sirmeowingtons5.coffeecapsuletracker.ui.screen.catalogue.components.FeedCoffeeRow
import org.koin.androidx.compose.getViewModel

@Composable
fun CatalogueScreen() {
    val viewModel = getViewModel<CatalogueViewModel>()

    LazyColumn {
        items(viewModel.capsules) { item ->
            FeedCoffeeRow(item)
        }
    }
}