package com.nextlevel.coinmirror.modules

import com.nextlevel.coinmirror.apiservice.APIService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Singleton
    @Provides
    fun provideApiService(): APIService {
        return Retrofit.Builder()
            .baseUrl("")
            .build()
            .create(APIService::class.java)
    }

}