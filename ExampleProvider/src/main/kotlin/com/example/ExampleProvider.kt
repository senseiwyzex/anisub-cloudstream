package com.example

import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.SearchResponse
import com.lagradost.cloudstream3.TvType

class ExampleProvider : MainAPI() {

    override var mainUrl = "https://anisub.co"

    override var name = "AniSub"

    override var lang = "tr"

    override val supportedTypes = setOf(
        TvType.Anime
    )

    override val hasMainPage = false

    override suspend fun search(query: String): List<SearchResponse> {
        return emptyList()
    }
}