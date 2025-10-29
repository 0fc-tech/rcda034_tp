package com.example.enishop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.enishop.ui.theme.TPTheme
import com.example.enishop.ui.widgets.ArticleDetailScreen

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TPTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = {
                        TopAppBar(

                            title = {
                                Text(text = "Enishop")
                            },
                            colors = TopAppBarDefaults
                                .topAppBarColors().copy(
                                    containerColor =
                                        MaterialTheme.colorScheme.inversePrimary
                                )
                        )
                    }
                ) { innerPadding ->
                    ArticleDetailScreen(Modifier.padding(innerPadding))
                }
            }
        }
    }
}
