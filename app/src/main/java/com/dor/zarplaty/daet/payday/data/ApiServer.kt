package com.dor.zarplaty.daet.payday.data

import com.dor.zarplaty.daet.payday.domain.model.basedto.BaseDto
import retrofit2.http.GET

interface ApiServer {
    @GET ("523/db.json")
    suspend fun getDataDb () : BaseDto
}