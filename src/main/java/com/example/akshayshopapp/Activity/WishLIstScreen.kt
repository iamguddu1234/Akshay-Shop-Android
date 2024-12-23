package com.example.akshayshopapp.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.akshayshopapp.R
import com.example.akshayshopapp.Repository.ProductRepository
import com.example.akshayshopapp.Repository.WishListAdapter
import com.example.akshayshopapp.Retrofit.RetrofitInstance
import com.example.akshayshopapp.Room.WishlistViewModel
import com.example.akshayshopapp.ViewModel.ProductViewModel
import com.example.akshayshopapp.dataClass.Product
import com.example.akshayshopapp.databinding.ActivityWishListScreenBinding
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class WishLIstScreen : AppCompatActivity() {

    private lateinit var binding: ActivityWishListScreenBinding
    private lateinit var wishListAdapter: WishListAdapter


    private lateinit var wishlistViewModel: WishlistViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize binding
        binding = ActivityWishListScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        wishlistViewModel = ViewModelProvider(this).get(WishlistViewModel::class.java)



        val id = intent.getIntExtra("id", -1)
        val title = intent.getStringExtra("title")
        val price = intent.getStringExtra("price")
        val category = intent.getStringExtra("category")
        val description = intent.getStringExtra("category")
        val image = intent.getStringExtra("image")
        Log.d("AddToCartScreen", "Product Data - id: $id, title: $title, price: $price, category: $category, description: $description, image: $image")


        //add product to the cart list

        // Add product to the cart list
        if (id != -1 && title != null && price != null && category != null && description != null && image != null) {
            val product = Product(id, title, price, category, description, image)
            Log.d("AddToCartScreen", "Adding product to cart: $product")
            wishlistViewModel.insertWishlist(product)
        }

        wishListAdapter = WishListAdapter(mutableListOf(), wishlistViewModel)


        binding.wishListRv.apply {
            layoutManager = LinearLayoutManager(this@WishLIstScreen)
            adapter = wishListAdapter
        }

        wishlistViewModel.allWishListProduct.observe(this, Observer { products ->
            wishListAdapter.setWishListProduct(products)
        })


    }


}