package com.example.feature_hotel.ui

import com.bumptech.glide.Glide
import com.example.feature_hotel.databinding.ItemHotelAboutBinding
import com.example.feature_hotel.databinding.ItemHotelPriceBinding
import com.example.feature_hotel.ui.model.HotelAboutItem
import com.example.feature_hotel.ui.model.HotelPriceItem
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegateViewBinding

object HotelScreenDelegates {
    val hotelPriceDelegate =
        adapterDelegateViewBinding<HotelPriceItem, ListItem, ItemHotelPriceBinding>(
            { inflater, container -> ItemHotelPriceBinding.inflate(inflater, container, false) }
        ) {
            bind {
                with(binding) {
                    hotelNameText.text = item.name
                    hotelAddressText.text = item.address
                    priceText.text = item.minimalPrice.toString()
                    ratingNumber.text = item.rating.toString()
                    ratingNameText.text = item.ratingName
                    Glide.with(context).load(item.imageUrls[0]).into(viewPager)
                }
            }
        }
    val hotelAboutDelegate =
        adapterDelegateViewBinding<HotelAboutItem, ListItem, ItemHotelAboutBinding>(
            { inflater, container -> ItemHotelAboutBinding.inflate(inflater, container, false) }
        ) {
            bind {
                binding.hotelDescriptionText.text = item.aboutTheHotel.description
            }
        }

}