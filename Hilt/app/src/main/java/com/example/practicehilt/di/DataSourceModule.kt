package com.example.practicehilt.di

import com.example.data.datasource.DataSource
import com.example.data.datasource.DataSourceImpl
import com.example.data.reomte.ApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class DataSourceModule {
    @Singleton
    @Provides
    fun provideDataSource(
        apiService: ApiService
    ) : DataSource = DataSourceImpl(apiService)
}