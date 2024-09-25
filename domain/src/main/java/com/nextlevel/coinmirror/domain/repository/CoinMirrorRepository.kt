package com.nextlevel.coinmirror.domain.repository

import com.nextlevel.coinmirror.apiservice.CoinLoreAPIService
import com.nextlevel.coinmirror.data.model.SymbolData
import com.nextlevel.coinmirror.domain.repository.impl.CoinMirrorRepositoryImpl
import javax.inject.Inject


class CoinMirrorRepository @Inject constructor(private val coinLoreAPIService: CoinLoreAPIService) :
    CoinMirrorRepositoryImpl {


    override suspend fun getSymbolData(): SymbolData {
        val responseGlobalData = coinLoreAPIService.fetchSymbolData()
        return responseGlobalData[0]
    }
}