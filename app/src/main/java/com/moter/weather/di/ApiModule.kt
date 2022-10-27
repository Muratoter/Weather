package com.moter.weather.di

import com.moter.weather.data.network.WeatherApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

/**
 * Created by muratoter on 27,October,2022
 */


@InstallIn(SingletonComponent::class)
@Module
class ApiModule {

    @Provides
    @Singleton
    fun weather(retrofit: Retrofit): WeatherApi =
        retrofit.create(WeatherApi::class.java)


}