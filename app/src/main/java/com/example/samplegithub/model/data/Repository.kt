package com.example.samplegithub.model.data

import com.google.gson.annotations.SerializedName

data class Repository(
    @SerializedName("total_count") val totalPages: Int,
    @SerializedName("name") var nameRepository: String,
    @SerializedName("description") var descriptionRepository: String,
    @SerializedName("forks_count") var numberShare: Long,
    @SerializedName("stargazers_count") var numberStar: Long
)