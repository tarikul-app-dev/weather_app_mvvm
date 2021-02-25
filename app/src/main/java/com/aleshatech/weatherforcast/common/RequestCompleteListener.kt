package com.aleshatech.weatherforcast.common

interface RequestCompleteListener <T>{
      fun onRequestSuccess(data:T)
      fun onRequestFailed(errorMessage:String)
}