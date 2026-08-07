package com.nitin.aiassistant.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Chat
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomBar(navController: NavController) {

    val items = listOf(
        Screen.Home,
        Screen.Chat,
        Screen.Settings
    )

    NavigationBar {

        val navBackStackEntry =
            navController.currentBackStackEntryAsState()

        val currentRoute =
            navBackStackEntry.value?.destination?.route

        items.forEach { screen ->

            NavigationBarItem(

                selected = currentRoute == screen.route,

                onClick = {

                    navController.navigate(screen.route)

                },

                icon = {

                    when (screen) {

                        Screen.Home ->
                            Icon(Icons.Default.Home, null)

                        Screen.Chat ->
                            Icon(Icons.Default.Chat, null)

                        Screen.Settings ->
                            Icon(Icons.Default.Settings, null)
                    }

                },

                label = {

                    Text(screen.route)

                }

            )

        }

    }

}