package com.forexinsights.domain

import com.forexinsights.data.Resource
import com.forexinsights.domain.model.basedto.BaseDto

interface RepositoryServer {
    suspend fun getDataDb() : Resource<BaseDto>
}