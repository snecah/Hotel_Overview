package com.example.feature_hotel.domain.model

import com.example.feature_hotel.data.model.AboutTheHotel

data class HotelOverview(
    val aboutTheHotel: AboutTheHotel,
    val address: String,
    val imageUrls: List<String>,
    val minimalPrice: Int,
    val name: String,
    val priceForIt: String,
    val rating: Int,
    val ratingName: String
)
