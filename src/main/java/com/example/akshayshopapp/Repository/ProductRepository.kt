package com.example.akshayshopapp.Repository

import com.example.akshayshopapp.dataClass.Category
import com.example.akshayshopapp.dataClass.Product
import com.example.akshayshopapp.productApi.ProductApi
import io.reactivex.rxjava3.core.Single

class ProductRepository(private val api: ProductApi) {

    fun getAllProduct(): Single<List<Product>> {
        return api.getAllProduct()
    }

    fun getCategory(): Single<List<String>> {
        return api.getCategory()
    }

    fun getProductByCategory(category: String): Single<List<Product>> {
        return api.getProductByCategory(category)
    }

    fun getLimitedProduct(limit: Int): Single<List<Product>> {
        return api.getLimitedProduct(limit)
    }

    fun getProductsByOrder(sort: String): Single<List<Product>> {
        return api.getProductsByOrder(sort)
    }


}