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
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
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
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.safirikenya.R
import com.example.safirikenya.navigation.ROUT_ACTIVITIES
import com.example.safirikenya.ui.theme.NewGreen


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsScreen(navController: NavController) {


    Column(modifier = Modifier.fillMaxSize())
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

    Spacer(modifier = Modifier.height(20.dp))

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
                    .width(250.dp),
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
            //start

            Column(
                modifier = Modifier
                    .padding(start = 20.dp, end = 2.dp)
            )
            {
                Text(text = "Sarova Beach resort", fontSize = 20.sp)
                Text(text = "Your luxury getaway resort!")
                Row {

                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Yellow
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Yellow
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Yellow
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Yellow
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Yellow
                    )

                }
                Text(text = "1440 Reviews")

            }

            //end
        }

        Spacer(modifier = Modifier.width(20.dp))

        Card() {
            Box(
                modifier = Modifier
                    .height(150.dp)
                    .width(250.dp),
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
            //start


            Column(
                modifier = Modifier
                    .padding(start = 20.dp, end = 20.dp)
            )
            {
                Text(text = "Crossroad Beach Resort", fontSize = 25.sp)
                Text(text = "Offering world class hospitality")
                Row {

                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Yellow
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Yellow
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Yellow
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Yellow
                    )

                }
                Text(text = "3100 Reviews")

            }
            //end
        }
        Spacer(modifier = Modifier.width(20.dp))

        Card() {
            Box(
                modifier = Modifier
                    .height(150.dp)
                    .width(250.dp),
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
           //start


            Column(
                modifier = Modifier
                    .padding(start = 20.dp, end = 20.dp)
            )
            {
                Text(text = "Villa Hotel", fontSize = 25.sp)
                Text(text = "The best hotel to relax after a safari")
                Row {

                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Yellow
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Yellow
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Yellow
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Yellow
                    )

                }
                Text(text = "2100 Reviews")

            }

            //end

        }
        Spacer(modifier = Modifier.width(20.dp))

        Card() {
            Box(
                modifier = Modifier
                    .height(150.dp)
                    .width(250.dp),
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

            //start

            Column(
                modifier = Modifier
                    .padding(start = 20.dp, end = 20.dp)
            )
            {
                Text(text = "Pandora Beach Resort", fontSize = 25.sp)
                Text(text = "The best resort to visit with the best sandy beaches.")
                Row {

                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Yellow
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Yellow
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Yellow
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Yellow
                    )

                }
                Text(text = "11900 Reviews")

            }
            //end



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
                    painter = painterResource(id = R.drawable.img_21),
                    contentDescription = "home",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
            }
            //start

            Column(
                modifier = Modifier
                    .padding(start = 20.dp, end = 20.dp)
            )
            {
                Text(text = "Panini luxury Hotel", fontSize = 25.sp)
                Text(text = "The best hotel you could find")
                Row {

                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Yellow
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Yellow
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Yellow
                    )
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "Star",
                        tint = Color.Yellow
                    )

                }
                Text(text = "12090 Reviews")

            }


            //end
        }

        }
       //start of 2nd  row


        Row(
            modifier = Modifier
                .padding(start = 20.dp)
                .horizontalScroll(rememberScrollState())
        )

        {

            //Card
            Card() {
                Box(
                    modifier = Modifier
                        .height(150.dp)
                        .width(350.dp),
                    contentAlignment = Alignment.Center
                )
                {
                    Image(
                        painter = painterResource(id = R.drawable.img_22),
                        contentDescription = "home",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                }
                //start

                Column(
                    modifier = Modifier
                        .padding(start = 20.dp, end = 2.dp)
                )
                {
                    Text(text = "Norflok hotel", fontSize = 20.sp)
                    Text(text = "Best hotel in Nairobi the most convinient place to stay!")
                    Row {

                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "Star",
                            tint = Color.Yellow
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "Star",
                            tint = Color.Yellow
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "Star",
                            tint = Color.Yellow
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "Star",
                            tint = Color.Yellow
                        )


                    }
                    Text(text = "10,200 Reviews")

                }

                //end
            }

            Spacer(modifier = Modifier.width(20.dp))

            Card() {
                Box(
                    modifier = Modifier
                        .height(150.dp)
                        .width(250.dp),
                    contentAlignment = Alignment.Center,
                )
                {
                    Image(
                        painter = painterResource(id = R.drawable.img_25),
                        contentDescription = "home",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )

                }
                //start


                Column(
                    modifier = Modifier
                        .padding(start = 20.dp, end = 20.dp)
                )
                {
                    Text(text = "View hotel", fontSize = 25.sp)
                    Text(text = "Offering world class hospitality")
                    Row {

                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "Star",
                            tint = Color.Yellow
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "Star",
                            tint = Color.Yellow
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "Star",
                            tint = Color.Yellow
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "Star",
                            tint = Color.Yellow
                        )

                    }
                    Text(text = "1900 Reviews")

                }
                //end
            }
            Spacer(modifier = Modifier.width(20.dp))

            Card() {
                Box(
                    modifier = Modifier
                        .height(150.dp)
                        .width(250.dp),
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
                //start


                Column(
                    modifier = Modifier
                        .padding(start = 20.dp, end = 20.dp)
                )
                {
                    Text(text = "Villa Hotel", fontSize = 25.sp)
                    Text(text = "The best hotel to relax after a safari")
                    Row {

                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "Star",
                            tint = Color.Yellow
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "Star",
                            tint = Color.Yellow
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "Star",
                            tint = Color.Yellow
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "Star",
                            tint = Color.Yellow
                        )

                    }
                    Text(text = "1900 Reviews")

                }

                //end

            }
            Spacer(modifier = Modifier.width(20.dp))

            Card() {
                Box(
                    modifier = Modifier
                        .height(150.dp)
                        .width(250.dp),
                    contentAlignment = Alignment.Center,
                )
                {
                    Image(
                        painter = painterResource(id = R.drawable.img_24),
                        contentDescription = "home",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                }

                //start

                Column(
                    modifier = Modifier
                        .padding(start = 20.dp, end = 20.dp)
                )
                {
                    Text(text = "Tribunal ", fontSize = 25.sp)
                    Text(text = "The best hotel expressing the beautiful culture of kenya.")
                    Row {

                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "Star",
                            tint = Color.Yellow
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "Star",
                            tint = Color.Yellow
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "Star",
                            tint = Color.Yellow
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "Star",
                            tint = Color.Yellow
                        )

                    }
                    Text(text = "1900 Reviews")

                }
                //end



            }
            Spacer(modifier = Modifier.width(20.dp))


            Card() {
                Box(
                    modifier = Modifier
                        .height(150.dp)
                        .width(250.dp),
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
            Spacer(modifier = Modifier.width(20.dp))



            Card() {
                Box(
                    modifier = Modifier
                        .height(150.dp)
                        .width(250.dp),
                    contentAlignment = Alignment.Center,
                )
                {
                    Image(
                        painter = painterResource(id = R.drawable.img_23),
                        contentDescription = "home",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                }
                //start

                Column(
                    modifier = Modifier
                        .padding(start = 20.dp, end = 20.dp)
                )
                {
                    Text(text = "Jamari luxury Hotel", fontSize = 25.sp)
                    Text(text = "Jamari Nairobi hotel is a beautiful,clean and well appointed hotel")
                    Row {

                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "Star",
                            tint = Color.Yellow
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "Star",
                            tint = Color.Yellow
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "Star",
                            tint = Color.Yellow
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "Star",
                            tint = Color.Yellow
                        )

                    }
                    Text(text = "1900 Reviews")

                }


                //end
            }

        }
        //end


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