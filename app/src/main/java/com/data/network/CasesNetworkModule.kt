package com.data.network

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object CasesNetworkModule {
    private val gsonFactory: GsonConverterFactory = GsonConverterFactory.create(GsonBuilder().create())
    private val okHttpClient: OkHttpClient = OkHttpClient.Builder().build()

    operator fun invoke(apiKey: Any?): CountryAPIService {
        return Retrofit.Builder()
            .baseUrl("https://api.api-ninjas.com/v1/covid19/")
            .addConverterFactory(gsonFactory)
            .client(okHttpClient)
            .build()
            .create(CountryAPIService::class.java)
    }
}