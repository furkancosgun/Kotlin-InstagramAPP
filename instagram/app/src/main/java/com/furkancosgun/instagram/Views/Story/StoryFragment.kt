package com.furkancosgun.instagram.Views.Story

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.furkancosgun.instagram.R
import com.furkancosgun.instagram.Views.Home.HomeFragment
import com.furkancosgun.instagram.Views.Utilites
import com.furkancosgun.instagram.databinding.FragmentStoryBinding


class StoryFragment : Fragment() {

    private lateinit var binding: FragmentStoryBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentStoryBinding.inflate(layoutInflater, container, false)
        binding.btnBack.setOnClickListener {
            Utilites.changeFragment(HomeFragment(), requireActivity(), R.id.homeFragment)
        }
        
        return binding.root
    }

}