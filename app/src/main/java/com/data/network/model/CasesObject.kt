package com.data.network.model

import com.google.gson.annotations.SerializedName

data class CasesObject(
    @SerializedName("country") var countryName: String,
    @SerializedName("region") var region: String,
    @SerializedName("cases") var cases: Map<String, Cases>
)

data class Cases(
    @SerializedName("total") var totalCases: Int,
    @SerializedName("new") var newCases: String
)
