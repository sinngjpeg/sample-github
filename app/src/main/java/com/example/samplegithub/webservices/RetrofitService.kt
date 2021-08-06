package com.example.samplegithub.webservices

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitService {
    val baseUrl = "https://api.github.com/"
    fun initRepositories(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val serviceJava = initRepositories().create(GitHubInterfaceJava::class.java)
    val serviceKotlin = initRepositories().create(GitHubInterfaceKotlin::class.java)

}