package com.furkancosgun.instagram.Views.Messages

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.furkancosgun.instagram.Adapters.SearchAdapter
import com.furkancosgun.instagram.Models.Users
import com.furkancosgun.instagram.R
import com.furkancosgun.instagram.Views.Home.HomeFragment
import com.furkancosgun.instagram.Views.Utilites
import com.furkancosgun.instagram.databinding.FragmentMessageListBinding

class MessageListFragment : Fragment() {

    private lateinit var binding: FragmentMessageListBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMessageListBinding.inflate(layoutInflater, container, false)
        binding.btnBack.setOnClickListener {
            Utilites.changeFragment(HomeFragment(), requireActivity(), R.id.homeFragment)
        }

        binding.rvMessageListRenderer.adapter = SearchAdapter(requireContext(), Users.users)
        binding.rvMessageListRenderer.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.rvMessageListRenderer.setHasFixedSize(true)
        binding.txtUsername.text = Users.user.userName

        return binding.root
    }

}