package com.wa7a.runningapp.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.wa7a.runningapp.R
import com.wa7a.runningapp.ui.viewmodel.MainViewModel
import com.wa7a.runningapp.ui.viewmodel.StatisticsViewModel
import dagger.hilt.android.AndroidEntryPoint

//@AndroidEntryPoint
class SettingFragment : Fragment(R.layout.fragment_settings) {
    private val viewModel: MainViewModel by viewModels()

}