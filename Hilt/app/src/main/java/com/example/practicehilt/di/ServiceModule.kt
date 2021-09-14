package com.example.practicehilt.di

import com.example.domain.repository.Repository
import com.example.domain.service.Service
import com.example.domain.service.ServiceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ServiceModule {

    @Singleton
    @Provides
    fun provideService(
        repository: Repository
    ) : Service = ServiceImpl(repository)
}