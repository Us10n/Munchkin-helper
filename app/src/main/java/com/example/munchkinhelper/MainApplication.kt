package com.example.munchkinhelper

import android.app.Application
import com.example.munchkinhelper.di.component.AppComponent
import com.example.munchkinhelper.di.component.DaggerAppComponent

class MainApplication : Application() {
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
//        appComponent=DaggerAppComponent.builder().build()
    }
}