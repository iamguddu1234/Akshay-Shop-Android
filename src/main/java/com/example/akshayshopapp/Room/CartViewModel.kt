package com.example.akshayshopapp.Room

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.akshayshopapp.dataClass.Product
import kotlinx.coroutines.launch

class CartViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: CartRepository
    val allProducts: LiveData<List<Product>>

    init {
        val productDao = CartDatabase.getDatabase(application).productDao()
        repository = CartRepository(productDao)
        allProducts = repository.allProducts
    }

    fun insert(product: Product) = viewModelScope.launch {
        repository.insert(product)
    }

    fun delete(product: Product) = viewModelScope.launch {
        repository.delete(product)
    }

    fun clearCart() = viewModelScope.launch {
        repository.clearCart()
    }
}