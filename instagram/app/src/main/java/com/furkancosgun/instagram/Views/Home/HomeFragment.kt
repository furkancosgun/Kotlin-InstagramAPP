package com.furkancosgun.instagram.Views.Home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.furkancosgun.instagram.Adapters.PostAdapter
import com.furkancosgun.instagram.Adapters.StoryAdapter
import com.furkancosgun.instagram.Models.Posts
import com.furkancosgun.instagram.Models.Stories
import com.furkancosgun.instagram.R
import com.furkancosgun.instagram.Views.Messages.MessageListFragment
import com.furkancosgun.instagram.Views.Story.StoryFragment
import com.furkancosgun.instagram.Views.Utilites
import com.furkancosgun.instagram.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        binding.btnGoMessages.setOnClickListener {
            Utilites.changeFragment(MessageListFragment(), requireActivity(), R.id.homeFragment)
        }
        binding.btnGoStoryScreen.setOnClickListener {
            Utilites.changeFragment(StoryFragment(), requireActivity(), R.id.homeFragment)
        }
        val adapter = StoryAdapter(requireContext(), Stories.stories)
        binding.rvStoryRenderer.adapter = adapter
        binding.rvStoryRenderer.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.rvStoryRenderer.setHasFixedSize(true)

        val contentAdapter = PostAdapter(requireContext(), Posts.posts)
        binding.rvContentRenderer.adapter = contentAdapter
        binding.rvContentRenderer.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.rvContentRenderer.setHasFixedSize(true)
        return binding.root
    }

}