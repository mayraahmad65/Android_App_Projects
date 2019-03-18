package com.example.ahmedpc.foodna

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.ImageView
import android.widget.ListView

class ListViewActivity : AppCompatActivity() {


    internal var Imageview = intArrayOf(

            R.drawable.chikkentikka, R.drawable.dutchsausagerolls, R.drawable.hotdog, R.drawable.meatballs, R.drawable.multiplefood, R.drawable.pasta, R.drawable.samosa, R.drawable.specialpizza, R.drawable.torrillapizza)

    internal var stringArrayname = arrayOf("Shake Shake", "IDAM RESTURANT", "PAPER MOON", "ACCHAN BROTHERS", "KFC", "MCDONALDS", "Munchies", "Savor", "Yummy 36", "Tehzeeb")

    internal var stringArraytype = arrayOf("ITALIAN", "ITALIAN", "ITALIAN", "ITALIAN", "ITALIAN", "ITALIAN", "ITALIAN", "ITALIAN", "ITALIAN", "ITALIAN")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_list_view)
        val lvname = findViewById<ListView>(R.id.lv_name)


    }
}