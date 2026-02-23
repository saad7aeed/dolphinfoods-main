package com.example.dolphin.core.ui.data_layer.model.orderdetail


import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class Data(
    @SerializedName("assigned_date")
    var assignedDate: String?,
    @SerializedName("assigned_to")
    var assignedTo: String?,
    @SerializedName("audio")
    var audio: String?,
    @SerializedName("balance_after_payment")
    var balanceAfterPayment: String?,
    @SerializedName("box_count")
    var boxCount: Int?,
    @SerializedName("cancel_reason")
    var cancelReason: String?,
    @SerializedName("created_from")
    var createdFrom: String?,
    @SerializedName("creator_id")
    var creatorId: Int?,
    @SerializedName("creator_role")
    var creatorRole: String?,
    @SerializedName("credit_amount")
    var creditAmount: Int?,
    @SerializedName("credit_request")
    var creditRequest: String?,
    @SerializedName("customer_image_url")
    var customerImageUrl: String?,
    @SerializedName("customer_name")
    var customerName: String?,
    @SerializedName("date")
    var date: String?,
    @SerializedName("dd_special_discount")
    var ddSpecialDiscount: Int?,
    @SerializedName("deal_total")
    var dealTotal: Double?,
    @SerializedName("delivered_by")
    var deliveredBy: String?,
    @SerializedName("delivery_charges")
    var deliveryCharges: String?,
    @SerializedName("delivery_date")
    var deliveryDate: String?,
    @SerializedName("delivery_time")
    var deliveryTime: String?,
    @SerializedName("deliveryman")
    var deliveryman: String?,
    @SerializedName("deliveryman_detail")
    var deliverymanDetail: String?,
    @SerializedName("discount")
    var discount: Int?,
    @SerializedName("discount_grand_total")
    var discountGrandTotal: Int?,
    @SerializedName("discounts")
    var discounts: List<String>?,
    @SerializedName("distributor")
    var distributor: Int?,
    @SerializedName("distributor_id")
    var distributorId: Int?,
    @SerializedName("distributor_punch")
    var distributorPunch: String?,
    @SerializedName("expected_delivery_date")
    var expectedDeliveryDate: String?,
    @SerializedName("feedback")
    var feedback: String?,
    @SerializedName("fixed_discount")
    var fixedDiscount: Int?,
    @SerializedName("followup_by")
    var followupBy: String?,
    @SerializedName("formatted_date")
    var formattedDate: String?,
    @SerializedName("formatted_delivery_date")
    var formattedDeliveryDate: String?,
    @SerializedName("formatted_time")
    var formattedTime: String?,
    @SerializedName("grand_total")
    var grandTotal: Double?,
    @SerializedName("group_id")
    var groupId: Int?,
    @SerializedName("human_order_date")
    var humanOrderDate: String?,
    @SerializedName("id")
    var id: Int?,
    @SerializedName("inventory_id")
    var inventoryId: String?,
    @SerializedName("invoice_type")
    var invoiceType: String?,
    @SerializedName("is_open_order")
    var isOpenOrder: Boolean?,
    @SerializedName("is_order_after_punch_time")
    var isOrderAfterPunchTime: Boolean?,
    @SerializedName("is_pinned")
    var isPinned: Int?,
    @SerializedName("is_spot_order")
    var isSpotOrder: Int?,
    @SerializedName("is_supplier_order")
    var isSupplierOrder: Boolean?,
    @SerializedName("is_supplier_review_added")
    var isSupplierReviewAdded: String?,
    @SerializedName("items")
    var items: List<Item>?,
    @SerializedName("items_count")
    var itemsCount: Int?,
    @SerializedName("order_address")
    var orderAddress: String?,
    @SerializedName("order_cancel_person")
    var orderCancelPerson: String?,
    @SerializedName("order_deals")
    var orderDeals: List<OrderDeal>?,
    @SerializedName("order_discounts")
    var orderDiscounts: List<String>?,
    @SerializedName("order_payable")
    var orderPayable: Double?,
    @SerializedName("order_person")
    var orderPerson: String?,
    @SerializedName("order_status")
    var orderStatus: String?,
    @SerializedName("order_taking_method")
    var orderTakingMethod: String?,
    @SerializedName("order_time")
    var orderTime: String?,
    @SerializedName("order_total")
    var orderTotal: Double?,
    @SerializedName("order_type")
    var orderType: String?,
    @SerializedName("original_date")
    var originalDate: String?,
    @SerializedName("pack_count")
    var packCount: Int?,
    @SerializedName("parent_id")
    var parentId: String?,
    @SerializedName("payment")
    var payment: String?,
    @SerializedName("payment_type")
    var paymentType: String?,
    @SerializedName("pinned_date")
    var pinnedDate: String?,
    @SerializedName("pre_balance")
    var preBalance: Int?,
    @SerializedName("proof_img")
    var proofImg: String?,
    @SerializedName("salesman")
    var salesman: String?,
    @SerializedName("salesman_id")
    var salesmanId: Int?,
    @SerializedName("salesman_shop_id")
    var salesmanShopId: Int?,
    @SerializedName("special_discount")
    var specialDiscount: Int?,
    @SerializedName("splitted_order_id")
    var splittedOrderId: String?,
    @SerializedName("stock_id")
    var stockId: String?,
    @SerializedName("store")
    var store: Store?,
    @SerializedName("store_discount")
    var storeDiscount: Int?,
    @SerializedName("store_id")
    var storeId: Int?,
    @SerializedName("store_image_url")
    var storeImageUrl: String?,
    @SerializedName("store_name")
    var storeName: String?,
    @SerializedName("store_phone")
    var storePhone: String?,
    @SerializedName("store_tehsil")
    var storeTehsil: String?,
    @SerializedName("store_type")
    var storeType: String?,
    @SerializedName("store_type_id")
    var storeTypeId: Int?,
    @SerializedName("supplier_id")
    var supplierId: String?,
    @SerializedName("time")
    var time: String?,
    @SerializedName("total")
    var total: Double?,
    @SerializedName("total_after_discount")
    var totalAfterDiscount: Double?,
    @SerializedName("total_discount")
    var totalDiscount: Int?,
    @SerializedName("total_discount_from_discount")
    var totalDiscountFromDiscount: String?,
    @SerializedName("total_discounts")
    var totalDiscounts: Int?,
    @SerializedName("total_fixed_discount")
    var totalFixedDiscount: Int?,
    @SerializedName("translated_order_status")
    var translatedOrderStatus: String?
) : Parcelable