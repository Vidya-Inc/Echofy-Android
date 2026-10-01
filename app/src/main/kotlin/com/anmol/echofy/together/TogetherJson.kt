/*
 * Echofy - by Vidya-Inc
 * Vidya-Inc
 * Licensed Under GPL-3.0
 */

package com.anmol.echofy.together

import kotlinx.serialization.json.Json

object TogetherJson {
    val json: Json =
        Json {
            ignoreUnknownKeys = true
            explicitNulls = false
            encodeDefaults = true
            classDiscriminator = "type"
        }
}
