package com.example.samplegithub.model.data

import com.google.gson.annotations.SerializedName

class ItemRepositoryKotlin(
    @SerializedName("items") val itemsKotlin: List<Repository>
)