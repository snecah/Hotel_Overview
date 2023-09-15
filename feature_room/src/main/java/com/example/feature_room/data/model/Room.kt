package com.example.feature_room.data.model

import com.example.core.ui.base.ListItem
import com.google.gson.annotations.SerializedName

data class Room(
    val id: Int,
    @SerializedName("image_urls")
    val imageUrls: List<String>,
    val name: String,
    val peculiarities: List<String>,
    val price: Int,
    @SerializedName("price_per")
    val pricePer: String
):ListItem {
    override val itemId: Long
        get() = id.toLong()
}