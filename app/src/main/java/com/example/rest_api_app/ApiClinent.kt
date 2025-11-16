package com.example.rest_api_app

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClinent {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.escuelajs.co/api/v1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val apiService = retrofit.create(ApiService::class.java)
}