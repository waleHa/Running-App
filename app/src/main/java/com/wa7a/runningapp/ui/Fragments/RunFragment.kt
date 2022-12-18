package com.wa7a.runningapp.ui.Fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.wa7a.runningapp.R
import com.wa7a.runningapp.ui.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RunFragment : Fragment(R.layout.fragment_run) {
    private val viewModel:MainViewModel by viewModels()
}