package com.dor.zarplaty.daet.payday.domain

import com.dor.zarplaty.daet.payday.data.Resource
import com.dor.zarplaty.daet.payday.domain.model.Sub1
import com.dor.zarplaty.daet.payday.domain.model.Sub2
import com.dor.zarplaty.daet.payday.domain.model.Sub3
import com.dor.zarplaty.daet.payday.domain.model.Sub5


interface RepositoryAnalytic {
    suspend fun getSub1 (
        applicationToken: String,
        userId: String,
        myTrackerId: String,
        appMetricaId: String,
        appsflyer: String,
        firebaseToken: String
    ): Resource<Sub1>

    suspend fun getSub2 (
        applicationToken: String,
        userId: String,
        appsflyer: String,
        myTracker: String,
    ): Resource<Sub2>

    suspend fun getSub3 (
        applicationToken: String,
        userId: String,
        myTrackerId: String,
        appMetricaId: String,
        appsflyer: String,
        firebaseToken: String,
    ): Resource<Sub3>

    suspend fun getSub5 (
        applicationToken: String,
        userId: String,
        gaid:String
    ): Resource<Sub5>
}