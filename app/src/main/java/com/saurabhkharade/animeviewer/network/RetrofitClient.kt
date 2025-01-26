package com.saurabhkharade.animeviewer.network

import com.saurabhkharade.animeviewer.repository.AnimeRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


@Module
@InstallIn(SingletonComponent::class)
object RetrofitClient {

    fun provideApiInterface(): ApiInterface {

        return Retrofit.Builder().baseUrl("https://api.jikan.moe/v4/")
            .addConverterFactory(GsonConverterFactory.create()).build()
            .create(ApiInterface::class.java)
    }


    @Provides
    fun provideAnimeRepository(apiInterface: ApiInterface): AnimeRepository {
        return AnimeRepository(apiInterface)
    }
}