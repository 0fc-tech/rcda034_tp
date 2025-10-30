package com.example.enishop.ui.page

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.enishop.data.model.Article
import com.example.enishop.ui.theme.Typography


val listArticles = listOf(
    Article(
        id = 1,
        name = "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops",
        description = "Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday",
        price = 109.95,
        urlImage = "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_t.png",
        category = "men's clothing")
)
@Composable
fun ArticleDetailScreen(modifier: Modifier = Modifier) {
    Column(
        modifier.padding(16.dp)
    ){
        Text(listArticles[0].name,
            style = Typography.headlineLarge)
        Spacer(Modifier.height(16.dp))
        AsyncImage(
            model = listArticles[0].urlImage,
            contentDescription = "Four pyrolyse",
            modifier = Modifier.fillMaxWidth().height(200.dp)
        )
        Spacer(Modifier.height(16.dp))
        Text(listArticles[0].description)
        Spacer(Modifier.height(16.dp))
        Text("Prix : ${listArticles[0].price}€",
            style = Typography.labelLarge)
    }
}