package com.saurabhkharade.animeviewer.ui.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.saurabhkharade.animeviewer.helper.Resource
import com.saurabhkharade.animeviewer.model.AnimeModel
import com.saurabhkharade.animeviewer.repository.AnimeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AnimeViewModel @Inject constructor(
    private val repository: AnimeRepository
) : ViewModel() {

    private val _animeList = MutableLiveData<AnimeModel>()

    init {
        fetchTopAnimeData()
    }

    private fun fetchTopAnimeData() {

        viewModelScope.launch {
            try {
                val response = repository.getTopAnime()
                _animeList.postValue(response)
            } catch (e: Exception) {
                e.printStackTrace()
            }
            }
        }
    }


