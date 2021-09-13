package com.example.practicehilt.data

import com.google.gson.annotations.SerializedName

data class BasicTeamData(
    @SerializedName("id")
    val teamId : Int,
    @SerializedName("name")
    val teamName : String,
    @SerializedName("city")
    val city : String,
    @SerializedName("conference")
    val conference : String,
    @SerializedName("division")
    val division : String
)
