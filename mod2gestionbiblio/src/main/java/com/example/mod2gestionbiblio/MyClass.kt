package com.example.mod2gestionbiblio



fun main() {
    val kotlinProg = Book("Kotlin Programming", "Jane Doe", 2021, "Education")
    val flutterPro = Book("Flutter Programming", "Majid", 2023, "Education")
    val harryPotter = Book("Harry Potter", "JK Rowling", 1995, "Novel")

    val jeanMichel = User("Jean Michel", 1)
    val robert = User("Robert Jackson", 2)

    jeanMichel.borrowItem(kotlinProg)
    robert.borrowItem(kotlinProg)
    robert.borrowItem(flutterPro)
    jeanMichel.returnItem(kotlinProg)

    robert.returnItem(flutterPro)
}