package com.moter.weather.data.network

import com.moter.weather.data.entity.OneCallResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by muratoter on 27,October,2022
 */
interface WeatherApi {

    @GET("onecall")
    suspend fun getWeeklyWeather(
        @Query("lat") lat: String,
        @Query("lon") lon: String,
        @Query("exclude") exclude: String,
        @Query("appid") appid: String
    ): Response<OneCallResponse>
}