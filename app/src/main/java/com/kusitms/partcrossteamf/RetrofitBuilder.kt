package com.kusitms.partcrossteamf

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder{
    var api: RetrofitService
    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("http://13.124.181.85/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        api = retrofit.create(RetrofitService::class.java)
    }
}