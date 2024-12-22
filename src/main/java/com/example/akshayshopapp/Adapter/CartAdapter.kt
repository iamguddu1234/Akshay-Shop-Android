package com.example.akshayshopapp.Adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.akshayshopapp.Room.CartViewModel
import com.example.akshayshopapp.dataClass.Product
import com.example.akshayshopapp.databinding.CustomeCarViewBinding

class CartAdapter(
    private var productList: MutableList<Product>,
    private val cartViewModel: CartViewModel
) : RecyclerView.Adapter<CartAdapter.CartViewHolder>() {

    class CartViewHolder(val binding: CustomeCarViewBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(product: Product) {
            Log.d("CartAdapter", "Binding product: ${product.title}")
            binding.title.text = product.title
            binding.price.text = product.price
            binding.category.text = product.category
            Glide.with(binding.image.context).load(product.image).into(binding.image)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        val binding =
            CustomeCarViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CartViewHolder(binding)
    }


    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
//        holder.bind(productList[position])

        val product = productList[position]
        holder.bind(product)

        holder.binding.removeBtn.setOnClickListener {
            cartViewModel.delete(product)
            removeItem(position)
        }
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    private fun removeItem(position: Int) {
        productList = productList.toMutableList().apply {
            removeAt(position)
        }
        notifyItemRemoved(position)
    }

    fun setProducts(products: List<Product>) {
        productList.clear()
        productList.addAll(products.reversed())
        notifyDataSetChanged() // Notify the adapter to refresh the UI
    }

    // Method to remove the item from the list and notify the adapter

}