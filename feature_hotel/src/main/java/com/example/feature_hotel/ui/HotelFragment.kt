package com.example.feature_hotel.ui

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.bumptech.glide.Glide
import com.example.feature_hotel.R
import com.example.feature_hotel.databinding.FragmentHotelBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HotelFragment : Fragment(R.layout.fragment_hotel) {
    private val viewModel by viewModels<HotelViewModel>()
    private val binding by viewBinding(FragmentHotelBinding::bind)


    override fun onAttach(context: Context) {
        super.onAttach(context)
        viewModel.getHotelOverview()
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.hotelData.observe(viewLifecycleOwner) {hotel ->
            with(binding) {
                hotelNameText.text = hotel.name
                hotelAddressText.text = hotel.address
                Glide.with(requireContext()).load(hotel.imageUrls[0]).into(viewPager)
            }
        }

    }

}