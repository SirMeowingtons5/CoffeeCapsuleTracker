package com.sirmeowingtons5.coffeecapsuletracker.ui.screen.catalogue

import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.preferredHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import com.sirmeowingtons5.coffeecapsuletracker.presentation.CatalogueViewModel
import com.sirmeowingtons5.coffeecapsuletracker.ui.Screen
import com.sirmeowingtons5.coffeecapsuletracker.ui.screen.catalogue.components.FeedCoffeeRow
import org.koin.androidx.compose.getViewModel

@Composable
fun CatalogueScreen(navController: NavController) {
    val viewModel = getViewModel<CatalogueViewModel>()

    Scaffold(
        topBar = {
            //TODO: Add backdrop-like filters with expandable top app bar
            TopAppBar(
                elevation = 0.dp,
                title = { Text("Catalogue screen") }
            )
        }
    ) {
        Surface(color = MaterialTheme.colors.primarySurface) {
            Card(
                shape = RoundedCornerShape(topLeft = 16.dp, topRight = 16.dp),
                elevation = 0.dp,
                modifier = Modifier.fillMaxSize()
            ) {
                ScrollableColumn {
                    Spacer(Modifier.preferredHeight(16.dp))
                    LazyColumn {
                        items(viewModel.capsules) { item ->
                            FeedCoffeeRow(item, onClick = {
                                navController.navigate(Screen.Details(item.capsule.id).route)
                            })
                        }
                    }
                }
            }
        }
    }
}