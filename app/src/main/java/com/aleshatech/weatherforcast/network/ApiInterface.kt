package com.aleshatech.weatherforcast.network


import com.aleshatech.weatherforcast.features.model.data_class.WeatherInfoResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {
    @GET ("weather")
    fun calApiForWeatherInfo(@Query("id") cityId:Int) : Call<WeatherInfoResponse>
}