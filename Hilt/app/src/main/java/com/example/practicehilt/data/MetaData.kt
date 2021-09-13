package com.example.practicehilt.data

import com.google.gson.annotations.SerializedName

data class MetaData(
    @SerializedName("total_pages")
    val totalPage : Int,
    @SerializedName("next_page")
    val page : Int?
)