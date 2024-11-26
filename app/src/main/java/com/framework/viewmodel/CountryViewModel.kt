package com.framework.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.data.network.model.CasesObject
import com.domain.CountryRequirement
import kotlinx.coroutines.launch

class CountryViewModel : ViewModel() {
    private val countryRepository = CountryRequirement()
    private val _countryList = MutableLiveData<List<CasesObject>>()
    val countryList: LiveData<List<CasesObject>> get() = _countryList

    fun getCovidData(apiKey: String) {
        viewModelScope.launch {
            val country = countryRepository.invoke(apiKey)
            println("ViewModel - Country received: $country")
            _countryList.postValue(country ?: emptyList())
        }
    }
}