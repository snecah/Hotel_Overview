package com.example.feature_hotel.ui

import com.example.core.ui.base.DifUtil.BaseDiffUtilItemCallback
import com.example.core.ui.base.ListItem
import com.hannesdorfmann.adapterdelegates4.AsyncListDifferDelegationAdapter

class HotelAdapter : AsyncListDifferDelegationAdapter<ListItem>(BaseDiffUtilItemCallback()) {
    init {
        delegatesManager.addDelegate(HotelScreenDelegates.hotelPriceDelegate)
            .addDelegate(HotelScreenDelegates.hotelAboutDelegate)
    }
}