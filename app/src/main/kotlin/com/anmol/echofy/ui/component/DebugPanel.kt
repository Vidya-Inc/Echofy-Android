/*
 * Echofy - by Vidya-Inc
 * Vidya-Inc
 * Licensed Under GPL-3.0
 */



package com.anmol.echofy.ui.component

import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.anmol.echofy.R

/**
 * Returns a `Material3SettingsItem` that can be placed inside a `Material3SettingsGroup`.
 * The caller should supply composables or values for the dynamic content.
 */
@Composable
fun DebugPanelItem(
    title: @Composable () -> Unit,
    description: (@Composable () -> Unit)? = null,
    trailingContent: (@Composable () -> Unit)? = null
): Material3SettingsItem {
    return Material3SettingsItem(
        icon = painterResource(R.drawable.info),
        title = title,
        description = description,
        trailingContent = trailingContent,
        isHighlighted = true
    )
}
