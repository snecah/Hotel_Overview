package com.example.feature_room.data.di

import com.example.feature_room.data.api.RoomsApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.create
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
internal object RoomsModule {
    @Provides
    @Singleton
    fun provideRoomsApi(retrofit: Retrofit): RoomsApi = retrofit.create(RoomsApi::class.java)
}