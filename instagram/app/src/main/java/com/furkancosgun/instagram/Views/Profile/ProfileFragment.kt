package com.furkancosgun.instagram.Views.Profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.furkancosgun.instagram.Adapters.DiscoverAdapter
import com.furkancosgun.instagram.Models.Posts
import com.furkancosgun.instagram.Models.Users
import com.furkancosgun.instagram.databinding.FragmentProfileBinding
import com.squareup.picasso.Picasso


class ProfileFragment : Fragment() {

    private lateinit var binding: FragmentProfileBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(layoutInflater, container, false)
        val user = Users.user

        Picasso.with(requireContext()).load(user.profileImg).into(binding.imgProfile)
        binding.txtFollowercount.text = user.followerCount
        binding.txtLink.text = user.link
        binding.txtName.text = user.name
        binding.txtFollwingcount.text = user.followingCount
        binding.txtBio.text = user.bio
        binding.txtPostcount.text = user.postCount
        binding.txtUsername.text = user.userName


        binding.profilePhotoRenderer.adapter = DiscoverAdapter(requireContext(), Posts.posts)
        binding.profilePhotoRenderer.layoutManager =
            GridLayoutManager(requireContext(), 3, GridLayoutManager.VERTICAL, false)
        binding.profilePhotoRenderer.setHasFixedSize(true)

        return binding.root
    }

}