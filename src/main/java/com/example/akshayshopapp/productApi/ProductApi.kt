package com.example.akshayshopapp.productApi

import com.example.akshayshopapp.dataClass.Category
import com.example.akshayshopapp.dataClass.Login.LoginRequest
import com.example.akshayshopapp.dataClass.Login.LoginResponse
import com.example.akshayshopapp.dataClass.Product
import com.example.akshayshopapp.dataClass.User
import io.reactivex.rxjava3.core.Single
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface ProductApi {


    @POST("/auth/login")
    fun login(@Body loginRequest: LoginRequest): Single<LoginResponse>

    @GET("products")
    fun getAllProduct(): Single<List<Product>>

    @GET("products/categories")
    fun getCategory(): Single<List<String>>


    @GET("products/category/{type}")
    fun getProductByCategory(@Path("type") category: String): Single<List<Product>>


    @GET("products")
    fun getLimitedProduct(@Query("limit") limit: Int): Single<List<Product>>


    @GET("products")
    fun getProductsByOrder(@Query("sort") sort: String): Single<List<Product>>

    //    =============================================================================
    //AdminPanel
    @POST("products")
    fun addProduct(@Body product: Product): Single<Product>

    @PUT("products/{id}")
    fun updateProduct(
        @Path("id") id: Int,
        @Body product: Product
    ): Single<Product>

    @DELETE("products/{id}")
    fun deleteProduct(
        @Path("id") id: Int
    ): Single<Response<Void>>


    @GET("users")
    fun getAllUsers(): Single<List<User>>

    @POST("users")
    fun addUser(@Body user: User): Single<User>

    @PUT("users/{id}")
    fun updateUser(
        @Path("id") id: Int,
        @Body user: User
    ): Single<User>

    @DELETE("users/{id}")
    fun deleteUser(@Path("id") id: Int): Single<Response<Void>>

    @GET("users")
    fun getUserByOrder(@Query("sort") sort: String): Single<List<User>>

    @GET("users")
    fun getLimitedUser(@Query("limit") limit: Int): Single<List<User>>

}