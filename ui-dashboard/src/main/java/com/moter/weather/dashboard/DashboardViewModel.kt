package com.moter.weather.dashboard

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.moter.weather.core.common.OneCallRequestBody
import com.moter.weather.domain.repository.WeatherRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * Created by muratoter on 27,October,2022
 */

@HiltViewModel
class DashboardViewModel @Inject constructor(private val weatherRepository: WeatherRepository) :
    ViewModel() {

    fun getWeatherData(requestBody: OneCallRequestBody) {
        viewModelScope.launch {
            weatherRepository.getWeeklyWeather(requestBody).collect {
                Log.d("DashboardViewModel", "response ${it}")
            }
        }
    }
}