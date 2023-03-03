package ru.ilfidev.vkrecorder

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import ru.ilfidev.vkrecorder.Models.Record

interface RecordDao {
    @Query("SELECT * FROM record")
    fun getAll(): List<Record>


    @Insert
    fun insertAll(vararg records: Record)

    @Delete
    fun delete(record: Record)
}