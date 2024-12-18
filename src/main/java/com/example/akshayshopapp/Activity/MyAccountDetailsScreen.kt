package com.example.akshayshopapp.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.akshayshopapp.R
import com.example.akshayshopapp.databinding.ActivityMyAccountDetailsScreenBinding

class MyAccountDetailsScreen : AppCompatActivity() {

    private lateinit var binding: ActivityMyAccountDetailsScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_my_account_details_screen)

        binding = ActivityMyAccountDetailsScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}