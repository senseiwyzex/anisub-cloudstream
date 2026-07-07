package com.example

import com.lagradost.nicehttp.Requests

object AniSubApi {

    private const val API = "https://anisub.co/api"

    suspend fun ping(): String {

        return Requests()
            .get("$API/subtitles")
            .text

    }

}