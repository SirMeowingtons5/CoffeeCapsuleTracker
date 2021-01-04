package com.sirmeowingtons5.coffeecapsuletracker.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sirmeowingtons5.coffeecapsuletracker.ui.screen.catalogue.CatalogueScreen
import com.sirmeowingtons5.coffeecapsuletracker.ui.screen.details.DetailsScreen
import com.sirmeowingtons5.coffeecapsuletracker.ui.theme.CoffeeCapsuleTrackerTheme

@Composable
fun CoffeeCapsuleTrackerApp() {
    CoffeeCapsuleTrackerTheme {
        val navController = rememberNavController()
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text("Capsule Tracker") }
                )
            }
        ) { innerPadding ->
            Box(modifier = Modifier.padding(innerPadding)) {
                NavHost(
                    navController = navController,
                    startDestination = Screen.CATALOGUE_ROUTE
                ) {
                    composable(Screen.CATALOGUE_ROUTE) { CatalogueScreen(navController) }
                    composable(Screen.DETAILS_ROUTE) { backStackEntry ->
                        DetailsScreen(id = backStackEntry.arguments?.getString(Screen.DETAILS_ARG))
                    }
                }
            }
        }
    }
}