package com.nirali.dagger_demo.written

import me.amitshekhar.example.written.provider.DatabaseServiceProvider
import com.nirali.dagger_demo.written.provider.NetworkServiceProvider

class MyApplicationComponent {

    private val networkServiceProvider = NetworkServiceProvider()
    private val databaseServiceProvider = DatabaseServiceProvider()

    fun inject(application: MyApplication) {
        application.networkService1 = networkServiceProvider.get()
        application.networkService2 = networkServiceProvider.get()
        application.databaseService1 = databaseServiceProvider.get()
        application.databaseService2 = databaseServiceProvider.get()
    }

}