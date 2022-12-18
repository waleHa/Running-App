package com.wa7a.runningapp.ui.Fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.wa7a.runningapp.R
import com.wa7a.runningapp.ui.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SetupFragment : Fragment(R.layout.fragment_setup) {
    private val viewModel: MainViewModel by viewModels()

}