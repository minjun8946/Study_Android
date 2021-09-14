package com.example.data.datasource

import com.example.data.entity.TeamBasicInfoData
import com.example.data.reomte.ApiService
import io.reactivex.Single

class DataSourceImpl (private val apiService : ApiService) : DataSource {

    override fun getTeamData(): Single<TeamBasicInfoData> = apiService.getTeamList()
}