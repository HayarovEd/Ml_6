package com.forexinsights.domain.model

import com.google.gson.annotations.SerializedName

data class FolderPathDto(
    @SerializedName("actualbackend")
    val folder: String
)
