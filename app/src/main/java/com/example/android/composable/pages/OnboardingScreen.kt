package com.example.android.composable.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android.composable.R
import com.example.android.composable.ui.theme.Shapes


@Composable
fun OnboardingScreen(onContinueClicked: () -> Unit) {
    Surface{
        Column(modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Spacer(modifier = Modifier.height(30.dp))
            Image(
                painter = painterResource(id = R.mipmap.ic_launcher_foreground),
                contentDescription = "Compose Camp",
                modifier = Modifier
                    .size(250.dp)
                //.padding(bottom = 5.dp)
                //.clip(CircleShape)
            )
            Spacer(modifier = Modifier.height(70.dp))
            Text("Welcome to Clonify!\n \nThis is a simple Spotify UI clone using Jetpack Compose.\n" +
                    "This is not an Exact Clone due to some limitations!",
                textAlign = TextAlign.Center,
                fontSize = 19.sp,
                modifier = Modifier.padding(horizontal = 8.dp)
            )
        }
        Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = onContinueClicked,
                modifier = Modifier
                    .height(60.dp)
                    .width(300.dp)
                    .padding(bottom = 10.dp),
                shape = RoundedCornerShape(50.dp)
            ) {
                Text("Continue")
            }
        }

    }

}



