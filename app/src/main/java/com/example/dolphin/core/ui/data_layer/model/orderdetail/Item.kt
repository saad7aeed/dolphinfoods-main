package com.example.dolphin.core.ui.data_layer.model.orderdetail


import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class Item(
    @SerializedName("base_price")
    var basePrice: Int?,
    @SerializedName("brand_id")
    var brandId: Int?,
    @SerializedName("creator_id")
    var creatorId: Int?,
    @SerializedName("deal_id")
    var dealId: String?,
    @SerializedName("deleted_at")
    var deletedAt: String?,
    @SerializedName("distributor_cost")
    var distributorCost: Double?,
    @SerializedName("distributor_id")
    var distributorId: Int?,
    @SerializedName("expense")
    var expense: String?,
    @SerializedName("final_price")
    var finalPrice: Int?,
    @SerializedName("follow_up_action")
    var followUpAction: String?,
    @SerializedName("follow_up_by")
    var followUpBy: String?,
    @SerializedName("free_product_price")
    var freeProductPrice: String?,
    @SerializedName("id")
    var id: Int?,
    @SerializedName("invoice_type")
    var invoiceType: String?,
    @SerializedName("is_box")
    var isBox: Boolean?,
    @SerializedName("item_profit")
    var itemProfit: String?,
    @SerializedName("item_type")
    var itemType: String?,
    @SerializedName("order_id")
    var orderId: Int?,
    @SerializedName("package_qty")
    var packageQty: String?,
    @SerializedName("price")
    var price: Double?,
    @SerializedName("product")
    var product: Product?,
    @SerializedName("product_discount")
    var productDiscount: Int?,
    @SerializedName("product_discount_id")
    var productDiscountId: String?,
    @SerializedName("product_id")
    var productId: Int?,
    @SerializedName("profit")
    var profit: String?,
    @SerializedName("qty")
    var qty: Int?,
    @SerializedName("review")
    var review: String?,
    @SerializedName("scheme_qty")
    var schemeQty: Int?,
    @SerializedName("shop_type_id")
    var shopTypeId: Int?,
    @SerializedName("special_deal")
    var specialDeal: String?,
    @SerializedName("store_id")
    var storeId: Int?,
    @SerializedName("sub_total")
    var subTotal: Double?,
    @SerializedName("total_after_discount")
    var totalAfterDiscount: Double?
) : Parcelable