package com.example.dolphin.core.ui.prespentation_layer.adapter

import android.content.Context
import android.os.Build
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.example.dolphin.core.ui.data_layer.model.orderdetail.productdetail.ProductDetail
import com.example.dolphin.databinding.OrderDetailItemBinding

class OrderDetailAdapter(
    private val context: Context,
    private var dataList: ArrayList<ProductDetail>,
) :
    RecyclerView.Adapter<OrderDetailAdapter.BindViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BindViewHolder {
        val rootView =
            OrderDetailItemBinding.inflate(LayoutInflater.from(context), parent, false)

        return BindViewHolder(rootView)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onBindViewHolder(viewHolder: BindViewHolder, position: Int) {
        val item = dataList[position]


        viewHolder.itemBinding.itemName.text = item.itemName
        viewHolder.itemBinding.itemWeight.text = item.itemWeight
        viewHolder.itemBinding.itemCost.text = item.itemCost
        viewHolder.itemBinding.itemQty.text = item.itemQuantity
        viewHolder.itemBinding.itemSubtotal.text = item.itemSubTotal
    }


    class BindViewHolder(val itemBinding: OrderDetailItemBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
    }

}