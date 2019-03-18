package com.example.ahmedpc.foodna

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val name = findViewById<TextView>(R.id.signup_tv_name)
        val entername = findViewById<EditText>(R.id.signup_et_name)
        val email = findViewById<TextView>(R.id.signup_tv_email)
        val enteremail = findViewById<EditText>(R.id.signup_et_email)
        val phnum = findViewById<TextView>(R.id.signup_tv_phonenum)
        val enterphnum = findViewById<EditText>(R.id.signup_et_phonenum)
        val password = findViewById<TextView>(R.id.signup_tv_passward)
        val enterpassword = findViewById<EditText>(R.id.signup_et_passward)
        val sigin = findViewById<Button>(R.id.signup_btn_signup)
    }

    private fun validate(username: String, userpassword: String) {
        if (username === "" && userpassword === "") {
            val intent = Intent(this@SignUpActivity, MainLauncherActivity::class.java)

        }
    }

}
