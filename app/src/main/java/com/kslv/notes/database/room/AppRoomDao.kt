package com.kslv.notes.database.room

import androidx.lifecycle.LiveData
import androidx.room.*
import com.kslv.notes.models.AppNote

@Dao
interface AppRoomDao {
    @Query("SELECT * from notes_tables")
    fun getAllNotes():LiveData<List<AppNote>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(note: AppNote)

    @Delete
    suspend fun delete(note: AppNote)
}