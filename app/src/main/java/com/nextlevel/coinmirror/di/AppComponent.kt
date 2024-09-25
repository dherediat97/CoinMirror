package com.nextlevel.coinmirror.di

import android.content.Context
import com.nextlevel.coinmirror.modules.NetworkModule
import com.nextlevel.coinmirror.modules.RepositoryModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class, RepositoryModule::class])
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }
}