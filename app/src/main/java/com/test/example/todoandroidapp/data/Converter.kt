package com.test.example.todoandroidapp.data

import androidx.room.TypeConverter
import com.test.example.todoandroidapp.data.models.Priority

class Converter {

    @TypeConverter
    fun fromPriority(priority: Priority): String {
        return priority.name
    }

    @TypeConverter
    fun toPriority (value: String): Priority {
        return Priority.valueOf(value);
    }
}