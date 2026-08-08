package com.nitin.aiassistant.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MessageInput(
    onSend: (String) -> Unit,
    onMicClick: () -> Unit = {}
) {
    var text by remember {
        mutableStateOf("")
    }

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {

        IconButton(
            onClick = {
                onMicClick()
            }
        ) {
            Text("🎤")
        }

        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            modifier = Modifier.weight(1f),
            placeholder = {
                Text("Type a message...")
            },
            singleLine = true
        )

        Button(
            onClick = {
                if (text.isNotBlank()) {
                    onSend(text.trim())
                    text = ""
                }
            }
        ) {
            Text("Send")
        }
    }
}