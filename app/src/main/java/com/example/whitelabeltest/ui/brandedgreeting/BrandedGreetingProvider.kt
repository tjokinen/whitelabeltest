package com.example.whitelabeltest.ui.brandedgreeting

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

interface BrandedGreetingProvider {
    @Composable
    fun BrandedGreeting(modifier: Modifier)
}