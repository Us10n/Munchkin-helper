package com.example.munchkinhelper.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.munchkinhelper.database.entity.Player

@Dao
interface PlayerDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addPlayer(player: Player)

    @Query("SELECT * FROM players ORDER BY id ASC")
    suspend fun findAll(): LiveData<List<Player>>
}