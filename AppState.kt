package com.nitin.aiassistant

data class AppState(

    val isListening: Boolean = false,

    val isThinking: Boolean = false,

    val currentScreen: String = "home",

    val currentModel: String = "Gemma 3 4B",

    val batterySaver: Boolean = false,

    val darkMode: Boolean = false

)