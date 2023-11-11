package com.dor.zarplaty.daet.payday.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import com.dor.zarplaty.daet.payday.data.RepositoryAnalyticImpl
import com.dor.zarplaty.daet.payday.data.RepositoryServerImpl
import com.dor.zarplaty.daet.payday.data.ServiceImpl
import com.dor.zarplaty.daet.payday.data.SharedKeeperImpl
import com.dor.zarplaty.daet.payday.domain.RepositoryAnalytic
import com.dor.zarplaty.daet.payday.domain.RepositoryServer
import com.dor.zarplaty.daet.payday.domain.Service
import com.dor.zarplaty.daet.payday.domain.SharedKepper
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