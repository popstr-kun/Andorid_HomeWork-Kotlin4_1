package com.example.lab12

import android.app.Service
import android.content.Intent
import android.os.IBinder
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MyService : Service() {

    override fun onBind(intent: Intent): IBinder? = null

    override fun onCreate() {
        val intent = Intent(this,MainActivity2::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        super.onCreate()
        GlobalScope.launch {
            delay(3000)
            startActivity(intent)
        }
    }
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return super.onStartCommand(intent, flags, startId)
        return START_NOT_STICKY
    }

}