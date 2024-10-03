package com.example.whitelabeltest.di

import com.example.whitelabeltest.ui.BrandedGreetingProvider
import com.example.whitelabeltest.ui.DefaultBrandedGreetingProvider
import org.koin.dsl.module

val appModule = module {
    single<BrandedGreetingProvider> { DefaultBrandedGreetingProvider() }
}