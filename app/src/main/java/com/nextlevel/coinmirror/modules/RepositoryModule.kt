package com.nextlevel.coinmirror.modules

import com.nextlevel.coinmirror.data.globaldata.GlobalDataRepository
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
    fun provideGlobalDataRepository(): GlobalDataRepository {
        return GlobalDataRepository()
    }

}