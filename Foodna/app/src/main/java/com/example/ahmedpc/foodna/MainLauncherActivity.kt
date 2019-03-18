package com.example.ahmedpc.foodna

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainLauncherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_launcher)

        val btn_signin = findViewById<Button>(R.id.foodna_btn_signin)
        val btn_signup = findViewById<Button>(R.id.foodna_btn_signup)
        val btn_skip = findViewById<Button>(R.id.foodna_btn_skip)

        btn_signin.setOnClickListener {
            val Intent = Intent(this@MainLauncherActivity, SignInActivity::class.java)
            startActivity(Intent)
        }


        btn_signup.setOnClickListener {
            val Intent = Intent(this@MainLauncherActivity, SignUpActivity::class.java)
            startActivity(Intent)
        }


        btn_skip.setOnClickListener {
            val Intent = Intent(this@MainLauncherActivity, LocationActivity::class.java)
            startActivity(Intent)
        }


    }
}
