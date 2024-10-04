package com.example.whitelabeltest.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.whitelabeltest.ui.basiccomposable.BasicComposable
import com.example.whitelabeltest.ui.brandedgreeting.BrandedGreetingProvider
import com.example.whitelabeltest.ui.flavorspecificbutton.FlavorSpecificButtonProvider
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
        //composables that have an implementation in FlavorA and default implementation in Main
        brandedGreetingProvider.BrandedGreeting(Modifier)
        flavorSpecificButtonProvider.FlavorSpecificButton(
            onClick = { /* Handle button click */ },
            modifier = Modifier.padding(top = 16.dp)
        )

        //normal composable that has implementation in FlavorA and FlavorB
        BasicComposable()
    }
}