package com.furkancosgun.instagram

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.furkancosgun.instagram.Views.Auth.SignInFragment
import com.furkancosgun.instagram.Views.Utilites.Companion.changeFragment
import com.furkancosgun.instagram.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        changeFragment(SignInFragment(), this, R.id.fragment_renderer)
    }
}