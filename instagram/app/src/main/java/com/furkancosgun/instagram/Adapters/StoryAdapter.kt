package com.furkancosgun.instagram.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.furkancosgun.instagram.Models.Story
import com.furkancosgun.instagram.R
import com.squareup.picasso.Picasso

class StoryAdapter(val context: Context, val list: List<Story>) :
    RecyclerView.Adapter<StoryAdapter.StoryViewHolder>() {
    inner class StoryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val img: ImageView
        val userName: TextView

        init {
            img = view.findViewById(R.id.imgProfile)
            userName = view.findViewById(R.id.txtUsername)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoryViewHolder {
        val desing = LayoutInflater.from(context).inflate(R.layout.rv_story_item, parent, false)
        return StoryViewHolder(desing)
    }


    override fun onBindViewHolder(holder: StoryViewHolder, position: Int) {
        Picasso.with(context).load(list[position].profileImg).into(holder.img)
        holder.userName.text = list[position].name
    }

    override fun getItemCount(): Int {
        return list.size
    }
}