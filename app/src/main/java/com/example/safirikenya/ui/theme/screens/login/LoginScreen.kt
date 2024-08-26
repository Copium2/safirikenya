package com.example.safirikenya.ui.theme.screens.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.safirikenya.R
import com.example.safirikenya.navigation.ROUT_SignupScreen
import com.example.safirikenya.data.AuthViewModel

@Composable
fun LoginScreen(navController: NavController) {


    Column(
        modifier = androidx.compose.ui.Modifier
            .fillMaxSize()
            .paint(painterResource(id = R.drawable.bg), contentScale = ContentScale.FillBounds),
        horizontalAlignment = Alignment.CenterHorizontally
    )

    {
        Spacer(modifier = androidx.compose.ui.Modifier.height(20.dp))

        Image(
            painter = painterResource(id = R.drawable.img5),
            contentDescription = "home",
            modifier = androidx.compose.ui.Modifier
                .size(200.dp),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = androidx.compose.ui.Modifier.height(10.dp))

        Text(
            text = "Safiri Kenya",
            fontSize = 60.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Magenta,
        )

        Text(
            text = "Already have an account.Please enter your details",
            fontSize = 18.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Magenta,
            modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center
        )

        Spacer(modifier = androidx.compose.ui.Modifier.height(10.dp))

        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }

        OutlinedTextField(
            value = email,
            onValueChange ={email=it},
            label = { Text(text = "email Address")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        Spacer(modifier = androidx.compose.ui.Modifier.height(10.dp))


        OutlinedTextField(
            value = password,
            onValueChange ={password=it},
            label = { Text(text = "Password")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            visualTransformation = PasswordVisualTransformation()

        )

        Spacer(modifier = androidx.compose.ui.Modifier.height(10.dp))

        val context = LocalContext.current
        val authViewModel = AuthViewModel(navController, context)

        Button(
            onClick = {authViewModel.login(email, password)},
            colors = ButtonDefaults.buttonColors(Color.DarkGray),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            shape = RoundedCornerShape(5.dp)
        ){
            Text(text ="Login" )
        }

        Spacer(modifier = androidx.compose.ui.Modifier.height(10.dp))

        Text(
            text = "Dont have an account? Register",
            fontSize = 18.sp,
            modifier = Modifier
                .fillMaxWidth()
                .clickable { navController.navigate(ROUT_SignupScreen) }
            , textAlign = TextAlign.Center
        )
    }
}


@Composable
@Preview(showBackground = true)
fun LoginScreenPreview(){
    LoginScreen(rememberNavController())

}