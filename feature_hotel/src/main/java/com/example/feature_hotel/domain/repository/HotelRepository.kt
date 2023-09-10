package com.example.feature_hotel.domain.repository

import com.example.feature_hotel.domain.model.HotelOverview

interface HotelRepository {
    suspend fun getHotelOverview():HotelOverview
}