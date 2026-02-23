package com.example.dolphin.core.ui.data_layer.model.orderdetail


import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class EpPrice(
    @SerializedName("product_Price")
    var productPrice: Int?
) : Parcelable