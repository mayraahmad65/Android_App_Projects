package com.example.simplefragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            button1.setOnClickListener {
                val textFragment = TextFragment()
                val manager = supportFragmentManager
                val transaction = manager.beginTransaction()
                transaction.replace(R.id.fragment_container,textFragment)
                transaction.addToBackStack(null)
                transaction.commit()
            }


            button2.setOnClickListener {
                val imageFragment = ImageFragment()
                val manager = supportFragmentManager
                val transaction = manager.beginTransaction()
                transaction.replace(R.id.fragment_container,imageFragment)
                transaction.addToBackStack(null)
                transaction.commit()
            }
        }
}
