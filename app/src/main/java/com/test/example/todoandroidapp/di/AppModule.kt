package com.test.example.todoandroidapp.di

import android.content.Context
import androidx.room.Room
import com.test.example.todoandroidapp.data.TodoDatabase
import com.test.example.todoandroidapp.data.dao.TodoDao
import com.test.example.todoandroidapp.data.repositories.ITodoRepository
import com.test.example.todoandroidapp.data.repositories.TodoRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext application: Context): TodoDatabase {
        return Room.databaseBuilder(application, TodoDatabase::class.java, "todo_db").build()
    }

    @Singleton
    @Provides
    fun provideRepository(db: TodoDatabase): ITodoRepository {
        val dao: TodoDao = db.todoDao()
        return TodoRepository(dao)
    }

}