package com.framework.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.data.network.model.CasesObject
import com.example.kotlin.examen.R
import com.framework.adapters.viewholders.CountryViewHolder

class CountryAdapter(private val casesList: List<CasesObject>) : RecyclerView.Adapter<CountryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return CountryViewHolder(layoutInflater.inflate(R.layout.item_cases, parent, false))
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        val item = casesList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int {
        return casesList.size
    }
}