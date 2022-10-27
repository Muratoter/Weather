package com.moter.weather.di

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.moter.weather.data.network.BaseOkHttpClient
import com.moter.weather.data.network.BaseRetrofit
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Singleton

/**
 * Created by muratoter on 27,October,2022
 */


@InstallIn(SingletonComponent::class)
@Module
class AppModule {

    @Provides
    @Singleton
    fun gson(): Gson = GsonBuilder().create()


    @Provides
    @Singleton
    fun okHttpClient(baseHttpClient: BaseOkHttpClient): OkHttpClient = baseHttpClient.okHttpClient


    @Provides
    @Singleton
    fun retrofit(baseRetrofit: BaseRetrofit): Retrofit = baseRetrofit.retrofit
}