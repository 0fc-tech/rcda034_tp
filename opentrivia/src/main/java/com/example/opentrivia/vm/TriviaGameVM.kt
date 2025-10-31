package com.example.opentrivia.vm

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.opentrivia.data.model.Question
import com.example.opentrivia.data.repository.QuestionRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class TriviaGameVM @Inject constructor(
    private val repository: QuestionRepository
) : ViewModel() {
    private var indexQuestion = 0;
    //Etats : Ce que l'UI va afficher
    private val _currentQuestion = MutableStateFlow(
        repository.getQuestions()[indexQuestion])
    val currentQuestion : StateFlow<Question?> = _currentQuestion
    private val _resultQuestion = MutableStateFlow<Boolean?>(null)
    val resultQuestion : StateFlow<Boolean?> = _resultQuestion
    private val _score = MutableStateFlow(0)
    val score : StateFlow<Int> = _score
    //------------------------------
    //Evénements : Ce que l'UI va délencher
    fun answer(response: Boolean){
        if(response.toString() == _currentQuestion.value.correct_answer.lowercase()){
            _resultQuestion.value = true
            _score.value += 1
        }else{
            _resultQuestion.value = false
        }
        nextQuestion()

    }
    fun restartGame(){
        indexQuestion = 0
        _currentQuestion.value = repository.getQuestions()[indexQuestion]
    }


    private fun nextQuestion() {
        indexQuestion++
        if(indexQuestion < repository.getQuestions().size){
            _currentQuestion.value = repository.getQuestions()[indexQuestion]
        }
    }

}