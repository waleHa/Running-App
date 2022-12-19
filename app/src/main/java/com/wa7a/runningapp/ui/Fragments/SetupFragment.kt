package com.wa7a.runningapp.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.wa7a.runningapp.R
import com.wa7a.runningapp.ui.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_run.*
import kotlinx.android.synthetic.main.fragment_setup.*

//@AndroidEntryPoint
class SetupFragment : Fragment(R.layout.fragment_setup) {
    private val viewModel: MainViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tvContinue.setOnClickListener{
            findNavController().navigate(R.id.action_setupFragment_to_runFragment)
        }
    }

}