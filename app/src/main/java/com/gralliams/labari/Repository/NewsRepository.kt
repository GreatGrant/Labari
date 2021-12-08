package com.gralliams.labari.Repository

import com.gralliams.labari.api.NewsClient
import com.gralliams.labari.database.ArticleDatabase

class NewsRepository(val database: ArticleDatabase){

    //Get breaking news from retrofit client
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        NewsClient.api.getBreakingNews(countryCode, pageNumber)
}