package com.moter.weather.data.repository

import com.moter.weather.core.common.OneCallRequestBody
import com.moter.weather.data.entity.mapIt
import com.moter.weather.core.common.Resource
import com.moter.weather.data.network.WeatherApi
import com.moter.weather.domain.entity.WeatherUIState
import com.moter.weather.domain.repository.WeatherRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

/**
 * Created by muratoter on 27,October,2022
 */
class WeatherRepositoryImpl @Inject constructor(private val weatherApi: WeatherApi) :
    WeatherRepository {
    override suspend fun getWeeklyWeather(requestBody: OneCallRequestBody): Flow<Resource<WeatherUIState>> =
        flow {
            emit(Resource.loading())
            try {
                val response = weatherApi.getWeeklyWeather(
                    lat = requestBody.lat,
                    lon = requestBody.lon,
                    exclude = requestBody.exclude.name,
                    appid = requestBody.api_key
                )
                if (response.isSuccessful) {
                    emit(Resource.success(response.body()!!.mapIt()))
                } else {
                    emit(
                        Resource.error(
                            response.errorBody().toString()
                        )
                    )
                }
            } catch (e: Exception) {
                emit(Resource.error(e.message))
            }

        }
}