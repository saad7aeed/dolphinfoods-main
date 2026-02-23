package com.example.dolphin.network.remote

import com.example.dolphin.core.ui.data_layer.model.orderdetail.OrderDetailResponse
import retrofit2.http.GET

interface DolphinApiService {

    @GET("orders/details/89182/")
    suspend fun getOrderDetail(
    ): OrderDetailResponse

}