package com.example.akshayshopapp.AdminPanel.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.akshayshopapp.AdminPanel.Repository.AdminRepository
import com.example.akshayshopapp.AdminPanel.ViewModel.AdminViewModel
import com.example.akshayshopapp.R
import com.example.akshayshopapp.Retrofit.RetrofitInstance
import com.example.akshayshopapp.dataClass.Product
import com.example.akshayshopapp.databinding.ActivityUpdateProductBinding
import com.example.akshayshopapp.databinding.ActivityUpdateUserBinding

class Update_product : AppCompatActivity() {

    private lateinit var binding: ActivityUpdateProductBinding

    private lateinit var viewModel: AdminViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_update_product)

        binding = ActivityUpdateProductBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val repository = AdminRepository(RetrofitInstance.api)
        viewModel = AdminViewModel(repository)

        binding.UpdateP.setOnClickListener {
            val id = binding.edId.text.toString().toInt()
            val title = binding.edTitle.text.toString()
            val price = binding.edPrice.text.toString()
            val description = binding.edDescription.text.toString()
            val image = binding.edImageUrl.text.toString()
            val category = binding.edCategory.text.toString()


            val product = Product(
                id = id,
                title = title,
                price = price,
                description = description,
                image = image,
                category = category
            )

            viewModel.updateProduct(id, product)


        }

        viewModel.adminProductLiveData.observe(this) { update ->
            Toast.makeText(this, "Update product Successfully", Toast.LENGTH_LONG).show()
        }
    }
}