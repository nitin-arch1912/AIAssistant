package com.nitin.aiassistant.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun EmptyChatView() {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {

        Text(
            text = "🤖",
            style = MaterialTheme.typography.headlineLarge
        )

        Text(
            text = "AI Assistant",
            style = MaterialTheme.typography.headlineSmall
        )

        Text(
            text = "How can I help you today?",
            style = MaterialTheme.typography.bodyLarge
        )

        Text(
            text = "Try asking me something.",
            style = MaterialTheme.typography.bodyMedium
        )
    }
}