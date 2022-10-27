package com.moter.weather.domain.repository

import com.moter.weather.core.common.OneCallRequestBody
import com.moter.weather.core.common.Resource
import com.moter.weather.domain.entity.WeatherUIState
import kotlinx.coroutines.flow.Flow

/**
 * Created by muratoter on 27,October,2022
 */

interface WeatherRepository {
    suspend fun getWeeklyWeather(oneCallRequestBody: OneCallRequestBody): Flow<Resource<WeatherUIState>>
}