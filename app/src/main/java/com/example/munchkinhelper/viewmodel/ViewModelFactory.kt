package com.example.munchkinhelper.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class ViewModelFactory:ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(PlayerListFragmentViewModel::class.java)) {
            return PlayerListFragmentViewModel() as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}