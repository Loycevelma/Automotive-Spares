package com.example.automotiveapp.Buyer

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.app.ActivityCompat
import com.example.automotiveapp.databinding.ActivityBuyerLocationBinding

class ActivityBuyerLocation : AppCompatActivity() {
    lateinit var binding: ActivityBuyerLocationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBuyerLocationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAllow.setOnClickListener {
           val intent = Intent(this, ActivityPaymentMethod::class.java)
            startActivity(intent)
        }

        binding.btnDeny.setOnClickListener {
            val intent = Intent(this, ActivityBuyerDeliveryMethod::class.java)
            startActivity(intent)
        }
    }
}
//        requestLocationPermission()
//
//        fun onClick(v: View?) {
//            requestLocationPermission()
//        }
//
//    }
//    private fun requestLocationPermission() {
//        val foreground = ActivityCompat.checkSelfPermission(
//            this,
//            Manifest.permission.ACCESS_COARSE_LOCATION
//        ) == PackageManager.PERMISSION_GRANTED
//        if (foreground) {
//            val background = ActivityCompat.checkSelfPermission(
//                this,
//                Manifest.permission.ACCESS_BACKGROUND_LOCATION
//            ) == PackageManager.PERMISSION_GRANTED
//            if (background) {
//                handleLocationUpdates()
//            } else {
//                ActivityCompat.requestPermissions(
//                    this,
//                    arrayOf(Manifest.permission.ACCESS_BACKGROUND_LOCATION),
//                    REQUEST_CODE_PERMISSIONS
//                )
//            }
//        } else {
//            ActivityCompat.requestPermissions(
//                this, arrayOf(
//                    Manifest.permission.ACCESS_COARSE_LOCATION,
//                    Manifest.permission.ACCESS_BACKGROUND_LOCATION
//                ), REQUEST_CODE_PERMISSIONS
//            )
//        }
//    }
//
//    override fun onRequestPermissionsResult(
//        requestCode: Int,
//        permissions: Array<String>,
//        grantResults: IntArray
//    ) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
//        if (requestCode == REQUEST_CODE_PERMISSIONS) {
//            var foreground = true
//            var background = true
//            for (i in permissions.indices) {
//                if (permissions[i].equals(
//                        Manifest.permission.ACCESS_COARSE_LOCATION,
//                        ignoreCase = true
//                    )
//
//                ) {
//                    //foreground permission allowed
//                    if (grantResults[i] >= 0) {
//                        foreground = true
//                        startActivity(Intent(baseContext, ActivityPaymentMethod::class.java))
//
//                    } else {
//                        Toast.makeText(
//                            applicationContext,
//                            "Location Permission denied",
//                            Toast.LENGTH_SHORT
//                        ).show()
//
//                    }
//                }
//                if (permissions[i].equals(
//                        Manifest.permission.ACCESS_BACKGROUND_LOCATION,
//                        ignoreCase = true
//                    )
//                ) {
//                    if (grantResults[i] >= 0) {
//                        foreground = true
//                        background = true
////                        startActivity(Intent(baseContext, CustomerCheckout::class.java))
//
//                    } else {
//                        Toast.makeText(
//                            applicationContext,
//                            " location permission allowed",
//                            Toast.LENGTH_SHORT
//                        ).show()
//                    }
//                }
//            }
//            if (foreground) {
//                if (background) {
//                    handleLocationUpdates()
//                } else {
//                    handleForegroundLocationUpdates()
//                }
//            }
//        }
//    }
//
//    private fun handleLocationUpdates() {
//        //foreground and background
//        Toast.makeText(
//            applicationContext,
//            "Start Foreground and Background Location Updates",
//            Toast.LENGTH_SHORT
//        ).show()
//    }
//
//    private fun handleForegroundLocationUpdates() {
//        //handleForeground Location Updates
//        Toast.makeText(
//            applicationContext,
//            "Start foreground location updates",
//            Toast.LENGTH_SHORT
//        ).show()
//    }
//
//    companion object {
//        const val REQUEST_CODE_PERMISSIONS = 101
//    }







