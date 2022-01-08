package com.example.munchkinhelper.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.munchkinhelper.entity.Sex

@Entity(tableName = "players")
data class Player(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val nickname: String,
    val sex: Sex,
    val damage: Int,
    val level: Int
)
