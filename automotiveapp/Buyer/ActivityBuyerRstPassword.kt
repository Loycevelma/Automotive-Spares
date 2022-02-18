package com.example.automotiveapp.Buyer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.automotiveapp.databinding.ActivityBuyerRstPasswordBinding

class ActivityBuyerRstPassword : AppCompatActivity() {
    lateinit var etCode1: EditText
    lateinit var etNewPassword: EditText
    lateinit var etConfirmNewPassword: EditText
    val MIN_PASSWORD_LENGTH = 6;
    lateinit var binding: ActivityBuyerRstPasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBuyerRstPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvSubmitPassword.setOnClickListener {
          val  intent = Intent(baseContext, ActivityBuyerDeliveryMethod::class.java)
            startActivity(intent)
        }
        viewInitializations()

    }

        fun viewInitializations() {
            val EnterCode = binding.etCode1.text.toString()
            val NewPassword = binding.etNewPassword.text.toString()
            val ConfirmNewPassword = binding.etConfirmNewPassword.text.toString()


            // To show back button in actionbar
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
        }

        // Checking if the input in form is valid
        fun validateInput(): Boolean {
            if (etCode1.text.toString().equals("")) {
                etCode1.setError("Please Enter Code")
                return false
            }

            if (etNewPassword.text.toString().equals("")) {
                etNewPassword.setError("Please Enter Password")
                return false
            }
            if (etConfirmNewPassword.text.toString().equals("")) {
                etConfirmNewPassword.setError("Please Confirm Password")
                return false
            }


            // checking minimum password Length
            if (etNewPassword.text.length < MIN_PASSWORD_LENGTH) {
                etNewPassword.setError("Password Length must be more than " + MIN_PASSWORD_LENGTH + "characters")
                return false
            }

            // Checking if repeat password is same
            if (!etNewPassword.text.toString().equals(etConfirmNewPassword.text.toString())) {
                etConfirmNewPassword.setError("Password does not match")
                return false
            }
            return true
        }


        // Hook Click Event

        fun performResetPassword(view: View) {
            if (validateInput()) {

                // Input is valid, here send data to your server

                val etCode = etCode1.text.toString()
                val password = etNewPassword.text.toString()
                val repeatPassword = etConfirmNewPassword.text.toString()

                Toast.makeText(this, "Password Reset Successfully", Toast.LENGTH_SHORT).show()

            }
        }
    }
