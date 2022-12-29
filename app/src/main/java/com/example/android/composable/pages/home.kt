package com.example.android.composable.pages


import android.widget.Toast
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android.composable.R
import com.example.android.composable.ui.theme.composableTheme



@Composable
fun HomePage() {
    val context = LocalContext.current
    composableTheme {
        Image(painter = painterResource(id = R.drawable.bg),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.FillBounds)
        Box(modifier = Modifier
            .verticalScroll(rememberScrollState())
            ) {
            Column(verticalArrangement = Arrangement.Top,
            modifier = Modifier.padding(15.dp)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text("Welcome to Clonify",
                        fontSize = 26.sp,
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
                    Text(text = "Rock/Metal Bands",
                    color = Color.White,
                    fontSize = 25.sp
                    )
                }
                Column(modifier = Modifier.horizontalScroll(rememberScrollState())) {
                    Row(modifier = Modifier.padding(top = 10.dp)) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(painter = painterResource(id = R.drawable.bandlinkinpark), contentDescription = null,
                                modifier = Modifier.height(120.dp)
                                    .clickable {
                                        Toast
                                            .makeText(
                                                context,
                                                "Linkin Park",
                                                Toast.LENGTH_SHORT
                                            ).show()
                                    }
                            )
                            Text(text = "Linkin Park",
                                color = Color.White
                            )
                        }
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(painter = painterResource(id = R.drawable.bandslipknot), contentDescription = null,
                                modifier = Modifier.height(120.dp)
                                    .clickable {
                                        Toast
                                            .makeText(
                                                context,
                                                "SlipKnot",
                                                Toast.LENGTH_SHORT
                                            ).show()
                                    })
                            Text(text = "SlipKnot",
                                color = Color.White
                            )
                        }
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(painter = painterResource(id = R.drawable.bandavengedsevenfold), contentDescription = null,
                                modifier = Modifier.height(120.dp)
                                    .clickable {
                                        Toast
                                            .makeText(
                                                context,
                                                "Avenged Sevenfold",
                                                Toast.LENGTH_SHORT
                                            ).show()
                                    })
                            Text(text = "Avenged Sevenfold",
                                color = Color.White
                            )
                        }
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(painter = painterResource(id = R.drawable.banklimpbizkit), contentDescription = null,
                                modifier = Modifier.height(120.dp)
                                    .clickable {
                                        Toast
                                            .makeText(
                                                context,
                                                "Limp Bizkit",
                                                Toast.LENGTH_SHORT
                                            ).show()
                                    })
                            Text(text = "Limp Bizkit",
                                
                                color = Color.White
                            )
                        }
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(painter = painterResource(id = R.drawable.bandmetallica), contentDescription = null,
                                modifier = Modifier.height(120.dp)
                                    .clickable {
                                        Toast
                                            .makeText(
                                                context,
                                                "Metallica",
                                                Toast.LENGTH_SHORT
                                            ).show()
                                    })
                            Text(text = "Metallica",
                                
                                color = Color.White
                            )
                        }
                    }
                }
                Column(modifier = Modifier.padding(top = 25.dp)) {
                    Text(text = "Pop",
                        color = Color.White,
                        fontSize = 25.sp,
                    )
                }
                Column(modifier = Modifier.horizontalScroll(rememberScrollState())) {
                    Row(modifier = Modifier.padding(top = 10.dp)) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(painter = painterResource(id = R.drawable.bandbackstreetboys), contentDescription = null,
                                modifier = Modifier.height(120.dp)
                                    .clickable {
                                        Toast
                                            .makeText(
                                                context,
                                                "Backstreet Boys",
                                                Toast.LENGTH_SHORT
                                            ).show()
                                    })
                            Text(text = "Backstreet Boys",
                                
                                color = Color.White
                            )
                        }
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(painter = painterResource(id = R.drawable.justinbieber), contentDescription = null,
                                modifier = Modifier.height(120.dp)
                                    .clickable {
                                        Toast
                                            .makeText(
                                                context,
                                                "Justin Bieber",
                                                Toast.LENGTH_SHORT
                                            ).show()
                                    })
                            Text(text = "Justin Bieber",
                                
                                color = Color.White
                            )
                        }
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(painter = painterResource(id = R.drawable.bts), contentDescription = null,
                                modifier = Modifier.height(120.dp)
                                    .clickable {
                                        Toast
                                            .makeText(
                                                context,
                                                "BTS",
                                                Toast.LENGTH_SHORT
                                            ).show()
                                    })
                            Text(text = "BTS",
                                
                                color = Color.White
                            )
                        }
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(painter = painterResource(id = R.drawable.bandmaroon5), contentDescription = null,
                                modifier = Modifier.height(120.dp)
                                    .clickable {
                                        Toast
                                            .makeText(
                                                context,
                                                "Maroon 5",
                                                Toast.LENGTH_SHORT
                                            ).show()
                                    })
                            Text(text = "Maroon 5",
                                
                                color = Color.White
                            )
                        }
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(painter = painterResource(id = R.drawable.edsheeran), contentDescription = null,
                                modifier = Modifier.height(120.dp)
                                    .clickable {
                                        Toast
                                            .makeText(
                                                context,
                                                "Ed Sheeran",
                                                Toast.LENGTH_SHORT
                                            ).show()
                                    })
                            Text(text = "Ed Sheeran",
                                
                                color = Color.White
                            )
                        }
                    }
                }
                Column(modifier = Modifier.padding(top = 25.dp)) {
                    Text(text = "MTV Hustle 2.0",
                        color = Color.White,
                        fontSize = 25.sp
                    )
                }
                Column(modifier = Modifier.horizontalScroll(rememberScrollState())) {
                    Row(modifier = Modifier.padding(top = 10.dp)) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(painter = painterResource(id = R.drawable.epriyer), contentDescription = null,
                                modifier = Modifier.height(120.dp)
                                    .clickable {
                                        Toast
                                            .makeText(
                                                context,
                                                "EPR Iyer",
                                                Toast.LENGTH_SHORT
                                            ).show()
                                    })
                            Text(text = "EPR Iyer",
                                
                                color = Color.White
                            )
                        }
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(painter = painterResource(id = R.drawable.gd47), contentDescription = null,
                                modifier = Modifier.height(120.dp)
                                    .clickable {
                                        Toast
                                            .makeText(
                                                context,
                                                "GD 47",
                                                Toast.LENGTH_SHORT
                                            ).show()
                                    })
                            Text(text = "GD 47",
                                
                                color = Color.White
                            )
                        }
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(painter = painterResource(id = R.drawable.paradox), contentDescription = null,
                                modifier = Modifier.height(120.dp)
                                    .clickable {
                                        Toast
                                            .makeText(
                                                context,
                                                "Paradox",
                                                Toast.LENGTH_SHORT
                                            ).show()
                                    })
                            Text(text = "paradox",
                                
                                color = Color.White
                            )
                        }
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(painter = painterResource(id = R.drawable.gravity), contentDescription = null,
                                modifier = Modifier.height(120.dp)
                                    .clickable {
                                        Toast
                                            .makeText(
                                                context,
                                                "Gravity",
                                                Toast.LENGTH_SHORT
                                            ).show()
                                    })
                            Text(text = "Gravity",
                                
                                color = Color.White
                            )
                        }
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(painter = painterResource(id = R.drawable.shrusti), contentDescription = null,
                                modifier = Modifier.height(120.dp)
                                    .clickable {
                                        Toast
                                            .makeText(
                                                context,
                                                "Shrusti",
                                                Toast.LENGTH_SHORT
                                            ).show()
                                    })
                            Text(text = "Shrusti",
                                color = Color.White
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.padding(top = 48.dp))
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
