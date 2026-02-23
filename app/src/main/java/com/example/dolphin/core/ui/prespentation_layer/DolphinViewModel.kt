package com.example.dolphin.core.ui.prespentation_layer

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dolphin.core.ui.domain_layer.usecase.GetDolphinUseCase
import com.example.dolphin.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class DolphinViewModel @Inject constructor(private val getListingUseCase: GetDolphinUseCase) :
    ViewModel() {
    private val _orderDetail = MutableStateFlow(OrderDetailState())
    val orderDetail: StateFlow<OrderDetailState> = _orderDetail

    fun getOrderDetail() {
        getListingUseCase().onEach {
            when (it) {
                is Resource.Loading -> {
                    _orderDetail.value = OrderDetailState(isLoading = true)
                }

                is Resource.Error -> {
                    _orderDetail.value = OrderDetailState(error = it.message)
                }

                is Resource.Success -> {
                    _orderDetail.value = OrderDetailState(data = it.data)
                }
            }
        }.launchIn(viewModelScope)
    }

}