package com.nitin.aiassistant.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.nitin.aiassistant.ui.screens.chat.ChatScreen
import com.nitin.aiassistant.ui.screens.home.HomeScreen
import com.nitin.aiassistant.ui.screens.settings.SettingsScreen

@Composable
fun NavigationGraph() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {

        composable(Screen.Home.route) {
            HomeScreen()
        }

        composable(Screen.Chat.route) {
            ChatScreen()
        }

        composable(Screen.Settings.route) {
            SettingsScreen()
        }
    }
}