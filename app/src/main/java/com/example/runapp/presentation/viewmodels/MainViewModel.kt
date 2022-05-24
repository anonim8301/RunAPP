package com.example.runapp.presentation.viewmodels

import androidx.lifecycle.ViewModel
import com.example.runapp.repositories.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    val repository : MainRepository
) : ViewModel() {
}