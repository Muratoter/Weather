package com.moter.weather.core.common

/**
 * Created by muratoter on 28,October,2022
 */
data class OneCallRequestBody(
    val lat: String,
    val lon: String,
    val exclude: Exclude,
    val api_key: String
)
