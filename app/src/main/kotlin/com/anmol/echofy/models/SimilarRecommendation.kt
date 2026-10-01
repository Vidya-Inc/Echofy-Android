/*
 * Echofy - by Vidya-Inc
 * Vidya-Inc
 * Licensed Under GPL-3.0
 */



package com.anmol.echofy.models

import com.anmol.echofy.innertube.models.YTItem
import com.anmol.echofy.db.entities.LocalItem

data class SimilarRecommendation(
    val title: LocalItem,
    val items: List<YTItem>,
)
