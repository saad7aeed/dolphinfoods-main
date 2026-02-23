package com.example.dolphin.core.ui.data_layer.model.orderdetail


import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class Salesman(
    @SerializedName("address")
    var address: String?,
    @SerializedName("balance_limit")
    var balanceLimit: Int?,
    @SerializedName("code")
    var code: String?,
    @SerializedName("created_at")
    var createdAt: String?,
    @SerializedName("created_by")
    var createdBy: Int?,
    @SerializedName("email")
    var email: String?,
    @SerializedName("email_verified_at")
    var emailVerifiedAt: String?,
    @SerializedName("id")
    var id: Int?,
    @SerializedName("is_active")
    var isActive: Int?,
    @SerializedName("is_admin")
    var isAdmin: Int?,
    @SerializedName("is_locked")
    var isLocked: Int?,
    @SerializedName("is_phone_verified")
    var isPhoneVerified: Int?,
    @SerializedName("is_warehouse_active")
    var isWarehouseActive: Int?,
    @SerializedName("level")
    var level: Int?,
    @SerializedName("name")
    var name: String?,
    @SerializedName("opening_balance")
    var openingBalance: Int?,
    @SerializedName("password")
    var password: String?,
    @SerializedName("phone_no")
    var phoneNo: String?,
    @SerializedName("profile_image")
    var profileImage: String?,
    @SerializedName("profile_image_url")
    var profileImageUrl: String?,
    @SerializedName("punch_time")
    var punchTime: String?,
    @SerializedName("remember_token")
    var rememberToken: String?,
    @SerializedName("role_id")
    var roleId: Int?,
    @SerializedName("spot_punch_time")
    var spotPunchTime: String?,
    @SerializedName("state_area_id")
    var stateAreaId: String?,
    @SerializedName("two_factor_recovery_codes")
    var twoFactorRecoveryCodes: String?,
    @SerializedName("two_factor_secret")
    var twoFactorSecret: String?,
    @SerializedName("updated_at")
    var updatedAt: String?,
    @SerializedName("user_permissions")
    var userPermissions: String?,
    @SerializedName("week")
    var week: Int?
) : Parcelable