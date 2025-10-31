package com.example.opentrivia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.opentrivia.ui.theme.TPTheme
import com.example.opentrivia.ui.theme.Typography
import com.example.opentrivia.vm.TriviaGameVM
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TPTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    OpenTriviaScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}


@Composable
fun OpenTriviaScreen(modifier: Modifier = Modifier,vm : TriviaGameVM = viewModel()) {
    val currentQuestion by vm.currentQuestion.collectAsState()
    val score by vm.score.collectAsState()
    val resultQuestion by vm.resultQuestion.collectAsState()
    Column(modifier.fillMaxWidth()) {
        Text(currentQuestion?.question ?: "", style = Typography.titleLarge)
        Text("Score : $score" )
        Row(Modifier.fillMaxWidth()){
            Button(
                onClick = {vm.answer(true)},
                modifier = Modifier.weight(1f)
                    .padding(horizontal = 8.dp)){
                Text("True")}
            Button(onClick = {vm.answer(false)},
                modifier = Modifier.weight(1f)
                    .padding(horizontal = 8.dp)){
                Text("False")}
        }
        if(resultQuestion != null){
            if(resultQuestion == true){
                Text(text = "Bonne réponse", color = Color.Green
                    )
            } else{
                Text(text = "Mauvaise réponse", color = Color.Red
                )
            }
        }
        Spacer(Modifier.weight(1f))
        Button(onClick = {vm.restartGame()}, Modifier.fillMaxWidth()){
            Text("Recommencer")
        }

    }
}