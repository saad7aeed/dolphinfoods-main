package com.example.dolphin.core.ui.data_layer.model.orderdetail


import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class DealDetails(
    @SerializedName("end_date")
    var endDate: String?,
    @SerializedName("formatted_created_date_time")
    var formattedCreatedDateTime: String?,
    @SerializedName("formatted_end_date")
    var formattedEndDate: String?,
    @SerializedName("formatted_start_date")
    var formattedStartDate: String?,
    @SerializedName("formatted_updated_date_time")
    var formattedUpdatedDateTime: String?,
    @SerializedName("free_amount")
    var freeAmount: Double?,
    @SerializedName("free_products")
    var freeProducts: List<FreeProduct>?,
    @SerializedName("gross_price")
    var grossPrice: Int?,
    @SerializedName("id")
    var id: Int?,
    @SerializedName("isDealSelected")
    var isDealSelected: Boolean?,
    @SerializedName("max_limit")
    var maxLimit: Int?,
    @SerializedName("name")
    var name: String?,
    @SerializedName("paid_amount")
    var paidAmount: Double?,
    @SerializedName("paid_products")
    var paidProducts: List<PaidProduct>?,
    @SerializedName("parent_id")
    var parentId: Int?,
    @SerializedName("per_store_limit")
    var perStoreLimit: Int?,
    @SerializedName("qty")
    var qty: Int?,
    @SerializedName("remaining_days")
    var remainingDays: Int?,
    @SerializedName("scheme_category")
    var schemeCategory: String?,
    @SerializedName("sold_count")
    var soldCount: Int?,
    @SerializedName("start_date")
    var startDate: String?,
    @SerializedName("store_sold_count")
    var storeSoldCount: Int?,
    @SerializedName("store_type_id")
    var storeTypeId: Int?,
    @SerializedName("type")
    var type: String?,
    @SerializedName("variants_count")
    var variantsCount: Int?
) : Parcelable