package com.example.android.composable.pages


import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.List

import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android.composable.R
import com.example.android.composable.ui.theme.composableTheme


@Composable
fun HomePage() {
    composableTheme {
        Image(painter = painterResource(id = R.drawable.bg),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.FillBounds)
        Box(modifier = Modifier.verticalScroll(rememberScrollState())) {
            Column(verticalArrangement = Arrangement.Top,
            modifier = Modifier.padding(15.dp)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text("Welcome to Clonify",
                        fontSize = 26.sp,
                        fontFamily = FontFamily.Monospace,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        modifier = Modifier.padding(vertical = 15.dp)
                    )
                    Spacer(modifier = Modifier.width(55.dp))
                    Image(imageVector = Icons.Default.Settings,
                        contentDescription = null,
                    colorFilter = ColorFilter.tint(color = Color.White))
                }
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
                            modifier = Modifier
                                .height(50.dp)
                                .width(100.dp),
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
                    Text(text = "Rock Bands",
                    color = Color.White,
                    fontSize = 25.sp,
                    fontFamily = FontFamily.SansSerif
                    )
                }
                Column(modifier = Modifier.horizontalScroll(rememberScrollState())) {
                    Row(modifier = Modifier.padding(top = 10.dp)) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(painter = painterResource(id = R.drawable.rakuda), contentDescription = null,
                                modifier = Modifier.height(120.dp))
                            Text(text = "Raku Da",
                                fontFamily = FontFamily.SansSerif,
                                color = Color.White
                            )
                        }
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(painter = painterResource(id = R.drawable.rakuda), contentDescription = null,
                                modifier = Modifier.height(120.dp))
                            Text(text = "Raku Da",
                                fontFamily = FontFamily.SansSerif,
                                color = Color.White
                            )
                        }
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(painter = painterResource(id = R.drawable.rakuda), contentDescription = null,
                                modifier = Modifier.height(120.dp))
                            Text(text = "Raku Da",
                                fontFamily = FontFamily.SansSerif,
                                color = Color.White
                            )
                        }
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(painter = painterResource(id = R.drawable.rakuda), contentDescription = null,
                                modifier = Modifier.height(120.dp))
                            Text(text = "Raku Da",
                                fontFamily = FontFamily.SansSerif,
                                color = Color.White
                            )
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
                Column(modifier = Modifier.padding(top = 25.dp)) {
                    Text(text = "Audiobooks",
                        color = Color.White,
                        fontSize = 25.sp,
                        fontFamily = FontFamily.SansSerif
                    )
                }
                Column(modifier = Modifier.horizontalScroll(rememberScrollState())) {
                    Row(modifier = Modifier.padding(top = 10.dp)) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(painter = painterResource(id = R.drawable.rakuda), contentDescription = null,
                                modifier = Modifier.height(120.dp))
                            Text(text = "Raku Da",
                                fontFamily = FontFamily.SansSerif,
                                color = Color.White
                            )
                        }
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(painter = painterResource(id = R.drawable.rakuda), contentDescription = null,
                                modifier = Modifier.height(120.dp))
                            Text(text = "Raku Da",
                                fontFamily = FontFamily.SansSerif,
                                color = Color.White
                            )
                        }
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(painter = painterResource(id = R.drawable.rakuda), contentDescription = null,
                                modifier = Modifier.height(120.dp))
                            Text(text = "Raku Da",
                                fontFamily = FontFamily.SansSerif,
                                color = Color.White
                            )
                        }
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(painter = painterResource(id = R.drawable.rakuda), contentDescription = null,
                                modifier = Modifier.height(120.dp))
                            Text(text = "Raku Da",
                                fontFamily = FontFamily.SansSerif,
                                color = Color.White
                            )
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
                Column(modifier = Modifier.padding(top = 25.dp)) {
                    Text(text = "Shows to Try",
                        color = Color.White,
                        fontSize = 25.sp,
                        fontFamily = FontFamily.SansSerif
                    )
                }
                Column(modifier = Modifier.horizontalScroll(rememberScrollState())) {
                    Row(modifier = Modifier.padding(top = 10.dp)) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(painter = painterResource(id = R.drawable.rakuda), contentDescription = null,
                                modifier = Modifier.height(120.dp))
                            Text(text = "Raku Da",
                                fontFamily = FontFamily.SansSerif,
                                color = Color.White
                            )
                        }
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(painter = painterResource(id = R.drawable.rakuda), contentDescription = null,
                                modifier = Modifier.height(120.dp))
                            Text(text = "Raku Da",
                                fontFamily = FontFamily.SansSerif,
                                color = Color.White
                            )
                        }
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(painter = painterResource(id = R.drawable.rakuda), contentDescription = null,
                                modifier = Modifier.height(120.dp))
                            Text(text = "Raku Da",
                                fontFamily = FontFamily.SansSerif,
                                color = Color.White
                            )
                        }
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(painter = painterResource(id = R.drawable.rakuda), contentDescription = null,
                                modifier = Modifier.height(120.dp))
                            Text(text = "Raku Da",
                                fontFamily = FontFamily.SansSerif,
                                color = Color.White
                            )
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
                Column(modifier = Modifier.padding(top = 25.dp)) {
                    Text(text = "Old Hits",
                        color = Color.White,
                        fontSize = 25.sp,
                        fontFamily = FontFamily.SansSerif
                    )
                }
                Column(modifier = Modifier.horizontalScroll(rememberScrollState())) {
                    Row(modifier = Modifier.padding(top = 10.dp)) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(
                                painter = painterResource(id = R.drawable.rakuda),
                                contentDescription = null,
                                modifier = Modifier.height(120.dp)
                            )
                            Text(
                                text = "Raku Da",
                                fontFamily = FontFamily.SansSerif,
                                color = Color.White
                            )
                        }
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(
                                painter = painterResource(id = R.drawable.rakuda),
                                contentDescription = null,
                                modifier = Modifier.height(120.dp)
                            )
                            Text(
                                text = "Raku Da",
                                fontFamily = FontFamily.SansSerif,
                                color = Color.White
                            )
                        }
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(
                                painter = painterResource(id = R.drawable.rakuda),
                                contentDescription = null,
                                modifier = Modifier.height(120.dp)
                            )
                            Text(
                                text = "Raku Da",
                                fontFamily = FontFamily.SansSerif,
                                color = Color.White
                            )
                        }
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(
                                painter = painterResource(id = R.drawable.rakuda),
                                contentDescription = null,
                                modifier = Modifier.height(120.dp)
                            )
                            Text(
                                text = "Raku Da",
                                fontFamily = FontFamily.SansSerif,
                                color = Color.White
                            )
                        }
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(
                                painter = painterResource(id = R.drawable.rakuda),
                                contentDescription = null,
                                modifier = Modifier.height(120.dp)
                            )
                            Text(
                                text = "Raku Da",
                                fontFamily = FontFamily.SansSerif,
                                color = Color.White
                            )
                        }
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
