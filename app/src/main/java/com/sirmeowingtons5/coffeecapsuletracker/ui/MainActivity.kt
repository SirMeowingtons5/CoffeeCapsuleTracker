package com.sirmeowingtons5.coffeecapsuletracker.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.setContent
import com.sirmeowingtons5.coffeecapsuletracker.ui.screen.catalogue.CatalogueScreen
import com.sirmeowingtons5.coffeecapsuletracker.ui.theme.CoffeeCapsuleTrackerTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoffeeCapsuleTrackerApp()
        }
    }
}

@Composable
fun CoffeeCapsuleTrackerApp() {
    CoffeeCapsuleTrackerTheme {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text("Capsule Tracker") }
                )
            }
        ) { innerPadding ->
            Box(modifier = Modifier.padding(innerPadding)) {
                CatalogueScreen()
            }
        }
    }
}