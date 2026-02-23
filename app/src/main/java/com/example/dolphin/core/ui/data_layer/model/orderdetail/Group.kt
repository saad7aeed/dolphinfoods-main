package com.example.dolphin.core.ui.data_layer.model.orderdetail


import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class Group(
    @SerializedName("account_id")
    var accountId: Int?,
    @SerializedName("business_discount_percentage")
    var businessDiscountPercentage: Int?,
    @SerializedName("color_code")
    var colorCode: String?,
    @SerializedName("count")
    var count: Int?,
    @SerializedName("deleted_at")
    var deletedAt: String?,
    @SerializedName("distributor_group_rule_id")
    var distributorGroupRuleId: String?,
    @SerializedName("distributor_id")
    var distributorId: Int?,
    @SerializedName("id")
    var id: Int?,
    @SerializedName("name")
    var name: String?
) : Parcelable