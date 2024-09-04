package com.example.safirikenya.ui.theme.screens.account


import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun AccountScreen(navController: NavController){


    class Account {
        var name:String = ""
        var email:String = ""
        var title:String = ""
        var imageUrl:String = ""
        var id:String = ""

        constructor(name: String, email: String, title: String,imageUrl: String, id: String) {
            this.name = name
            this.email = email
            this.title= title
            this.imageUrl = imageUrl
            this.id = id
        }

        constructor()
    }


}
@Composable
@Preview(showBackground = true)
fun AccountScreenPreview(){
    AccountScreen(rememberNavController())

}