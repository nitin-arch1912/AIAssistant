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

        val userMessage = ChatMessage(
            id = System.currentTimeMillis(),
            message = text,
            isUser = true,
            timestamp = System.currentTimeMillis()
        )

        _messages.value += userMessage

        generateTemporaryResponse(text)
    }

    private fun generateTemporaryResponse(text: String) {

        val response = when {
            text.contains("hello", ignoreCase = true) ->
                "Hello! 👋 I'm your AI Assistant."

            text.contains("weather", ignoreCase = true) ->
                "Weather feature isn't connected yet, but we'll add it soon. 🌤️"

            text.contains("chrome", ignoreCase = true) ->
                "Chrome control isn't connected yet. 🌐"

            text.contains("call", ignoreCase = true) ->
                "Phone calling isn't connected yet. 📞"

            else ->
                "I received your message: \"$text\""
        }

        val aiMessage = ChatMessage(
            id = System.currentTimeMillis() + 1,
            message = response,
            isUser = false,
            timestamp = System.currentTimeMillis()
        )

        _messages.value += aiMessage
    }
}