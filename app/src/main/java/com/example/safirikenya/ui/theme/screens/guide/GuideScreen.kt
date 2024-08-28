package com.example.safirikenya.ui.theme.screens.guide

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.safirikenya.R
import com.example.safirikenya.ui.theme.NewGreen


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GuideScreen(navController: NavController){


    Column(

        modifier = androidx.compose.ui.Modifier.fillMaxSize(),
    )


    {

        TopAppBar(
            title = { Text(text = "Tourist Guide") },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.LightGray),
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


        var search by remember { mutableStateOf("") }
        OutlinedTextField(
            value = search,
            onValueChange = { search = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 40.dp, end = 40.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "search")},
            placeholder={ Text(text = "Browse all the guides and contact them") }
        )


        Box(
            modifier = Modifier.height(200.dp).width(600.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.img_3),
                contentDescription = "home",
                modifier = Modifier.fillMaxSize().size(50.dp)
            )

        }


        Text(
            text = "Michael Ceaser.",
            fontSize = 25.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.Black,

        )

        Spacer(modifier = androidx.compose.ui.Modifier.height(20.dp))

        Text(
            text = "Tour guide in Kenya organising safaris,cruises and tours.Providing transportation on demand",
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.Black,
        )

        Spacer(modifier = androidx.compose.ui.Modifier.height(20.dp))

        Button(
            onClick = {
                val smsIntent = Intent(Intent.ACTION_SENDTO)
                smsIntent.data = "sms to:0720245837".toUri()
                smsIntent.putExtra("sms_body", "Hello Glory,how was your day?")

            },
            modifier = androidx.compose.ui.Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(start = 20.dp, end = 20.dp),
            colors = ButtonDefaults.buttonColors(NewGreen),
            shape = RoundedCornerShape(10.dp)

        ) {
            Text(text = "View contact information")
        }



        //start
        Box(
            modifier = Modifier
                .height(150.dp)
                .width(400.dp),
            contentAlignment = Alignment.Center
        )

        {
            Image(
                painter = painterResource(id = R.drawable.img_4),
                contentDescription = "home",
                modifier = Modifier.fillMaxSize().size(70.dp),
                contentScale = ContentScale.Crop
            )

        }


        Text(
            text = "John Musembi",
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.Black,
        )

        Spacer(modifier = androidx.compose.ui.Modifier.height(20.dp))

        Text(
            text = "Outgoing interpersonal and energetic tour guide with over three years of experience navigating guests on tours.",
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.Black,
        )


        Spacer(modifier = androidx.compose.ui.Modifier.height(20.dp))

        Button(
            onClick = {
                val smsIntent = Intent(Intent.ACTION_SENDTO)
                smsIntent.data = "sms to:0720245837".toUri()
                smsIntent.putExtra("sms_body", "Hello Glory,how was your day?")

            },
            modifier = androidx.compose.ui.Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(start = 20.dp, end = 20.dp),
            colors = ButtonDefaults.buttonColors(NewGreen),
            shape = RoundedCornerShape(10.dp)

        ) {
            Text(text = "View contact information")
        }


        Spacer(modifier = androidx.compose.ui.Modifier.width(40.dp))

        Box(
            modifier = Modifier
                .height(150.dp)
                .width(400.dp),
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

        Text(
            text = "Enjoy the oceans breeze within our beautiful beaches.",
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.Black,
        )



        Spacer(modifier = androidx.compose.ui.Modifier.width(20.dp))


        Box(
            modifier = Modifier
                .height(150.dp)
                .width(600.dp),
            contentAlignment = Alignment.Center,
        )
        {
            Image(
                painter = painterResource(id = R.drawable.img_18),
                contentDescription = "home",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
        }



        Text(
            text = "Christopher Kimani.",
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.Black,
        )

        Spacer(modifier = androidx.compose.ui.Modifier.width(20.dp))

        Text(
            text = "Offering recreational tours, safaris and nature areas .Reservations for transportation.",
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.Black,
        )

        Spacer(modifier = androidx.compose.ui.Modifier.height(20.dp))

        Button(
            onClick = {
                val smsIntent = Intent(Intent.ACTION_SENDTO)
                smsIntent.data = "sms to:0720245837".toUri()
                smsIntent.putExtra("sms_body", "Hello Glory,how was your day?")

            },
            modifier = androidx.compose.ui.Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(start = 20.dp, end = 20.dp),
            colors = ButtonDefaults.buttonColors(NewGreen),
            shape = RoundedCornerShape(10.dp)

        ) {
            Text(text = "View contact information")
        }





        //end
    }

}
@Composable
@Preview(showBackground = true)
fun GuideScreenPreview(){
    GuideScreen(rememberNavController())

}