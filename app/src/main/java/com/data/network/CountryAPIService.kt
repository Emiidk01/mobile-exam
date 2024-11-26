package com.data.network

import com.data.network.model.CasesObject
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface CountryAPIService {
    @GET("?country=canada")
    fun getCovidData(
        @Header("X-Api-Key") apiKey: String
    ): Call<List<CasesObject>>
}