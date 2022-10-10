package com.example.android.composable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.android.composable.pages.HomePage
import com.example.android.composable.ui.theme.composableTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            composableTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    defaultPage()
                }
            }
        }
    }
}

@Composable
fun defaultPage() {
    HomePage()
}

@Preview
@Composable
fun Preeeeee(){
    defaultPage()
}
