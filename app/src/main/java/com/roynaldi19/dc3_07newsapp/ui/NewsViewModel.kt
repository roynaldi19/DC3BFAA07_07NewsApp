package com.roynaldi19.dc3_07newsapp.ui

import androidx.lifecycle.ViewModel
import com.roynaldi19.dc3_07newsapp.data.NewsRepository
import com.roynaldi19.dc3_07newsapp.data.local.entity.NewsEntity

class NewsViewModel(private val newsRepository: NewsRepository): ViewModel() {
    fun getHeadlineNews() = newsRepository.getHeadlineNews()

    fun getBookmarkedNews() = newsRepository.getBookmarkedNews()

    fun saveNews(news: NewsEntity) {
        newsRepository.setBookmarkedNews(news, true)
    }

    fun deleteNews(news: NewsEntity){
        newsRepository.setBookmarkedNews(news, false)
    }
}