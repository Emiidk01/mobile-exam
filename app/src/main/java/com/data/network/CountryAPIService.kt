package com.data.network

import com.data.network.model.CasesObject
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header

interface CountryAPIService {
    @GET("?country=canada")
    fun getCovidData(
        @Header("rMDOQVSAOpHab3I65cqxlg==EkwityQtbSIhyAiB\n") apiKey: String
    ): Call<List<CasesObject>>
}