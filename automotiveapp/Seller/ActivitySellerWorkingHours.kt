package com.example.automotiveapp.Seller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.automotiveapp.databinding.ActivitySellerWorkingHoursBinding

class ActivitySellerWorkingHours : AppCompatActivity() {
    lateinit var binding:ActivitySellerWorkingHoursBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySellerWorkingHoursBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
          val  intent= Intent(baseContext,ActivityPendingOrders::class.java)
            startActivity(intent)
        }
    }
}