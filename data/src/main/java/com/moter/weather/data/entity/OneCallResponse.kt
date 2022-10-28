package com.moter.weather.data.entity

import com.moter.weather.domain.entity.WeatherUIState

data class OneCallResponse(
    val current: Current,
    val daily: List<Daily>,
    val hourly: List<Hourly>,
    val lat: Double,
    val lon: Double,
    val timezone: String,
    val timezone_offset: Int
)

//TODO: map api model to ui model
fun OneCallResponse.mapIt(): WeatherUIState = WeatherUIState(
    text = this.toString()
)