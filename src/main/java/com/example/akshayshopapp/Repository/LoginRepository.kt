package com.example.akshayshopapp.Repository

import com.example.akshayshopapp.dataClass.Login.LoginRequest
import com.example.akshayshopapp.dataClass.Login.LoginResponse
import com.example.akshayshopapp.productApi.ProductApi
import io.reactivex.rxjava3.core.Single

class LoginRepository(private val api: ProductApi) {

    fun login(username: String, password: String): Single<LoginResponse> {
        return api.login(LoginRequest(username, password))
    }
}