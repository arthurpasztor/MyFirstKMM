package com.example.myfirstkmm.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myfirstkmm.SharedRes
import com.example.myfirstkmm.platform.Strings
import com.example.myfirstkmm.repository.Greeting
import com.example.myfirstkmm.repository.MoviesRepository
import dev.icerock.moko.resources.StringResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
//                    val viewModel = MoviesViewModel()
                    LaunchedEffect(true) {
                        MoviesRepository.getMoviesList()
                        MoviesRepository.getMovie("tt0000081")
                    }

                    var text by remember { mutableStateOf("Loading") }
                    LaunchedEffect(true) {
                        text = try {
                            Greeting().greet()
                        } catch (e: Exception) {
                            e.localizedMessage ?: "error"
                        }
                    }

                    Column(modifier = Modifier.fillMaxSize()) {
                        GreetingView(text)
                        Spacer(Modifier.height(24.dp))
                        Text(text = StringResource(id = SharedRes.strings.hello_world))
                        Spacer(Modifier.height(24.dp))
                        Image(painter = painterResource(
                            id = com.example.myfirstkmm.R.drawable.kermit),
                            contentDescription = null)
                    }
                }
            }
        }
    }
}

@Composable
fun GreetingView(text: String) {
    Text(text = text)
}

@Preview
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        GreetingView(StringResource(id = SharedRes.strings.hello_world))
    }
}

@Composable
fun StringResource(id: StringResource, vararg args: Any): String {
    return Strings(LocalContext.current).get(id, args.toList())
}