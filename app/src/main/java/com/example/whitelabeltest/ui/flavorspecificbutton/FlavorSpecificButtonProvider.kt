package com.example.whitelabeltest.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

interface FlavorSpecificButtonProvider {
    @Composable
    fun FlavorSpecificButton(onClick: () -> Unit, modifier: Modifier)
}