package com.may.restuarantmenuapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_food_details.*

class FoodDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_details)
        val bundle=intent.extras

        iv_food_image.setImageResource(bundle.getInt("image"))
        tvname.text=bundle.getString("name")
        tvdes.text=bundle.getString("des")
    }
}
