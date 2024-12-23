package com.example.akshayshopapp.Room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.akshayshopapp.dataClass.Product


@Dao
interface ProductDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(product: Product)

    @Delete
    suspend fun delete(product: Product)

    @Query("SELECT * FROM cart_table")
    fun getAllProducts(): LiveData<List<Product>>

    @Query("SELECT * FROM cart_table")
    fun getWishListProducts(): LiveData<List<Product>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertWishlistProduct(product: Product)

    @Query("DELETE FROM cart_table")
    suspend fun clearCart()

}