package com.example.munchkinhelper.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.munchkinhelper.database.dao.PlayerDao
import com.example.munchkinhelper.database.entity.Player

@Database(entities = [Player::class], version = 1, exportSchema = false)
abstract class PlayerDatabase : RoomDatabase() {

    abstract fun playerDao(): PlayerDao

    companion object {

        private var instance: PlayerDatabase? = null

        fun getInstance(context: Context): PlayerDatabase {
            if (instance != null) {
                return instance as PlayerDatabase
            }
            synchronized(this) {
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    PlayerDatabase::class.java,
                    "players"
                ).build()
                return instance as PlayerDatabase
            }
        }
    }

}