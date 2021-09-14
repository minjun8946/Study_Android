package com.example.data.repository

import com.example.data.datasource.DataSource
import com.example.data.entity.toEntity
import com.example.domain.entity.TeamBasicInfo
import com.example.domain.repository.Repository
import io.reactivex.Single

class RepositoryImpl(private val dataSource: DataSource) : Repository {
    override fun getTeamList(): Single<TeamBasicInfo> =
        dataSource.getTeamData().map { it.toEntity() }
}