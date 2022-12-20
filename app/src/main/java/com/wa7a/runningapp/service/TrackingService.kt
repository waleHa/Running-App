package com.wa7a.runningapp.service

import android.content.Intent
import androidx.lifecycle.LifecycleService
import com.wa7a.runningapp.utils.Constants.ACTION_PAUSE_SERVICE
import com.wa7a.runningapp.utils.Constants.ACTION_START_OR_RESUME_SERVICE
import com.wa7a.runningapp.utils.Constants.ACTION_STOP_SERVICE
import timber.log.Timber

//lifecycle owner
class TrackingService :LifecycleService(){
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        intent?.let {
         when(it.action){
             ACTION_START_OR_RESUME_SERVICE -> {
                 Timber.d("Started or resume service")
             }
             ACTION_PAUSE_SERVICE -> {
                 Timber.d("Paused service")
             }
             ACTION_STOP_SERVICE -> {
                 Timber.d("Stopped service")
             }
         }
        }
        return super.onStartCommand(intent, flags, startId)
    }
//Create a channel
}