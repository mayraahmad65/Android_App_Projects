package com.example.ahmedpc.foodna

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.Button

class AboutFoodnaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_foodna)

        val aboutfoodna = findViewById<Button>(R.id.about_foodna_btn_sidebar)
        aboutfoodna.setOnClickListener { val intent = Intent(this@AboutFoodnaActivity, SideBarActivityMain::class.java) }

    }

}