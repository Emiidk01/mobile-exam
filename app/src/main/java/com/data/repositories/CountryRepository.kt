package com.data.repositories

import com.data.network.CountryAPIClient
import com.data.network.model.CasesObject

class CountryRepository {
    private val apiClient = CountryAPIClient()

    suspend fun getCovidData(apiKey: String): List<CasesObject>? {
        val cases = apiClient.getCovidData(apiKey)
        println("Repository - Cases received: $cases")
        return cases
    }
}