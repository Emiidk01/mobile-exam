package com.framework.adapters.viewholders

//noinspection SuspiciousImport
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.data.network.model.CasesObject
import com.example.kotlin.examen.R

class CountryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val regionName: TextView = view.findViewById(R.id.tv_region)
    private val date: TextView = view.findViewById(R.id.tv_fecha)
    private val totalCases: TextView = view.findViewById(R.id.tv_casos_totales)
    private val newCases: TextView = view.findViewById(R.id.tv_casos_nuevos)

    fun render(casesModel: CasesObject) {
        regionName.text = casesModel.region
        date.text = casesModel.cases.keys.first()
        totalCases.text = casesModel.cases.values.first().totalCases.toString()
        newCases.text = casesModel.cases.values.first().newCases
    }
}