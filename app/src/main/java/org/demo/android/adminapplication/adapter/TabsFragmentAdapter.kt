package org.demo.android.adminapplication.adapter

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import org.demo.android.adminapplication.fragment.*

/**
 * Адаптер управления TabNavigation-ом
 *
 * Created by Secundus on 09.03.2016.
 */
class TabsFragmentAdapter : FragmentPagerAdapter {

    private var tabs: Map<Int, AbstractTabFragment> = emptyMap()
    private var context: Context

    constructor(context: Context, fm: FragmentManager?) : super(fm) {
        this.context = context
        initTabsMap(context)
    }

    override fun getItem(p0: Int): Fragment? {
        return tabs[p0]
    }

    override fun getCount(): Int {
        return tabs.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return tabs[position]?.title
    }

    private fun initTabsMap(context: Context) {
        tabs = mapOf(
                0 to HistoryFragment.getInstance(context),
                1 to IdeasFragment.getInstance(context),
                2 to TodoFragment.getInstance(context),
                3 to BirthdaysFragment.getInstance(context))
    }
}