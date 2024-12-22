package com.example.akshayshopapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.akshayshopapp.Activity.AddToCartScreen
import com.example.akshayshopapp.Activity.CategoryScreen
import com.example.akshayshopapp.Activity.ProductDetailsScreen
import com.example.akshayshopapp.Activity.WishLIstScreen
import com.example.akshayshopapp.Adapter.CategoryAdapter
import com.example.akshayshopapp.Adapter.ProductListAdapter
import com.example.akshayshopapp.Repository.ProductRepository
import com.example.akshayshopapp.Retrofit.RetrofitInstance
import com.example.akshayshopapp.ViewModel.ProductViewModel
import com.example.akshayshopapp.dataClass.Product
import com.example.akshayshopapp.databinding.ActivityMainBinding
import com.google.gson.Gson

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: ProductViewModel
    private lateinit var productListAdapter: ProductListAdapter
    private lateinit var category_adapter: CategoryAdapter


    private var wishList = mutableListOf<Product>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val repository = ProductRepository(RetrofitInstance.api)
        viewModel = ProductViewModel(repository)



        binding.rvCategory.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        category_adapter = CategoryAdapter(listOf()) { category ->
            val intent = Intent(this, CategoryScreen::class.java).apply {
                putExtra("category", category)

            }
            startActivity(intent)

        }
        binding.rvCategory.adapter = category_adapter

        viewModel.categoryLiveData.observe(this) { category ->
            category_adapter.updateCategoryList(category)
        }

        viewModel.getCategory()


//        binding.rvProduct.layoutManager = GridLayoutManager(this, 2)
//        adapter = ProductListAdapter(listOf()) { product ->
//
//            val intent = Intent(this, ProductDetailsScreen::class.java).apply {
//                putExtra("id", product.id)
//                putExtra("image", product.image).toString()
//                putExtra("title", product.title)
//                putExtra("category", product.category)
//                putExtra("price", product.price)
//                putExtra("description", product.description)
//            }
//            startActivity(intent)
//        }
//        binding.rvProduct.adapter = adapter


        binding.rvProduct.layoutManager = GridLayoutManager(this, 2)
        productListAdapter = ProductListAdapter(listOf(), onFavorite = { favProduct ->
//            val intent = Intent(this, WishLIstScreen::class.java).apply {
//                putExtra("id", favProduct.id)
//                putExtra("image", favProduct.image)
//                putExtra("title", favProduct.title)
//                putExtra("price", favProduct.price)
//                putExtra("category", favProduct.category)
//                putExtra("description", favProduct.description)
            addProductToWishlist(favProduct)
//            }
//            startActivity(intent)
        }, onItemCLicked = { product ->
            val intent = Intent(this, ProductDetailsScreen::class.java).apply {
                putExtra("id", product.id)
                putExtra("image", product.image)
                putExtra("title", product.title)
                putExtra("price", product.price)
                putExtra("category", product.category)
                putExtra("description", product.description)
            }
            startActivity(intent)


        }
        )
        binding.rvProduct.adapter = productListAdapter
        // Pass the wishlist data to the adapter


        viewModel.productLiveData.observe(this) { product ->
            productListAdapter.updateProductList(product)
        }



        viewModel.getAllProduct()



        binding.btnAsc.setOnClickListener {

            viewModel.getProductsByOrder("asc")
        }

        binding.btnDesc.setOnClickListener {
            viewModel.getProductsByOrder("desc")
        }

        binding.search.setOnClickListener {
            val id = binding.edLimit.text.toString().toInt()

            viewModel.getLimitedProduct(id)

        }


        //Search Product Logic
        binding.searchBox.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                productListAdapter.filter(s.toString())
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }
        })


        // Load the wishlist from SharedPreferences
        wishList.addAll(WishlistUtil.getWishlist(this))


        // Setup for the wishlist screen
        binding.wishList.setOnClickListener {
            val intent = Intent(this, WishLIstScreen::class.java)
            startActivity(intent)
        }

        binding.cartList.setOnClickListener {
            val intent = Intent(this, AddToCartScreen::class.java)
            startActivity(intent)
        }


    }


    // Function to add product to the wishlist
    private fun addProductToWishlist(product: Product) {
        // Add the product to wishlist if not already added
        if (!wishList.contains(product)) {
            wishList.add(product)

            // Save the updated wishlist to SharedPreferences
            WishlistUtil.saveWishlist(this, wishList)


            // Notify the user
            Toast.makeText(this, "${product.title} added to wishlist!", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "${product.title} is already in the wishlist!", Toast.LENGTH_SHORT)
                .show()
        }
    }

    @SuppressLint("MissingSuperCall")
    override fun onBackPressed() {

    }
}