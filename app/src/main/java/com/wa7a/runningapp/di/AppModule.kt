package com.wa7a.runningapp.di

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.wa7a.runningapp.db.RunningDatabase
import com.wa7a.runningapp.utils.Constants.RUNNING_DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun provideRunningDatabase(@ApplicationContext app: Context) =
        Room.databaseBuilder(app, RunningDatabase::class.java, RUNNING_DATABASE_NAME).build()
    @Singleton
    @Provides
    fun provideRunDao(db: RunningDatabase) = db.getRunDao()
}
/*

    fun provideRunningDatabase(
        @ApplicationContext app: Context
    ) = Room.databaseBuilder(
        app,
        RunningDatabase::class.java,
        RUNNING_DATABASE_NAME
    ).build()

    @Singleton
    @Provides
    fun provideRunDao(db: RunningDatabase) = db.getRunDao()
}
 */