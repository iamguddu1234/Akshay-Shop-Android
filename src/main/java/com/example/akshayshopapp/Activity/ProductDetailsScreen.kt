package com.example.akshayshopapp.Activity

import android.content.Intent
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

        // Fetch product details from intent
        val id = intent.getIntExtra("id", -1)
        val title = intent.getStringExtra("title")
        val price = intent.getStringExtra("price")
        val category = intent.getStringExtra("category")
        val description = intent.getStringExtra("description")
        val imageUrl = intent.getStringExtra("image")

        // Populate views with product data
        binding.apply {
            this.title.text = title
            this.price.text = price
            this.category.text = category
            this.description.text = description

            Glide.with(this@ProductDetailsScreen)
                .load(imageUrl)
                .into(image)
        }

        // Add to cart
        binding.bBuyNow.setOnClickListener {
            val intent = Intent(this, AddToCartScreen::class.java).apply {
                putExtra("id", id)
                putExtra("title", title)
                putExtra("price", price)
                putExtra("category", category)
                putExtra("description", description)
                putExtra("image", imageUrl)
            }
            startActivity(intent)
        }


    }
}