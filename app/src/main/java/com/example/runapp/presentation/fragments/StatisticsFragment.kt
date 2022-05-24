package com.example.runapp.presentation.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.runapp.R
import com.example.runapp.presentation.viewmodels.MainViewModel
import com.example.runapp.presentation.viewmodels.StatisticsViewModel

class StatisticsFragment : Fragment(R.layout.fragment_statistics) {

    private val viewModel: StatisticsViewModel by viewModels()
}