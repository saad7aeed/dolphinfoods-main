package com.example.dolphin.core.ui.prespentation_layer

import android.app.Dialog
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dolphin.R
import com.example.dolphin.core.ui.data_layer.model.orderdetail.productdetail.ProductDetail
import com.example.dolphin.core.ui.prespentation_layer.adapter.OrderDetailAdapter
import com.example.dolphin.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import dolphinLoaderDialog
import kotlinx.coroutines.flow.collectLatest

@AndroidEntryPoint
class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    private val listingViewModel: DolphinViewModel by viewModels()
    private lateinit var oderDetailAdapter: OrderDetailAdapter
    open lateinit var loaderDialog: Dialog
    private var productDetailList = ArrayList<ProductDetail>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        window.statusBarColor = ContextCompat.getColor(this, R.color.air_red_dark)
        listingViewModel.getOrderDetail()
        loaderDialog = dolphinLoaderDialog()
        binding.swipeRefreshLayout.setOnRefreshListener {
            listingViewModel.getOrderDetail()
        }
        setObservers()
    }

    private fun setObservers() {
        lifecycleScope.launchWhenStarted {
            listingViewModel.orderDetail.collectLatest {
                if (it.isLoading) {
                    showLoader()
                    binding.swipeRefreshLayout.isRefreshing = false
                }
                if (it.error.isNotBlank()) {
                    hideLoader()
                    binding.swipeRefreshLayout.isRefreshing = false
                    Toast.makeText(this@MainActivity, it.error, Toast.LENGTH_LONG).show()
                }
                it.data?.let {
                    hideLoader()
                    binding.swipeRefreshLayout.isRefreshing = false
                    Log.wtf("OrderDetails", it.data.toString())
                    productDetailList.clear()
                    for (obj in it.data?.items!!) {
                        productDetailList.add(
                            ProductDetail(
                                obj.product?.name,
                                obj.product?.productWeight,
                                obj.product?.finalPrice.toString(),
                                obj.qty.toString(),
                                calAmount(obj.product?.finalPrice, obj.qty)
                            )
                        )
                    }
                    //SettingUp Data
                    //Retailer Detail
                    binding.orderNo.text = it.data!!.store?.id.toString() ?: "N/A"
                    binding.retailerName.text = it.data!!.store?.name ?: "N/A"
                    binding.retailerNumber.text = it.data!!.store?.phone ?: "N/A"
                    binding.retailerAddress.text = it.data!!.store?.address ?: "N/A"
                    //Salesman Detail
                    binding.date.text = it.data!!.date ?: "N/A"
                    binding.status.text = it.data!!.orderStatus ?: "N/A"
                    binding.assignedName.text = it.data!!.orderPerson ?: "N/A"
                    binding.totalOrderPrice.text = calGrossTotal(productDetailList)
                    binding.payablePrice.text = calGrossTotal(productDetailList)
                    setUpRV()
                }
            }

        }
    }

    private fun calGrossTotal(productDetailList: ArrayList<ProductDetail>): String? {
        var totalValue = 0
        for (obj in productDetailList) {
            totalValue += obj.itemSubTotal?.toInt()!!
        }
        return totalValue.toString() ?: "N/A"
    }

    private fun calAmount(finalPrice: Int?, qty: Int?): String? {
        return if (finalPrice != null && qty != null) {
            (finalPrice * qty).toString()
        } else {
            "N/A"
        }
    }

    private fun setUpRV() {
        binding.orderDetailRev.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        oderDetailAdapter =
            OrderDetailAdapter(this, productDetailList)
        binding.orderDetailRev.adapter = oderDetailAdapter

    }

    override fun onClick(v: View?) {
        when (v) {

        }
    }

    fun showLoader() {
        binding.progressBar.visibility = View.VISIBLE
    }

    fun hideLoader() {
        binding.progressBar.visibility = View.GONE
    }

}