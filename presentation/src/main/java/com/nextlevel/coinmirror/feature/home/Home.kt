package com.nextlevel.coinmirror.feature.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.nextlevel.coinmirror.feature.home.viewmodel.HomeViewModel
import com.nextlevel.coinmirror.feature.topbar.CoinMirrorTopBar


@Composable
fun Home(
    homeViewModel: HomeViewModel
) {

    val data by homeViewModel.uiState.collectAsState()
    println("data=$data")

    LaunchedEffect(Unit) {
        homeViewModel.getGlobalData()
    }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { CoinMirrorTopBar() },
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .padding(innerPadding)
        ) {
            if (data.isLoading) CircularProgressIndicator(
                modifier = Modifier
                    .fillMaxSize()
                    .matchParentSize()
            )
            else Text(data.homeData.name)
        }
    }
}