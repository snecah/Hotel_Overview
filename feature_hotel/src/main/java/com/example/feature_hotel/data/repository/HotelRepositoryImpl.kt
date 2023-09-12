package com.example.feature_hotel.data.repository

import com.example.feature_hotel.data.api.HotelApi
import com.example.feature_hotel.data.model.HotelOverview
import com.example.feature_hotel.domain.repository.HotelRepository
import javax.inject.Inject

class HotelRepositoryImpl @Inject constructor(private val hotelApi: HotelApi) : HotelRepository {
    override suspend fun getHotelOverview(): HotelOverview = hotelApi.getHotelOverview()
}