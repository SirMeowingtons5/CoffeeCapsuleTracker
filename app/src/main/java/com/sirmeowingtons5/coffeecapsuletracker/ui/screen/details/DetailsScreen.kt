package com.sirmeowingtons5.coffeecapsuletracker.ui.screen.details

import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.sirmeowingtons5.coffeecapsuletracker.domain.model.CapsuleInfo
import com.sirmeowingtons5.coffeecapsuletracker.presentation.DetailsViewModel
import com.sirmeowingtons5.coffeecapsuletracker.ui.components.IntensityIndicator
import dev.chrisbanes.accompanist.coil.CoilImage
import org.koin.androidx.compose.getViewModel

@Composable
fun DetailsScreen(id: String?) {
    val viewModel = getViewModel<DetailsViewModel>()

    if (id == null) {
        DetailsErrorScreen()
    } else {
        viewModel.loadCapsuleInfo(id)
        FullDetails(info = viewModel.capsuleInfo)
    }
}

//TODO: separate description into cards, make description expandable
@Composable
fun FullDetails(info: CapsuleInfo?) {
    info?.let {
        ScrollableColumn {
            CoilImage(
                data = info.capsule.backgroundImageLink,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(200.dp)
                    .fillMaxWidth()
            )
            Spacer(Modifier.preferredHeight(16.dp))
            Column(Modifier.padding(horizontal = 8.dp)) {
                Text(
                    text = info.capsule.title,
                    style = MaterialTheme.typography.h4
                )
                Spacer(Modifier.preferredHeight(4.dp))
                Text(
                    text = info.capsule.collection,
                    style = MaterialTheme.typography.body2,
                    fontWeight = FontWeight.Light,
                    fontStyle = FontStyle.Italic,
                )
                info.capsule.aromaticProfile?.let { aromaticProfile ->
                    Spacer(Modifier.preferredHeight(8.dp))
                    Text(
                        text = aromaticProfile,
                        style = MaterialTheme.typography.caption
                    )
                }
                if (info.capsule.intensity > 0) {
                    Spacer(Modifier.preferredHeight(8.dp))
                    IntensityIndicator(info.capsule.intensity)
                }
                Spacer(Modifier.preferredHeight(16.dp))
                Text(
                    text = info.capsule.description,
                    style = MaterialTheme.typography.body1,
                )
            }
        }
    } ?: DetailsLoadingScreen()
}

@Composable
fun DetailsErrorScreen() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Error :(")
    }
}

@Composable
fun DetailsLoadingScreen() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CircularProgressIndicator(Modifier.preferredSize(48.dp))
    }
}