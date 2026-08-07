package com.nitin.aiassistant.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import com.nitin.aiassistant.AppState

class AppViewModel : ViewModel() {

    private val _appState = MutableStateFlow(AppState())
    val appState: StateFlow<AppState> = _appState.asStateFlow()

    fun setListening(listening: Boolean) {
        _appState.value = _appState.value.copy(
            isListening = listening
        )
    }

    fun setThinking(thinking: Boolean) {
        _appState.value = _appState.value.copy(
            isThinking = thinking
        )
    }

    fun changeScreen(screen: String) {
        _appState.value = _appState.value.copy(
            currentScreen = screen
        )
    }

    fun toggleDarkMode() {
        _appState.value = _appState.value.copy(
            darkMode = !_appState.value.darkMode
        )
    }
}