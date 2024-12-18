package com.example.akshayshopapp.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.GridLayoutManager
import com.example.akshayshopapp.Adapter.CategoryAdapter
import com.example.akshayshopapp.Adapter.ProductListAdapter
import com.example.akshayshopapp.R
import com.example.akshayshopapp.Repository.ProductRepository
import com.example.akshayshopapp.Retrofit.RetrofitInstance
import com.example.akshayshopapp.ViewModel.ProductViewModel
import com.example.akshayshopapp.databinding.ActivityCategoryScreenBinding

class CategoryScreen : AppCompatActivity() {

    private lateinit var binding: ActivityCategoryScreenBinding

    private lateinit var viewModel: ProductViewModel
    private lateinit var productListAdapter: ProductListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_category_screen)

        binding = ActivityCategoryScreenBinding.inflate(layoutInflater)

        setContentView(binding.root)


        val selectCategory = intent.getStringExtra("category") ?: return


//        binding.categoriesRV.layoutManager = GridLayoutManager(this, 2)
//        productListAdapter = ProductListAdapter(listOf()) { product ->
//
//            val intent = Intent(this, ProductDetailsScreen::class.java).apply {
//                putExtra("id", product.id)
//                putExtra("image", product.image)
//                putExtra("title", product.title)
//                putExtra("price", product.price)
//                putExtra("category", product.category)
//                putExtra("description", product.description)
//            }
//            startActivity(intent)
//
//        }






        binding.categoriesRV.adapter = productListAdapter

        val repository = ProductRepository(RetrofitInstance.api)
        viewModel = ProductViewModel(repository)

        viewModel.productLiveData.observe(this) { products ->
            productListAdapter.updateProductList(products)
            // Log.d("Category Screen","data get ${products}")
        }

        viewModel.getProductByCategory(selectCategory)


    }
}