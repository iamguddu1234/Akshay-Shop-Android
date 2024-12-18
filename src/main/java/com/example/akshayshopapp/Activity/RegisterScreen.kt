package com.example.akshayshopapp.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.akshayshopapp.R
import com.example.akshayshopapp.Repository.LoginRepository
import com.example.akshayshopapp.Retrofit.RetrofitInstance
import com.example.akshayshopapp.ViewModel.LoginViewModel
import com.example.akshayshopapp.databinding.ActivityRegisterScreenBinding

class RegisterScreen : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterScreenBinding


    private lateinit var viewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_register_screen)

        binding = ActivityRegisterScreenBinding.inflate(layoutInflater)

        setContentView(binding.root)


        val repository = LoginRepository(RetrofitInstance.api)
        viewModel = LoginViewModel(repository)


        binding.apply {
            val fistName = binding.edName.text.toString()
            val lastname = binding.edLastname.text.toString()
            val email = binding.edEmail.text.toString()
            val phone = binding.edPhone.text.toString()
            val username = binding.edUsername.text.toString()
            val password = binding.edPassword.text.toString()
            val city = binding.edCity.text.toString()
            val street = binding.edStreet.text.toString()
            val zipcode = binding.edZipcode.text.toString()
        }
    }
}