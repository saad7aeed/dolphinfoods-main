package com.example.dolphin.core.ui.prespentation_layer

import com.example.dolphin.core.ui.domain_layer.usecase.GetDolphinUseCase
import com.example.dolphin.utils.Resource
import io.mockk.coEvery
import io.mockk.mockk
import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertTrue
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.take
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import kotlinx.coroutines.test.resetMain
import org.junit.After
import org.junit.Before
import org.junit.Test

@OptIn(ExperimentalCoroutinesApi::class)
class WeatherViewModelTest {

    private lateinit var dolphinViewModel: DolphinViewModel
    private val getDolphinUseCase: GetDolphinUseCase = mockk()

    @Before
    fun setUp() {
        Dispatchers.setMain(Dispatchers.Unconfined)
        dolphinViewModel = DolphinViewModel(getDolphinUseCase)
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
    }
}