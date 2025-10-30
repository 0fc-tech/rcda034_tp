package com.example.enishop.ui.widgets

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.enishop.data.model.Article
import com.example.enishop.ui.theme.Typography


@Composable
fun ArticleItem(article: Article) {
    OutlinedCard(Modifier.padding(8.dp)) {
        Column {
            AsyncImage(
                model = article.urlImage,
                contentDescription = "",
                alignment = Alignment.Center,
                modifier = Modifier
                    .height(200.dp)
                    .padding(8.dp)
                    .fillMaxSize()
                    .border(1.dp, Color.Red, CircleShape)
                    .padding(8.dp)
                    .clip(CircleShape)
            )
            Text(
                article.name,
                style = Typography.titleMedium,
                modifier = Modifier.padding(horizontal = 8.dp)
            )
            Text(
                "${article.price}€", Modifier.padding(
                    start = 8.dp,
                    end = 8.dp,
                    bottom = 8.dp,
                )
            )
        }
    }
}