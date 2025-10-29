package com.example.mod2correctiongestionbibliotheque



// Class for a book, implementing the Borrowable interface
class Book(title: String, author: String, year: Int, var genre: String)
    : Item(title, author, year), Borrowable {
    override fun borrow(user: User): Boolean {
        if (isAvailable) {
            isAvailable = false
            println("$title has been borrowed by ${user.name}")
            return true
        }
        return false
    }

    override fun returnItem(user: User) {
        isAvailable = true
        println("$title has been returned by ${user.name}")
    }
}