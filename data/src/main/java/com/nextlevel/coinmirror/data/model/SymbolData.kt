package com.nextlevel.coinmirror.data.model

import com.google.gson.annotations.SerializedName

data class SymbolData(
    val id: String,
    val symbol: String,
    val name: String,
    val nameid: String,
    val rank: Long,
    @SerializedName("price_usd") val priceUsd: String,
    @SerializedName("percent_change_24h") val percentChange24H: String,
    @SerializedName("percent_change_1h") val percentChange1H: String,
    @SerializedName("percent_change_7d") val percentChange7D: String,
    @SerializedName("market_cap_usd") val marketCapUsd: String,

    val volume24: String,

    @SerializedName("volume24_native") val volume24Native: String,
    val csupply: String,

    @SerializedName("price_btc") val priceBtc: String,
    val tsupply: String,
    val msupply: String
) {
    constructor() : this(
        id = "",
        symbol = "",
        name = "",
        nameid = "",
        rank = 0L,
        priceUsd = "",
        percentChange24H = "",
        percentChange1H = "",
        percentChange7D = "",
        marketCapUsd = "",
        volume24 = "",
        volume24Native = "",
        csupply = "",
        priceBtc = "",
        tsupply = "",
        msupply = "",
    )

    constructor(symbol: String, priceBtc: String, priceUsd: String) : this(
        id = "",
        symbol = symbol,
        name = "",
        nameid = "",
        rank = 0L,
        priceUsd = priceUsd,
        percentChange24H = "",
        percentChange1H = "",
        percentChange7D = "",
        marketCapUsd = "",
        volume24 = "",
        volume24Native = "",
        csupply = "",
        priceBtc = priceBtc,
        tsupply = "",
        msupply = "",
    )
}