package com.furkancosgun.instagram.Views

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

class Utilites {
    companion object {
        fun changeFragment(fragment: Fragment, activity: FragmentActivity, fragmentRenderer: Int) {
            val fragmentTransaction = activity.supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(fragmentRenderer, fragment)
            fragmentTransaction.commit()
        }
    }
}