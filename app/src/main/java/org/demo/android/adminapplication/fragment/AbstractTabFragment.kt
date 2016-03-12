package org.demo.android.adminapplication.fragment

import android.content.Context
import android.support.v4.app.Fragment
import android.view.View

/**
 * Created by Secundus on 11.03.2016.
 */
abstract  class AbstractTabFragment : Fragment() {

    var title: String? = null
    protected var fragmentContext: Context? = null
    protected var fragmentView: View? = null

}
