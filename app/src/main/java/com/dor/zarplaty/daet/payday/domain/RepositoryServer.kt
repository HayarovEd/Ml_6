package com.dor.zarplaty.daet.payday.domain

import com.dor.zarplaty.daet.payday.data.Resource
import com.dor.zarplaty.daet.payday.domain.model.basedto.BaseDto

interface RepositoryServer {
    suspend fun getDataDb() : Resource<BaseDto>
}