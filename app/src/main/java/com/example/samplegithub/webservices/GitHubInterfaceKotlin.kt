package com.example.samplegithub.webservices

import android.telecom.Call
import com.example.samplegithub.model.data.ItemRepositoryKotlin
import retrofit2.http.GET
import retrofit2.http.Query

class GitHubInterfaceKotlin {
    @GET("search/repositories?q=language:Kotlin&sort=stars"),
    fun getRepositories(@Query("page") page: Int): Call<ItemRepositoryKotlin>

//    @GET("repos/{owner}/{repo}/pulls")
//    fun getPullRequests(
//        @Path("owner") creator: String,
//        @Path("repo") repository: String
//    ): Call<List<PullRequest>>
}