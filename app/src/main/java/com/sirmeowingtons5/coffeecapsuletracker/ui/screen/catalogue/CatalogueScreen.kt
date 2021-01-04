package com.sirmeowingtons5.coffeecapsuletracker.ui.screen.catalogue

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import com.sirmeowingtons5.coffeecapsuletracker.presentation.CatalogueViewModel
import com.sirmeowingtons5.coffeecapsuletracker.ui.Screen
import com.sirmeowingtons5.coffeecapsuletracker.ui.screen.catalogue.components.FeedCoffeeRow
import org.koin.androidx.compose.getViewModel

@Composable
fun CatalogueScreen(navController: NavController) {
    val viewModel = getViewModel<CatalogueViewModel>()

    LazyColumn {
        items(viewModel.capsules) { item ->
            FeedCoffeeRow(item, onClick = {
                navController.navigate(Screen.Details(item.capsule.id).route)
            }
            )
        }
    }
}