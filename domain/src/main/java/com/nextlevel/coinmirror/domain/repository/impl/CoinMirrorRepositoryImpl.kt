package com.nextlevel.coinmirror.domain.repository.impl

import com.nextlevel.coinmirror.data.model.SymbolData

interface CoinMirrorRepositoryImpl {
   suspend fun getSymbolData(): SymbolData
}