package com.example.feature_room.data.repository

import com.example.feature_room.data.api.RoomsApi
import com.example.feature_room.data.model.Rooms
import com.example.feature_room.domain.RoomsRepository
import javax.inject.Inject

class RoomsRepositoryImpl @Inject constructor(private val roomsApi: RoomsApi):RoomsRepository {
    override suspend fun getRooms(): Rooms = roomsApi.getRooms()
}