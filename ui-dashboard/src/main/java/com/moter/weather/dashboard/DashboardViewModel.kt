package com.moter.weather.dashboard

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.moter.weather.core.common.OneCallRequestBody
import com.moter.weather.core.common.Resource
import com.moter.weather.domain.entity.WeatherUIState
import com.moter.weather.domain.repository.WeatherRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * Created by muratoter on 27,October,2022
 */

@HiltViewModel
class DashboardViewModel @Inject constructor(private val weatherRepository: WeatherRepository) :
    ViewModel() {
    private val _uiState = MutableStateFlow(WeatherUIState())
    val uiState: StateFlow<WeatherUIState> = _uiState.asStateFlow()

    fun getWeatherData(requestBody: OneCallRequestBody) {
        viewModelScope.launch {
            weatherRepository.getWeeklyWeather(requestBody).collect {
                when (it.status) {
                    Resource.Status.ERROR -> {

                    }
                    Resource.Status.SUCCESS -> {
                        it.data?.let {
                            _uiState.value = it
                        }
                    }
                    Resource.Status.LOADING -> {

                    }
                }
            }
        }
    }
}