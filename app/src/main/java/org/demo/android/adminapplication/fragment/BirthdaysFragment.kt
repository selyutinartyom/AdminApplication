package org.demo.android.adminapplication.fragment

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.demo.android.adminapplication.R

/**
 * Created by Secundus on 10.03.2016.
 */
class BirthdaysFragment : AbstractTabFragment() {

    // Java static objects (fields, methods) in kotlin
    companion object {
        private val LAYOUT: Int = R.layout.fragment_example

        fun getInstance(context: Context): BirthdaysFragment {
            val fragment = BirthdaysFragment()
            fragment.arguments = Bundle()
            fragment.fragmentContext = context
            fragment.title = context.getString(R.string.tab_item_birthdays)
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        fragmentView = inflater?.inflate(LAYOUT, container, false)
        return fragmentView
    }
}