package com.furkancosgun.instagram.Views.Discover

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.furkancosgun.instagram.Adapters.SearchAdapter
import com.furkancosgun.instagram.Models.Users
import com.furkancosgun.instagram.databinding.FragmentDiscoverBinding

class DiscoverFragment : Fragment() {

    private lateinit var binding: FragmentDiscoverBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDiscoverBinding.inflate(layoutInflater, container, false)
        binding.searchRCView.adapter = SearchAdapter(requireContext(), Users.users)
        binding.searchRCView.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.searchRCView.setHasFixedSize(true)
        return binding.root
    }

}