package com.example.akshayshopapp.Room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.akshayshopapp.dataClass.Product


@Database(entities = [Product::class], version = 1, exportSchema = false)
abstract class WishListDatabase : RoomDatabase() {

    abstract fun productDao(): ProductDao

    companion object {
        @Volatile
        private var INSTANCE: WishListDatabase? = null

        fun getWishListDatabase(context: Context): WishListDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    WishListDatabase::class.java,
                    "wishlist_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}