package com.wa7a.runningapp.repository

import com.wa7a.runningapp.db.Run
import com.wa7a.runningapp.db.RunDao
import javax.inject.Inject

//Collect data from data sources
class MainRepository @Inject constructor(val runDao: RunDao) {
    suspend fun insertRun(run: Run) = runDao.insertRun(run)

    suspend fun deleteRun(run: Run) = runDao.deleteRun(run)

    fun getAllRunsSortedByDate() = runDao.getAllRunsSortedByDate()
    fun getAllRunsSortedByCaloriesBurned() = runDao.getAllRunsSortedByCaloriesBurned()
    fun getAllRunsSortedByAvgSpeedInKMH() = runDao.getAllRunsSortedByAvgSpeedInKMH()
    fun getAllRunsSortedByTimeInMills() = runDao.getAllRunsSortedByTimeInMills()
    fun getAllRunsSortedByDistanceInMeters() = runDao.getAllRunsSortedByDistanceInMeters()
    fun getTotalAvgSpeed() = runDao.getTotalAvgSpeedInKMH()
    fun getTotalDistance() = runDao.getTotalDistanceInMeters()
    fun getTotalTimeInMillis() = runDao.getTotalTimeInMillis()

    //                fun get() = runDao.getTo()
    fun getTotalCaloriesBurned() = runDao.getTotalCaloriesBurned()
}