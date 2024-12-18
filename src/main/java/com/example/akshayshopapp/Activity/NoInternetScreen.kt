package com.example.akshayshopapp.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.akshayshopapp.R
import com.example.akshayshopapp.databinding.ActivityNoInternetScreenBinding

class NoInternetScreen : AppCompatActivity() {

    private lateinit var binding: ActivityNoInternetScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_no_internet_screen)

        binding = ActivityNoInternetScreenBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}