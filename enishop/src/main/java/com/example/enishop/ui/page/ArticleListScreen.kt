package com.example.enishop.ui.page

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil3.compose.AsyncImage
import com.example.enishop.ui.theme.Typography
import com.example.enishop.vm.ArticleListViewModel

@Composable
fun ArticleListScreen(modifier: Modifier = Modifier,
                      vm : ArticleListViewModel = viewModel()) {
    val listArticles by vm.articles.collectAsState()
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = modifier
    ){
        items(listArticles){
            OutlinedCard(Modifier.padding(8.dp)){
                Column {
                    AsyncImage(
                        model = it.urlImage,
                        contentDescription = "",
                        alignment = Alignment.Center,
                        modifier = Modifier.height(200.dp)
                            .padding(8.dp)
                            .fillMaxSize()
                            .border(1.dp,Color.Red, CircleShape)
                            .padding(8.dp)
                            .clip(CircleShape)
                    )
                    Text(it.name,
                        style = Typography.titleMedium,
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                    Text("${it.price}€", Modifier.padding(
                        start = 8.dp,
                        end = 8.dp,
                        bottom = 8.dp,
                    ))
                }
            }
        }
    }

}