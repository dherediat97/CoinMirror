package com.nextlevel.coinmirror.apiservice

import com.nextlevel.coinmirror.data.model.SymbolData
import retrofit2.http.GET


interface CoinLoreAPIService {

    @GET("ticker/?id=90")
    suspend fun fetchSymbolData(): List<SymbolData>
}