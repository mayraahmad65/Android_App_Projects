package com.example.zooapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.animal_ticket.*

class AnimalsInfo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animals_info)
        val bundle:Bundle= intent.extras
        val name=bundle.getString("name")
        val des =bundle.getString("des")
        val image=bundle.getInt("image")
        ivanimal.setImageResource(image)
        tvname.text=name
        tvdes.text=des
    }
}
