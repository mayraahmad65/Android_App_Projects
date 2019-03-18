package com.example.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_get_age.setOnClickListener {

            val yearofbirth = et_age.text.toString().toInt()
            if (yearofbirth.toInt()==0){
            tv_add_age.text = "Invalid Input"
            return@setOnClickListener
        }
            val currentyear = Calendar.getInstance().get(Calendar.YEAR)
            val myagae = currentyear - yearofbirth
            val avg = myagae/yearofbirth
             tv_add_age.text = "your age is $myagae years"
        }
    }
}
