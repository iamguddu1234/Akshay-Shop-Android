package com.example.akshayshopapp.AdminPanel.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.akshayshopapp.AdminPanel.Repository.AdminRepository
import com.example.akshayshopapp.AdminPanel.ViewModel.AdminViewModel
import com.example.akshayshopapp.R
import com.example.akshayshopapp.Retrofit.RetrofitInstance
import com.example.akshayshopapp.databinding.ActivityDeleteUserBinding

class DeleteUser : AppCompatActivity() {

    private lateinit var binding: ActivityDeleteUserBinding

    private lateinit var viewModel: AdminViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_delete_user)

        binding = ActivityDeleteUserBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val repository = AdminRepository(RetrofitInstance.api)
        viewModel = AdminViewModel(repository)


        binding.userDELETE.setOnClickListener {
            val id = binding.edId.text.toString().toInt()

            viewModel.deleteUser(id)
        }
    }
}