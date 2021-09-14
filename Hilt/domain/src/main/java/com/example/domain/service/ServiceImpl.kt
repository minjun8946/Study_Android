package com.example.domain.service

import com.example.domain.base.Result
import com.example.domain.entity.TeamBasicInfo
import com.example.domain.repository.Repository
import com.example.domain.toResult
import io.reactivex.Single

class ServiceImpl(private val repository: Repository) : Service {
    override fun getTeamList(): Single<Result<TeamBasicInfo>> = repository.getTeamList().toResult()
}