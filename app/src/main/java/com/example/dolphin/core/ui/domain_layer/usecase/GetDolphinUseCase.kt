package com.example.dolphin.core.ui.domain_layer.usecase

import com.example.dolphin.core.ui.data_layer.model.orderdetail.OrderDetailResponse
import com.example.dolphin.core.ui.domain_layer.repository.DolphinRepository
import com.example.dolphin.utils.Resource
import kotlinx.coroutines.flow.flow
import javax.inject.Inject


class GetDolphinUseCase @Inject constructor(private val listingRepository: DolphinRepository) {

    operator fun invoke(): kotlinx.coroutines.flow.Flow<Resource<OrderDetailResponse>> = flow {
        emit(Resource.Loading())
        try {
            emit(Resource.Success(data = listingRepository.getOrderDetail()))
        } catch (e: Exception) {
            emit(Resource.Error(message = e.message.toString()))
        }
    }
}