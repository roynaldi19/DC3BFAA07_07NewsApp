package com.roynaldi19.dc3_07newsapp.ui

import androidx.lifecycle.ViewModel
import com.roynaldi19.dc3_07newsapp.data.NewsRepository

class NewsViewModel(private val newsRepository: NewsRepository): ViewModel() {
    fun getHeadlineNews() = newsRepository.getHeadlineNews()
}