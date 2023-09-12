package com.example.feature_hotel.domain.repository

import com.example.feature_hotel.data.model.HotelOverview

interface HotelRepository {
    suspend fun getHotelOverview(): HotelOverview
}