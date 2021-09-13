package com.example.practicehilt

import com.example.practicehilt.data.TeamBasicInfoData
import io.reactivex.Single
import retrofit2.http.GET

interface ApiService {
    @GET("teams")
    fun getTeamList() : Single<TeamBasicInfoData>
}