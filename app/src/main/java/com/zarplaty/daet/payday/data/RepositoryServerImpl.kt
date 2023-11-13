package com.zarplaty.daet.payday.data

import android.util.Log
import com.zarplaty.daet.payday.domain.RepositoryServer
import javax.inject.Inject
import com.zarplaty.daet.payday.domain.model.basedto.BaseDto
import com.zarplaty.daet.payday.data.Resource.Error
import com.zarplaty.daet.payday.data.Resource.Success

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