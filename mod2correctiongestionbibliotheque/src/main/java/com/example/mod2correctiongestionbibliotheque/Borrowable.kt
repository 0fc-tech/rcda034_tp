package com.example.mod2correctiongestionbibliotheque


// Interface for borrowable items
interface Borrowable {
    fun borrow(user: User): Boolean
    fun returnItem(user: User)
}