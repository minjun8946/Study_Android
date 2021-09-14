package com.example.data.reomte

import com.example.data.entity.TeamBasicInfoData
import io.reactivex.Single
import retrofit2.http.GET

interface ApiService {
    @GET("teams")
    fun getTeamList() : Single<TeamBasicInfoData>
}