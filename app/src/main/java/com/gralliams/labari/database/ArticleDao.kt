package com.gralliams.labari.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.gralliams.labari.models.Article

@Dao
interface ArticleDao {

    //Returns id of inserted article (Long)
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(article: Article): Long

//    @Query("SELECT * FROM articles")
//    fun getAllArticles(article: Article): LiveData<List<Article>>

    @Delete
    suspend fun delete(article: Article)
}