package com.yusufmendes.jetpackcomposedesignwork

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yusufmendes.jetpackcomposedesignwork.ui.theme.JetpackComposeDesignWorkTheme

class ExampleRecipeScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeDesignWorkTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                    RecipeScreen()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun RecipeScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { TextDesign(text = "Yemek Tarifi") })
        },
        content = {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.recipe),
                    contentDescription = "",
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(250.dp)
                )
                Row(modifier = Modifier.fillMaxWidth()) {
                    Button(
                        onClick = { Log.e("like button", "Liked") },
                        colors = ButtonDefaults.buttonColors(
                            colorResource(id = R.color.orange),
                            contentColor = Color.White
                        ),
                        modifier = Modifier.weight(50f)
                    ) {
                        TextDesign(text = "Beğen")
                    }
                    Button(
                        onClick = { Log.e("like button", "Liked") },
                        colors = ButtonDefaults.buttonColors(
                            colorResource(id = R.color.other_color),
                            contentColor = Color.White
                        ),
                        modifier = Modifier.weight(50f)
                    ) {
                        TextDesign(text = "Yorum yap")
                    }
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(all = 10.dp)
                ) {
                    Text(
                        text = "Köfte",
                        color = colorResource(id = R.color.other_color),
                        fontSize = 18.sp
                    )
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        TextDesign(text = "Izgaraya Uygun")
                        TextDesign(text = "7 Haziran")
                    }
                }
                Text(
                    text = "Köfte harcını hazırlamak için,soğanları rendeleyin ve maydanozları ince ince kesin. İsterseniz bir diş sarımsak da ekleyebilirsiniz.",
                    modifier = Modifier.padding(all = 10.dp),
                    textAlign = TextAlign.Center
                )

            }
        }
    )
}

@Composable
fun TextDesign(text: String) {
    Text(text = text)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview4() {
    JetpackComposeDesignWorkTheme {
        RecipeScreen()
    }
}