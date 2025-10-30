package com.example.enishop.vm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.enishop.data.model.Article
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ArticleListViewModel : ViewModel() {
    private val _articles = MutableStateFlow<List<Article>>(emptyList())
    val articles : StateFlow<List<Article>> = _articles

    init {
        _articles.value = listOf(
            Article(
                id = 1,
                name = "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops",
                description = "Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday",
                price = 109.95,
                urlImage = "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_t.png",
                category = "men's clothing"),

            Article(
                id = 2,
                name = "Mens Casual Premium Slim Fit T-Shirts",
                description = "Slim-fitting style, contrast raglan long sleeve, three-button henley placket, light weight & soft fabric for breathable and comfortable wearing. And Solid stitched shirts with round neck made for durability and a great fit for casual fashion wear and diehard baseball fans. The Henley style round neckline includes a three-button placket.",
                price = 22.3,
                urlImage = "https://fakestoreapi.com/img/71-3HjGNDUL._AC_SY879._SX._UX._SY._UY_t.png",
                category = "men's clothing",
            ),

            Article(
                id = 3,
                name = "Mens Cotton Jacket",
                description = "great outerwear jackets for Spring/Autumn/Winter, suitablefor many occasions, such as working, hiking, camping, mountain/rock climbing, cycling, traveling or other outdoors. Good gift choice for you or your family Titre exact du cours complet member. A warm hearted love to Father, husband or son in this thanksgiving or Christmas Day.",
                price = 55.99,
                urlImage = "https://fakestoreapi.com/img/71li-ujtlUL._AC_UX679_t.png",
                category = "men's clothing",
            )
        )
    }
    //fun filterCategory(category: String) {
    //    _articles.value = repository.getArticles().filter { it.category == category }
    //}



}