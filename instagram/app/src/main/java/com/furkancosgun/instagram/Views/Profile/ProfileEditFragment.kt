package com.furkancosgun.instagram.Views.Profile

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.furkancosgun.instagram.HomeActivity
import com.furkancosgun.instagram.databinding.FragmentProfileEditBinding

class ProfileEditFragment : Fragment() {

    private lateinit var binding: FragmentProfileEditBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =
            FragmentProfileEditBinding.inflate(layoutInflater, container, false)

        val intent = Intent(activity, HomeActivity::class.java)
        binding.btnClose.setOnClickListener {
            startActivity(intent)
        }
        binding.btnSave.setOnClickListener {
            startActivity(intent)
        }
        return binding.root
    }

}