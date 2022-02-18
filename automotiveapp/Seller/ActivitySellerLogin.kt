package com.example.automotiveapp.Seller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.automotiveapp.ActivitySellerLocation
import com.example.automotiveapp.databinding.ActivitySellerLoginBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.ktx.Firebase
import com.google.firebase.ktx.initialize

class ActivitySellerLogin : AppCompatActivity() {
//    private lateinit var auth: FirebaseAuth
//    lateinit var firebaseUser: FirebaseUser
    lateinit var binding: ActivitySellerLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySellerLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        Firebase.initialize(this)
//        auth = FirebaseAuth.getInstance()

        binding.btnLogin.setOnClickListener {
           val intent=Intent(baseContext,ActivitySellerLocation::class.java)
            startActivity(intent)
        }
        binding.tvResetPassword.setOnClickListener {
         val   intent=Intent(baseContext,ActivitySellerResetPassword::class.java)
            startActivity(intent)
        }
        binding.tvRegister.setOnClickListener {
          val  intent=Intent(baseContext,ActivitySellerSignUp::class.java)
            startActivity(intent)
        }
//        binding.btnLogin.setOnClickListener {
//            val email = binding.etEnterEmail.text.toString()
//            val password = binding.etPassword.text.toString()
//
//            if (email.isEmpty()) {
//                Toast.makeText(this, "Email can't be empty", Toast.LENGTH_LONG).show()
//                return@setOnClickListener
//            }
//
//            if (password.isEmpty()) {
//                Toast.makeText(this, "Password can't be empty", Toast.LENGTH_LONG).show()
//                return@setOnClickListener
//            }
//
//            // signin with firebase
//            fun createUser(email:String,password:String){
//                auth.createUserWithEmailAndPassword(email,password)
//                    .addOnCompleteListener(this) { task ->
//                        if (task.isSuccessful) {
//                            Log.e("Task Message","Task is successful")
//
//
//
//                        }
//                        else{
//                            Log.e("Task Message","Failed"+task.exception)
//                        }
//
//
//                    }
//            }
//        }
//    }
//    private fun sendEmailVerification() {
//        firebaseUser.let {
//            it.sendEmailVerification().addOnCompleteListener { task ->
//                if (task.isSuccessful) {
//                    Toast.makeText(this,"Email has been Sent to "+firebaseUser.email, Toast.LENGTH_SHORT).show()
//                }
//            }
//        }
//    }
//
//    override fun onStart() {
//        super.onStart()
//        val user: FirebaseUser? = auth.currentUser
//        user?.let {
//            val intent = Intent(baseContext, ActivitySellerLocation::class.java)
//            startActivity(intent)
//        }

    }
}