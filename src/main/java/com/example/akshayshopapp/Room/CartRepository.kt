package com.example.akshayshopapp.Room

import androidx.lifecycle.LiveData
import com.example.akshayshopapp.dataClass.Product

class CartRepository(private val productDao: ProductDao) {

    val allProducts: LiveData<List<Product>> = productDao.getAllProducts()

    suspend fun insert(product: Product) {
        productDao.insert(product)
    }

    suspend fun delete(product: Product) {
        productDao.delete(product)
    }

    suspend fun clearCart() {
        productDao.clearCart()
    }
}