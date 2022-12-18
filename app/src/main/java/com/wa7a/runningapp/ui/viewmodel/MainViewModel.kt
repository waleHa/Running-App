package com.wa7a.runningapp.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.wa7a.runningapp.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(val mainRepository: MainRepository): ViewModel(){
}