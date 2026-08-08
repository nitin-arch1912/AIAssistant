package com.nitin.aiassistant.ui.components

import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TypingIndicator() {

    val transition = rememberInfiniteTransition(
        label = "typing"
    )

    val alpha by transition.animateFloat(
        initialValue = 0.3f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(600),
            repeatMode = RepeatMode.Reverse
        ),
        label = "typingAlpha"
    )

    Row(
        modifier = Modifier.padding(
            horizontal = 12.dp,
            vertical = 8.dp
        ),
        horizontalArrangement = Arrangement.spacedBy(4.dp)
    ) {

        Text(
            text = "● ● ●",
            color = MaterialTheme.colorScheme.primary.copy(
                alpha = alpha
            )
        )
    }
}