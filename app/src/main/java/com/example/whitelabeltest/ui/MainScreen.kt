package com.example.whitelabeltest.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.koin.compose.koinInject

@Composable
fun MainScreen() {
    val brandedGreetingProvider: BrandedGreetingProvider = koinInject()
    val flavorSpecificButtonProvider: FlavorSpecificButtonProvider = koinInject()

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        brandedGreetingProvider.BrandedGreeting(Modifier)
        flavorSpecificButtonProvider.FlavorSpecificButton(
            onClick = { /* Handle button click */ },
            modifier = Modifier.padding(top = 16.dp)
        )
    }
}