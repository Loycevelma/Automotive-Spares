package com.example.automotiveapp.Buyer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.automotiveapp.databinding.ActivityBuyerDeliveryMethodBinding

class ActivityBuyerDeliveryMethod : AppCompatActivity() {
    lateinit var binding:ActivityBuyerDeliveryMethodBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBuyerDeliveryMethodBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.chDelivery.setOnClickListener {
          val  intent= Intent(baseContext,ActivityBuyerLocation::class.java)
            startActivity(intent)
        }
        binding.chPickup.setOnClickListener {
          val  intent= Intent(baseContext,ActivityPaymentMethod::class.java)
            startActivity(intent)
        }
    }
}