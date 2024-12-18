package com.example.akshayshopapp.AdminPanel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.akshayshopapp.AdminPanel.Activity.Add_product
import com.example.akshayshopapp.AdminPanel.Activity.Add_user
import com.example.akshayshopapp.AdminPanel.Activity.All_User_details
import com.example.akshayshopapp.AdminPanel.Activity.DeleteUser
import com.example.akshayshopapp.AdminPanel.Activity.Delete_product
import com.example.akshayshopapp.AdminPanel.Activity.Update_User
import com.example.akshayshopapp.AdminPanel.Activity.Update_product
import com.example.akshayshopapp.R
import com.example.akshayshopapp.databinding.ActivityAdminPanelHomeBinding

class AdminPanel_Home : AppCompatActivity() {



    private lateinit var binding: ActivityAdminPanelHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_admin_panel_home)

        binding = ActivityAdminPanelHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.addProduct.setOnClickListener {
            val intent = Intent(this, Add_product::class.java)
            startActivity(intent)
        }

        binding.UpdateProduct.setOnClickListener {
            val intent = Intent(this, Update_product::class.java)
            startActivity(intent)
        }

        binding.DeleteProduct.setOnClickListener {
            val intent = Intent(this, Delete_product::class.java)
            startActivity(intent)
        }

        binding.allUser.setOnClickListener {
            val intent = Intent(this, All_User_details::class.java)
            startActivity(intent)
        }

        binding.addUser.setOnClickListener {
            val intent = Intent(this, Add_user::class.java)
            startActivity(intent)
        }

        binding.updateUser.setOnClickListener {
            val intent = Intent(this, Update_User::class.java)
            startActivity(intent)
        }

        binding.deleteUser.setOnClickListener {
            val intent = Intent(this, DeleteUser::class.java)
            startActivity(intent)
        }


    }
}