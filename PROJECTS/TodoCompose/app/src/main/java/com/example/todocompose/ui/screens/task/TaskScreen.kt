package com.example.todocompose.ui.screens.task

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.example.todocompose.data.models.Priority
import com.example.todocompose.data.models.TodoTask
import com.example.todocompose.ui.SharedViewModel
import com.example.todocompose.utils.Action

@Composable
fun TaskScreen(
    sharedViewModel: SharedViewModel,
    selectedTask: TodoTask?,
    navigateToListScreen: (Action) -> Unit,
) {
    val title: String by sharedViewModel.title
    val description: String by sharedViewModel.description
    val priority: Priority by sharedViewModel.priority

    Scaffold(
        topBar = {
            TaskAppBar(selectedTask = selectedTask, navigateToListScreen = navigateToListScreen)
        },
        content = {
            TaskContent(
                title = title,
                onTitleChange = { sharedViewModel.title.value = it },
                description = description,
                onDescriptionChange = { sharedViewModel.description.value = it },
                priority = priority,
                onPriorityChange = { sharedViewModel.priority.value = it })

            Row(modifier = Modifier.padding(it)) {}
        }

    )
}