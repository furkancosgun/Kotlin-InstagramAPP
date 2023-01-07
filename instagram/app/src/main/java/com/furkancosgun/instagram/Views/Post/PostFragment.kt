package com.furkancosgun.instagram.Views.Post

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.furkancosgun.instagram.Adapters.DiscoverAdapter
import com.furkancosgun.instagram.Models.Posts
import com.furkancosgun.instagram.databinding.FragmentPostBinding

class PostFragment : Fragment() {

    private lateinit var binding: FragmentPostBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPostBinding.inflate(layoutInflater, container, false)
        binding.discoverRCView.adapter = DiscoverAdapter(requireContext(), Posts.posts)
        binding.discoverRCView.layoutManager =
            GridLayoutManager(requireContext(), 3, GridLayoutManager.VERTICAL, false)
        binding.discoverRCView.setHasFixedSize(true)
        return binding.root
    }
}