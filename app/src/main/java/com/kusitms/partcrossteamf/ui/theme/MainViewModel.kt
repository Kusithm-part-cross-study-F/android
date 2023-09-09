package com.kusitms.partcrossteamf.ui.theme

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kusitms.partcrossteamf.RetrofitBuilder
import com.kusitms.partcrossteamf.model.GetAllArticle
import com.kusitms.partcrossteamf.model.GetAllArticleApiResponse
import retrofit2.Call
import retrofit2.Response

class MainViewModel: ViewModel() {
    private val _data = MutableLiveData<ArrayList<GetAllArticle>>()
    val data: LiveData<ArrayList<GetAllArticle>>
        get() = _data

    init {
        fetchData()
    }

    private fun fetchData(){
        RetrofitBuilder.api.getAllArticle().enqueue(object: retrofit2.Callback<GetAllArticleApiResponse>{
            override fun onResponse(
                call: Call<GetAllArticleApiResponse>,
                response: Response<GetAllArticleApiResponse>
            ) {
                if(response.isSuccessful){
                    Log.d("testt", "success")
                }
            }

            override fun onFailure(call: Call<GetAllArticleApiResponse>, t: Throwable) {
                TODO("Not yet implemented")
            }
        })
    }

}