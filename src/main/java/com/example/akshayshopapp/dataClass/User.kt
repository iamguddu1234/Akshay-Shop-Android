package com.example.akshayshopapp.dataClass


data class User(
    val id: Int,
    val email: String,
    val username: String,
    val password: String,
    val name: Name,
    val address: Address,
    val phone: String
)

data class Name(
    val firstname: String,
    val lastname: String
)

data class Address(
    val city: String,
    val street: String,
    val number: String,
    val zipcode: String,
    val geolocation: Geolocation
)

data class Geolocation(
    val lat: Double?,
    val long: Double?
)
