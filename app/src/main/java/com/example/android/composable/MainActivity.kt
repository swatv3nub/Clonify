package com.example.android.composable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
                    HomePage()
                }
            }
        }
    }
}

@Composable
fun HomePage() {
    composableTheme() {
        Column(verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.hands),
                contentDescription = "Banner"
            )
            Text("Score",
                fontSize = 30.sp,
            modifier = Modifier.padding(top = 20.dp)
            )
            Text("0 / 4",
            fontSize = 50.sp,
            modifier = Modifier.padding(top = 20.dp),
            fontWeight = FontWeight.Bold
            )
            Row(horizontalArrangement = Arrangement.Center,
            modifier = Modifier.padding(top = 50.dp)) {
                Column(modifier = Modifier.padding(all = 45.dp)) {
                    Text(text = "You Chose",
                    fontSize = 16.sp
                    )
                    Text(text = "Rock",
                    fontWeight = FontWeight.Bold,
                    fontSize = 32.sp,
                    modifier = Modifier.padding(top = 5.dp))
                }
                Column(modifier = Modifier.padding(all = 45.dp)) {
                    Text(text = "Android Chose",
                    fontSize = 16.sp
                    )
                    Text(text = "Paper",
                    fontWeight = FontWeight.Bold,
                    fontSize = 32.sp,
                    modifier = Modifier.padding(top = 5.dp))
                }
                
            }
            Row(horizontalArrangement = Arrangement.Center,
            //verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(top = 80.dp)) {
                Column(modifier = Modifier.padding(15.dp)) {
                    Button(onClick = {},
                        modifier = Modifier
                            .height(90.dp)
                            .width(90.dp),
                        shape = RoundedCornerShape(15)
                            ) {
                        Text("Rock")
                    }
                }
                Column(modifier = Modifier.padding(15.dp)){
                    Button(onClick = {},
                        modifier = Modifier
                            .height(90.dp)
                            .width(90.dp),
                        shape = RoundedCornerShape(15)
                            ) {
                        Text("Paper")
                    }
                }
                Column(modifier = Modifier.padding(15.dp)) {
                    Button(onClick = {},
                        modifier = Modifier
                            .height(90.dp)
                            .width(96.dp),
                        shape = RoundedCornerShape(15)
                            ) {
                        Text("Scissors")
                    }
                }

            }
            Column(verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text("#Jetpack Compose", modifier = Modifier.padding(all = 15.dp),
                    fontSize = 20.sp)
            }
        }

    }
}
@Preview(showBackground = false, showSystemUi = true)
@Composable
fun DefaultPreview() {
    composableTheme {
        HomePage()
    }
}