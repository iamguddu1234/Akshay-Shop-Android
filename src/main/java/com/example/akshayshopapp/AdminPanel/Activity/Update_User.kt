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
import com.example.akshayshopapp.databinding.ActivityUpdateUserBinding

class Update_User : AppCompatActivity() {

    private lateinit var binding: ActivityUpdateUserBinding

    private lateinit var viewModel: AdminViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_update_user)

        binding = ActivityUpdateUserBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val repository = AdminRepository(RetrofitInstance.api)
        viewModel = AdminViewModel(repository)


        binding.userUPDATE.setOnClickListener {

            val id = binding.id.text.toString().toInt()
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
                id = id,
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
            viewModel.updateUser(id, user)

            viewModel.userAdmin.observe(this){update ->
                Toast.makeText(this,"Update user Successfully",Toast.LENGTH_LONG).show()
            }

        }
    }
}