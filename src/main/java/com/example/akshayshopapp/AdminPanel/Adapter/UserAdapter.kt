package com.example.akshayshopapp.AdminPanel.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.akshayshopapp.dataClass.User
import com.example.akshayshopapp.databinding.CustomeUserViewBinding

class UserAdapter(
    private var userList: List<User>,
    private val onItemClicked: (User) -> Unit

) : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    private var filterUserList: List<User> = userList

    class UserViewHolder(val binding: CustomeUserViewBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val binding =
            CustomeUserViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UserViewHolder(binding)
    }

    override fun getItemCount(): Int {
//        return userList.size

        return filterUserList.size//search
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {

//        val user = userList[position]

        val user = filterUserList[position]

        holder.binding.number.text = user.address.number
        holder.binding.email.text = user.email
        holder.binding.name.text = user.name.firstname
        holder.binding.phone.text = user.phone

        holder.itemView.setOnClickListener {
            onItemClicked(user)
        }

    }


    fun filter(query: String) {
        filterUserList = if (query.isEmpty()) {
            userList
        } else {
            userList.filter { user ->
//                it.name.firstname.contains(
//                    query, ignoreCase = true
//                )
                user.name.firstname.contains(query, ignoreCase = true) ||
                        user.name.lastname.contains(query, ignoreCase = true) ||
                        user.phone.contains(query, ignoreCase = true) ||
                        user.email.contains(query, ignoreCase = true)
            }
        }
        notifyDataSetChanged()

    }


    fun updateUserList(newUserList: List<User>) {
        userList = newUserList

        filterUserList = newUserList
        notifyDataSetChanged()
    }
}