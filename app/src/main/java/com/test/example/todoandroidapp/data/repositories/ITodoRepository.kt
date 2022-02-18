package com.test.example.todoandroidapp.data.repositories

import androidx.lifecycle.LiveData
import com.test.example.todoandroidapp.data.models.TodoEntity

interface ITodoRepository {

    suspend fun insert(entity: TodoEntity)

    suspend fun update(entity: TodoEntity)

    suspend fun delete(entity: TodoEntity)

    suspend fun deleteAll()

    fun getAll(): LiveData<List<TodoEntity>>

    fun search(query: String): LiveData<List<TodoEntity>>
}