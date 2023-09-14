package com.example.feature_hotel.ui.model

import com.example.core.ui.base.ListItem
import com.example.feature_hotel.R

data class HotelIncludedItem(val name: String, val resourceImgId: Int) : ListItem {
    override val itemId: Long
        get() = this.hashCode().toLong()

    companion object {
        val hardcodeItem1 = HotelIncludedItem("Удобства", R.drawable.emoji_happy)
        val hardcodeItem2 = HotelIncludedItem("Что включено", R.drawable.tick_square)
        val hardcodeItem3 = HotelIncludedItem("Что не включено", R.drawable.close_square)
    }

}