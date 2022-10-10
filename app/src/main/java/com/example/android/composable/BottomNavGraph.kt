package com.example.android.composable

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.android.composable.pages.Search
import com.example.android.composable.pages.HomePage
import com.example.android.composable.pages.Library


@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.MainScreen.route
    ) {
        composable(route = BottomBarScreen.MainScreen.route) {
            HomePage()
        }
        composable(route = BottomBarScreen.Search.route) {
            Search()
        }
        composable(route = BottomBarScreen.Library.route) {
            Library()
        }
    }
}

