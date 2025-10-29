package com.example.mod2gestionbiblio

open class Item(
    val title :String,
    val author : String,
    val releaseYear : Int,
    var isAvailable :Boolean = true
)