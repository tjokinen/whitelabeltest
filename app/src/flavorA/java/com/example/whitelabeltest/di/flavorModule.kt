package com.example.whitelabeltest.di

import com.example.whitelabeltest.ui.brandedgreeting.BrandedGreetingProvider
import com.example.whitelabeltest.ui.brandedgreeting.FlavorABrandedGreetingProvider
import com.example.whitelabeltest.ui.flavorspecificbutton.FlavorAFlavorSpecificButtonProvider
import com.example.whitelabeltest.ui.flavorspecificbutton.FlavorSpecificButtonProvider
import org.koin.dsl.module

val flavorModule = module {
    factory<BrandedGreetingProvider> { FlavorABrandedGreetingProvider() }
    factory<FlavorSpecificButtonProvider> { FlavorAFlavorSpecificButtonProvider() }
}