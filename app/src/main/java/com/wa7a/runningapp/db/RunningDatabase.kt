package com.wa7a.runningapp.db

import androidx.room.Database
import androidx.room.TypeConverters

@Database(entities = [Run::class], version = 1)
@TypeConverters
abstract class RunningDatabase {

    abstract fun getRunDao():RunDao
}