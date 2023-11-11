package com.dor.zarplaty.daet.payday.domain.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class AffSub5(
    @SerializedName ("application_token")
    val applicationToken: String,
    @SerializedName ("user_id")
    val userId: String,
    @SerializedName ("payload_affsub5")
    val payloadAffsub: String
): Serializable
