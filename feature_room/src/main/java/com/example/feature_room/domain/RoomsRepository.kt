package com.example.feature_room.domain

import com.example.feature_room.data.model.Rooms

interface RoomsRepository {
    suspend fun getRooms():Rooms
}