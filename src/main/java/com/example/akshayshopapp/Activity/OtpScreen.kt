package com.example.akshayshopapp.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.akshayshopapp.R
import com.example.akshayshopapp.databinding.ActivityOtpScreenBinding

class OtpScreen : AppCompatActivity() {

    private lateinit var binding: ActivityOtpScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_otp_screen)

        binding = ActivityOtpScreenBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}