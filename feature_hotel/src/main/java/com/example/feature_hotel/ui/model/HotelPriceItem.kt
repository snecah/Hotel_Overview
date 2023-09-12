package com.example.feature_hotel.ui.model

import com.example.feature_hotel.ui.ListItem

data class HotelPriceItem(
    val name: String,
    val address: String,
    val minimalPrice: Int,
    val rating: Int,
    val ratingName: String,
    val imageUrls: List<String>
) : ListItem {
    override val itemId: Long
        get() = name.hashCode().toLong()
}
