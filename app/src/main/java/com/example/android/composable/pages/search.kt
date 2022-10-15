package com.example.android.composable.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android.composable.R
import com.example.android.composable.ui.theme.composableTheme


@Composable
fun Search() {
    composableTheme() {
        Image(painter = painterResource(id = R.drawable.bg),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.FillBounds)
        Box {
            Column(modifier = Modifier.padding(horizontal = 15.dp)) {
                val textState = remember { mutableStateOf(TextFieldValue("")) }
                Spacer(modifier = Modifier.height(15.dp))
                SearchView(state = textState)
                Spacer(modifier = Modifier.height(420.dp))
                BodyElements()
            }
        }
    }
}

@Composable
fun SearchView(state: MutableState<TextFieldValue>) {
    Text("Search",
        color = Color.White,
        fontSize = 45.sp,

        modifier = Modifier.padding(95.dp, 50.dp, 90.dp, 20.dp)
    )
    Card() {
        TextField(
            value = state.value,
            onValueChange = { value ->
                state.value = value
            },
            placeholder = { Text(text = "Artists, songs or podcasts",
                modifier = Modifier
                    .alpha(ContentAlpha.disabled),
                color = Color.Black) },
            modifier = Modifier
                .fillMaxWidth(),
            textStyle = TextStyle(color = Color.Black, fontSize = 18.sp),
            leadingIcon = {
                Icon(
                    Icons.Default.Search,
                    contentDescription = "",
                    tint = Color.DarkGray,
                    modifier = Modifier
                        .padding(start = 23.dp)
                        .size(24.dp)
                )
            },
            singleLine = true,
            colors = TextFieldDefaults.textFieldColors(
                textColor = Color.Black,
                disabledTextColor = Color.Transparent,
                backgroundColor = Color.White,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent
            )
        )
    }
}

@Composable
fun BodyElements() {
    Text("Type a Song Name, Artist name, or Album name in the Search box" +
    "Or Listen to your playlists in the Library Page next to this!",
    textAlign = TextAlign.Center,
    color = Color.White,)
}

@Preview
@Composable
fun SearchPreview() {
    composableTheme {
        Search()
    }
}