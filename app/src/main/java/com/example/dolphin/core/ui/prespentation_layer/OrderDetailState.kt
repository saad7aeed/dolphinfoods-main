package com.example.dolphin.core.ui.prespentation_layer

import com.example.dolphin.core.ui.data_layer.model.orderdetail.OrderDetailResponse

data class OrderDetailState(
    val isLoading:Boolean=false,
    val error:String="",
    val data:OrderDetailResponse?=null
)
