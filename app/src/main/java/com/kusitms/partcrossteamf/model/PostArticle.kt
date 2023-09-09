package com.kusitms.partcrossteamf.model

data class PostArticleApiResponse(
    val isSuccess: Boolean,
    val message: String,
    val data: List<PostArticle>
)

data class PostArticle(
    val articleId: Int,
    val title: String,
    val description: String,
    val body: String,
    val tagList: List<String>,
    val createdAt: String,
    val updatedAt: String
)