package com.example.whitelabeltest.ui.flavorspecificbutton

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

class DefaultFlavorSpecificButtonProvider : FlavorSpecificButtonProvider {
    @Composable
    override fun FlavorSpecificButton(onClick: () -> Unit, modifier: Modifier) {
        Button(onClick = onClick, modifier = modifier) {
            Text("Default Button")
        }
    }
}