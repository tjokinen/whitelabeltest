package com.example.whitelabeltest

import android.app.Application
import com.example.whitelabeltest.di.appModule
import com.example.whitelabeltest.di.flavorModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class WhiteLabelApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@WhiteLabelApp)
            modules(appModule, flavorModule)
        }
    }
}