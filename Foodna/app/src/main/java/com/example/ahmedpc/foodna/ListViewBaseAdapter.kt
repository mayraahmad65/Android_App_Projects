package com.example.ahmedpc.foodna

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

import com.example.ahmedpc.foodna.R

/**
 * Created by AHMED PC on 12/10/2018.
 */

class ListViewBaseAdapter(internal var index: Context, internal var stringname: Array<String>, internal var stringtype: Array<String>, internal var imagevieww: IntArray) : BaseAdapter() {

    override fun getCount(): Int {
        return stringname.size
    }

    override fun getItem(i: Int): Any? {
        return null
    }

    override fun getItemId(i: Int): Long {
        return 0
    }

    override fun getView(i: Int, view: View, viewGroup: ViewGroup): View {
        var view = view
        val inflater = LayoutInflater.from(index)
        view = inflater.inflate(R.layout.row_basic_list_view, null)
        val index = view.findViewById<TextView>(R.id.lv_tv_names)
        val name = view.findViewById<TextView>(R.id.lv_tv_types)
        val imageView = view.findViewById<ImageView>(R.id.lv_im_background)
        index.text = stringname[i]
        name.text = stringtype[i]
        imageView.setImageResource(imagevieww[i])
        return view
    }
}
