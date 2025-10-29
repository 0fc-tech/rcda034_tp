package com.example.mod2gestionbiblio

class User(val name: String, val id: Int) {
    val borrowedItems = mutableListOf<Item>()

    fun borrowItem(item: Item) {
        if (item is Borrowable && item.borrow(this)) {
            borrowedItems.add(item)
        } else {
            println("${item.title} is not available for borrowing")
        }
    }

    fun returnItem(item: Item) {
        if (item in borrowedItems && item is Borrowable) {
            item.returnItem(this)
            borrowedItems.remove(item)
        }
    }
}