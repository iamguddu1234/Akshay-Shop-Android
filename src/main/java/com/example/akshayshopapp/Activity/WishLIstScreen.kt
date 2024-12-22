package com.example.akshayshopapp.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.akshayshopapp.R
import com.example.akshayshopapp.Repository.ProductRepository
import com.example.akshayshopapp.Repository.WishListAdapter
import com.example.akshayshopapp.Retrofit.RetrofitInstance
import com.example.akshayshopapp.ViewModel.ProductViewModel
import com.example.akshayshopapp.dataClass.Product
import com.example.akshayshopapp.databinding.ActivityWishListScreenBinding
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class WishLIstScreen : AppCompatActivity() {

    private lateinit var binding: ActivityWishListScreenBinding

    private lateinit var wishListAdapter: WishListAdapter
    private var wishList = mutableListOf<Product>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize binding
        binding = ActivityWishListScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Load the wishlist from SharedPreferences
        wishList.addAll(WishlistUtil.getWishlist(this))

        // Initialize RecyclerView
        binding.wishListRv.layoutManager = LinearLayoutManager(this)
        wishListAdapter = WishListAdapter(wishList) { product ->
            // Handle removing item from wishlist
//            wishListAdapter.notifyDataSetChanged()
            removeItemFromWishlist(product)
//                    wishListAdapter.updateWishList(wishList)

        }
        binding.wishListRv.adapter = wishListAdapter
    }




    private fun removeItemFromWishlist(product: Product) {
        // Remove product from wishlist
        wishList.remove(product)

        wishListAdapter.updateWishList(wishList)

        // Notify the adapter to refresh the RecyclerView

        wishListAdapter.notifyDataSetChanged()




        // Save the updated wishlist to SharedPreferences
        WishlistUtil.saveWishlist(this, wishList)
//        wishListAdapter.notifyDataSetChanged()




    }


}