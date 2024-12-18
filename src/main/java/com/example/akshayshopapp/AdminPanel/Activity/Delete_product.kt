package com.example.akshayshopapp.AdminPanel.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.akshayshopapp.AdminPanel.Repository.AdminRepository
import com.example.akshayshopapp.AdminPanel.ViewModel.AdminViewModel
import com.example.akshayshopapp.R
import com.example.akshayshopapp.Retrofit.RetrofitInstance
import com.example.akshayshopapp.databinding.ActivityDeleteProductBinding

class Delete_product : AppCompatActivity() {

    private lateinit var binding: ActivityDeleteProductBinding

    private lateinit var viewModel: AdminViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_delete_product)

        binding = ActivityDeleteProductBinding.inflate(layoutInflater)

        setContentView(binding.root)


        val repository = AdminRepository(RetrofitInstance.api)
        viewModel = AdminViewModel(repository)

        binding.deleteProduct.setOnClickListener {
            val id = binding.edId.text.toString().toInt()


            viewModel.deleteProduct(id)

        }

    }
}