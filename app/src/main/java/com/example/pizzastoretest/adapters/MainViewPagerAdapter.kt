package com.example.pizzastoretest.adapters

import androidx.core.content.res.FontResourcesParserCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.pizzastoretest.fragments.MyInfoFragment
import com.example.pizzastoretest.fragments.PizzaOtherFragment

class MainViewPagerAdapter(fm:FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount() = 2

    override fun getItem(position: Int): Fragment {

        return when( position) {

            0 -> PizzaOtherFragment()
            else -> MyInfoFragment()

        }

    }
}