package com.saurabhkharade.animeviewer.network

import com.saurabhkharade.animeviewer.model.AnimeModel
import retrofit2.http.GET

interface ApiInterface {


    @GET("top/anime")
    suspend fun getTopAnime(): AnimeModel
}