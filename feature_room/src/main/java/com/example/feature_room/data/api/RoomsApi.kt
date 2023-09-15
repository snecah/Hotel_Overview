package com.example.feature_room.data.api

import com.example.feature_room.data.model.Rooms
import retrofit2.http.GET

interface RoomsApi {
    @GET("v3/f9a38183-6f95-43aa-853a-9c83cbb05ecd")
     suspend fun getRooms(): Rooms
}