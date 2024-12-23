package com.example.akshayshopapp.Room

import androidx.lifecycle.LiveData
import com.example.akshayshopapp.dataClass.Product

class WishlistRepository(private val productDao: ProductDao) {

    val allWishlistProduct: LiveData<List<Product>> = productDao.getAllProducts()

    suspend fun insertWishlistProduct(product: Product) {
        productDao.insert(product)
    }

    suspend fun deleteWishlistProduct(product: Product) {
        productDao.delete(product)
    }

    suspend fun clearCart() {
        productDao.clearCart()
    }
}