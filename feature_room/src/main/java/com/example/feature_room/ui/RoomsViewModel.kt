package com.example.feature_room.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.feature_room.data.model.Rooms
import com.example.feature_room.data.repository.RoomsRepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RoomsViewModel @Inject constructor(private val repository: RoomsRepositoryImpl) :ViewModel() {

    private val _rooms = MutableLiveData<Rooms>()
    val rooms:LiveData<Rooms> get() = _rooms

    fun getRoomsData() {
        viewModelScope.launch {
            val roomsData = repository.getRooms()
            _rooms.postValue(roomsData)
        }
    }
}