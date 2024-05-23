package com.example.mcproject.api

import java.io.Serializable
import java.time.LocalDateTime

data class NewsResponse(
    val status: String,
    val totalResults: Int,
    val articles: List<Article>
)

data class Article(
    val source: Source,
    val author: String?,
    val title: String,
    val description: String?,
    val url: String,
    val urlToImage: String?,
    val publishedAt: String?,
    val content: String?
) : Serializable

data class Source(
    val id: String?,
    val name: String
) : Serializable
