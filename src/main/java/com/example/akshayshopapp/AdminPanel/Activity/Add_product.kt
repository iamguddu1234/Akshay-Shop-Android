package com.example.akshayshopapp.AdminPanel.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.akshayshopapp.AdminPanel.Repository.AdminRepository
import com.example.akshayshopapp.AdminPanel.ViewModel.AdminViewModel
import com.example.akshayshopapp.R
import com.example.akshayshopapp.Retrofit.RetrofitInstance
import com.example.akshayshopapp.ViewModel.ProductViewModel
import com.example.akshayshopapp.dataClass.Product
import com.example.akshayshopapp.databinding.ActivityAddProductBinding

class Add_product : AppCompatActivity() {

    private lateinit var binding: ActivityAddProductBinding

    private lateinit var viewModel: AdminViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_add_product)
        binding = ActivityAddProductBinding.inflate(layoutInflater)

        setContentView(binding.root)


        val repository = AdminRepository(RetrofitInstance.api)
        viewModel = AdminViewModel(repository)

        binding.addP.setOnClickListener {

            val title = binding.edTitle.text.toString().trim()
            val price = binding.edPrice.text.toString().trim()
            val description = binding.edDescription.text.toString().trim()
            val image = binding.edImageUrl.text.toString().trim()
            val category = binding.edCategory.text.toString().trim()

            val product = Product(
                id = 0,
                title = title,
                price = price,
                description = description,
                image = image,
                category = category
            )
            viewModel.addProduct(product)

            viewModel.adminProductLiveData.observe(this) { product ->
                Toast.makeText(this, "Product Add Successfully", Toast.LENGTH_LONG).show()
            }


        }


    }
}