package com.nitin.aiassistant.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
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
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "🤖",
            style = MaterialTheme.typography.displaySmall
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