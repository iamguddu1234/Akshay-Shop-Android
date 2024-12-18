package com.example.akshayshopapp.AdminPanel.Repository

import com.example.akshayshopapp.dataClass.Product
import com.example.akshayshopapp.dataClass.User
import com.example.akshayshopapp.productApi.ProductApi
import io.reactivex.rxjava3.core.Single
import retrofit2.Response

class AdminRepository(private val api: ProductApi) {

    fun addProduct(product: Product): Single<Product> {
        return api.addProduct(product)
    }

    fun updateProduct(id: Int, product: Product): Single<Product> {
        return api.updateProduct(id, product)
    }

    fun deleteProduct(id: Int): Single<Response<Void>> {
        return api.deleteProduct(id)
    }


    fun getAllUsers(): Single<List<User>> {
        return api.getAllUsers()
    }

    fun addUser(user: User): Single<User> {
        return api.addUser(user)
    }

    fun updateUser(id: Int, user: User): Single<User> {
        return api.updateUser(id, user)
    }

   fun deleteUser(id: Int):Single<Response<Void>>{
       return api.deleteUser(id)
   }

    fun getUserByOrder(sort: String):Single<List<User>>{
        return api.getUserByOrder(sort)
    }

    fun getLimitedUser(limit:Int):Single<List<User>>{
        return api.getLimitedUser(limit)
    }


}