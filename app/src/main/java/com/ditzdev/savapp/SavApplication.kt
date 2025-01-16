package com.ditzdev.savapp

import android.app.Application
import com.ditzdev.savapp.handler.CrashHandler

class SavApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        CrashHandler.initialize(this)
    }
}