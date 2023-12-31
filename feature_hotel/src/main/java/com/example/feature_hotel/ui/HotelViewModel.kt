package com.example.feature_hotel.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.core.ui.base.ListItem
import com.example.feature_hotel.data.mapper.toHotelAboutItem
import com.example.feature_hotel.data.mapper.toHotelPriceItem
import com.example.feature_hotel.data.repository.HotelRepositoryImpl
import com.example.feature_hotel.data.model.HotelOverview
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HotelViewModel @Inject constructor(private val repository: HotelRepositoryImpl) :
    ViewModel() {

    private val _hotelData = MutableLiveData<HotelOverview>()
    val hotelData: LiveData<HotelOverview> get() = _hotelData
    val hotelAbout get() = _hotelData.value?.toHotelAboutItem() as ListItem
    val hotelPriceItem get() =  _hotelData.value?.toHotelPriceItem() as ListItem

    fun getHotelOverview() {
        viewModelScope.launch {
            val data = repository.getHotelOverview()
            _hotelData.postValue(data)
        }
    }
}