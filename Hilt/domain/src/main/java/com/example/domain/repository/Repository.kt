package com.example.domain.repository

import com.example.domain.entity.TeamBasicInfo
import io.reactivex.Single

interface Repository {
    fun getTeamList() : Single<TeamBasicInfo>

}