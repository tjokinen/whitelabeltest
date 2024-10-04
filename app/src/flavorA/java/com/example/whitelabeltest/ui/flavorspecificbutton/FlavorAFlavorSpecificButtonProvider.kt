package com.example.whitelabeltest.ui.flavorspecificbutton

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

class FlavorAFlavorSpecificButtonProvider : FlavorSpecificButtonProvider {
    @Composable
    override fun FlavorSpecificButton(onClick: () -> Unit, modifier: Modifier) {
        Button(
            onClick = onClick,
            modifier = modifier,
            colors = ButtonDefaults.buttonColors(containerColor = Color.Red)
        ) {
            Text("Flavor A Button", color = Color.White)
        }
    }
}