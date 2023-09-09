package com.kusitms.partcrossteamf.model

import com.google.gson.annotations.SerializedName

data class PutArticleRequestBody(
    @SerializedName("title")
    val title: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("body")
    val body: String,
    @SerializedName("tagList")
    val tagList: List<String>
)