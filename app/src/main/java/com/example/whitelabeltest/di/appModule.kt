package com.example.whitelabeltest.di

import com.example.whitelabeltest.ui.*
import org.koin.dsl.module

val appModule = module {
    factory<BrandedGreetingProvider> { DefaultBrandedGreetingProvider() }
    factory<FlavorSpecificButtonProvider> { DefaultFlavorSpecificButtonProvider() }
}