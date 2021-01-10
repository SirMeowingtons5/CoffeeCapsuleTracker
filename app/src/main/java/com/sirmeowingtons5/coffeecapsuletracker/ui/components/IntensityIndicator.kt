package com.sirmeowingtons5.coffeecapsuletracker.ui.components

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.sirmeowingtons5.coffeecapsuletracker.domain.model.Capsule

@Composable
fun IntensityIndicator(intensity: Int) {
    val intensityFullSymbol = "■"
    val intensityEmptySymbol = "□"
    val intensityString = StringBuilder()

    for (i in 0 until intensity) {
        intensityString.append(intensityFullSymbol)
    }

    intensityString.append(" $intensity ")

    for (i in intensity until Capsule.MAX_INTENSITY) {
        intensityString.append(intensityEmptySymbol)
    }

    Text(
        text = intensityString.toString(),
        style = MaterialTheme.typography.caption,
        maxLines = 1
    )
}