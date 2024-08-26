package com.example.safirikenya.ui.theme.screens.Activities

import android.app.Activity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.safirikenya.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ActivityScreen(navController: NavController) {


    Column(

        modifier = androidx.compose.ui.Modifier.fillMaxSize(),
    )
    {

        TopAppBar(
            title = { Text(text = "Activities") },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.DarkGray),
            navigationIcon = {
                IconButton(onClick = {/*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "menu", tint = Color.White
                    )
                }
            },
            actions = {
                IconButton(onClick = {/*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "menu", tint = Color.White
                    )
                }
            }


        )

        Box(
            modifier = Modifier.height(200.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.img_15),
                contentDescription = "home",
                modifier = Modifier.fillMaxSize().size(70.dp)
            )

        }


        Text(
            text ="Discover the exciting attractions at Wild Waters Kenya, Mombasa's premier Waterpark",
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.Black,
        )

        //start
        Card() {
            Box(
                modifier = Modifier
                    .height(150.dp)
                    .width(200.dp),
                contentAlignment = Alignment.Center
            )
            {
                Image(
                    painter = painterResource(id = R.drawable.img_16),
                    contentDescription = "home",
                    modifier = Modifier.fillMaxSize().size(70.dp),
                    contentScale = ContentScale.Crop
                )
            }


            Text(
                text ="Experience Africa like never before. All safaris here are loaded by the safari operator themselves.",
                fontSize = 20.sp,
                fontFamily = FontFamily.SansSerif,
                color = Color.Black,
            )


        }

        Spacer(modifier = androidx.compose.ui.Modifier.width(40.dp))

        Card() {
            Box(
                modifier = Modifier
                    .height(150.dp)
                    .width(200.dp),
                contentAlignment = Alignment.Center,
            )
            {
                Image(
                    painter = painterResource(id = R.drawable.img_9),
                    contentDescription = "home",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
            }
        }
        Spacer(modifier = androidx.compose.ui.Modifier.width(20.dp))

        Card() {
            Box(
                modifier = Modifier
                    .height(150.dp)
                    .width(200.dp),
                contentAlignment = Alignment.Center,
            )
            {
                Image(
                    painter = painterResource(id = R.drawable.img_12),
                    contentDescription = "home",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
            }
        }

        //end




    }
}
@Composable
@Preview(showBackground = true)
fun ActivityScreenPreview(){
    ActivityScreen(rememberNavController())

}