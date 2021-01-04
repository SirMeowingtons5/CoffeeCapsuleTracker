package com.sirmeowingtons5.coffeecapsuletracker.ui.screen.catalogue.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sirmeowingtons5.coffeecapsuletracker.domain.model.Capsule
import com.sirmeowingtons5.coffeecapsuletracker.domain.model.CapsuleInfo
import com.sirmeowingtons5.coffeecapsuletracker.ui.theme.CoffeeCapsuleTrackerTheme
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun FeedCoffeeRow(item: CapsuleInfo) {
    FeedRow(
        imageUrl = item.capsule.capsuleImageLink,
        title = item.capsule.title,
        hint = item.capsule.aromaticProfile,
        intensity = item.capsule.intensity
    )
}

@Composable
fun FeedRow(
    imageUrl: String,
    title: String,
    hint: String?,
    intensity: Int,
) {
    Card(
        shape = RoundedCornerShape(4.dp),
        elevation = 4.dp,
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(horizontal = 16.dp)
        ) {
            CoilImage(
                data = imageUrl,
                contentScale = ContentScale.Fit,
                modifier = Modifier.preferredSize(50.dp)
            )
            Column(Modifier.padding(16.dp)) {
                Text(
                    text = title,
                    style = MaterialTheme.typography.h5,
                )
                hint?.let {
                    Spacer(Modifier.preferredHeight(4.dp))
                    Text(
                        text = hint,
                        style = MaterialTheme.typography.caption,
                    )
                }
                if (intensity > 0) {
                    Spacer(Modifier.preferredHeight(4.dp))
                    IntensityIndicator(intensity)
                }
            }
        }
    }
}

@Composable
private fun IntensityIndicator(intensity: Int) {
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

@Preview
@Composable
fun PreviewFeedCoffeeRowFullInfo() {
    CoffeeCapsuleTrackerTheme {
        FeedRow(
            imageUrl = "",
            title = "Costa-Rica",
            hint = "Fruity-Winey",
            intensity = 4
        )
    }
}

@Preview
@Composable
fun PreviewFeedCoffeeRowMinimalistic() {
    CoffeeCapsuleTrackerTheme {
        FeedRow(
            imageUrl = "",
            title = "Costa-Rica",
            hint = null,
            intensity = 0
        )
    }
}