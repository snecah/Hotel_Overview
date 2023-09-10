package com.example.feature_hotel.data.api

import com.example.feature_hotel.data.model.HotelResponse
import retrofit2.http.GET

interface HotelApi {
    @GET("v3/35e0d18e-2521-4f1b-a575-f0fe366f66e3")
    suspend fun getHotelOverview(): HotelResponse
}