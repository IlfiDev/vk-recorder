package ru.ilfidev.vkrecorder

import androidx.room.Database
import ru.ilfidev.vkrecorder.Models.Record

@Database(entities = [Record::class], version = 1)
abstract class RecordsDB {
    abstract fun recordDao(): RecordDao
}