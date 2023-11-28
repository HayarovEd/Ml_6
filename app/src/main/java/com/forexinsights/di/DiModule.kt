package com.forexinsights.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import com.forexinsights.data.RepositoryAnalyticImpl
import com.forexinsights.data.RepositoryServerImpl
import com.forexinsights.data.ServiceImpl
import com.forexinsights.data.SharedKeeperImpl
import com.forexinsights.domain.RepositoryAnalytic
import com.forexinsights.domain.RepositoryServer
import com.forexinsights.domain.Service
import com.forexinsights.domain.SharedKepper
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class DiModule {

    @Binds
    @Singleton
    abstract fun bindService(service: ServiceImpl): Service

    @Binds
    @Singleton
    abstract fun bindKeeper(sharedKeeper: SharedKeeperImpl): SharedKepper

    @Binds
    @Singleton
    abstract fun bindRepositoryAnalytic(repository: RepositoryAnalyticImpl): RepositoryAnalytic

    @Binds
    @Singleton
    abstract fun bindRepositoryServer(repository: RepositoryServerImpl): RepositoryServer

}