package com.example.feature_room.ui

import android.view.View
import android.widget.Button
import com.example.core.ui.base.ListItem
import com.example.core.ui.base.ViewPagerAdapter.ViewPagerAdapter
import com.example.feature_room.data.model.Room
import com.example.feature_room.databinding.ItemRoomBinding
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegateViewBinding

object RoomsScreenDelegates {
    fun roomsDelegate(onChoiceButtonClicked: () -> Unit) = adapterDelegateViewBinding<Room, ListItem, ItemRoomBinding>(
        { inflater, container -> ItemRoomBinding.inflate(inflater, container, false) }
    )
    {
        bind {

            val roomsViewPagerAdapter = ViewPagerAdapter(item.imageUrls)

            with(binding) {
                viewPager.adapter = roomsViewPagerAdapter
                roomDescriptionText.text = item.name
                priceNumberText.text = item.price.toString()
                priceForText.text = item.pricePer
                setUpPeculiarities(this, item.peculiarities)
                binding.chooseRoomButton.setOnClickListener { onChoiceButtonClicked() }
            }
        }
    }

    private fun setUpPeculiarities(binding: ItemRoomBinding, peculiarities: List<String>) {
        binding.peculiarity1Text.text = peculiarities[0]
        binding.peculiarity2Text.text = peculiarities[1]
        if (peculiarities.size == 3)
            binding.peculiarity3Text.text = peculiarities[2]
        else
            binding.peculiarity3Text.visibility = View.GONE
    }
}