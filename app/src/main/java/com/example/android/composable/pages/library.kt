package com.example.android.composable.pages

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
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
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android.composable.R
import com.example.android.composable.ui.theme.composableTheme


@Composable
fun Library() {
    val context = LocalContext.current
    val textState = remember { mutableStateOf(TextFieldValue("")) }
    composableTheme() {
        Image(painter = painterResource(id = R.drawable.bg),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.FillBounds)
        Box {
            Column(modifier = Modifier.padding(horizontal = 20.dp)) {
                Text(text = "Playlists",
                    fontSize = 40.sp,
                    modifier = Modifier.padding(vertical = 30.dp),
                    color = Color.White
                )
                findInPlaylist(state = textState)
                Spacer(modifier = Modifier.height(20.dp))
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        Toast
                            .makeText(
                                context,
                                "Create a new Playlist",
                                Toast.LENGTH_SHORT
                            )
                            .show()
                    }) {
                    Image(
                        imageVector = Icons.Default.Add,
                        contentDescription = null,
                        colorFilter = ColorFilter.tint(color = Color.White),
                        modifier = Modifier.size(50.dp)
                    )
                    Spacer(modifier = Modifier.padding(horizontal = 10.dp))
                    Text(text = "Create Playlist",
                        color = Color.White,
                        fontSize = 30.sp,
                        modifier = Modifier.padding(top = 6.5.dp)
                    )
                }
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        Toast
                            .makeText(
                                context,
                                "Create a new Playlist",
                                Toast.LENGTH_SHORT
                            )
                            .show()
                    }) {
                    Image(
                        imageVector = Icons.Default.Add,
                        contentDescription = null,
                        colorFilter = ColorFilter.tint(color = Color.White),
                        modifier = Modifier.size(50.dp)
                    )
                    Spacer(modifier = Modifier.padding(horizontal = 10.dp))
                    Text(text = "Create Playlist",
                        color = Color.White,
                        fontSize = 30.sp,
                        modifier = Modifier.padding(top = 6.5.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun findInPlaylist(state: MutableState<TextFieldValue>){
    Card() {
        TextField(
            value = state.value,
            onValueChange = { value ->
                state.value = value
            },
            placeholder = { Text(text = "Find in playlists",
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


@Preview
@Composable
fun LibraryPreview() {
    composableTheme {
        Library()
    }
}