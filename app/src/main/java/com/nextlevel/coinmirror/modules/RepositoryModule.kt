package com.nextlevel.coinmirror.modules

import com.nextlevel.coinmirror.apiservice.CoinLoreAPIService
import com.nextlevel.coinmirror.domain.repository.CoinMirrorRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideGlobalDataRepository(coinLoreAPIService: CoinLoreAPIService): CoinMirrorRepository {
        return CoinMirrorRepository(coinLoreAPIService)
    }

}