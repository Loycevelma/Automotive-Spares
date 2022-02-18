package com.example.automotiveapp.Buyer

import com.example.automotiveapp.Seller.ActivitySellerSignUp
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.automotiveapp.databinding.ActivityBuyerStartBinding

class BuyerStartActivity : AppCompatActivity() {
    lateinit var binding: ActivityBuyerStartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBuyerStartBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.checkBoxSeller.setOnClickListener {
            val intent = Intent(baseContext, ActivitySellerSignUp::class.java)
            startActivity(intent)
        }
        binding.chBuyer.setOnClickListener {
            val intent=Intent(baseContext, ActivityCategories::class.java)
            startActivity(intent)
        }

    }

}