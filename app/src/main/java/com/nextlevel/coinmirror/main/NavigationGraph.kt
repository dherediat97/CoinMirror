package com.nextlevel.coinmirror.main

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.nextlevel.coinmirror.feature.home.Home
import com.nextlevel.coinmirror.feature.home.viewmodel.HomeViewModel
import com.nextlevel.coinmirror.feature.splash.Splash


@Composable
fun NavigationGraph() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "/") {
        composable("/") {
            Splash(navController)
        }

        composable("/home") {
            val viewModel: HomeViewModel = hiltViewModel()
            Home(viewModel)
        }
    }
}