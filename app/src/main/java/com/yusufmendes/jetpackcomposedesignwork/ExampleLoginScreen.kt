package com.yusufmendes.jetpackcomposedesignwork

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.yusufmendes.jetpackcomposedesignwork.ui.theme.JetpackComposeDesignWorkTheme

class ExampleLoginScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeDesignWorkTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                    LoginScreen()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen() {
    Surface(
        color = MaterialTheme.colorScheme.primary
    ) {
        val userName = remember { mutableStateOf("") }
        val password = remember { mutableStateOf("") }
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(painter = painterResource(id = R.drawable.login), contentDescription = "")
            TextField(
                value = userName.value,
                onValueChange = { userName.value = it },
                label = { Text(text = "Username") },
                colors = TextFieldDefaults.textFieldColors(
                    textColor = Color.Black,
                    focusedIndicatorColor = Color.Red
                )
            )
            TextField(
                value = password.value,
                onValueChange = { password.value = it },
                label = { Text(text = "Password") },
                colors = TextFieldDefaults.textFieldColors(
                    textColor = Color.Black,
                    focusedIndicatorColor = Color.Red
                )
            )
            Button(
                onClick = { Log.e("login message", "Login") },
                colors = ButtonDefaults.buttonColors(
                    colorResource(id = R.color.main_dark_color),
                    contentColor = Color.White
                )
            ) {
                Text(text = "LOGIN")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview3() {
    JetpackComposeDesignWorkTheme {
        LoginScreen()
    }
}