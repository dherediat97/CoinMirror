package com.nextlevel.coinmirror.feature.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.nextlevel.coinmirror.feature.topbar.CoinMirrorTopBar
import com.nextlevel.coinmirror.feature.ui.theme.CoinMirrorTheme


@Composable
fun HomeScreen() {
    CoinMirrorTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            topBar = { CoinMirrorTopBar() }) { innerPadding ->
            Box(modifier = Modifier.padding(innerPadding))
        }
    }
}
