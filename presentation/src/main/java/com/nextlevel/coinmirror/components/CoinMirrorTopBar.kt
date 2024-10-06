package com.nextlevel.coinmirror.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import com.nextlevel.coinmirror.theme.NavyBlue
import com.nextlevel.coinmirror.theme.SimpleWhite


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CoinMirrorTopBar() {
    TopAppBar(colors = TopAppBarColors(
        containerColor = NavyBlue,
        titleContentColor = SimpleWhite,
        actionIconContentColor = SimpleWhite,
        navigationIconContentColor = SimpleWhite,
        scrolledContainerColor = SimpleWhite,
    ), actions = {
        IconButton(onClick = {}) {
            Icon(imageVector = Icons.Filled.Add, contentDescription = "Switch currency action")
        }
    },
        title = {
            Text("Coin Mirror")
        }
    )
}