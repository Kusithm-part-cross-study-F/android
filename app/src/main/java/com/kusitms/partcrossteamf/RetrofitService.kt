package com.kusitms.partcrossteamf

import com.kusitms.partcrossteamf.model.GetAllArticleApiResponse
import com.kusitms.partcrossteamf.model.GetArticleApiResponse
import com.kusitms.partcrossteamf.model.PostArticleApiResponse
import com.kusitms.partcrossteamf.model.PutArticle
import retrofit2.Call
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface RetrofitService {
    @GET("api/v1/articles/")
    fun getAllArticle(): Call<GetAllArticleApiResponse>

    @POST("createArticle")
    fun postArticle(): Call<PostArticleApiResponse>

    @GET("api/v1/articles/{articleId}")
    fun getArticle(@Path("articleId") articleId: Int): Call<GetArticleApiResponse>

    @PUT("api/v1/articles/{articleId}")
    fun putArticle(@Path("articleId") articleId: Int): Call<PutArticle>

//    @DELETE("api/v1/articles/{articleId}")
//    fun delArticle(@Path("articleId") articleId: Int): Call<>
}