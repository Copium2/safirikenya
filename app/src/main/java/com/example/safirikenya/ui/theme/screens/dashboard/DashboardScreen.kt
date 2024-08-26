package com.example.safirikenya.ui.theme.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.safirikenya.R
import com.example.safirikenya.navigation.ROUT_ABOUT
import com.example.safirikenya.navigation.ROUT_ACTIVITIES
import com.example.safirikenya.navigation.ROUT_HOME
import com.example.safirikenya.navigation.ROUT_LOGIN
import com.example.safirikenya.ui.theme.NewGreen
import com.example.safirikenya.ui.theme.NewGrey
import com.example.safirikenya.ui.theme.NewOrange


@Composable
fun DashboardScreen(navController: NavController){

    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally)
    {

        Text(
            text ="Safiri Kenya",
            fontSize = 60.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Gray,
        )
        Spacer(modifier = androidx.compose.ui.Modifier.height(15.dp))

        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = "home",
            modifier = androidx.compose.ui.Modifier.size(100.dp),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = androidx.compose.ui.Modifier.height(15.dp))


        Text(
            text ="Travel with ease.",
            fontSize = 30.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.DarkGray,
        )

        Spacer(modifier = androidx.compose.ui.Modifier.height(10.dp))

        Column(
            modifier = Modifier.verticalScroll(rememberScrollState())
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(700.dp)
                    .clickable {
                        navController.navigate(ROUT_HOME)
                    },
                elevation = CardDefaults.cardElevation(10.dp),
                shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp),
                colors = CardDefaults.cardColors(NewGreen)
            ){
                //Row1
                Row(modifier = Modifier
                    .padding(25.dp)
                    .clickable { ROUT_LOGIN}
                ) {
                    //Card
                    Card(modifier = Modifier
                        .width(160.dp)
                        .height(180.dp),
                        elevation = CardDefaults.cardElevation(20.dp)) {
                       Column {
                           Spacer(modifier = androidx.compose.ui.Modifier.height(15.dp))

                           Box(
                               modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center )
                           {
                               Image(
                                   painter = painterResource(id = R.drawable.img_6),
                                   contentDescription = "home",
                                   modifier = Modifier.size(100.dp)
                               )
                           }

                           Text(
                               text = "Profile.",
                               fontSize = 25.sp,
                               fontFamily = FontFamily.SansSerif,
                               color = Color.DarkGray,
                               modifier = Modifier.fillMaxWidth(),
                               textAlign = TextAlign.Center

                           )

                       }
                    }
                    //End of Card

                    Spacer(modifier = androidx.compose.ui.Modifier.width(20.dp))

                    //Card
                    Card(modifier = Modifier
                        .width(160.dp)
                        .height(180.dp),
                        elevation = CardDefaults.cardElevation(15.dp),
                    ) {
                        Column {
                            Spacer(modifier = androidx.compose.ui.Modifier.height(15.dp))

                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clickable {
                                        navController.navigate(ROUT_ABOUT)
                                    },

                                contentAlignment = Alignment.Center) {
                                Image(
                                    painter = painterResource(id = R.drawable.img_5),
                                    contentDescription = "home",
                                    modifier = Modifier.size(100.dp)

                                )
                            }

                            Text(
                                text ="Hotels.",
                                fontSize = 25.sp,
                                fontFamily = FontFamily.SansSerif,
                                color = Color.DarkGray,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center

                            )

                        }
                    }

                    //End of Card

                }

                //End of row1

                //Row2

                Row(modifier = Modifier
                    .padding(20.dp)
                    .clickable { ROUT_ACTIVITIES }
                ) {
                    //Card
                    Card(modifier = Modifier
                        .width(160.dp)
                        .height(180.dp),
                        elevation = CardDefaults.cardElevation(10.dp),) {
                        Column {
                            Spacer(modifier = androidx.compose.ui.Modifier.height(15.dp))

                            Box(
                                modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                                Image(
                                    painter = painterResource(id = R.drawable.img_8),
                                    contentDescription = "home",
                                    modifier = Modifier.size(100.dp)
                                )
                            }

                            Text(
                                text = "Activities to do nearby.",
                                fontSize = 25.sp,
                                fontFamily = FontFamily.SansSerif,
                                color = Color.DarkGray,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center

                            )

                        }
                    }
                    //End of Card

                    Spacer(modifier = androidx.compose.ui.Modifier.width(20.dp))

                    //Card
                    Card(modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)
                        .clickable {  },
                        elevation = CardDefaults.cardElevation(10.dp),) {
                        Column {
                            Spacer(modifier = androidx.compose.ui.Modifier.height(15.dp))

                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center) {
                                Image(
                                    painter = painterResource(id = R.drawable.img_7),
                                    contentDescription = "home",
                                    modifier = Modifier.size(100.dp)

                                )
                            }

                            Text(
                                text = "Tourist guide.",
                                fontSize = 25.sp,
                                fontFamily = FontFamily.SansSerif,
                                color = Color.DarkGray,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                    //End of Card
                }
                //End of Row2
            }
        }
    }
}
@Composable
@Preview(showBackground = true)
fun  DashboardScreenPreview(){


    DashboardScreen(rememberNavController())
}