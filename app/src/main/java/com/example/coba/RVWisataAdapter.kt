package com.example.coba

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.coba.entity.wisata

class RVWisataAdapter(private val data: Array<wisata>) : RecyclerView.Adapter<RVWisataAdapter.viewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup,viewType: Int): viewHolder{
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.rv_wisata, parent, false)
        return viewHolder(itemView)
    }
    override fun onBindViewHolder(holder: viewHolder,position: Int) {
        val currentItem = data[position]
        holder.tvNamaWisata.text = currentItem.name
        holder.tvLokasi.text = currentItem.lokasi
        holder.tvImageWisata.setImageResource(currentItem.image)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    class viewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val tvNamaWisata : TextView = itemView.findViewById(R.id.tv_nama_wisata)
        val tvLokasi : TextView = itemView.findViewById(R.id.tv_lokasi_wisata)
        val tvImageWisata : ImageView = itemView.findViewById(R.id.imageWisata)
    }
}