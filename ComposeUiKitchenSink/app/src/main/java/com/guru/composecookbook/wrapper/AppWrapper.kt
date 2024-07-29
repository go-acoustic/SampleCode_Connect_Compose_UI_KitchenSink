package com.guru.composecookbook.wrapper

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun AppWrapper(content: @Composable () -> Unit) {
    ApplyGlobalModifiers()
    content()
}