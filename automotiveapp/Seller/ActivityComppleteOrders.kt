package com.example.automotiveapp.Seller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.automotiveapp.databinding.ActivityComppleteOrdersBinding

class ActivityComppleteOrders : AppCompatActivity() {
    lateinit var binding:ActivityComppleteOrdersBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityComppleteOrdersBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNext.setOnClickListener {
          val  intent= Intent(baseContext,ActivityUpdateProducts::class.java)
            startActivity(intent)
        }
    }
}