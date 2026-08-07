package com.nitin.aiassistant.ui.navigation

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun SimpleBottomBar(navController: NavController) {

    NavigationBar {

        NavigationBarItem(
            selected = false,
            onClick = {
                navController.navigate(Screen.Home.route)
            },
            icon = { Text("🏠") },
            label = { Text("Home") }
        )

        NavigationBarItem(
            selected = false,
            onClick = {
                navController.navigate(Screen.Chat.route)
            },
            icon = { Text("💬") },
            label = { Text("Chat") }
        )

        NavigationBarItem(
            selected = false,
            onClick = {
                navController.navigate(Screen.Settings.route)
            },
            icon = { Text("⚙") },
            label = { Text("Settings") }
        )
    }
}