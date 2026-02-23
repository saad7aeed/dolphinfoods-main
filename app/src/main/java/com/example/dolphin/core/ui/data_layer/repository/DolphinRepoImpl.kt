package com.example.dolphin.core.ui.data_layer.repository
import com.example.dolphin.core.ui.data_layer.model.orderdetail.OrderDetailResponse
import com.example.dolphin.core.ui.domain_layer.repository.DolphinRepository
import com.example.dolphin.network.remote.DolphinApiService
class DolphinRepoImpl(
    private val dolphinApiService: DolphinApiService
) : DolphinRepository {

    override suspend fun getOrderDetail(): OrderDetailResponse {
        return dolphinApiService.getOrderDetail()
    }
}