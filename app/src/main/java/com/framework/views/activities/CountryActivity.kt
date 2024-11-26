package com.framework.views.activities

import android.app.Activity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewbinding.ViewBinding
import com.example.kotlin.examen.databinding.ActivityCountryBinding
import com.framework.adapters.CountryAdapter
import com.framework.viewmodel.CountryViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.http.Query

class CountryActivity: AppCompatActivity() {

    private lateinit var binding: ActivityCountryBinding
    private val viewModel: CountryViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCountryBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
        observeViewModel()
        viewModel.getCovidData("rMDOQVSAOpHab3I65cqxlg==EkwityQtbSIhyAiB")
    }

    private fun initRecyclerView() {
        binding.rvCountries.layoutManager = LinearLayoutManager(this)
    }

    private fun observeViewModel() {
        viewModel.countryList.observe(this, Observer { countryList ->
            binding.rvCountries.adapter = countryList?.let { CountryAdapter(it) }
        })
    }
}