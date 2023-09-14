package com.example.feature_hotel.ui.model

import com.example.core.ui.base.ListItem
import com.example.feature_hotel.data.model.AboutTheHotel

data class HotelAboutItem(val aboutTheHotel: AboutTheHotel): ListItem {
    override val itemId: Long
        get() = aboutTheHotel.description.hashCode().toLong()

}
