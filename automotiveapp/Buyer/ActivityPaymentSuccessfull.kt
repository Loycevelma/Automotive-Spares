package com.example.automotiveapp.Buyer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.automotiveapp.databinding.ActivityPaymentMethodBinding

class ActivityPaymentSuccessfull : AppCompatActivity() {
    lateinit var binding:ActivityPaymentMethodBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityPaymentMethodBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}