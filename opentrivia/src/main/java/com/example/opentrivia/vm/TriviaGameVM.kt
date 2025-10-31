package com.example.opentrivia.vm

import androidx.lifecycle.ViewModel
import com.example.opentrivia.data.repository.QuestionRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TriviaGameVM @Inject constructor(
    private val repository: QuestionRepository
) : ViewModel() {
    //Etats : Ce que l'UI va afficher
    //CurrentQuestion
    //ResultQuestion
    //Score
    //------------------------------
    //Evénements : Ce que l'UI va délencher

    //answer(VALEUR)
    //restartGame()


}