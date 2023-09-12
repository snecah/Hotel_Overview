package com.example.feature_hotel.data.mapper

import com.example.feature_hotel.data.model.HotelOverview
import com.example.feature_hotel.ui.model.HotelAboutItem
import com.example.feature_hotel.ui.model.HotelPriceItem

fun HotelOverview.toHotelAboutItem() = HotelAboutItem(
    aboutTheHotel = aboutTheHotel
)

fun HotelOverview.toHotelPriceItem() = HotelPriceItem(
    name = name,
    address = address,
    rating = rating,
    ratingName = ratingName,
    imageUrls = imageUrls,
    minimalPrice = minimalPrice
)