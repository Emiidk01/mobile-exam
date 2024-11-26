package com.domain

import com.data.network.model.CasesObject
import com.data.repositories.CountryRepository

class CountryRequirement {

    private val repository = CountryRepository()

    suspend operator fun invoke(apiKey: String): List<CasesObject>? {
        val data = repository.getCovidData(apiKey)
        println("Requirement - Data received: $data")
        return data
    }
}