package com.example.gestionfilmserie
enum class TypeFilm { DEJA_VU, A_VOIR}
var userInput :String = ""
val filmSerie = mutableMapOf<String, TypeFilm>()
fun main() {
    do {
        showMenu()
        userInput = readln()
        when(userInput){
            "1"-> saveMovieSerie(TypeFilm.DEJA_VU)
            "2"-> saveMovieSerie(TypeFilm.A_VOIR)
            "3"-> seeList()
        }
    }while(userInput != "4")

}

fun showMenu() {
    println("Choisissez")
    println("1 - Ajouter un film/série déjà vu")
    println("2 - Ajouter un film/série à voir")
    println("3 - Voir toute la liste")
    println("4 - Exit")
}
fun saveMovieSerie(typeFilm : TypeFilm){
    println("Tapez le nom du film/série")
    filmSerie.put(readln(),typeFilm)
}
fun seeList(){
    for (filmSerie in filmSerie){
        if(filmSerie.value == TypeFilm.A_VOIR)
            println("${filmSerie.key} est à voir")
        else
            println("${filmSerie.key} est déjà vu")
    }

}
