package com.wa7a.runningapp.db

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "running_table")
data class Run(
    var img: Bitmap? = null,
    //time in milliSeconds
    var timeStamp: Long = 0L,
    var avgSpeedInKMH: Float = 0F,
    var distanceInMeters: Int = 0,
    //time in milliSeconds
    var timeInMills: Long = 0L,
    var caloriesBurned: Int = 0
) {
    //to make room handle the primary key put it here
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null

}