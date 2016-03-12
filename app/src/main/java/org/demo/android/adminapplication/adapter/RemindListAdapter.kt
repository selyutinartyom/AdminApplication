package org.demo.android.adminapplication.adapter

import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import org.demo.android.adminapplication.R
import org.demo.android.adminapplication.dto.RemindDTO

/**
 * Created by Secundus on 11.03.2016.
 */
class RemindListAdapter(private var data: List<RemindDTO>) :
        RecyclerView.Adapter<RemindListAdapter.Companion.RemindViewHolder>() {

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onCreateViewHolder(p0: ViewGroup?, p1: Int): RemindViewHolder? {
        val view = LayoutInflater.from(p0?.context).inflate(R.layout.remind_item, p0, false)
        return RemindViewHolder(view)
    }

    override fun onBindViewHolder(p0: RemindViewHolder?, p1: Int) {
        val item: RemindDTO = data[p1]
        p0?.title?.text = item.title
    }

    companion object {
        class RemindViewHolder : RecyclerView.ViewHolder {
            var cardView: CardView? = null
            var title: TextView? = null

            constructor(itemView: View?) : super(itemView) {
                cardView = itemView?.findViewById(R.id.cardView) as CardView?
                title = itemView?.findViewById(R.id.title) as TextView?
            }
        }
    }
}