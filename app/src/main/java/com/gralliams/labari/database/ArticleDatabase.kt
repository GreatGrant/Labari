package com.gralliams.labari.database

import android.content.Context
import androidx.room.*
import com.gralliams.labari.models.Article

@Database(
    entities = [Article::class],
    version = 1
)

@TypeConverters(Converters::class)
abstract class ArticleDatabase : RoomDatabase(){
    abstract fun getDao(): ArticleDao

    //To create database instance
    companion object{

        @Volatile
        var instance: ArticleDatabase? = null
        val LOCK = Any()


        operator fun invoke (context: Context) = instance ?: synchronized(LOCK){
            instance ?: createDatabase(context).also{ instance = it}
        }

        private fun createDatabase(context: Context) = Room.databaseBuilder(
            context.applicationContext,
            ArticleDatabase::class.java,
            "article_db.db"
        ).build()
    }
}