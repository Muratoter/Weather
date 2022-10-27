package com.moter.weather.data.network

import com.google.gson.Gson
import com.moter.weather.data.BuildConfig
import javax.inject.Inject
import javax.inject.Singleton
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by muratoter on 27,October,2022
 */
@Singleton
class BaseRetrofit @Inject constructor(
    gson: Gson,
    okHttpClient: OkHttpClient
) {
    val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(BuildConfig.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .client(okHttpClient)
        .build()
}