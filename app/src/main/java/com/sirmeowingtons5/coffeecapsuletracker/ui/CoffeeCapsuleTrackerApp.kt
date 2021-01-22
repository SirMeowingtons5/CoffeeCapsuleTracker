package com.sirmeowingtons5.coffeecapsuletracker.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
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
        Box {
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