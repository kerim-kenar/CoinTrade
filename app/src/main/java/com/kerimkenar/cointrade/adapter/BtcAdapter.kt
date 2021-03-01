package com.kerimkenar.cointrade.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kerimkenar.cointrade.R
import com.kerimkenar.cointrade.model.BtcModels
import kotlinx.android.synthetic.main.btc_data_layout.view.*

class BtcAdapter (val dataList:ArrayList<BtcModels>):RecyclerView.Adapter<BtcAdapter.BtcViewHolder>() {

    class BtcViewHolder(var view: View) : RecyclerView.ViewHolder(view) {

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BtcViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.btc_data_layout,parent,false)
        return BtcViewHolder(view)
    }

    override fun getItemCount(): Int {
       return dataList.size
    }

    override fun onBindViewHolder(holder: BtcViewHolder, position: Int) {
        if(position%2 == 0){
            holder.view.buyLinearLayout.setBackgroundColor(Color.parseColor("#0f131e"))
            holder.view.sellLinearLayout.setBackgroundColor(Color.parseColor("#0f131e"))
        }else{
            holder.view.buyLinearLayout.setBackgroundColor(Color.parseColor("#1e222d"))
            holder.view.sellLinearLayout.setBackgroundColor(Color.parseColor("#1e222d"))
        }
        holder.view.buyPieceTextView.text = dataList[position].buyPiece.toString()
        holder.view.buyPriceTextView.text = dataList[position].buyPrice.toString()
        holder.view.sellPieceTextView.text = dataList[position].sellPiece.toString()
        holder.view.sellPriceTextView.text = dataList[position].sellPrice.toString()

    }

    fun updateDataList(newDataList: List<BtcModels>){
        dataList.clear()
        dataList.addAll(newDataList)
        notifyDataSetChanged()
    }

}