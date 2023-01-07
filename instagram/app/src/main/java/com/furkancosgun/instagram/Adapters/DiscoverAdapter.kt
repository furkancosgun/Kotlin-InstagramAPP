package com.furkancosgun.instagram.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.furkancosgun.instagram.Models.Post
import com.furkancosgun.instagram.R
import com.squareup.picasso.Picasso

class DiscoverAdapter(val context: Context, val list: List<Post>) :
    RecyclerView.Adapter<DiscoverAdapter.DiscoverViewHolder>() {
    inner class DiscoverViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imgContent: ImageView

        init {
            imgContent = view.findViewById(R.id.imgContent)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DiscoverViewHolder {
        val desing = LayoutInflater.from(context).inflate(R.layout.rv_discover_item, parent, false)
        return DiscoverViewHolder(desing)
    }

    override fun onBindViewHolder(holder: DiscoverViewHolder, position: Int) {
        Picasso.with(context).load(list[position].contentImg).into(holder.imgContent)
    }

    override fun getItemCount(): Int {
        return list.count()
    }
}