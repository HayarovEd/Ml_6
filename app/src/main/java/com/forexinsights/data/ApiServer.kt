package com.forexinsights.data

import com.forexinsights.domain.model.basedto.BaseDto
import retrofit2.http.GET

interface ApiServer {
    @GET ("523/db.json")
    suspend fun getDataDb () : BaseDto
}