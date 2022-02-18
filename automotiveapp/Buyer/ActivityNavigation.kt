package com.example.automotiveapp.Buyer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.Navigation
import com.example.automotiveapp.R
import com.example.automotiveapp.databinding.ActivityNavigationBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class ActivityNavigation : AppCompatActivity() {
    lateinit var binding: ActivityNavigationBinding
    lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityNavigationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupViews()

    }
    fun setupViews() {
        val bottomNavView : BottomNavigationView = binding.bottomNavView;
        navController = Navigation.findNavController(this@ActivityNavigation, R.id.fragNavHost)
        NavigationUI.setupWithNavController(bottomNavView, navController)

    }

}