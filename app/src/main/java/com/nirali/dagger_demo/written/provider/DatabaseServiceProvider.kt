package me.amitshekhar.example.written.provider

import me.amitshekhar.example.data.DatabaseService

class DatabaseServiceProvider {

    fun get(): DatabaseService {
        return DatabaseService()
    }

}