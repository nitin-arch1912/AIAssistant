package com.nitin.aiassistant.viewmodel

import androidx.lifecycle.ViewModel
import com.nitin.aiassistant.domain.model.ChatMessage
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class ChatViewModel : ViewModel() {

    private val _messages =
        MutableStateFlow<List<ChatMessage>>(emptyList())

    val messages = _messages.asStateFlow()

    fun sendMessage(text: String) {

        if (text.isBlank()) return

        val message = ChatMessage(
            id = System.currentTimeMillis(),
            message = text,
            isUser = true,
            timestamp = System.currentTimeMillis()
        )

        _messages.value += message
    }
}