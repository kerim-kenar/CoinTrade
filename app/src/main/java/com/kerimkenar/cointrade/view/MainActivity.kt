package com.kerimkenar.cointrade.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.kerimkenar.cointrade.R
import com.kerimkenar.cointrade.databinding.ActivityMainBinding
import np.com.susanthapa.curved_bottom_navigation.CbnMenuItem

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navController = findNavController(R.id.nav_host_fragment)
        val appBarConfiguration = AppBarConfiguration(
            setOf(R.id.marketsFragment, R.id.assetsFragment, R.id.buySellFragment, R.id.depositCheckFragment, R.id.accountFragment)
        )
        val menuItems = arrayOf(CbnMenuItem(R.drawable.ic_markets, R.drawable.avd_markets, R.id.marketsFragment),
            CbnMenuItem(R.drawable.ic_assets, R.drawable.avd_assets, R.id.assetsFragment),
            CbnMenuItem(R.drawable.ic_buysell, R.drawable.avd_buysell, R.id.buySellFragment),
            CbnMenuItem(R.drawable.ic_checkdeposit, R.drawable.avd_checkdeposit, R.id.depositCheckFragment),
            CbnMenuItem(R.drawable.ic_account, R.drawable.avd_account, R.id.accountFragment)
        )
        binding.navView.setMenuItems(menuItems,2)
        binding.navView.setupWithNavController(navController)
    }
}