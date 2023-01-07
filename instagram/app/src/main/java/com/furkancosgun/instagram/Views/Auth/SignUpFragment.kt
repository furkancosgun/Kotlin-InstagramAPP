package com.furkancosgun.instagram.Views.Auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.furkancosgun.instagram.R
import com.furkancosgun.instagram.Views.Profile.ProfileEditFragment
import com.furkancosgun.instagram.Views.Utilites.Companion.changeFragment
import com.furkancosgun.instagram.databinding.FragmentSignUpBinding


class SignUpFragment : Fragment() {


    private lateinit var binding: FragmentSignUpBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSignUpBinding.inflate(layoutInflater, container, false)

        binding.txtSignIn.setOnClickListener {
            changeFragment(SignInFragment(), requireActivity(), R.id.fragment_renderer)
        }
        binding.btnSignUp.setOnClickListener {
            changeFragment(ProfileEditFragment(), requireActivity(), R.id.fragment_renderer)
        }
        return binding.root
    }


}