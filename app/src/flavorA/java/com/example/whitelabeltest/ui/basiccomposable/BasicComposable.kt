package com.example.whitelabeltest.ui.basiccomposable

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun BasicComposable() {
    Column() {
        Text("This is FlavorA basic composable")
        Text("Column")
    }
}