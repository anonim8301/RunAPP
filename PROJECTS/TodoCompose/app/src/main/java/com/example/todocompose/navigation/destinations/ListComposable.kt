package com.example.todocompose.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.todocompose.ui.SharedViewModel
import com.example.todocompose.ui.screens.list.ListScreen
import com.example.todocompose.utils.Constants.LIST_ARGUMENT_KEY
import com.example.todocompose.utils.Constants.LIST_SCREEN

fun NavGraphBuilder.listComposable(
    navigateToTask: (taskId: Int) -> Unit,
    sharedViewModel: SharedViewModel
) {
    composable(
        route = LIST_SCREEN,
        arguments = listOf(navArgument(LIST_ARGUMENT_KEY) {
            type = NavType.StringType
        })
    ) {
        ListScreen(navigateToTaskScreen = navigateToTask , sharedViewModel = sharedViewModel)
    }
}