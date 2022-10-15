package com.example.android.composable.pages


import android.view.MotionEvent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInteropFilter
import com.example.android.composable.R
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.android.composable.BottomBar
import com.example.android.composable.BottomNavGraph
import com.example.android.composable.ui.theme.composableTheme


@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun HomePage() {
    val color = remember { mutableStateOf(Color(0xFFBB86FC)) }
    composableTheme() {
        Box() {
            Image(painter = painterResource(id = R.drawable.bg),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight())
            Column(verticalArrangement = Arrangement.Top,
            modifier = Modifier.padding(15.dp)) {
                Text("Welcome to Clonify",
                    fontSize = 26.sp,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    modifier = Modifier.padding(vertical = 15.dp)
                )
                Row(verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.padding(top = 3.dp)) {
                    Column(modifier = Modifier.padding(horizontal = 5.dp)) {
                        Button(onClick = { /*TODO*/ },
                            modifier = Modifier
                                .height(50.dp)
                                .width(100.dp),
                        shape = RoundedCornerShape(15)
                        ){
                            Image(imageVector = Icons.Default.Favorite, contentDescription = null)
                            Text(text = "Liked Songs",
                            textAlign = TextAlign.Center)
                        }
                    }
                    Column(modifier = Modifier.padding(horizontal = 5.dp)) {
                        Button(onClick = { /*TODO*/ },
                            modifier = Modifier
                                .height(50.dp)
                                .width(100.dp),
                            shape = RoundedCornerShape(15)) {
                            Image(imageVector = Icons.Default.List, contentDescription = null)
                            Text(text = "Global Top 10",
                            textAlign = TextAlign.Center)
                        }
                    }
                    Column(modifier = Modifier.padding(horizontal = 5.dp)) {
                        Button(onClick = { /*TODO*/ },
                            colors = ButtonDefaults.buttonColors(
                                backgroundColor = color.value
                            ),
                            modifier = Modifier
                                .height(50.dp)
                                .width(100.dp)
                                .pointerInteropFilter {
                                    when (it.action) {
                                        MotionEvent.ACTION_DOWN -> {
                                            color.value = Color(0xFF3700B3)
                                        }

                                        MotionEvent.ACTION_UP -> {
                                            color.value = Color(0xFFBB86FC)
                                        }
                                    }
                                    true
                                },
                            shape = RoundedCornerShape(15)) {
                            Image(imageVector = Icons.Default.List, contentDescription = null)
                            Text(text = "Rock Mix",
                                textAlign = TextAlign.Center)
                        }
                    }
                }
                Row(verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier.padding(top = 5.dp)) {
                    Column(modifier = Modifier.padding(horizontal = 5.dp)) {
                        Button(
                            onClick = { /*TODO*/ },
                            modifier = Modifier
                                .height(50.dp)
                                .width(100.dp),
                            shape = RoundedCornerShape(15)) {
                            Image(imageVector = Icons.Default.List, contentDescription = null)
                            Text(text = "EDM Mix",
                                textAlign = TextAlign.Center)
                        }
                    }
                    Column(modifier = Modifier.padding(horizontal = 5.dp)) {
                        Button(onClick = { /*TODO*/ },
                            modifier = Modifier
                                .height(50.dp)
                                .width(100.dp),
                            shape = RoundedCornerShape(15)) {
                            Image(imageVector = Icons.Default.List, contentDescription = null)
                            Text(text = "Hindi Mix",
                                textAlign = TextAlign.Center)
                        }
                    }
                    Column(modifier = Modifier.padding(horizontal = 5.dp)) {
                        Button(onClick = { /*TODO*/ },
                            modifier = Modifier
                                .height(50.dp)
                                .width(100.dp),
                            shape = RoundedCornerShape(15)) {
                            Image(imageVector = Icons.Default.List, contentDescription = null)
                            Text(text = "Metal Mix",
                                textAlign = TextAlign.Center)
                        }
                    }
                }
                Column(modifier = Modifier.padding(top = 25.dp)) {
                    Text(text = "Motivational Speech",
                    color = Color.White,
                    fontSize = 25.sp,
                    fontFamily = FontFamily.SansSerif
                    )
                }
                Row() {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(painter = painterResource(id = R.drawable.hitler), contentDescription = null,
                            modifier = Modifier.size(height = 120.dp, width = 120.dp))
                        Text(text = "Hitler baba",
                            fontFamily = FontFamily.SansSerif,
                        color = Color.White)
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(painter = painterResource(id = R.drawable.tate), contentDescription = null,
                            modifier = Modifier.size(height = 120.dp, width = 100.dp))
                        Text(text = "Tate baba",
                            fontFamily = FontFamily.SansSerif,
                            color = Color.White)
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(painter = painterResource(id = R.drawable.rakuda), contentDescription = null,
                            modifier = Modifier.height(120.dp))
                        Text(text = "Raku Da",
                            fontFamily = FontFamily.SansSerif,
                            color = Color.White
                        )
                    }
                }
                Column(modifier = Modifier.padding(top = 25.dp)) {
                    Text(text = "Audiobooks",
                        color = Color.White,
                        fontSize = 25.sp,
                        fontFamily = FontFamily.SansSerif
                    )
                }
                Row() {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(painter = painterResource(id = R.drawable.hitler), contentDescription = null,
                            modifier = Modifier.size(height = 120.dp, width = 120.dp))
                        Text(text = "Hitler baba",
                            fontFamily = FontFamily.SansSerif,
                            color = Color.White)
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(painter = painterResource(id = R.drawable.tate), contentDescription = null,
                            modifier = Modifier.size(height = 120.dp, width = 100.dp))
                        Text(text = "Tate baba",
                            fontFamily = FontFamily.SansSerif,
                            color = Color.White)
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(painter = painterResource(id = R.drawable.rakuda), contentDescription = null,
                            modifier = Modifier.height(120.dp))
                        Text(text = "Raku Da",
                            fontFamily = FontFamily.SansSerif,
                            color = Color.White
                        )
                    }
                }
                Column(modifier = Modifier.padding(top = 25.dp)) {
                    Text(text = "Shows to Try",
                        color = Color.White,
                        fontSize = 25.sp,
                        fontFamily = FontFamily.SansSerif
                    )
                }
                Row() {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(painter = painterResource(id = R.drawable.hitler), contentDescription = null,
                            modifier = Modifier.size(height = 120.dp, width = 120.dp))
                        Text(text = "Hitler baba",
                            fontFamily = FontFamily.SansSerif,
                            color = Color.White)
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(painter = painterResource(id = R.drawable.tate), contentDescription = null,
                            modifier = Modifier.size(height = 120.dp, width = 100.dp))
                        Text(text = "Tate baba",
                            fontFamily = FontFamily.SansSerif,
                            color = Color.White)
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(painter = painterResource(id = R.drawable.rakuda), contentDescription = null,
                            modifier = Modifier.height(120.dp))
                        Text(text = "Raku Da",
                            fontFamily = FontFamily.SansSerif,
                            color = Color.White
                        )
                    }
                }
            }
            
        }
    }

}

@Preview
@Composable
fun DefaultPreview() {
    composableTheme {
        HomePage()
    }
}
