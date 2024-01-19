package com.yusufmendes.jetpackcomposedesignwork

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yusufmendes.jetpackcomposedesignwork.ui.theme.JetpackComposeDesignWorkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeDesignWorkTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    /*UseOfRow()
                    UseOfColumn()
                    UseOfBox()
                    UseMixed()
                    UseOfArrangement()*/
                    UseOfAlignment()
                }
            }
        }
    }
}

@Composable
fun UseOfRow() {
    Row {
        Box(
            modifier = Modifier
                .size(80.dp)
                .background(Color.Red)
        )
        Box(
            modifier = Modifier
                .size(50.dp)
                .background(Color.Green)
        )
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Blue)
        )
    }
}

@Composable
fun UseOfColumn() {
    Column {
        Box(
            modifier = Modifier
                .size(80.dp)
                .background(Color.Red)
        )
        Box(
            modifier = Modifier
                .size(50.dp)
                .background(Color.Green)
        )
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Blue)
        )
    }
}

@Composable
fun UseOfBox() {
    Box {
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Red)
        )
        Box(
            modifier = Modifier
                .size(80.dp)
                .background(Color.Green)
        )
        Box(
            modifier = Modifier
                .size(60.dp)
                .background(Color.Blue)
        )
    }
}

@Composable
fun UseMixed() {
    Row {
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Red)
        )
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Green)
        )
        Column {
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .background(Color.Blue)
            )

            Box(
                modifier = Modifier
                    .size(100.dp)
                    .background(Color.Yellow)
            )
        }
        Box {
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .background(Color.Black)
            )
            Box(
                modifier = Modifier
                    .size(80.dp)
                    .background(Color.White)
            )
        }
    }
}

@Composable
fun UseOfArrangement() {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxHeight()
    ) {
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Red)
        )
        Box(
            modifier = Modifier
                .size(80.dp)
                .background(Color.Green)
        )
        Box(
            modifier = Modifier
                .size(60.dp)
                .background(Color.Blue)
        )
    }

    Row(
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxWidth()
    ) {
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Red)
        )
        Box(
            modifier = Modifier
                .size(80.dp)
                .background(Color.Green)
        )
        Box(
            modifier = Modifier
                .size(60.dp)
                .background(Color.Blue)
        )
    }
}

@Composable
fun UseOfAlignment() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Red)
        )
        Box(
            modifier = Modifier
                .size(80.dp)
                .background(Color.Green)
        )
        Box(
            modifier = Modifier
                .size(60.dp)
                .background(Color.Blue)
        )
    }

    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Red)
        )
        Box(
            modifier = Modifier
                .size(80.dp)
                .background(Color.Green)
        )
        Box(
            modifier = Modifier
                .size(60.dp)
                .background(Color.Blue)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeDesignWorkTheme {
        /*UseOfRow()
        UseOfColumn()
        UseOfBox()
        UseMixed()
        UseOfArrangement()*/
        UseOfAlignment()
    }
}