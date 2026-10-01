/*
 * Echofy - by Vidya-Inc
 * Vidya-Inc
 * Licensed Under GPL-3.0
 */



package com.anmol.echofy.ui.utils

import androidx.navigation.NavController
import com.anmol.echofy.ui.screens.Screens

fun NavController.backToMain() {
    val mainRoutes = Screens.MainScreens.map { it.route }

    while (previousBackStackEntry != null &&
        currentBackStackEntry?.destination?.route !in mainRoutes
    ) {
        popBackStack()
    }
}
