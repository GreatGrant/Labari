package com.gralliams.labari.database

import androidx.room.TypeConverter
import com.gralliams.labari.models.Source

class Converters {

    //Converts to string
    @TypeConverter
    fun fromSource(source: Source): String = source.name

    //Converts to source
    @TypeConverter
    fun toSource(string: String): Source = Source(string, string)
}