package com.nitin.aiassistant.domain.model

data class ChatMessage(
    val id: Long,
    val message: String,
    val isUser: Boolean,
    val timestamp: Long
)