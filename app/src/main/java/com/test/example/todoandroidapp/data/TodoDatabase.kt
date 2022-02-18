package com.test.example.todoandroidapp.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.test.example.todoandroidapp.data.dao.TodoDao
import com.test.example.todoandroidapp.data.models.TodoEntity

@Database(entities = [TodoEntity::class],
    version = 1,
    exportSchema = false)
@TypeConverters(Converter::class)
abstract class TodoDatabase: RoomDatabase() {

    abstract fun todoDao(): TodoDao

}