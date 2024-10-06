package com.nextlevel.coinmirror.main

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.nextlevel.coinmirror.feature.home.HomeScreen
import com.nextlevel.coinmirror.feature.splash.SplashScreen
import com.nextlevel.coinmirror.feature.symbolHistory.SymbolDetailScreen

@Composable
fun NavigationGraph() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "/") {
        composable("/") {
            SplashScreen(navController)
        }

        composable("/home") {
            HomeScreen(navController)
        }

        composable("/symbol/{id}") {
            SymbolDetailScreen()
        }
    }
}