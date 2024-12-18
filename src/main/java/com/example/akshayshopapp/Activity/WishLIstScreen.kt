package com.example.akshayshopapp.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.GridLayoutManager
import com.example.akshayshopapp.Adapter.ProductListAdapter
import com.example.akshayshopapp.R
import com.example.akshayshopapp.Repository.ProductRepository
import com.example.akshayshopapp.Repository.WishListAdapter
import com.example.akshayshopapp.Retrofit.RetrofitInstance
import com.example.akshayshopapp.ViewModel.ProductViewModel
import com.example.akshayshopapp.dataClass.Product
import com.example.akshayshopapp.databinding.ActivityWishListScreenBinding

class WishLIstScreen : AppCompatActivity() {

    private lateinit var binding: ActivityWishListScreenBinding

    private lateinit var wishListAdapter: WishListAdapter
    private val wishList = mutableListOf<Product>()
    private lateinit var viewModel: ProductViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize binding using the correct method
        binding = ActivityWishListScreenBinding.inflate(layoutInflater)

        // Set the root view using the binding object
        setContentView(binding.root)

        // Initialize the adapter with the wishList and remove click callback
        wishListAdapter = WishListAdapter(wishList)

        // Set up RecyclerView with GridLayoutManager
        binding.wishListRv.layoutManager = GridLayoutManager(this, 2)
        binding.wishListRv.adapter = wishListAdapter

        // Example: Add some initial data to the wishlist (could come from an API, ViewModel, etc.)


        val product = Product(1, "https://example.com/image.jpg", "Product Title", "19.99", "Category", "Description")
        addProductToWishList(product)


    }

    private fun addProductToWishList(product: Product) {
        wishList.add(product) // Add product to the wishlist
        wishListAdapter.updateWishList(wishList) // Notify the adapter
    }

}