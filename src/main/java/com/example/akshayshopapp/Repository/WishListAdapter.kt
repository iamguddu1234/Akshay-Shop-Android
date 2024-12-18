package com.example.akshayshopapp.Repository

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.akshayshopapp.dataClass.Product
import com.example.akshayshopapp.databinding.WishlistViewBinding

class WishListAdapter(
    private var wishList: MutableList<Product>,
) : RecyclerView.Adapter<WishListAdapter.WishListViewHolder>() {


    class WishListViewHolder(private val binding: WishlistViewBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(product: Product, context: Context) {
            binding.title.text = product.title
            binding.price.text = "$${product.price}"

            // Load the product image using Glide or other image loading library
            Glide.with(binding.image.context)
                .load(product.image)
                .into(binding.image)


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WishListViewHolder {
        val binding =
            WishlistViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return WishListViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return wishList.size
    }

    override fun onBindViewHolder(holder: WishListViewHolder, position: Int) {
        holder.bind(wishList[position], holder.itemView.context)


    }

    // Update the wishlist with new data
    fun updateWishList(newWishList: List<Product>) {
        wishList.clear()
        wishList.addAll(newWishList)
        notifyDataSetChanged()
    }
}