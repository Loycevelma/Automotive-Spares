package com.example.automotiveapp.Seller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.automotiveapp.databinding.ActivityPendingOrdersBinding

class ActivityPendingOrders : AppCompatActivity() {
    lateinit var binding:ActivityPendingOrdersBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityPendingOrdersBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnComplete.setOnClickListener {
           val intent= Intent(baseContext,ActivityComppleteOrders::class.java)
            startActivity(intent)
        }
        binding.btnComplete1.setOnClickListener {
           val intent= Intent(baseContext,ActivityComppleteOrders::class.java)
            startActivity(intent)
        }
    }
}