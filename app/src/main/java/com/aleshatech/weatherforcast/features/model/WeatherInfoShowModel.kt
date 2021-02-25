package com.aleshatech.weatherforcast.features.model

import com.aleshatech.weatherforcast.common.RequestCompleteListener
import com.aleshatech.weatherforcast.features.model.data_class.City
import com.aleshatech.weatherforcast.features.model.data_class.WeatherInfoResponse

interface WeatherInfoShowModel {
    fun getCityList(callback:RequestCompleteListener<MutableList<City>>)
    fun getWeatherInfo(cityId:Int,callback: RequestCompleteListener<WeatherInfoResponse>)

}