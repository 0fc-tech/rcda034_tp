package com.example.mod2gestionbiblio

interface Borrowable {
    //L'utilisateur essaie d'emprunter. Retourne true si le livre est dispo
    fun borrow(user : User) : Boolean
    //L'utilisateur retourne l'item
    fun returnItem(user : User)
}