package com.example.naeem.fragmentapp

import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import javax.swing.text.View

class MainActivity : AppCompatActivity() {

    protected fun Bundle.onCreate() {
        super.onCreate(this)
        setContentView(R.layout.activity_main)

        val btnOne = findViewById(R.id.btn_frag_1)
        val btnTwo = findViewById(R.id.btn_frag_2)



        btnOne.setOnClickListener(object : View.OnClickListener() {
            fun onClick(view: View) {
                val manager = getSupportFragmentManager()
                val fragmentTransaction = manager.beginTransaction()
                val oneFragment = OneFragment()
                fragmentTransaction.setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
                fragmentTransaction.replace(R.id.frag_main, oneFragment)

                fragmentTransaction.commit()
            }
        })

        btnTwo.setOnClickListener(object : View.OnClickListener() {
            fun onClick(view: View) {
                val manager = getSupportFragmentManager()
                val fragmentTransaction = manager.beginTransaction()
                val twoFragment = TwoFragment()
                fragmentTransaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)
                fragmentTransaction.replace(R.id.frag_main, twoFragment)

                fragmentTransaction.commit()
            }
        })
    }

    private fun findViewById(btn_frag_1: Any): Any {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun setContentView(activity_main: Any) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

private val Any.activity_main: Any
    get() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

open class AppCompatActivity {

}

private fun Any.onCreate(bundle: Bundle) {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}
