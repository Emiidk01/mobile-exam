package com.data.network

import com.data.network.model.CasesObject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class CountryAPIClient {

    private val apiService: CountryAPIService = CasesNetworkModule.invoke(null)

    suspend fun getCovidData(apiKey: String): List<CasesObject>? {
        return withContext(Dispatchers.IO) {
            try {
                val response = apiService.getCovidData(apiKey).execute()
                if (response.isSuccessful) {
                    println("API Client - Successful response: ${response.body()}")
                    response.body()
                } else {
                    println("API Client - Response not successful: ${response.errorBody()}")
                    emptyList()
                }
            } catch (e: Exception) {
                e.printStackTrace()
                println("API Client - Exception: ${e.message}")
                emptyList()
            }
        }
    }
}