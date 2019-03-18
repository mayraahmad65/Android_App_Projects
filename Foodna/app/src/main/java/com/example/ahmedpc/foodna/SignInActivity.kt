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

class SignInActivity : AppCompatActivity() {


    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val email = findViewById<TextView>(R.id.signin_tv_email)
        val password = findViewById<TextView>(R.id.signin_tv_passward)
        val enteremail = findViewById<EditText>(R.id.signin_et_email)
        val enterpassword = findViewById<EditText>(R.id.signin_et_passward)
        val sigin = findViewById<Button>(R.id.signin_btn_signin)

    }

}
