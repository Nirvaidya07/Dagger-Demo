package com.nirali.dagger_demo

import android.app.Application
import android.util.Log
import com.nirali.dagger_demo.data.DatabaseService
import com.nirali.dagger_demo.data.NetworkService
import com.nirali.dagger_demo.written.MyApplicationComponent

class MyApplication : Application() {

    private lateinit var applicationComponent: MyApplicationComponent

    lateinit var networkService1: NetworkService
    lateinit var networkService2: NetworkService

    lateinit var databaseService1: DatabaseService
    lateinit var databaseService2: DatabaseService

    override fun onCreate() {
        super.onCreate()
        getDependencies()
        Log.d("MyApplication", "networkService1: ${networkService1.hashCode()}")
        Log.d("MyApplication", "networkService2: ${networkService2.hashCode()}")
        Log.d("MyApplication", "databaseService1: ${databaseService1.hashCode()}")
        Log.d("MyApplication", "databaseService2: ${databaseService2.hashCode()}")
    }

    private fun getDependencies() {
        applicationComponent = MyApplicationComponent()
        applicationComponent.inject(this)
    }

}