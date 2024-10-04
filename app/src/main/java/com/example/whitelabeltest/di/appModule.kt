package com.example.whitelabeltest.di

import com.example.whitelabeltest.ui.brandedgreeting.BrandedGreetingProvider
import com.example.whitelabeltest.ui.brandedgreeting.DefaultBrandedGreetingProvider
import com.example.whitelabeltest.ui.flavorspecificbutton.DefaultFlavorSpecificButtonProvider
import com.example.whitelabeltest.ui.flavorspecificbutton.FlavorSpecificButtonProvider
import org.koin.dsl.module

val appModule = module {
    factory<BrandedGreetingProvider> { DefaultBrandedGreetingProvider() }
    factory<FlavorSpecificButtonProvider> { DefaultFlavorSpecificButtonProvider() }
}