package com.example.opentrivia.data.model

data class Question(
    val type:Boolean,
    val difficulty:String,
    val question:String,
    val correct_answer:String,
    val incorrect_answers:List<String>,
    val category:String,

)