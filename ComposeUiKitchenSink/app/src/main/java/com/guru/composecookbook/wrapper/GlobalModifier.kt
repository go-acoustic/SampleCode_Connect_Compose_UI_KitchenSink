package com.guru.composecookbook.wrapper

import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.platform.debugInspectorInfo
import android.view.View
import android.view.ViewGroup

@Composable
fun ApplyGlobalModifiers() {
    val rootView = LocalView.current
    DisposableEffect(Unit) {
        traverseAndApplyModifiers(rootView)
        onDispose { }
    }
}

private fun traverseAndApplyModifiers(view: View) {
    if (view is ViewGroup) {
        for (i in 0 until view.childCount) {
            traverseAndApplyModifiers(view.getChildAt(i))
        }
    } else {
//        view.modifier = view.modifier.captureTapEvents(view.contentDescription?.toString())
    }
}