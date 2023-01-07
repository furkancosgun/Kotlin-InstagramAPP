package com.furkancosgun.instagram.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.furkancosgun.instagram.Models.Post
import com.furkancosgun.instagram.R
import com.squareup.picasso.Picasso


class PostAdapter(val context: Context, val list: List<Post>) :
    RecyclerView.Adapter<PostAdapter.PostViewHolder>() {
    inner class PostViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imgProfile: ImageView
        val txtUname: TextView
        val imgContent: ImageView
        val txtLikeSize: TextView
        val txtContent: TextView

        init {
            imgProfile = view.findViewById(R.id.imgProfile)
            txtUname = view.findViewById(R.id.txtUsername)
            imgContent = view.findViewById(R.id.imgContent)
            txtLikeSize = view.findViewById(R.id.txtLikeSize)
            txtContent = view.findViewById(R.id.txtContent)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val design = LayoutInflater.from(context).inflate(R.layout.rv_content_item, parent, false)
        return PostViewHolder(design)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.txtLikeSize.text = list[position].likeSize
        holder.txtUname.text = list[position].uname
        holder.txtContent.text = list[position].contentTxt
        Picasso.with(context).load(list[position].contentImg).into(holder.imgContent)
        Picasso.with(context).load(list[position].imgProfile).into(holder.imgProfile)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}