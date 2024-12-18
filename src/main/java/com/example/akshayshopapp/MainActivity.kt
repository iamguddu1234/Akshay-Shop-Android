package com.example.akshayshopapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.core.widget.addTextChangedListener
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.akshayshopapp.Activity.CategoryScreen
import com.example.akshayshopapp.Activity.ProductDetailsScreen
import com.example.akshayshopapp.Activity.WishLIstScreen
import com.example.akshayshopapp.Adapter.CategoryAdapter
import com.example.akshayshopapp.Adapter.ProductListAdapter
import com.example.akshayshopapp.Repository.ProductRepository
import com.example.akshayshopapp.Retrofit.RetrofitInstance
import com.example.akshayshopapp.ViewModel.ProductViewModel
import com.example.akshayshopapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: ProductViewModel
    private lateinit var adapter: ProductListAdapter
    private lateinit var category_adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.wishList.setOnClickListener {
            val intent = Intent(this, WishLIstScreen::class.java)
            startActivity(intent)
        }

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
        adapter = ProductListAdapter(listOf(), onFavorite = { favProduct ->
            val intent = Intent(this, WishLIstScreen::class.java).apply {
                putExtra("id", favProduct.id)
                putExtra("image", favProduct.image)
                putExtra("title", favProduct.title)
                putExtra("price", favProduct.price)
                putExtra("category", favProduct.category)
                putExtra("description", favProduct.description)
            }
            startActivity(intent)
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
        binding.rvProduct.adapter = adapter


        viewModel.productLiveData.observe(this) { product ->
            adapter.updateProductList(product)
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
                adapter.filter(s.toString())
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }
        })


    }

    @SuppressLint("MissingSuperCall")
    override fun onBackPressed() {

    }
}