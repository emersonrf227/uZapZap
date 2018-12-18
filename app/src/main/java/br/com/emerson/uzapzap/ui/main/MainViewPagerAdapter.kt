package br.com.emerson.uzapzap.ui.main


import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import br.com.emerson.uzapzap.ui.base.BaseFragment

class MainViewPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager){


    private val meusFragments = ArrayList<BaseFragment>()

    override fun getItem(position: Int): android.support.v4.app.Fragment {
        return meusFragments[position]

    }

    override fun getCount(): Int {

        return meusFragments.size


    }


    fun addFragment(fragment: BaseFragment){

        meusFragments.add(fragment)

    }

}