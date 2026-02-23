package com.example.dolphin.core.ui.data_layer.di

import com.example.dolphin.core.ui.data_layer.repository.DolphinRepoImpl
import com.example.dolphin.core.ui.domain_layer.repository.DolphinRepository
import com.example.dolphin.network.remote.DolphinApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit


@InstallIn(SingletonComponent::class)
@Module
object DolphinDataModule {

    @Provides
    fun provideUniversityApiService(retrofit: Retrofit): DolphinApiService {
        return retrofit.create(DolphinApiService::class.java)
    }

    @Provides
    fun providesUniversityRepository(
        dolphinApiService: DolphinApiService): DolphinRepository {
        return DolphinRepoImpl(dolphinApiService)
    }
}