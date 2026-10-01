/*
 * Echofy - by Vidya-Inc
 * Vidya-Inc
 * Licensed Under GPL-3.0
 */



package com.anmol.echofy.lyrics

import android.content.Context
import com.anmol.echofy.lrclib.LrcLib
import com.anmol.echofy.constants.EnableLrcLibKey
import com.anmol.echofy.utils.dataStore
import com.anmol.echofy.utils.get

object LrcLibLyricsProvider : LyricsProvider {
    override val name = "LrcLib"

    override fun isEnabled(context: Context): Boolean = context.dataStore[EnableLrcLibKey] ?: true

    override suspend fun getLyrics(
        id: String,
        title: String,
        artist: String,
        album: String?,
        duration: Int,
    ): Result<String> = LrcLib.getLyrics(title, artist, duration)

    override suspend fun getAllLyrics(
        id: String,
        title: String,
        artist: String,
        album: String?,
        duration: Int,
        callback: (String) -> Unit,
    ) {
        LrcLib.getAllLyrics(title, artist, duration, null, callback)
    }
}
