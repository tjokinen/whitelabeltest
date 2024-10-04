package com.example.whitelabeltest.di

import com.example.whitelabeltest.ui.*
import org.koin.dsl.module

val flavorModule = module {
    factory<BrandedGreetingProvider> { FlavorABrandedGreetingProvider() }
    factory<FlavorSpecificButtonProvider> { FlavorAFlavorSpecificButtonProvider() }
}