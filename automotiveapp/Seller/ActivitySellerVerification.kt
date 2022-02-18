package com.example.automotiveapp.Seller

import android.content.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.automotiveapp.databinding.ActivitySellerVerificationBinding

class ActivitySellerVerification : AppCompatActivity() {
    lateinit var binding: ActivitySellerVerificationBinding
//    private val CREDENTIAL_PICKER_REQUEST = 1
//    private val SMS_CONSENT_REQUEST = 2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySellerVerificationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnverify.setOnClickListener {
           val intent = Intent(baseContext, ActivitySellerLogin::class.java)
            startActivity(intent)
        }
    }
}

//        fun requestHint() {
//            val hintRequest = HintRequest.Builder()
//                .setPhoneNumberIdentifierSupported(true)
//                .build()
//            val credentialsClient = Credentials.getClient(this)
//            val intent = credentialsClient.getHintPickerIntent(hintRequest)
//            startIntentSenderForResult(
//                intent.intentSender,
//                CREDENTIAL_PICKER_REQUEST,
//                null, 0, 0, 0
//            )
//        }
//
//
//            }
//        }
//
//        val task =
//            SmsRetriever.getClient(context).startSmsUserConsent("0706387923" )
//        private val SMS_CONSENT_REQUEST = 2  // Set to an unused request code
//        private val smsVerificationReceiver = object : BroadcastReceiver() {
//            override fun onReceive(context: Context, intent: Intent) {
//                if (SmsRetriever.SMS_RETRIEVED_ACTION == intent.action) {
//                    val extras = intent.extras
//                    val smsRetrieverStatus = extras?.get(SmsRetriever.EXTRA_STATUS) as Status
//
//                    when (smsRetrieverStatus.statusCode) {
//                        CommonStatusCodes.SUCCESS -> {
//                            // Get consent intent
//                            val consentIntent =
//                                extras.getParcelable<Intent>(SmsRetriever.EXTRA_CONSENT_INTENT)
//                            try {
//                                // Start activity to show consent dialog to user, activity must be started in
//                                // 5 minutes, otherwise you'll receive another TIMEOUT intent
//                            } catch (e: ActivityNotFoundException) {
//                                // Handle the exception ...
//                            }
//                        }
//                        CommonStatusCodes.TIMEOUT -> {
//                            // Time out occurred, handle the error.
//                        }
//                    }
//                }
//            }
//        }
//
//        fun onCreate(savedInstanceState: Bundle?) {
//            val intentFilter = IntentFilter(SmsRetriever.SMS_RETRIEVED_ACTION)
//            registerReceiver(smsVerificationReceiver, SmsRetriever.SEND_PERMISSION, intentFilter)
//
//        }
//
//        fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//           onActivityResult(requestCode, resultCode, data)
//            when (requestCode) {
//                // ...
//                SMS_CONSENT_REQUEST ->
//                    if (resultCode == Activity.RESULT_OK && data != null) {
//                        val message = data.getStringExtra(SmsRetriever.EXTRA_SMS_MESSAGE)
//
//                        val oneTimeCode = parseOneTimeCode(message) // define this function
//
//                    }
//            }
//        }
//
