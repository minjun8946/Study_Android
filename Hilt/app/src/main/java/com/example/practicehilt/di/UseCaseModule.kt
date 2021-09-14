package com.example.practicehilt.di

import com.example.domain.base.UseCase
import com.example.domain.service.Service
import com.example.domain.usecase.TeamUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {

    @Singleton
    @Provides
    fun provideUseCase(
        service: Service
    )  = TeamUseCase(service)
}