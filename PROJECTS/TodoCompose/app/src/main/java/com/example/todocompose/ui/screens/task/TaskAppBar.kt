package com.example.todocompose.ui.screens.task

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import com.example.todocompose.R
import com.example.todocompose.data.models.Priority
import com.example.todocompose.data.models.TodoTask
import com.example.todocompose.ui.theme.topAppBarBackgroundColor
import com.example.todocompose.ui.theme.topAppBarContentColor
import com.example.todocompose.utils.Action

@Composable
fun TaskAppBar(
    selectedTask: TodoTask?,
    navigateToListScreen: (Action) -> Unit,
) {
    if (selectedTask == null) {
        NewTaskAppBar(navigateToListScreen = navigateToListScreen)
    } else{
        ExistingTaskAppBar(selectedTask = selectedTask, navigateToListScreen = navigateToListScreen)
    }

}

@Composable
fun NewTaskAppBar(
    navigateToListScreen: (Action) -> Unit,
) {
    TopAppBar(
        navigationIcon = { BackAction(onBackClicked = navigateToListScreen) },
        title = {
            Text(
                text = stringResource(id = R.string.new_task_appbar_text),
                color = MaterialTheme.colors.topAppBarContentColor
            )
        },
        actions = {
            AddAction(onAddClicked = navigateToListScreen)
        },
        backgroundColor = MaterialTheme.colors.topAppBarBackgroundColor

    )
}

@Composable
fun BackAction(
    onBackClicked: (Action) -> Unit,
) {
    IconButton(onClick = { onBackClicked(Action.NO_ACTION) }) {
        Icon(
            imageVector = Icons.Filled.ArrowBack,
            contentDescription = stringResource(id = R.string.tasks_appbar_back_action),
            tint = MaterialTheme.colors.topAppBarContentColor
        )
    }
}

@Composable
fun AddAction(
    onAddClicked: (Action) -> Unit,
) {
    IconButton(onClick = { onAddClicked(Action.ADD) }) {
        Icon(
            imageVector = Icons.Filled.Check,
            contentDescription = stringResource(id = R.string.tasks_appbar_add_action),
            tint = MaterialTheme.colors.topAppBarContentColor
        )
    }
}


@Composable
fun ExistingTaskAppBar(
    selectedTask: TodoTask,
    navigateToListScreen: (Action) -> Unit,
) {
    TopAppBar(
        navigationIcon = { CloseAction(onCloseClicked = navigateToListScreen) },
        title = {
            Text(
                text = selectedTask.title,
                color = MaterialTheme.colors.topAppBarContentColor,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        },
        actions = {
            DeleteAction(onDeleteClicked = navigateToListScreen)
            UpdateAction(onUpdateClicked = navigateToListScreen)
        },
        backgroundColor = MaterialTheme.colors.topAppBarBackgroundColor

    )
}

@Composable
fun CloseAction(
    onCloseClicked: (Action) -> Unit,
) {
    IconButton(onClick = { onCloseClicked(Action.NO_ACTION) }) {
        Icon(
            imageVector = Icons.Filled.Close,
            contentDescription = stringResource(id = R.string.tasks_appbar_close_action),
            tint = MaterialTheme.colors.topAppBarContentColor
        )
    }
}

@Composable
fun DeleteAction(
    onDeleteClicked: (Action) -> Unit,
) {
    IconButton(onClick = { onDeleteClicked(Action.DELETE) }) {
        Icon(
            imageVector = Icons.Filled.Delete,
            contentDescription = stringResource(id = R.string.tasks_appbar_delete_action),
            tint = MaterialTheme.colors.topAppBarContentColor
        )
    }
}

@Composable
fun UpdateAction(
    onUpdateClicked: (Action) -> Unit,
) {
    IconButton(onClick = { onUpdateClicked(Action.UPDATE) }) {
        Icon(
            imageVector = Icons.Filled.Check,
            contentDescription = stringResource(id = R.string.tasks_appbar_update_action),
            tint = MaterialTheme.colors.topAppBarContentColor
        )
    }
}
