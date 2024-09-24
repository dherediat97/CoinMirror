package com.nextlevel.coinmirror

import android.app.Application
import com.nextlevel.coinmirror.di.AppComponent
import com.nextlevel.coinmirror.di.DaggerAppComponent
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
open class CoinMirrorApp : Application() {

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(applicationContext)
    }

}