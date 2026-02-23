package com.example.dolphin.core.ui.data_layer.model.orderdetail


import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class FreeProduct(
    @SerializedName("id")
    var id: Int?,
    @SerializedName("is_box")
    var isBox: Boolean?,
    @SerializedName("product")
    var product: ProductX?,
    @SerializedName("product_id")
    var productId: Int?,
    @SerializedName("qty")
    var qty: Int?
) : Parcelable