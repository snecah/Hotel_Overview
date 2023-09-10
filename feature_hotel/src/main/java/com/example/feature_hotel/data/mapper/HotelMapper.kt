package com.example.feature_hotel.data.mapper

import com.example.feature_hotel.data.model.HotelResponse
import com.example.feature_hotel.domain.model.HotelOverview

fun HotelResponse.toDomainModel() = HotelOverview(
    aboutTheHotel = aboutTheHotel,
    address = address,
    imageUrls = imageUrls,
    minimalPrice = minimalPrice,
    name = name,
    priceForIt = priceForIt,
    rating = rating,
    ratingName = ratingName
)