package com.nirali.dagger_demo.written.provider

import com.nirali.dagger_demo.data.NetworkService


class NetworkServiceProvider {

    private val networkService = NetworkService()

    fun get(): NetworkService {
        return networkService
    }

}