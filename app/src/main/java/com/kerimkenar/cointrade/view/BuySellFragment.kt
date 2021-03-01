package com.kerimkenar.cointrade.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager

import com.kerimkenar.cointrade.R
import com.kerimkenar.cointrade.adapter.BtcAdapter
import com.kerimkenar.cointrade.viewmodel.BuySellViewModel
import kotlinx.android.synthetic.main.fragment_buy_sell.*

class BuySellFragment : Fragment() {
    private lateinit var viewModel : BuySellViewModel
    private  val btcAdapter = BtcAdapter(arrayListOf())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_buy_sell, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel =  ViewModelProviders.of(this).get(BuySellViewModel::class.java)
        viewModel.refreshData()

        btcDetailList.layoutManager = LinearLayoutManager(context)
        btcDetailList.adapter = btcAdapter
        observeLiveData()
    }

    fun observeLiveData(){
        viewModel.btcNow.observe(viewLifecycleOwner, Observer {datas ->
            datas?.let{
                btcDetailList.visibility = View.VISIBLE
                btcAdapter.updateDataList(datas)
            }
        })
    }

}