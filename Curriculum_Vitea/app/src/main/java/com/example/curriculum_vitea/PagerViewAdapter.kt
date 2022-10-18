package com.example.curriculum_vitea

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.curriculum_vitea.Fragments.AboutMeFragment
import com.example.curriculum_vitea.Fragments.Contact
import com.example.curriculum_vitea.Fragments.HomeFragment
import com.example.curriculum_vitea.Fragments.WorkExperienceFragment

internal class PagerViewAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm!!) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                HomeFragment()
            }
            1 -> {
                AboutMeFragment()
            }
            2 -> {
                WorkExperienceFragment()
            }
            3 -> {
                Contact()
            }
            else -> Fragment()
        }
    }

    override fun getCount(): Int {

        return 4
    }

}