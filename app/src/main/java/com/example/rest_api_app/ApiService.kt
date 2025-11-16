package com.example.rest_api_app

import retrofit2.http.GET

interface ApiService {
    @GET("products")
    suspend fun getProduct():List<Product>

}