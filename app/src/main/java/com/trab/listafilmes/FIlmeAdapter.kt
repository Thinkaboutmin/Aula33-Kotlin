package com.trab.listafilmes

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class FIlmeAdapter(val list: ArrayList<Unit>) : RecyclerView.Adapter<FIlmeAdapter.FilmeHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmeHolder {

    }

    override fun onBindViewHolder(holder: FilmeHolder, position: Int) {

    }

    override fun getItemCount(): Int = list.size

    inner class FilmeHolder(view: View) : RecyclerView.ViewHolder(view) {

    }
}