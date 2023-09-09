package com.kusitms.partcrossteamf.model

import com.google.gson.annotations.SerializedName

data class PutArticleApiResponse(
    @SerializedName("isSuccess")
    val isSuccess: Boolean,
    @SerializedName("message")
    val message: String,
    @SerializedName("data")
    val data: PutArticle
)

data class PutArticle(
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
