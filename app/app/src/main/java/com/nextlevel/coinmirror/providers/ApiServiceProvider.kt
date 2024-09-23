package com.nextlevel.coinmirror.providers

import com.nextlevel.coinmirror.apiservice.APIService

interface ApiServiceProvider {
    fun provideApiService(): APIService
}