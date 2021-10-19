package com.jskaleel.ocr_tamil.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.jskaleel.ocr_tamil.db.dao.RecentScanDao
import com.jskaleel.ocr_tamil.db.entity.RecentScan

@Database(entities = [RecentScan::class], version = 1, exportSchema = false)
abstract class VizhiDatabase : RoomDatabase() {
    abstract fun recentScanDao(): RecentScanDao
}