package com.kerimkenar.cointrade.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kerimkenar.cointrade.model.BtcModels

class BuySellViewModel: ViewModel() {
    val btcNow = MutableLiveData<List<BtcModels>>()

    fun refreshData(){
        val btcdata = BtcModels(0.01432196,245.549,0.01432196,245.549)
        val btcdata1 = BtcModels(0.01432196,245.549,0.01432196,245.549)
        val btcdata2 = BtcModels(0.01432196,245.549,0.01432196,245.549)
        val btcdata3 = BtcModels(0.01432196,245.549,0.01432196,245.549)
        val btcdata4 = BtcModels(0.01432196,245.549,0.01432196,245.549)
        val btcdata5 = BtcModels(0.01432196,245.549,0.01432196,245.549)
        val btcdata6 = BtcModels(0.01432196,245.549,0.01432196,245.549)
        val btcdata7 = BtcModels(0.01432196,245.549,0.01432196,245.549)
        val btcdata8 = BtcModels(0.01432196,245.549,0.01432196,245.549)
        val btcDataList = arrayListOf<BtcModels>(btcdata,btcdata1,btcdata2,btcdata3,btcdata4,btcdata5,btcdata6,btcdata7,btcdata8)
        btcNow.value = btcDataList
    }
}