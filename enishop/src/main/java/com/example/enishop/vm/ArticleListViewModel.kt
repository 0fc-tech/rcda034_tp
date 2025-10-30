package com.example.enishop.vm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.enishop.data.model.Article
import com.example.enishop.data.repository.ArticleRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class ArticleListViewModel @Inject constructor(
    private val repository: ArticleRepository
) : ViewModel() {
    private val _articles = MutableStateFlow<List<Article>>(emptyList())
    val articles : StateFlow<List<Article>> = _articles
    private val _categories = MutableStateFlow<List<String>>(emptyList())
    val categories : StateFlow<List<String>> = _categories
    private var listActiveFilters = arrayListOf<String>()

    init {
        _articles.value = repository.getArticles()
        _categories.value = repository.getCategories()
    }

    fun filterCategory(category: String, enabled : Boolean) {
        if(enabled){
            listActiveFilters.add(category)
        }else{
            listActiveFilters.remove(category)
        }
        if(listActiveFilters.isEmpty){
            _articles.value = repository.getArticles()
        }else
        _articles.value = repository.getArticles()
            .filter { listActiveFilters.contains(it.category)}
    }



}