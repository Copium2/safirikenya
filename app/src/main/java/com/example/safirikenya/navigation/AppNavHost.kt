package com.example.safirikenya.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.safirikenya.ui.theme.screens.about.AboutScreen
import com.example.safirikenya.ui.theme.screens.home.HomeScreen
import com.example.safirikenya.ui.theme.intent.intentscreen
import com.example.safirikenya.ui.theme.screens.Activities.ActivityScreen
import com.example.safirikenya.ui.theme.screens.dashboard.DashboardScreen
import com.example.safirikenya.ui.theme.screens.details.DetailsScreen
import com.example.safirikenya.ui.theme.screens.guide.GuideScreen
import com.example.safirikenya.ui.theme.screens.login.LoginScreen
import com.example.safirikenya.ui.theme.screens.signup.SignupScreen
import com.example.safirikenya.ui.theme.screens.splash.Splashscreen


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination:String = ROUT_SPLASHSCREEN
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {

        composable(ROUT_HOME) {
            HomeScreen(navController = navController)
        }

        composable(ROUT_DETAIL) {
            DetailsScreen(navController = navController)
        }

        composable(ROUT_ABOUT) {
            AboutScreen(navController = navController)

        }
        composable(ROUT_SPLASHSCREEN) {
            Splashscreen(navController = navController)

        }

        composable(ROUT_INTENT) {
            intentscreen(navController = navController)

        }
        composable(ROUT_SignupScreen) {
            SignupScreen(navController = navController)

        }


        composable(ROUT_LOGIN) {
            LoginScreen(navController =  navController)

        }

        composable(ROUT_DASHBOARD) {
            DashboardScreen(navController =  navController)

        }

        composable(ROUT_ACTIVITIES) {
            ActivityScreen(navController =  navController)

        }


        composable(ROUT_GUIDE) {
            GuideScreen(navController =  navController)

        }

    }
}