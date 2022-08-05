package com.kslv.notes.database

import androidx.lifecycle.LiveData
import com.kslv.notes.models.AppNote

interface DatabaseRepository {
    val allNotes:LiveData<List<AppNote>>
    suspend fun insert(note: AppNote, onSuccess:()->Unit)
    suspend fun delete(note: AppNote, onSuccess:()->Unit)
}