package com.zarplaty.daet.payday.domain

import com.zarplaty.daet.payday.data.Resource
import com.zarplaty.daet.payday.domain.model.basedto.BaseDto

interface RepositoryServer {
    suspend fun getDataDb() : Resource<BaseDto>
}