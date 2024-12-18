package com.example.akshayshopapp.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.akshayshopapp.R
import com.example.akshayshopapp.databinding.ActivityAddToCartScreenBinding

class AddToCartScreen : AppCompatActivity() {

    private lateinit var binding: ActivityAddToCartScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_add_to_cart_screen)
        binding = ActivityAddToCartScreenBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}