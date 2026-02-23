package com.example.dolphin.core.ui.data_layer.model.orderdetail


import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class Store(
    @SerializedName("address")
    var address: String?,
    @SerializedName("address_eng")
    var addressEng: String?,
    @SerializedName("address_verified_by")
    var addressVerifiedBy: String?,
    @SerializedName("approval_status")
    var approvalStatus: String?,
    @SerializedName("bazar")
    var bazar: String?,
    @SerializedName("bazar_id")
    var bazarId: Int?,
    @SerializedName("city_id")
    var cityId: String?,
    @SerializedName("class")
    var classX: String?,
    @SerializedName("cnic")
    var cnic: String?,
    @SerializedName("complete_address")
    var completeAddress: String?,
    @SerializedName("contacts")
    var contacts: List<String?>?,
    @SerializedName("cover_image")
    var coverImage: String?,
    @SerializedName("cover_image_url")
    var coverImageUrl: String?,
    @SerializedName("created_by")
    var createdBy: String?,
    @SerializedName("credit_date")
    var creditDate: String?,
    @SerializedName("custom1")
    var custom1: String?,
    @SerializedName("custom2")
    var custom2: String?,
    @SerializedName("distributor_id")
    var distributorId: Int?,
    @SerializedName("domain_created_by")
    var domainCreatedBy: String?,
    @SerializedName("filer_status")
    var filerStatus: String?,
    @SerializedName("fixed_discount")
    var fixedDiscount: Int?,
    @SerializedName("group")
    var group: Group?,
    @SerializedName("id")
    var id: Int?,
    @SerializedName("image_url")
    var imageUrl: String?,
    @SerializedName("initials")
    var initials: String?,
    @SerializedName("invoice_type")
    var invoiceType: String?,
    @SerializedName("is_active")
    var isActive: Boolean?,
    @SerializedName("is_address_verified")
    var isAddressVerified: Boolean?,
    @SerializedName("is_branded")
    var isBranded: String?,
    @SerializedName("is_credit_store")
    var isCreditStore: Boolean?,
    @SerializedName("is_phone_verified")
    var isPhoneVerified: Int?,
    @SerializedName("is_physical")
    var isPhysical: String?,
    @SerializedName("is_store_prices_enabled")
    var isStorePricesEnabled: Boolean?,
    @SerializedName("is_verified")
    var isVerified: Boolean?,
    @SerializedName("lat_lng")
    var latLng: String?,
    @SerializedName("latitude")
    var latitude: String?,
    @SerializedName("location")
    var location: String?,
    @SerializedName("location_id")
    var locationId: Int?,
    @SerializedName("logo")
    var logo: String?,
    @SerializedName("longitude")
    var longitude: String?,
    @SerializedName("map_data")
    var mapData: String?,
    @SerializedName("max_discount_per_order")
    var maxDiscountPerOrder: String?,
    @SerializedName("min_order_for_discount")
    var minOrderForDiscount: String?,
    @SerializedName("name")
    var name: String?,
    @SerializedName("name_eng")
    var nameEng: String?,
    @SerializedName("ntn")
    var ntn: String?,
    @SerializedName("open_credit")
    var openCredit: String?,
    @SerializedName("opening_credit")
    var openingCredit: String?,
    @SerializedName("owner_name")
    var ownerName: String?,
    @SerializedName("pending_credits")
    var pendingCredits: List<PendingCredit?>?,
    @SerializedName("phone")
    var phone: String?,
    @SerializedName("place_id")
    var placeId: String?,
    @SerializedName("pre_balance")
    var preBalance: Int?,
    @SerializedName("rank")
    var rank: String?,
    @SerializedName("remaining_credit_limit")
    var remainingCreditLimit: Double?,
    @SerializedName("sales_rank")
    var salesRank: String?,
    @SerializedName("salesman_id")
    var salesmanId: String?,
    @SerializedName("serial")
    var serial: String?,
    @SerializedName("state")
    var state: String?,
    @SerializedName("state_area")
    var stateArea: String?,
    @SerializedName("state_area_id")
    var stateAreaId: Int?,
    @SerializedName("state_id")
    var stateId: Int?,
    @SerializedName("status")
    var status: String?,
    @SerializedName("store_balance")
    var storeBalance: Int?,
    @SerializedName("store_category_id")
    var storeCategoryId: String?,
    @SerializedName("store_status_id")
    var storeStatusId: Int?,
    @SerializedName("store_type")
    var storeType: String?,
    @SerializedName("store_type_id")
    var storeTypeId: Int?,
    @SerializedName("super_updated_at")
    var superUpdatedAt: String?,
    @SerializedName("tehsil")
    var tehsil: String?,
    @SerializedName("tehsil_id")
    var tehsilId: Int?,
    @SerializedName("thumbnail")
    var thumbnail: String?,
    @SerializedName("verification_status")
    var verificationStatus: String?,
    @SerializedName("verified_by")
    var verifiedBy: String?
) : Parcelable