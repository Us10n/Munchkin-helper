package com.example.munchkinhelper.recycler

import com.example.munchkinhelper.entity.Sex

data class PlayerRecyclerViewItem(
    val nickname: String,
    val sex: Sex,
    val damage: Int,
    val level: Int
)

