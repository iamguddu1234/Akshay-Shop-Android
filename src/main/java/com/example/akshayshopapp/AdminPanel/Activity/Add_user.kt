package com.example.akshayshopapp.AdminPanel.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.akshayshopapp.AdminPanel.Repository.AdminRepository
import com.example.akshayshopapp.AdminPanel.ViewModel.AdminViewModel
import com.example.akshayshopapp.R
import com.example.akshayshopapp.Retrofit.RetrofitInstance
import com.example.akshayshopapp.dataClass.Address
import com.example.akshayshopapp.dataClass.Geolocation
import com.example.akshayshopapp.dataClass.Name
import com.example.akshayshopapp.dataClass.User
import com.example.akshayshopapp.databinding.ActivityAddUserBinding

class Add_user : AppCompatActivity() {

    private lateinit var binding: ActivityAddUserBinding

    private lateinit var viewModel: AdminViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_add_user)

        binding = ActivityAddUserBinding.inflate(layoutInflater)

        setContentView(binding.root)


        val repository = AdminRepository(RetrofitInstance.api)
        viewModel = AdminViewModel(repository)

        binding.userADD.setOnClickListener {

            val email = binding.email.text.toString()
            val number = binding.no.text.toString()
            val firstname = binding.name.text.toString()
            val lastname = binding.email.text.toString()
            val username = binding.username.text.toString()
            val password = binding.password.text.toString()
            val city = binding.city.text.toString()
            val street = binding.street.text.toString()
            val phone = binding.mobileNu.text.toString()
            val zipcode = binding.zipcode.text.toString()
            val lat = binding.lattitude.text.toString().toDoubleOrNull() ?: 0.0
            val long = binding.longitude.text.toString().toDoubleOrNull() ?: 0.0

            val user = User(
                id =  0,
                email = email,
                username = username,
                password = password,
                name = Name(firstname = firstname, lastname = lastname),
                address = Address(
                    city = city, street = street, number = number, zipcode = zipcode,
                    geolocation = Geolocation(lat = lat, long = long),
                ),
                phone = phone


            )

            viewModel.addUser(user)

            viewModel.userAdmin.observe(this) { addUser ->
                Toast.makeText(this, "User add Successfully", Toast.LENGTH_LONG).show()
            }


        }

    }
}