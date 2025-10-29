package com.example.mod2correctiongestionbibliotheque

// Base class for library items
open class Item(val title: String, val author: String, val year: Int) {
    var isAvailable = true
}