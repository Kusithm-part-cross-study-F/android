package com.kusitms.partcrossteamf.model

import com.google.gson.annotations.SerializedName


data class GetAllArticleApiResponse(
    @SerializedName("isSuccess")
    val isSuccess: Boolean,
    @SerializedName("message")
    val message: String,
    @SerializedName("data")
    val data: List<GetAllArticle>
)

data class GetAllArticle(
    @SerializedName("articleId")
    val articleId: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("body")
    val body: String,
    @SerializedName("tagList")
    val tagList: List<String>,
    @SerializedName("createdAt")
    val createdAt: String,
    @SerializedName("updatedAt")
    val updatedAt: String
)