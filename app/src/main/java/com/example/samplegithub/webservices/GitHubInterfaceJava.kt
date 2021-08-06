package com.example.samplegithub.webservices

import android.telecom.Call
import com.example.samplegithub.model.data.ItemRepositoryJava
import retrofit2.http.GET
import retrofit2.http.Query

class GitHubInterfaceJava {
    @GET("search/repositories?q=language:Java&sort=stars"),
    fun getRepositories(@Query("page") page: Int): Call<ItemRepositoryJava>

//    @GET("repos/{owner}/{repo}/pulls")
//    fun getPullRequests(
//        @Path("owner") creator: String,
//        @Path("repo") repository: String
//    ): Call<List<PullRequest>>
}