package com.junaedi.pemesanantiket.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.junaedi.pemesanantiket.database.dao.DatabaseDao
import com.junaedi.pemesanantiket.model.ModelDatabase


@Database(entities = [ModelDatabase::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun databaseDao(): DatabaseDao?
}