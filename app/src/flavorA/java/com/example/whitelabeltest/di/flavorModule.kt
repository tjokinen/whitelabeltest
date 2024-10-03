package com.example.whitelabeltest.di

import com.example.whitelabeltest.ui.*
import org.koin.dsl.module

val flavorModule = module {
    single<BrandedGreetingProvider> { FlavorABrandedGreetingProvider() }
    single<FlavorSpecificButtonProvider> { FlavorAFlavorSpecificButtonProvider() }
}