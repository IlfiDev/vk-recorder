package ru.ilfidev.vkrecorder.Models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Record (
    @PrimaryKey
    val id: Int,

    @ColumnInfo(name = "title")
    val title: String?,

    @ColumnInfo(name = "length")
    val length: Int,

    @ColumnInfo(name = "filePath")
    val filePath: String
    )