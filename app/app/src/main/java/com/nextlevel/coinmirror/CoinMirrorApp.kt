package com.nextlevel.coinmirror

import android.app.Application
import com.nextlevel.coinmirror.apiservice.APIService
import com.nextlevel.coinmirror.providers.ApiServiceProvider
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class CoinMirrorApp : Application() {

//    val appComponent = DaggerApplicationComponent.create()


    override fun onCreate() {
        super.onCreate()
    }

//    override fun provideApiService(): APIService {
//        return appComponent.apiServiceComponent().create()
//    }
}