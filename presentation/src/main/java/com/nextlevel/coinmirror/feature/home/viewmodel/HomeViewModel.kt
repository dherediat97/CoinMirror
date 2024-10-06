package com.nextlevel.coinmirror.feature.home.viewmodel

import androidx.lifecycle.ViewModel
import com.nextlevel.coinmirror.data.model.SymbolData
import com.nextlevel.coinmirror.domain.repository.CoinMirrorRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val repository: CoinMirrorRepository) : ViewModel() {

    private val _state = MutableStateFlow(HomeUiState())
    val uiState: StateFlow<HomeUiState>
        get() = _state


    suspend fun getHomeData() {
        runCatching {
            _state.update {
                it.copy(isLoading = true)
            }
            val data = repository.getSymbolData()
            _state.update {
                it.copy(
                    homeData = data
                )
            }
        }.onFailure {
            _state.update {
                it.copy(isError = true)
            }
        }
        _state.update {
            it.copy(isLoading = false)
        }
    }


    data class HomeUiState(
        val homeData: SymbolData = SymbolData(),
        val isLoading: Boolean = false,
        val isError: Boolean = false
    )

}