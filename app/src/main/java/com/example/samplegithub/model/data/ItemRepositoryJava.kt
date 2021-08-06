package com.example.samplegithub.model.data

import com.google.gson.annotations.SerializedName

data class ItemRepositoryJava(
    @SerializedName("items") val itemsJava: List<Repository>
)