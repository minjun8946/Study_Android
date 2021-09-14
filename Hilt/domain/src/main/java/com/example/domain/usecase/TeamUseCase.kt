package com.example.domain.usecase

import com.example.domain.base.Result
import com.example.domain.base.UseCase
import com.example.domain.entity.TeamBasicInfo
import com.example.domain.service.Service
import io.reactivex.Single

class TeamUseCase (
    private val teamService: Service
) : UseCase<Unit, Result<TeamBasicInfo>>() {
    override fun create(data: Unit): Single<Result<TeamBasicInfo>> {
        return teamService.getTeamList()
    }
}