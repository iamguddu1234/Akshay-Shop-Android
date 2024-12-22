package com.example.akshayshopapp.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.akshayshopapp.Adapter.CartAdapter
import com.example.akshayshopapp.R
import com.example.akshayshopapp.Room.CartViewModel
import com.example.akshayshopapp.dataClass.Product
import com.example.akshayshopapp.databinding.ActivityAddToCartScreenBinding
import com.razorpay.Checkout
import com.razorpay.PaymentResultListener
import org.json.JSONObject

class AddToCartScreen : AppCompatActivity(), PaymentResultListener {

    private lateinit var binding: ActivityAddToCartScreenBinding

    private val productList = mutableListOf<Product>()
    private val cartViewModel: CartViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_add_to_cart_screen)
        binding = ActivityAddToCartScreenBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val id = intent.getIntExtra("id", -1)
        val title = intent.getStringExtra("title")
        val price = intent.getStringExtra("price")
        val category = intent.getStringExtra("category")
        val description = intent.getStringExtra("category")
        val image = intent.getStringExtra("image")
        Log.d("AddToCartScreen", "Product Data - id: $id, title: $title, price: $price, category: $category, description: $description, image: $image")


        //add product to the cart list

        // Add product to the cart list
        if (id != -1 && title != null && price != null && category != null && description != null && image != null) {
            val product = Product(id, title, price, category, description, image)
            Log.d("AddToCartScreen", "Adding product to cart: $product")
            cartViewModel.insert(product) // Add product to the cart using Room
        }

        val cartAdapter = CartAdapter(productList,cartViewModel)
        binding.cartRv.apply {
            layoutManager = LinearLayoutManager(this@AddToCartScreen)
            adapter = cartAdapter
        }
        // Observe changes in the cart and update the RecyclerView
        cartViewModel.allProducts.observe(this, Observer { products ->
            cartAdapter.setProducts(products) // Update the adapter with the new list of products
        })


        // Initialize Razorpay
        Checkout.preload(applicationContext)

        binding.buyNow.setOnClickListener {

            val priceText = binding.priceText.text.toString()

            // Check if priceText is not empty
            if (priceText.isNotEmpty()) {
                try {
                    // Convert price to Integer
                    val priceInInt = priceText.toInt()

                    // Convert price to paise (multiply by 100)
                    val amountInPaise = priceInInt * 100

                    // Start the payment process
                    startPayment(amountInPaise)

                } catch (e: NumberFormatException) {
                    Toast.makeText(this, "Invalid price entered", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Please enter a valid amount", Toast.LENGTH_SHORT).show()
            }
        }
    }

    // Function to start the payment process
    private fun startPayment(amount: Int) {
        val checkout = Checkout()

        // Set your Razorpay API key here
        checkout.setKeyID("rzp_test_XtXE4VdmsQwQE3")

        try {
            // Set up the options for the payment
            val options = JSONObject()
            options.put("name", "Akshay Bhasme")
            options.put("description", "Test Payment")
            options.put(
                "image",
                "https://www.indiaesevakendra.in/wp-content/uploads/2020/08/Paymentsuccessful21.png"
            )
            options.put("currency", "INR")
            options.put("amount", amount) // Amount is in paise (50000 paise = 500 INR)

            // Optional - set prefill information
            options.put("prefill.email", "iamguddu37@gmail.com")
            options.put("prefill.contact", "8855935799")

            // Start the Razorpay Checkout
            checkout.open(this, options)

        } catch (e: Exception) {
            e.printStackTrace()
        }
    }


    // Handle payment success
    override fun onPaymentSuccess(razorpayPaymentID: String?) {
        Toast.makeText(this, "Payment Successful: $razorpayPaymentID", Toast.LENGTH_SHORT).show()
    }

    // Handle payment error
    override fun onPaymentError(code: Int, response: String?) {
        Toast.makeText(this, "Payment Failed: $response", Toast.LENGTH_SHORT).show()
        Log.e("Error Payment Gateway :", " ERROR : ${response}")
    }


}

