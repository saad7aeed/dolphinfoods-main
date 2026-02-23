package com.example.dolphin.core.ui.data_layer.model.orderdetail


import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class ProductXX(
    @SerializedName("final_box_price")
    var finalBoxPrice: Int?,
    @SerializedName("final_price")
    var finalPrice: Int?,
    @SerializedName("id")
    var id: Int?,
    @SerializedName("image_url")
    var imageUrl: String?,
    @SerializedName("is_box")
    var isBox: Boolean?,
    @SerializedName("name")
    var name: String?,
    @SerializedName("package_name")
    var packageName: String?,
    @SerializedName("package_qty")
    var packageQty: Int?,
    @SerializedName("package_weight")
    var packageWeight: Int?,
    @SerializedName("packing")
    var packing: String?,
    @SerializedName("product_details")
    var productDetails: String?,
    @SerializedName("qty")
    var qty: Int?,
    @SerializedName("scale")
    var scale: Int?,
    @SerializedName("thumbnail")
    var thumbnail: String?
) : Parcelable