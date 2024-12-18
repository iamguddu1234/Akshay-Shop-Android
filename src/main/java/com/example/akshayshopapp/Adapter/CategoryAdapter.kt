package com.example.akshayshopapp.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.akshayshopapp.dataClass.Category
import com.example.akshayshopapp.databinding.CustomeCategoryBinding

class CategoryAdapter(
    private var categoryList: List<String>,
    private val onItemClicked: (String) -> Unit
) : RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {


    class CategoryViewHolder(val binding: CustomeCategoryBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val binding =
            CustomeCategoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CategoryViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return categoryList.size
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {

        val category = categoryList[position]
        holder.binding.tCategory.text = category

        holder.itemView.setOnClickListener {
            onItemClicked(category)
        }


    }


    fun updateCategoryList(newCategory: List<String>) {
        categoryList = newCategory
        notifyDataSetChanged()
    }
}