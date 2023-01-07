package com.furkancosgun.instagram

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.furkancosgun.instagram.Views.Discover.DiscoverFragment
import com.furkancosgun.instagram.Views.Home.HomeFragment
import com.furkancosgun.instagram.Views.Post.PostFragment
import com.furkancosgun.instagram.Views.Profile.ProfileFragment
import com.furkancosgun.instagram.Views.Utilites
import com.furkancosgun.instagram.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Utilites.changeFragment(HomeFragment(), this, R.id.homeFragment)
        binding.bottomNavigation.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home -> {
                    Utilites.changeFragment(HomeFragment(), this, R.id.homeFragment)
                    return@setOnItemSelectedListener true
                }
                R.id.search -> {
                    Utilites.changeFragment(DiscoverFragment(), this, R.id.homeFragment)
                    return@setOnItemSelectedListener true
                }
                R.id.media -> {
                    Utilites.changeFragment(PostFragment(), this, R.id.homeFragment)
                    return@setOnItemSelectedListener true
                }
                R.id.profile -> {
                    Utilites.changeFragment(ProfileFragment(), this, R.id.homeFragment)
                    return@setOnItemSelectedListener true
                }
                else -> {
                    return@setOnItemSelectedListener false
                }
            }
        }

    }


}