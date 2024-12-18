package com.example.akshayshopapp.AdminPanel.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.akshayshopapp.R
import com.example.akshayshopapp.databinding.ActivityUserDetailsViewBinding

class UserDetailsView : AppCompatActivity() {

    private lateinit var binding: ActivityUserDetailsViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityUserDetailsViewBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.apply {
            tno.text = intent.getStringExtra("number")
            temail.text = intent.getStringExtra("email")
            tusername.text = intent.getStringExtra("username")
            tpassword.text = intent.getStringExtra("password")
            tname.text = intent.getStringExtra("firstname")
            tlast.text = intent.getStringExtra("lastname")
            tcity.text = intent.getStringExtra("city")
            tstreet.text = intent.getStringExtra("street")
            tzipcode.text = intent.getStringExtra("zipcode")
            tmob.text = intent.getStringExtra("phone")
            tlat.text = intent.getDoubleExtra("lat",0.0).toString()
            tlong.text = intent.getDoubleExtra("lone",0.0).toString()
        }
    }
}