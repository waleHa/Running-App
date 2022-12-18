package com.wa7a.runningapp.ui.viewmodel

import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.fragment.app.viewModels
import com.wa7a.runningapp.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class StatisticsViewModel @Inject constructor(val mainRepository: MainRepository) : ViewModel() {

}