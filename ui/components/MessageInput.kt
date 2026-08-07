package com.nitin.aiassistant.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier

@Composable
fun MessageInput(
    onSend: (String) -> Unit
) {

    var text by remember {

        mutableStateOf("")

    }

    Row(
        modifier = Modifier.fillMaxWidth()
    ) {

        OutlinedTextField(

            value = text,

            onValueChange = {

                text = it

            },

            modifier = Modifier.weight(1f),

            placeholder = {

                Text("Type a message")

            }

        )

        Button(

            onClick = {

                onSend(text)

                text = ""

            }

        ) {

            Text("Send")

        }

    }

}