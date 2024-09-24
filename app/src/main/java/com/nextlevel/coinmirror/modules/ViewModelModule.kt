package com.nextlevel.coinmirror.modules

import com.nextlevel.coinmirror.data.globaldata.GlobalDataRepository
import com.nextlevel.coinmirror.feature.home.viewmodel.HomeViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ViewModelModule {

    @Singleton
    @Provides
    fun provideHomeViewModel(repository: GlobalDataRepository): HomeViewModel {
        return HomeViewModel(repository = repository)
    }

}