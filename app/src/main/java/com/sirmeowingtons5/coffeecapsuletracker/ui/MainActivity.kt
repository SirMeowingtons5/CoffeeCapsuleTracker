package com.sirmeowingtons5.coffeecapsuletracker.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.ui.platform.setContent

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoffeeCapsuleTrackerApp()
        }
    }
}