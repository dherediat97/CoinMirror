package com.nextlevel.coinmirror.feature.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CurrencyBitcoin
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.nextlevel.coinmirror.data.model.SymbolData
import com.nextlevel.coinmirror.feature.home.viewmodel.HomeViewModel
import com.nextlevel.coinmirror.components.CoinMirrorTopBar


@Composable
fun HomeScreen(navController: NavController) {
    val homeViewModel: HomeViewModel = hiltViewModel()

    val data by homeViewModel.uiState.collectAsState()

    LaunchedEffect(Unit) {
        homeViewModel.getHomeData()
    }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { CoinMirrorTopBar() },
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxWidth()
        ) {
            SymbolValue(symbolData = data.homeData, onItemClick = {
                navController.navigate("/symbol/${data.homeData.id}")
            })
        }
    }
}


@Composable
fun SymbolValue(
    symbolData: SymbolData,
    onItemClick: () -> Unit,
) {
    Row(modifier = Modifier
        .fillMaxWidth()
        .clickable { onItemClick.invoke() }) {
        TextField(
            value = TextFieldValue(symbolData.priceUsd),
            onValueChange = {},
            singleLine = true,
            modifier = Modifier
                .width(100.dp)
                .height(20.dp)
        )
        Text(symbolData.priceBtc)
        when (symbolData.symbol) {
            "BTC" -> Icon(imageVector = Icons.Filled.CurrencyBitcoin, contentDescription = "")
        }
    }
}

@Composable
@Preview
fun HomeScreenPreview() {
    HomeScreen(navController = rememberNavController())
}

@Composable
@Preview
fun SymbolValuePreview(modifier: Modifier = Modifier) {
    SymbolValue(symbolData = SymbolData(symbol = "BTC", priceBtc = "100000", priceUsd = "1")) {}
}