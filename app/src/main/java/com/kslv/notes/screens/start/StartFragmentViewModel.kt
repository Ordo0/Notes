package com.kslv.notes.screens.start

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.kslv.notes.database.room.AppRoomDatabase
import com.kslv.notes.database.room.AppRoomRepository
import com.kslv.notes.utilits.REPOSITORY
import com.kslv.notes.utilits.TYPE_ROOM

class StartFragmentViewModel(application: Application) : AndroidViewModel(application) {
    private val mContext = application

    fun initDatabase(type: String, onSuccess: () -> Unit) {
        when (type) {
            TYPE_ROOM -> {
                val dao = AppRoomDatabase.getInstance(mContext).getAppRoomDao()
                REPOSITORY = AppRoomRepository(dao)
                onSuccess()
            }
        }

    }
}