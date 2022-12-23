package com.wa7a.runningapp.ui.viewmodel

//import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.wa7a.runningapp.db.Run
import com.wa7a.runningapp.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(val mainRepository: MainRepository): ViewModel(){
    val runsSortedByDate = mainRepository.getAllRunsSortedByDate()

    fun insertRun(run: Run)= viewModelScope.launch {
        mainRepository.insertRun(run)
    }
}