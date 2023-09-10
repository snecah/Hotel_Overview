package com.example.feature_hotel.data.di

import com.example.feature_hotel.data.api.HotelApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal object HotelModule {

    @Provides
    @Singleton
    fun provideHotelApi(retrofit: Retrofit): HotelApi = retrofit.create(HotelApi::class.java)
}