package com.example.android.composable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.runtime.*

import androidx.compose.ui.tooling.preview.Preview
import com.example.android.composable.pages.OnboardingScreen

import com.example.android.composable.ui.theme.composableTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            composableTheme {
                var showOnboarding by remember {
                    mutableStateOf(true)
                }
                if (showOnboarding) {
                    OnboardingScreen(onContinueClicked = { showOnboarding = false})
                } else {
                    MainScreen()
                }
            }
        }
    }
}


@Preview
@Composable
fun Preeeeee(){
    composableTheme() {
        MainScreen()
    }

}
