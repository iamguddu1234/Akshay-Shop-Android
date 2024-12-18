package com.example.akshayshopapp.AdminPanel.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.akshayshopapp.AdminPanel.Adapter.UserAdapter
import com.example.akshayshopapp.AdminPanel.Repository.AdminRepository
import com.example.akshayshopapp.AdminPanel.ViewModel.AdminViewModel
import com.example.akshayshopapp.R
import com.example.akshayshopapp.Retrofit.RetrofitInstance
import com.example.akshayshopapp.databinding.ActivityAllUserDetailsBinding

class All_User_details : AppCompatActivity() {

    private lateinit var binding: ActivityAllUserDetailsBinding

    private lateinit var viewModel: AdminViewModel
    private lateinit var userAdapter: UserAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_all_user_details)

        binding = ActivityAllUserDetailsBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val repository = AdminRepository(RetrofitInstance.api)
        viewModel = AdminViewModel(repository)


        binding.userRv.layoutManager = LinearLayoutManager(this)
        userAdapter = UserAdapter(listOf()) { user ->
            val intent = Intent(this, UserDetailsView::class.java).apply {

                putExtra("email", user.email)
                putExtra("username", user.username)
                putExtra("password", user.password)
                putExtra("firstname", user.name.firstname)
                putExtra("lastname", user.name.lastname)
                putExtra("city", user.address.city)
                putExtra("street", user.address.street)
                putExtra("number", user.address.number)
                putExtra("zipcode", user.address.zipcode)
                putExtra("lat", user.address.geolocation.lat)
                putExtra("lone", user.address.geolocation.long)
                putExtra("phone", user.phone)

            }
            startActivity(intent)
        }
        binding.userRv.adapter = userAdapter

        viewModel.userAdminLiveData.observe(this) { user ->
            userAdapter.updateUserList(user)
        }

        viewModel.getAllUsers()


        binding.btnAsc.setOnClickListener {
            viewModel.getUserByOrder("asc")
        }
        binding.btnDesc.setOnClickListener {

            viewModel.getUserByOrder("desc")
        }

        binding.search.setOnClickListener {

            val userNu = binding.edLimit.text.toString().toInt()

            viewModel.getLimitedUser(userNu)
        }

        binding.searchBoxUser.addTextChangedListener(object : TextWatcher {


            override fun afterTextChanged(s: Editable?) {
                userAdapter.filter(s.toString())
            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }
        })


    }
}