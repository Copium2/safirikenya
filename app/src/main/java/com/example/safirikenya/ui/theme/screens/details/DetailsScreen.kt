package com.example.safirikenya.ui.theme.screens.details

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.safirikenya.R
import com.example.safirikenya.navigation.ROUT_ACTIVITIES
import com.example.safirikenya.ui.theme.NewGreen


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsScreen(navController: NavController) {


    Column(

        modifier = androidx.compose.ui.Modifier.fillMaxSize(),
    )
    {
        TopAppBar(
            title = { Text(text = "Hotels") },
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
        modifier = Modifier.height(280.dp),
        contentAlignment = Alignment.Center
    ){
        Image(
            painter = painterResource(id = R.drawable.img_11),
            contentDescription = "home",
            modifier = Modifier.fillMaxSize()
        )
    }
    Spacer(modifier = androidx.compose.ui.Modifier.height(20.dp))

    var search by remember { mutableStateOf("") }
    OutlinedTextField(
        value = search,
        onValueChange = { search = it },
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp),
        leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "search")},
        placeholder={ Text(text = "What's your Location") }
        )


//end of search bar

    Spacer(modifier = androidx.compose.ui.Modifier.height(20.dp))

    Row(
        modifier = Modifier
            .padding(start = 20.dp)
            .horizontalScroll(rememberScrollState())
    ){
        //Card
        Card() {
            Box(
                modifier = Modifier
                    .height(150.dp)
                    .width(200.dp),
                contentAlignment = Alignment.Center
            )
            {
                Image(
                    painter = painterResource(id = R.drawable.img_10),
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
                    painter = painterResource(id = R.drawable.img_13),
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
                    painter = painterResource(id = R.drawable.img_14),
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
                    painter = painterResource(id = R.drawable.img_2),
                    contentDescription = "home",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
            }
        }

        }

        Spacer(modifier = androidx.compose.ui.Modifier.height(20.dp))


        Button(
            onClick = { navController.navigate(ROUT_ACTIVITIES)},
            modifier = androidx.compose.ui.Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(start = 20.dp, end = 20.dp),
            colors = ButtonDefaults.buttonColors(NewGreen),
            shape = RoundedCornerShape(10.dp)
        ){
            Text(text = "Continue")
        }


    }


}



@Composable
@Preview(showBackground = true)
fun DetailsScreenPreview(){
    DetailsScreen(rememberNavController())
}