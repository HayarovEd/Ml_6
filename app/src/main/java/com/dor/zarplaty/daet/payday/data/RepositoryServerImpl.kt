package com.dor.zarplaty.daet.payday.data

import android.util.Log
import com.dor.zarplaty.daet.payday.domain.RepositoryServer
import javax.inject.Inject
import com.dor.zarplaty.daet.payday.domain.model.basedto.BaseDto
import com.dor.zarplaty.daet.payday.data.Resource.Error
import com.dor.zarplaty.daet.payday.data.Resource.Success

class RepositoryServerImpl @Inject constructor(
    private val apiServer: ApiServer
) : RepositoryServer {
    override suspend fun getDataDb(): Resource<BaseDto> {
        return try {
            val folder = apiServer.getDataDb()
            Log.d("DATADB", "dATA DB:${folder.loans.first().id}")
            Success(
                data = folder
            )
        } catch (e: Exception) {
            e.printStackTrace()
            Error(e.message ?: "An unknown error")
        }
    }
}