package com.nitin.aiassistant.ui.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.*

import com.nitin.aiassistant.ui.screens.chat.ChatScreen
import com.nitin.aiassistant.ui.screens.home.HomeScreen
import com.nitin.aiassistant.ui.screens.settings.SettingsScreen

@Composable
fun NavigationGraph() {

    val navController = rememberNavController()

    Scaffold(

        bottomBar = {

            BottomBar(navController)

        }

    ) { padding ->

        NavHost(

            navController = navController,

            startDestination = Screen.Home.route,

            modifier = Modifier.padding(padding)

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

}