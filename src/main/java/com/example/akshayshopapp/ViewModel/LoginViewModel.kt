package com.example.akshayshopapp.ViewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.akshayshopapp.Repository.LoginRepository
import com.example.akshayshopapp.dataClass.Login.LoginResponse
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.schedulers.Schedulers

class LoginViewModel(private val repository: LoginRepository) : ViewModel() {

    private val _loginLiveData = MutableLiveData<LoginResponse>()

    val loginLiveData: LiveData<LoginResponse> get() = _loginLiveData

    private val compositeDisposable = CompositeDisposable()


    fun login(username: String, password: String) {
        compositeDisposable.add(
            repository.login(username, password)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ login ->
                    _loginLiveData.value = login
                }, { error ->
                    Log.e("LoginViewModel", "Login Error : ${error.message}")
                })
        )
    }


    override fun onCleared() {
        super.onCleared()
        compositeDisposable.clear()
    }

}