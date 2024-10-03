package com.example.whitelabeltest.di

import com.example.whitelabeltest.ui.BrandedGreetingProvider
import com.example.whitelabeltest.ui.FlavorABrandedGreetingProvider
import org.koin.dsl.module

val flavorModule = module {
    single<BrandedGreetingProvider> { FlavorABrandedGreetingProvider() }
}