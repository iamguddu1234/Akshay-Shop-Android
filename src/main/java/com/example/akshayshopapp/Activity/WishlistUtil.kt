import android.content.Context
import com.example.akshayshopapp.dataClass.Product
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

object WishlistUtil {

    private const val PREFS_NAME = "wishlist_prefs"
    private const val WISHLIST_KEY = "wishlist"

    // Save the wishlist to SharedPreferences
    fun saveWishlist(context: Context, wishlist: List<Product>) {
        val sharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()

        // Convert wishlist to JSON and save it
        val gson = Gson()
        val json = gson.toJson(wishlist)
        editor.putString(WISHLIST_KEY, json)
        editor.apply()
    }

    // Retrieve the wishlist from SharedPreferences
    fun getWishlist(context: Context): MutableList<Product> {
        val sharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val json = sharedPreferences.getString(WISHLIST_KEY, null)

        return if (!json.isNullOrEmpty()) {
            val gson = Gson()
            val type = object : TypeToken<MutableList<Product>>() {}.type
            gson.fromJson(json, type)
        } else {
            mutableListOf() // Return an empty list if no wishlist is found
        }
    }
}
