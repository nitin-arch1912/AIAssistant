package com.nitin.aiassistant.ui.screens.chat

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.nitin.aiassistant.ui.components.ChatBubble
import com.nitin.aiassistant.ui.components.ChatTopBar
import com.nitin.aiassistant.ui.components.EmptyChatView
import com.nitin.aiassistant.ui.components.MessageInput
import com.nitin.aiassistant.ui.components.TypingIndicator
import com.nitin.aiassistant.viewmodel.ChatViewModel

@Composable
fun ChatScreen(
    chatViewModel: ChatViewModel = viewModel()
) {

    val messages by chatViewModel.messages.collectAsState()

    val listState = rememberLazyListState()

    Scaffold(
        topBar = {
            ChatTopBar()
        },
        bottomBar = {
            MessageInput(
                onSend = { message ->
                    chatViewModel.sendMessage(message)
                }
            )
        }
    ) { innerPadding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {

            if (messages.isEmpty()) {

                EmptyChatView()

            } else {

                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    state = listState,
                    contentPadding = PaddingValues(
                        horizontal = 16.dp,
                        vertical = 12.dp
                    ),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {

                    items(
                        items = messages,
                        key = { message ->
                            message.id
                        }
                    ) { message ->

                        ChatBubble(
                            message = message
                        )
                    }

                }
            }
        }
    }

    LaunchedEffect(messages.size) {

        if (messages.isNotEmpty()) {

            listState.animateScrollToItem(
                index = messages.lastIndex
            )
        }
    }
}