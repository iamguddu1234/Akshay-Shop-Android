package com.example.akshayshopapp.AdminPanel.ViewModel

import android.net.http.HttpException
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.akshayshopapp.AdminPanel.Repository.AdminRepository
import com.example.akshayshopapp.dataClass.Product
import com.example.akshayshopapp.dataClass.User
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.schedulers.Schedulers

class AdminViewModel(private val repository: AdminRepository) : ViewModel() {

    private val _adminProductLiveData = MutableLiveData<Product>()
    val adminProductLiveData: LiveData<Product> get() = _adminProductLiveData


    private val _deleteLiveData = MutableLiveData<Boolean>()
    val deleteLiveData: LiveData<Boolean> = _deleteLiveData


    private val _userAdminLiveData = MutableLiveData<List<User>>()
    val userAdminLiveData: LiveData<List<User>> get() = _userAdminLiveData


    private val _userAdmin = MutableLiveData<User>()
    val userAdmin: LiveData<User> get() = _userAdmin


    private val _deleteUser = MutableLiveData<Boolean>()
    val deleteUser: LiveData<Boolean> = _deleteUser

    private val compositeDisposable = CompositeDisposable()


    fun addProduct(product: Product) {
        compositeDisposable.add(
            repository.addProduct(product)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ product ->
                    _adminProductLiveData.value = product
                    Log.d("AdminViewModel", "Product Add Successfully: ${product}")
                }, { error ->
                    Log.e("AdminViewModel", "Error Adding Product Data : ${error.message}")
                })
        )
    }


    fun updateProduct(id: Int, product: Product) {
        compositeDisposable.add(
            repository.updateProduct(id, product)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ update ->
                    _adminProductLiveData.value = update
                    Log.d("AdminViewModel", "Product Update Successfully : ${update}")

                }, { error ->
                    Log.e("AdminViewModel", "Product Update Error : ${error.message}")
                })
        )
    }


    fun deleteProduct(id: Int) {
        compositeDisposable.add(
            repository.deleteProduct(id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ delete ->
                    if (delete.isSuccessful) {
                        _deleteLiveData.value = true
                        Log.d("AdminViewModel", "Product Delte Successfully : ${delete}")
                    } else {
                        _deleteLiveData.value = false
                    }
                }, { error ->
                    Log.e("AdminViewModel", "Product Delete Error :${error.message}")
                })
        )
    }


    fun getAllUsers() {
        compositeDisposable.add(
            repository.getAllUsers()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ users ->
                    _userAdminLiveData.value = users
                }, { error ->
                    Log.e("AdminViewModel", "User Details Fetched Failed : ${error.message}")

                })
        )
    }


    fun addUser(user: User) {
        compositeDisposable.add(
            repository.addUser(user)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ adduser ->
                    _userAdmin.value = adduser
                    Log.d("AdminViewModel", "User Add Successfully")

                }, { error ->
                    Log.e("AdminViewModel", "Error User Add : ${error.message}")
                })
        )
    }

    fun updateUser(id: Int, user: User) {
        compositeDisposable.add(
            repository.updateUser(id, user)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ update ->
                    _userAdmin.value = update
                    Log.d("AdminViewModel", "User Update Successfully")
                }, { error ->
                    Log.e("AdminViewModel", " User Update Failed : ${error.message}")
                })
        )
    }

    fun deleteUser(id: Int) {
        compositeDisposable.add(
            repository.deleteUser(id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ delete ->
                    if (delete.isSuccessful) {
                        _deleteUser.value = true
                        Log.d("AdminViewModel", "User Delete Successfully")
                    } else {
                        _deleteUser.value = false
                    }
                }, { error ->
                    Log.e("Admin ViewModel", "Delete User : ${error.message}")
                })
        )
    }


    fun getUserByOrder(sort: String) {
        compositeDisposable.add(
            repository.getUserByOrder(sort)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ sort ->
                    _userAdminLiveData.value = sort
                }, { error ->
                    Log.e("AdminViewModel", "Error Getting User By Order : ${error.message}")
                })
        )
    }

    fun getLimitedUser(limit: Int) {
        compositeDisposable.add(
            repository.getLimitedUser(limit)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ limit ->
                    _userAdminLiveData.value = limit
                }, { error ->
                    Log.e("AdminViewModel", "Error Limited user : ${error.message}")
                })
        )
    }


    override fun onCleared() {
        super.onCleared()
        compositeDisposable.clear()
    }
}