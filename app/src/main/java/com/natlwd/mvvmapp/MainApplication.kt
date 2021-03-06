package com.natlwd.mvvmapp

import android.app.Application
import android.content.Context

class MainApplication : Application() {
    companion object {
        lateinit var mainApplication: MainApplication
        fun getContext(): Context {
            return mainApplication.applicationContext
        }
    }

    override fun onCreate() {
        super.onCreate()
        mainApplication = this
    }
}