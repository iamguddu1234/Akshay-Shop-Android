package com.example.akshayshopapp.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.akshayshopapp.dataClass.Product
import com.example.akshayshopapp.databinding.CustomeCategoryBinding
import com.example.akshayshopapp.databinding.CustomeProductCardBinding

class ProductListAdapter(
    private var productList: List<Product>,
    private val onItemCLicked: (Product) -> Unit,
    private val onFavorite: (Product) -> Unit
) : RecyclerView.Adapter<ProductListAdapter.ProductViewHolder>() {


    private var filterProductList: List<Product> = productList//search

    class ProductViewHolder(val binding: CustomeProductCardBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val binding =
            CustomeProductCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProductViewHolder(binding)
    }

    override fun getItemCount(): Int {
//        return productList.size
        return filterProductList.size//search
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
//        val product = productList[position]

        val product = filterProductList[position]//search


        Glide.with(holder.itemView.context).load(product.image).into(holder.binding.image)
        holder.binding.title.text = product.title
        holder.binding.price.text = product.price

        holder.itemView.setOnClickListener {
            onItemCLicked(product)
        }

        holder.binding.addWishList.setOnClickListener {
            onFavorite(product)
        }
    }


    //search
    fun filter(query: String){
        filterProductList = if (query.isEmpty()){
            productList
        }else{
            productList.filter {
                it.title.contains(query,ignoreCase = true)
            }
        }
        notifyDataSetChanged()
    }

    fun updateProductList(newProductList: List<Product>) {
        productList = newProductList

        filterProductList = newProductList// search
        notifyDataSetChanged()
    }
}