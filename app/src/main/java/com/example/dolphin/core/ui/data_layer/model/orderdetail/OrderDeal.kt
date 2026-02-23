package com.example.dolphin.core.ui.data_layer.model.orderdetail


import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class OrderDeal(
    @SerializedName("created_at")
    var createdAt: String?,
    @SerializedName("deal_details")
    var dealDetails: DealDetails?,
    @SerializedName("deal_id")
    var dealId: Int?,
    @SerializedName("deal_qty")
    var dealQty: Int?,
    @SerializedName("deal_type")
    var dealType: String?,
    @SerializedName("free_amount")
    var freeAmount: Double?,
    @SerializedName("id")
    var id: Int?,
    @SerializedName("invoice_type")
    var invoiceType: String?,
    @SerializedName("order_id")
    var orderId: Int?,
    @SerializedName("paid_amount")
    var paidAmount: Double?,
    @SerializedName("store_id")
    var storeId: Int?,
    @SerializedName("store_type_id")
    var storeTypeId: Int?,
    @SerializedName("updated_at")
    var updatedAt: String?
) : Parcelable