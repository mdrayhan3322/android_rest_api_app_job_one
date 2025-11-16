//package com.example.rest_api_app
//
//import androidx.lifecycle.LiveData
//import androidx.lifecycle.MutableLiveData
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewModelScope
//import kotlinx.coroutines.CoroutineScope
//import kotlinx.coroutines.launch
//
//class ProductViewModel: ViewModel {
//    private val _products = MutableLiveData<List<Product>>()
//    val products : LiveData<List<Product>>get()=_products
//    init {
//        viewModelScope.launch {
//            feteehProducts()
//        }
//    }
//
//    private suspend fun CoroutineScope .feteehProducts() {
//        TODO("Not yet implemented")
//        try {
//            _products.postValue(response)
//        }
//        catch (e: Exception){
//
//        }
//    }
//}





package com.example.rest_api_app

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class ProductViewModel : ViewModel() {
    private val _products = MutableLiveData<List<Product>>()
    val products: LiveData<List<Product>> get() = _products

    init {
        viewModelScope.launch {
            fetchProducts()
        }
    }

    private suspend fun fetchProducts() {
        try {

            val response: List<Product> = listOf()
            _products.postValue(response)
        } catch (e: Exception) {

//            e.printStackTrace()
        }
    }
}
