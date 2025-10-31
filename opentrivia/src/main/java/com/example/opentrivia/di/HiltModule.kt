package com.example.opentrivia.di

import com.example.opentrivia.data.repository.QuestionRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object HiltModule {
    @Provides
    fun provideQuestionRepositry()= QuestionRepository()
}