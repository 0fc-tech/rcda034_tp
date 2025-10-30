package com.example.enishop

import com.example.enishop.data.repository.ArticleRepository
import com.example.enishop.ui.widgets.ArticleItem
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object HiltModule {
    @Provides
    fun provideArticleRepositry()= ArticleRepository()
}