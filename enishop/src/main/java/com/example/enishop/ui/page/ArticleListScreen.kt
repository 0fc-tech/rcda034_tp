package com.example.enishop.ui.page

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.enishop.ui.widgets.ArticleItem
import com.example.enishop.vm.ArticleListViewModel

@Composable
fun ArticleListScreen(modifier: Modifier = Modifier,
                      vm : ArticleListViewModel = viewModel()) {
    val listArticles by vm.articles.collectAsState()
    val listCategories by vm.categories.collectAsState()
    Column(modifier = modifier) {
        LazyRow {
            items(listCategories){category->
                FilterChipCategory(category, onSelectCatagory = {category,enabled ->
                    vm.filterCategory(category,enabled)
                })
            }
        }
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
        ) {
            items(listArticles) {
                ArticleItem(it)
            }
        }
    }
}

@Composable
fun FilterChipCategory(category :String,
                       onSelectCatagory : (category:String,enabled:Boolean) -> Unit) {
    var selected by remember { mutableStateOf(false) }

    FilterChip(
        onClick = {
            selected = !selected
            onSelectCatagory(category,selected)
        },
        label = { Text(category) },
        selected = selected,
        leadingIcon = if (selected) {
            {
                Icon(
                    imageVector = Icons.Filled.Done,
                    contentDescription = "Done icon",
                    modifier = Modifier.size(FilterChipDefaults.IconSize)
                )
            }
        } else {
            null
        },
    )
}