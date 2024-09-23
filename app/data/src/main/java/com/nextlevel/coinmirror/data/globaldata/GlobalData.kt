package com.nextlevel.coinmirror.data.globaldata

data class GlobalData(
    val coinsCount: Int,
    val activeMarkets: Int,
    val totalMcap: Int,
    val bthD: String,
    val ethD: String,
    val mcapChange: String,
    val volumeChange: String,
    val avgChangePercent: String,
    val volumeAth: Int,
    val mcapAth: Int,
)