package com.example.dolphin.core.ui.data_layer.model.orderdetail


import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class PendingCredit(
    @SerializedName("credit_amount")
    var creditAmount: String?,
    @SerializedName("credit_type")
    var creditType: String?,
    @SerializedName("credit_update_request")
    var creditUpdateRequest: String?,
    @SerializedName("date")
    var date: String?,
    @SerializedName("days")
    var days: Int?,
    @SerializedName("expected_pay_date")
    var expectedPayDate: String?,
    @SerializedName("formatted_date")
    var formattedDate: String?,
    @SerializedName("id")
    var id: Int?,
    @SerializedName("note")
    var note: String?,
    @SerializedName("order_id")
    var orderId: Int?,
    @SerializedName("paid_date")
    var paidDate: String?,
    @SerializedName("payments")
    var payments: List<String?>?,
    @SerializedName("process_by")
    var processBy: Int?,
    @SerializedName("reference_person")
    var referencePerson: String?,
    @SerializedName("salesman")
    var salesman: Salesman?,
    @SerializedName("salesman_id")
    var salesmanId: Int?,
    @SerializedName("status")
    var status: String?,
    @SerializedName("status_color")
    var statusColor: String?,
    @SerializedName("store_id")
    var storeId: Int?,
    @SerializedName("total_payment")
    var totalPayment: Int?
) : Parcelable