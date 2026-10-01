/*
 * Echofy - by Vidya-Inc
 * Vidya-Inc
 * Licensed Under GPL-3.0
 */



package com.anmol.echofy.lyrics

import android.content.Context
import com.anmol.echofy.betterlyrics.BetterLyrics
import com.anmol.echofy.constants.EnableBetterLyricsKey
import com.anmol.echofy.utils.dataStore
import com.anmol.echofy.utils.get

import com.anmol.echofy.utils.GlobalLog
import android.util.Log

object BetterLyricsProvider : LyricsProvider {
    init {
        BetterLyrics.logger = { message ->
            GlobalLog.append(Log.INFO, "BetterLyrics", message)
        }
    }

    override val name = "BetterLyrics"

    override fun isEnabled(context: Context): Boolean = context.dataStore[EnableBetterLyricsKey] ?: true

    override suspend fun getLyrics(
        id: String,
        title: String,
        artist: String,
        album: String?,
        duration: Int,
    ): Result<String> = BetterLyrics.getLyrics(title = title, artist = artist, album = null, durationSeconds = duration)

    override suspend fun getAllLyrics(
        id: String,
        title: String,
        artist: String,
        album: String?,
        duration: Int,
        callback: (String) -> Unit,
    ) {
        BetterLyrics.getAllLyrics(
            title = title,
            artist = artist,
            album = album,
            durationSeconds = duration,
            callback = callback,
        )
    }
}
