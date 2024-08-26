package com.example.safirikenya.ui.theme.screens.home


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
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
import com.example.safirikenya.navigation.ROUT_DETAIL
import com.example.safirikenya.ui.theme.Green
import com.example.safirikenya.ui.theme.NewGreen
import com.example.safirikenya.ui.theme.PurpleGrey80


fun image(painter:Painter) {

}

@Composable
fun HomeScreen(navController: NavController
         ){




   Column(

       modifier = androidx.compose.ui.Modifier
           .fillMaxSize()
           .background(Color.White),
       verticalArrangement = Arrangement.Center,
       horizontalAlignment = Alignment.CenterHorizontally,
   ) {

        Image(
            painter = painterResource(id = R.drawable.img_9) ,
            contentDescription ="home",
            modifier = androidx.compose.ui.Modifier
                .size(350.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop
        )


       Text(
           text ="Safiri Kenya",
           fontSize = 60.sp,
           fontFamily = FontFamily.Cursive,
           color = Color.Black,
       )
       Text(text = "Explore the wonders of Kenya",
           fontSize = 20.sp,
           textAlign = TextAlign.Center
       )
       Spacer(modifier = androidx.compose.ui.Modifier.height(20.dp))
       Button(
           onClick = { navController.navigate(ROUT_DETAIL)},
           modifier = androidx.compose.ui.Modifier
               .fillMaxWidth()
               .height(50.dp)
               .padding(start = 20.dp, end = 20.dp),
           colors = ButtonDefaults.buttonColors(NewGreen),
           shape = RoundedCornerShape(10.dp)

           ) {
           Text(text = "Get started")
       }
      
   }
}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())

}

