package com.roynaldi19.dc3_07newsapp.di

import android.content.Context
import com.roynaldi19.dc3_07newsapp.data.NewsRepository
import com.roynaldi19.dc3_07newsapp.data.local.room.NewsDatabase
import com.roynaldi19.dc3_07newsapp.data.remote.retrofit.ApiConfig
import com.roynaldi19.dc3_07newsapp.utils.AppExecutors

object Injection {
    fun provideRepository(context: Context): NewsRepository {
        val apiService = ApiConfig.getApiService()
        val database = NewsDatabase.getInstance(context)
        val dao = database.newsDao()
        val appExecutors = AppExecutors()
        return NewsRepository.getInstance(apiService, dao, appExecutors)
    }
}