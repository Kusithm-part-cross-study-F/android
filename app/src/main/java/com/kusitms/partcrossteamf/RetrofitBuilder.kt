package com.kusitms.partcrossteamf

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder{
    var api: RetrofitService
    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://kusitms.shop/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        api = retrofit.create(RetrofitService::class.java)
    }
}