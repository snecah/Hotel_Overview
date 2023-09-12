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
import com.hannesdorfmann.adapterdelegates4.ListDelegationAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HotelFragment : Fragment(R.layout.fragment_hotel) {
    private val viewModel by viewModels<HotelViewModel>()
    private val binding by viewBinding(FragmentHotelBinding::bind)
    private val adapter by lazy {
        ListDelegationAdapter<List<ListItem>>(
            HotelScreenDelegates.hotelPriceDelegate, HotelScreenDelegates.hotelAboutDelegate
        )
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        viewModel.getHotelOverview()
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerView.adapter = adapter

        viewModel.hotelData.observe(viewLifecycleOwner) {
            adapter.items = listOf(viewModel.hotelPriceItem, viewModel.hotelAbout)
            adapter.notifyDataSetChanged()
        }
    }
}