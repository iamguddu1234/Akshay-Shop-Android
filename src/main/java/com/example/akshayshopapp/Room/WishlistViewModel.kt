package com.example.akshayshopapp.Room

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.akshayshopapp.dataClass.Product
import kotlinx.coroutines.launch

class WishlistViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: WishlistRepository
    val allWishListProduct: LiveData<List<Product>>

    init {
        val productDao = WishListDatabase.getWishListDatabase(application).productDao()
        repository = WishlistRepository(productDao)
        allWishListProduct = repository.allWishlistProduct
    }

    fun insertWishlist(product: Product) = viewModelScope.launch {
        repository.insertWishlistProduct(product)
    }

    fun deleteWishlist(product: Product) = viewModelScope.launch {
        repository.deleteWishlistProduct(product)
    }

    fun clearCart() = viewModelScope.launch {
        repository.clearCart()
    }
}