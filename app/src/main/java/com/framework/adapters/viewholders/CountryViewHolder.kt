package com.framework.adapters.viewholders

//noinspection SuspiciousImport
import android.annotation.SuppressLint
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

    @SuppressLint("SetTextI18n")
    fun render(casesModel: CasesObject) {
        regionName.text = "Region: ${casesModel.region}"
        date.text = "Fecha: ${casesModel.cases.keys.first()}"
        totalCases.text = "Casos Totales: ${casesModel.cases.values.first().totalCases}"
        newCases.text = "Casos Nuevos: ${casesModel.cases.values.first().newCases}"
    }
}