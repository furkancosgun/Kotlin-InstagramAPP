package com.furkancosgun.instagram.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.furkancosgun.instagram.Models.User
import com.furkancosgun.instagram.R
import com.squareup.picasso.Picasso

class SearchAdapter(val context: Context, val list: List<User>) :
    RecyclerView.Adapter<SearchAdapter.SearchViewHolder>() {
    inner class SearchViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val profileImg: ImageView
        val uname: TextView

        init {
            profileImg = view.findViewById(R.id.imgProfile)
            uname = view.findViewById(R.id.txtUserName)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchViewHolder {
        val design = LayoutInflater.from(context).inflate(R.layout.rv_search_item, parent, false)
        return SearchViewHolder(design)
    }

    override fun onBindViewHolder(holder: SearchViewHolder, position: Int) {
        holder.uname.text = list[position].userName
        Picasso.with(context).load(list[position].profileImg).into(holder.profileImg)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}