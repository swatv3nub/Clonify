package com.example.android.composable.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.android.composable.R
import com.example.android.composable.ui.theme.composableTheme

@Composable
fun Library(){
    composableTheme() {
        Box() {
            Image(painter = painterResource(id = R.drawable.bg),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight())

        }
    }
}

@Preview
@Composable
fun LibraryPreview(){
    composableTheme {
        Library()
    }
}