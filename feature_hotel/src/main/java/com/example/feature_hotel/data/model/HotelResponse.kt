package com.example.feature_hotel.data.model

import com.google.gson.annotations.SerializedName

data class HotelResponse(
    @SerializedName("about_the_hotel")
    val aboutTheHotel: AboutTheHotel,
    @SerializedName("adress")
    val address: String,
    val id: Int,
    @SerializedName("image_urls")
    val imageUrls: List<String>,
    @SerializedName("minimal_price")
    val minimalPrice: Int,
    val name: String,
    @SerializedName("price_for_it")
    val priceForIt: String,
    val rating: Int,
    @SerializedName("rating_name")
    val ratingName: String
)