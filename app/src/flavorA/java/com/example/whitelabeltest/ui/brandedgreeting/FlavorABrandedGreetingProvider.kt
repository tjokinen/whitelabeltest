package com.example.whitelabeltest.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

class FlavorABrandedGreetingProvider : BrandedGreetingProvider {
    @Composable
    override fun BrandedGreeting(modifier: Modifier) {
        Column(modifier = modifier) {
            Text("Welcome to Flavor A!")
            Text("This is the custom implementation for Flavor A.")
        }
    }
}