package com.example.whitelabeltest.ui.basiccomposable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun BasicComposable() {
    Row() {
        Text("This is FlavorB basic composable")
        Text("Row")
    }
    OtherComposable()
}
