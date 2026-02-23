package com.example.dolphin.core.ui.data_layer.model.orderdetail


import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class Product(
    @SerializedName("base_price")
    var basePrice: Int?,
    @SerializedName("base_price_updated_at")
    var basePriceUpdatedAt: String?,
    @SerializedName("box_min_quantity")
    var boxMinQuantity: Int?,
    @SerializedName("box_sku")
    var boxSku: String?,
    @SerializedName("brand_id")
    var brandId: Int?,
    @SerializedName("brand_name")
    var brandName: String?,
    @SerializedName("category_id")
    var categoryId: Int?,
    @SerializedName("created_at")
    var createdAt: String?,
    @SerializedName("created_by")
    var createdBy: Int?,
    @SerializedName("customer_rate")
    var customerRate: Int?,
    @SerializedName("description_content_id")
    var descriptionContentId: String?,
    @SerializedName("detail")
    var detail: String?,
    @SerializedName("discount_packages")
    var discountPackages: String?,
    @SerializedName("discount_percentage")
    var discountPercentage: String?,
    @SerializedName("discount_percentage_end_date")
    var discountPercentageEndDate: String?,
    @SerializedName("discount_percentage_start_date")
    var discountPercentageStartDate: String?,
    @SerializedName("ep_price")
    var epPrice: EpPrice?,
    @SerializedName("expense")
    var expense: Int?,
    @SerializedName("final_box_price")
    var finalBoxPrice: Int?,
    @SerializedName("final_price")
    var finalPrice: Int?,
    @SerializedName("fixed_price")
    var fixedPrice: String?,
    @SerializedName("form_id")
    var formId: Int?,
    @SerializedName("id")
    var id: Int?,
    @SerializedName("image")
    var image: String?,
    @SerializedName("in_review")
    var inReview: String?,
    @SerializedName("in_stock_qty")
    var inStockQty: Int?,
    @SerializedName("is_active")
    var isActive: Boolean?,
    @SerializedName("is_appeal_not_allowed")
    var isAppealNotAllowed: String?,
    @SerializedName("is_applied_discount")
    var isAppliedDiscount: Int?,
    @SerializedName("is_base_price_product")
    var isBasePriceProduct: Boolean?,
    @SerializedName("is_distributor_product")
    var isDistributorProduct: Int?,
    @SerializedName("is_published")
    var isPublished: Int?,
    @SerializedName("keywords")
    var keywords: String?,
    @SerializedName("min_order_qty")
    var minOrderQty: Int?,
    @SerializedName("name")
    var name: String?,
    @SerializedName("name_content_id")
    var nameContentId: String?,
    @SerializedName("name_eng")
    var nameEng: String?,
    @SerializedName("original_product_id")
    var originalProductId: String?,
    @SerializedName("pack_id")
    var packId: Int?,
    @SerializedName("pack_min_quantity")
    var packMinQuantity: Int?,
    @SerializedName("pack_sku")
    var packSku: String?,
    @SerializedName("package_info_valid")
    var packageInfoValid: Boolean?,
    @SerializedName("package_name")
    var packageName: String?,
    @SerializedName("package_price")
    var packagePrice: String?,
    @SerializedName("package_qty")
    var packageQty: Int?,
    @SerializedName("package_unit")
    var packageUnit: String?,
    @SerializedName("package_weight")
    var packageWeight: Int?,
    @SerializedName("package")
    var packageX: String?,
    @SerializedName("packaging_type")
    var packagingType: String?,
    @SerializedName("packing")
    var packing: String?,
    @SerializedName("packing_weight")
    var packingWeight: String?,
    @SerializedName("parent_id")
    var parentId: Int?,
    @SerializedName("price")
    var price: Int?,
    @SerializedName("product_details")
    var productDetails: String?,
    @SerializedName("product_id")
    var productId: Int?,
    @SerializedName("product_point")
    var productPoint: Int?,
    @SerializedName("product_weight")
    var productWeight: String?,
    @SerializedName("profit")
    var profit: Int?,
    @SerializedName("rank")
    var rank: Int?,
    @SerializedName("scale")
    var scale: Double?,
    @SerializedName("sub_cat_id")
    var subCatId: Int?,
    @SerializedName("thumbnail")
    var thumbnail: String?,
    @SerializedName("translated_name")
    var translatedName: String?,
    @SerializedName("unit_id")
    var unitId: Int?,
    @SerializedName("unit_qty")
    var unitQty: String?,
    @SerializedName("updated_at")
    var updatedAt: String?
) : Parcelable