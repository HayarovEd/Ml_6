package com.dor.zarplaty.daet.payday.data

import com.dor.zarplaty.daet.payday.domain.model.AffSub1
import com.dor.zarplaty.daet.payday.domain.model.AffSub2
import com.dor.zarplaty.daet.payday.domain.model.AffSub3
import com.dor.zarplaty.daet.payday.domain.model.AffSub5
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiAnalytic {
    @POST("subs/aff_sub1")
    suspend fun getSub1(@Body affSub1: AffSub1): String

    @POST("subs/aff_sub2")
    suspend fun getSub2(@Body affSub2: AffSub2): String

    @POST("subs/aff_sub3")
    suspend fun getSub3(@Body affSub3: AffSub3): String

    @POST("subs/aff_sub5")
    suspend fun getSub5(@Body affSub5: AffSub5): String
}