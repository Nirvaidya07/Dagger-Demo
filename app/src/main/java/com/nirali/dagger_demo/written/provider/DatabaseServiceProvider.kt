package com.nirali.dagger_demo.written.provider

import com.nirali.dagger_demo.data.DatabaseService

class DatabaseServiceProvider {

    fun get(): DatabaseService {
        return DatabaseService()
    }

}