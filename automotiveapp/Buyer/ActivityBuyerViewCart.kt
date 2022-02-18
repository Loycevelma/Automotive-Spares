package com.example.automotiveapp.Buyer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.automotiveapp.databinding.ActivityBuyerViewCartBinding

class ActivityBuyerViewCart : AppCompatActivity() {
    lateinit var binding:ActivityBuyerViewCartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBuyerViewCartBinding.inflate(layoutInflater)
        setContentView(binding.root)

       binding.ivImage1.setOnClickListener {
          val intent= Intent(baseContext,ActivityBuyerSignUp::class.java)
           startActivity(intent)
       }
        binding.ivImage2.setOnClickListener {
          val  intent= Intent(baseContext,ActivityBuyerSignUp::class.java)
            startActivity(intent)
        }
        binding.ivImage3.setOnClickListener {
          val  intent= Intent(baseContext,ActivityBuyerSignUp::class.java)
            startActivity(intent)
        }
    }
}