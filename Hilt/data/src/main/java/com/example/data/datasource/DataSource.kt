package com.example.data.datasource

import com.example.data.entity.TeamBasicInfoData
import io.reactivex.Single

interface DataSource {
    fun getTeamData() : Single<TeamBasicInfoData>
}