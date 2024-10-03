package com.example.whitelabeltest.di

import com.example.whitelabeltest.ui.*
import org.koin.dsl.module

val appModule = module {
    single<BrandedGreetingProvider> { DefaultBrandedGreetingProvider() }
    single<FlavorSpecificButtonProvider> { DefaultFlavorSpecificButtonProvider() }
}