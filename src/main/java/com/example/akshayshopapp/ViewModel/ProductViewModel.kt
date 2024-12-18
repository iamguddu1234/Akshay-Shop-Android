package com.example.akshayshopapp.ViewModel

import android.net.http.HttpException
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.akshayshopapp.Repository.ProductRepository
import com.example.akshayshopapp.dataClass.Category
import com.example.akshayshopapp.dataClass.Product
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.schedulers.Schedulers

class ProductViewModel(private val repository: ProductRepository) : ViewModel() {

    private val _productLiveData = MutableLiveData<List<Product>>()
    val productLiveData: LiveData<List<Product>> get() = _productLiveData

    private val _categoryLiveData = MutableLiveData<List<String>>()
    val categoryLiveData: LiveData<List<String>> get() = _categoryLiveData

    private val compositeDisposable = CompositeDisposable()


    private val _FavLivedata = MutableLiveData<MutableList<Product>>()
    val favLiveData: LiveData<MutableList<Product>> get() = _FavLivedata

    init {
        _FavLivedata.value = mutableListOf()
    }


    fun getAllProduct() {
        compositeDisposable.add(
            repository.getAllProduct()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ product ->
                    _productLiveData.value = product
                    Log.d("ProductViewModel", "All Product Fetch")

                }, { error ->
                    Log.e("ProductViewModel", "Error Fetching Product ${error.message}")
                })
        )
    }

    fun getCategory() {
        compositeDisposable.add(
            repository.getCategory()
                .retry(5)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ category ->
                    _categoryLiveData.value = category
                    Log.d("ProductViewModel", "All Category FETCHE")
                }, { error ->
                    Log.e("ProductViewModel", "Error Fetching Category : ${error.message}")
                })
        )
    }

    fun getProductByCategory(category: String) {
        compositeDisposable.add(
            repository.getProductByCategory(category)
                .retry(5)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ products ->
                    _productLiveData.value = products
                    Log.d("ProductsViewModel", "All category By product Fetched")
                }, { error ->
                    if (error is retrofit2.HttpException) {
                        Log.e("ProductsViewModel", "HTTP ERROR Code : ${error.code()}")
                        Log.e(
                            "ProductsViewModel",
                            "HTTP ERROR Message: ${error.response()?.errorBody()?.string()}"
                        )
                    } else {
                        Log.e(
                            "ProductsViewModel",
                            "Error Getting Categories by Product ${error.message}"
                        )
                    }
                })
        )
    }

    fun getLimitedProduct(limit: Int) {
        compositeDisposable.add(
            repository.getLimitedProduct(limit)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ limit ->
                    _productLiveData.value = limit
                }, { error ->
                    Log.e("ProductViewModel", "Error Fetching Limited product : ${error.message}")
                })
        )
    }

    fun getProductsByOrder(sort: String) {
        compositeDisposable.add(
            repository.getProductsByOrder(sort)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ sortproduct ->
                    _productLiveData.value = sortproduct
                }, { error ->
                    Log.e("ProductsViewModel", "Error to get order: ${error.message}")
                })
        )
    }


//    //Add TO WishList
//    fun addToWishList(product: Product){
//        _FavLivedata.value?.apply {
//            add(product)
//            _FavLivedata.value = this //Update Live Data
//        }
//    }
//
//
//    fun removeTOWishList(product: Product){
//        _FavLivedata.value?.apply {
//            remove(product)
//            _FavLivedata.value = this
//        }
//    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.clear()
    }

}