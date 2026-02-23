package com.example.dolphin.core.ui.domain_layer.repository

import com.example.dolphin.core.ui.data_layer.model.orderdetail.OrderDetailResponse


interface DolphinRepository {

    suspend fun getOrderDetail(): OrderDetailResponse
}