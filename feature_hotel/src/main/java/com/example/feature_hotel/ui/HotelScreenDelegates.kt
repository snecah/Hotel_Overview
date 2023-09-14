package com.example.feature_hotel.ui

import com.example.core.ui.base.ListItem
import com.example.feature_hotel.databinding.ItemHotelAboutBinding
import com.example.feature_hotel.databinding.ItemHotelIncludedBinding
import com.example.feature_hotel.databinding.ItemHotelPriceBinding
import com.example.feature_hotel.ui.model.HotelAboutItem
import com.example.feature_hotel.ui.model.HotelIncludedItem
import com.example.feature_hotel.ui.model.HotelPriceItem
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegateViewBinding

object HotelScreenDelegates {
    val hotelPriceDelegate =
        adapterDelegateViewBinding<HotelPriceItem, ListItem, ItemHotelPriceBinding>(
            { inflater, container -> ItemHotelPriceBinding.inflate(inflater, container, false) }
        ) {
            bind {

                val viewPagerAdapter = ViewPagerAdapter(item.imageUrls)

                with(binding) {
                    viewPager.adapter = viewPagerAdapter
                    hotelNameText.text = item.name
                    hotelAddressText.text = item.address
                    priceNumberText.text = item.minimalPrice.toString()
                    ratingNumber.text = item.rating.toString()
                    ratingNameText.text = item.ratingName
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

    val hotelIncludedDelegate =
        adapterDelegateViewBinding<HotelIncludedItem, ListItem, ItemHotelIncludedBinding>(
            { inflater, container -> ItemHotelIncludedBinding.inflate(inflater, container, false) }
        ) {
            bind {
                with(binding) {
                    facilitiesText.text = item.name
                    facilityImage.setImageResource(item.resourceImgId)
                }
            }
        }
}