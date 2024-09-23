package com.nextlevel.coinmirror.apiservice

import com.nextlevel.coinmirror.data.globaldata.GlobalData
import retrofit2.http.GET


interface APIService {

    @GET("global/")
    suspend fun fetchGlobalData(): GlobalData
}