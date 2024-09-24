package com.nextlevel.coinmirror.feature.topbar

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CoinMirrorTopBar() {
    TopAppBar(title = { Text("Coin Mirror") })
}