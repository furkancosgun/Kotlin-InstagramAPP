package com.furkancosgun.instagram.Views.Auth

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.furkancosgun.instagram.HomeActivity
import com.furkancosgun.instagram.R
import com.furkancosgun.instagram.Views.Utilites.Companion.changeFragment
import com.furkancosgun.instagram.databinding.FragmentSignInBinding
import com.google.firebase.auth.FirebaseAuth


class SignInFragment : Fragment() {

    private lateinit var auth: FirebaseAuth
    private lateinit var binding: FragmentSignInBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSignInBinding.inflate(layoutInflater, container, false)


        binding.txtSignUp.setOnClickListener {
            changeFragment(SignUpFragment(), requireActivity(), R.id.fragment_renderer)
        }
        binding.btnSignIn.setOnClickListener { view ->

            val intent = Intent(activity, HomeActivity::class.java)
            startActivity(intent)

        }

        return binding.root
    }


}