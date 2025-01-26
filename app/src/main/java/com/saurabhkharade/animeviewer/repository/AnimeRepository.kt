package com.saurabhkharade.animeviewer.repository

import com.saurabhkharade.animeviewer.network.ApiInterface
import javax.inject.Inject

class AnimeRepository @Inject constructor(private val apiInterface: ApiInterface) {

    suspend fun getTopAnime() = apiInterface.getTopAnime()
}