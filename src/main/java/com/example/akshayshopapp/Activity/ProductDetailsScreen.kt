package com.example.akshayshopapp.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.akshayshopapp.R
import com.example.akshayshopapp.databinding.ActivityProductDetailsScreenBinding

class ProductDetailsScreen : AppCompatActivity() {

    private lateinit var binding: ActivityProductDetailsScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_product_details_screen)

        binding = ActivityProductDetailsScreenBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.apply {
            title.text = intent.getStringExtra("title")
            price.text = intent.getStringExtra("price")
            category.text = intent.getStringExtra("category")
            description.text = intent.getStringExtra("description")
            val imageUrl = intent.getStringExtra("image")

            Glide.with(this@ProductDetailsScreen)
                .load(imageUrl)
                .into(image)


        }
    }
}