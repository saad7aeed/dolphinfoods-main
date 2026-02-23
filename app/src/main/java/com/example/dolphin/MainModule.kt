package com.example.dolphin

import android.content.Context
import com.example.dolphin.core.ui.domain_layer.repository.DolphinRepository
import com.example.dolphin.core.ui.domain_layer.usecase.GetDolphinUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object MainModule {

    @Provides
    @Singleton
    fun provideGetWeatherUseCase(dolphinRepository: DolphinRepository): GetDolphinUseCase {
        return GetDolphinUseCase(dolphinRepository)
    }
}