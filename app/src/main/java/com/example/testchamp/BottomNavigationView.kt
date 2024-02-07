package com.example.testchamp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.testchamp.databinding.BottomNavigationViewBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class BottomNavigationView : AppCompatActivity() {
    private lateinit var binding: BottomNavigationViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        super.onCreate(savedInstanceState)
        binding = BottomNavigationViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment_activity_main) as NavHostFragment

        val navController = navHostFragment.navController

        findViewById<BottomNavigationView>(R.id.navigation_view)
            .setupWithNavController(navController)
    }
}