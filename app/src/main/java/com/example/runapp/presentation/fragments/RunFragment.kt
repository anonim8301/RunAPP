package com.example.runapp.presentation.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.runapp.R
import com.example.runapp.presentation.viewmodels.MainViewModel

class RunFragment : Fragment(R.layout.fragment_run) {

    private val viewModel: MainViewModel by viewModels()
}