package com.example.akshayshopapp.Activity

import android.annotation.SuppressLint
import android.content.ContentValues.TAG
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import android.window.OnBackInvokedDispatcher
import com.example.akshayshopapp.MainActivity
import com.example.akshayshopapp.R
import com.example.akshayshopapp.Repository.LoginRepository
import com.example.akshayshopapp.Retrofit.RetrofitInstance
import com.example.akshayshopapp.ViewModel.LoginViewModel
import com.example.akshayshopapp.databinding.ActivityLoginScreenBinding
import com.facebook.AccessToken
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions

import com.google.android.gms.common.api.ApiException
import com.google.firebase.auth.FacebookAuthProvider
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthProvider


class Login_Screen : AppCompatActivity() {

    private lateinit var binding: ActivityLoginScreenBinding
    private lateinit var viewModel: LoginViewModel

    //Login Material -google
    private lateinit var googleSignInClient: GoogleSignInClient
    private lateinit var firebaseAuth: FirebaseAuth
    private val RC_SIGN_IN = 9001



    //login material facebook
    private lateinit var auth: FirebaseAuth
    private lateinit var callbackManager: CallbackManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)

        binding = ActivityLoginScreenBinding.inflate(layoutInflater)

        // Initialize Facebook CallbackManager
        callbackManager = CallbackManager.Factory.create()



        if (!isInternetAvailable()) {
            val intent = Intent(this, NoInternetScreen::class.java)
            startActivity(intent)

            finish()

            return
        }

        setContentView(binding.root)


        val repository = LoginRepository(RetrofitInstance.api)
        viewModel = LoginViewModel(repository)


        binding.login.setOnClickListener {

            val username = binding.edUsername.text.toString().trim()
            val password = binding.edPassword.text.toString().trim()

            if (username.isNotEmpty() && password.isNotEmpty()) {

                viewModel.login(username, password)
            } else {
                Toast.makeText(this, "please enter username and Password", Toast.LENGTH_LONG).show()
            }
        }

        viewModel.loginLiveData.observe(this) { login ->

            if (login != null && login.token.isNotEmpty()) {
                Log.d("Login Activity", "Token : ${login.token}")
                Toast.makeText(this, "Login Successfully", Toast.LENGTH_LONG).show()


                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)

                finish()
            } else {

                Log.e("Login Activity", "Login Failed - Check Username and Password ")
                Toast.makeText(this, "Login Failed", Toast.LENGTH_LONG).show()
            }

        }



        binding.register.setOnClickListener {
            val intent = Intent(this, RegisterScreen::class.java)
            startActivity(intent)
        }


        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken(getString(R.string.default_web_client_id))
            .requestEmail()
            .build()

        googleSignInClient = GoogleSignIn.getClient(this, gso)

        firebaseAuth = FirebaseAuth.getInstance()

        // Set click listener for the sign-in button
        binding.signInWithGoogle.setOnClickListener {
            val signInIntent = googleSignInClient.signInIntent
            startActivityForResult(signInIntent, RC_SIGN_IN)
            Toast.makeText(this,"Successfull",Toast.LENGTH_LONG).show()
        }

        binding.signInWithFacebook.setOnClickListener {
            LoginManager.getInstance().logInWithReadPermissions(
                this,
                listOf("email", "public_profile")
            )
        }

        // Handle Facebook login result
        LoginManager.getInstance().registerCallback(callbackManager,
            object : FacebookCallback<LoginResult> {
                override fun onSuccess(loginResult: LoginResult) {
                    Log.d("FacebookLogin", "facebook:onSuccess:$loginResult")
                    handleFacebookAccessToken(loginResult.accessToken)
                }

                override fun onCancel() {
                    Log.d("FacebookLogin", "facebook:onCancel")
                }

                override fun onError(error: FacebookException) {
                    Log.d("FacebookLogin", "facebook:onError", error)
                }
            })


    }



    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        // Handle Facebook login result
        callbackManager.onActivityResult(requestCode, resultCode, data)

        if (requestCode == RC_SIGN_IN) {
            val task = GoogleSignIn.getSignedInAccountFromIntent(data)
            try {
                val account = task.getResult(ApiException::class.java)
                firebaseAuthWithGoogle(account.idToken!!)
            } catch (e: ApiException) {
                Log.w(TAG, "Google sign in failed", e)
            }
        }
    }

    private fun firebaseAuthWithGoogle(idToken: String) {
        val credential = GoogleAuthProvider.getCredential(idToken, null)
        firebaseAuth.signInWithCredential(credential)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    finish()
                } else {
                    Toast.makeText(this, "Authentication Failed.", Toast.LENGTH_SHORT).show()
                }
            }
    }



    private fun handleFacebookAccessToken(token: AccessToken) {
        Log.d("FacebookLogin", "handleFacebookAccessToken:$token")

        val credential = FacebookAuthProvider.getCredential(token.token)
        firebaseAuth.signInWithCredential(credential)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, go to MainActivity
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    finish()
                } else {
                    // Sign in failure
                    Toast.makeText(baseContext, "Facebook Authentication failed.", Toast.LENGTH_SHORT).show()
                }
            }
    }










    private fun isInternetAvailable(): Boolean {
        val connectivityManager =
            getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo = connectivityManager.activeNetworkInfo

        return networkInfo != null && networkInfo.isConnected

    }

    @SuppressLint("MissingSuperCall")
    override fun onBackPressed() {

    }
}