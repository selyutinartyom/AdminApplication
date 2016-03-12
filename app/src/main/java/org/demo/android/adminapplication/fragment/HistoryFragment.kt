package org.demo.android.adminapplication.fragment

import android.content.Context
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.demo.android.adminapplication.R
import org.demo.android.adminapplication.adapter.RemindListAdapter
import org.demo.android.adminapplication.dto.RemindDTO

/**
 * Created by Secundus on 09.03.2016.
 */
class HistoryFragment : AbstractTabFragment() {

    // Java static objects (fields, methods) in kotlin
    companion object {
        private val LAYOUT: Int = R.layout.fragment_history

        fun getInstance(context: Context): HistoryFragment {
            val fragment = HistoryFragment()
            fragment.arguments = Bundle()
            fragment.fragmentContext = context
            fragment.title = context.getString(R.string.tab_item_history)
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        fragmentView = inflater?.inflate(LAYOUT, container, false)

        val rv = fragmentView?.findViewById(R.id.recycleView) as RecyclerView
        rv.layoutManager = LinearLayoutManager(fragmentContext)
        rv.adapter = RemindListAdapter(createMockRemindListData())

        return fragmentView
    }

    /**
     * TODO Метод-заглушка будет заменен данными из сервера
     */
    private fun createMockRemindListData(): List<RemindDTO> {
        return listOf(
                RemindDTO("Item 1"),
                RemindDTO("Item 2"),
                RemindDTO("Item 3"),
                RemindDTO("Item 4"),
                RemindDTO("Item 5"),
                RemindDTO("Item 6"))
    }
}