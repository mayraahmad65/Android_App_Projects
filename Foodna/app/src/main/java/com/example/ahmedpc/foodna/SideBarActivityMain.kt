package com.example.ahmedpc.foodna

import android.app.FragmentManager
import android.app.FragmentTransaction
import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.view.View
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import android.widget.Button

class SideBarActivityMain : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_side_bar_main)

        val navigationView = findViewById<View>(R.id.nav_view) as NavigationView
        navigationView.setNavigationItemSelectedListener(this)

        val aboutfoodna = findViewById<Button>(R.id.about_foodna_btn_sidebar)
        aboutfoodna.setOnClickListener { val intent = Intent(this, AboutFoodnaFragment::class.java) }

    }

    override fun onBackPressed() {
        val drawer = findViewById<View>(R.id.drawer_layout) as DrawerLayout
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.side_bar_activity_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId


        return if (id == R.id.action_settings) {
            true
        } else super.onOptionsItemSelected(item)

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        val id = item.itemId
        val fragmentManager = fragmentManager

        if (id == R.id.nav_AboutFoodnaFragment) {
            supportFragmentManager.beginTransaction().replace(R.id.content_frame, AboutFoodnaFragment()).commit();
        }
         else if (id == R.id.nav_FAQFragment) {
            supportFragmentManager.beginTransaction().replace(R.id.content_frame, FAQFragment()).commit()

        } else if (id == R.id.nav_SettingsFragment) {
            supportFragmentManager.beginTransaction().replace(R.id.content_frame, SettingsFragment()).commit()

        }
//        else if (id == R.id.nav_MainLauncherActivity) {
//            supportFragmentManager.beginTransaction().replace(R.id.content_frame, MainLauncherActivity()).commit();
//
//        }

        val drawer = findViewById<View>(R.id.drawer_layout) as DrawerLayout
        drawer.closeDrawer(GravityCompat.START)
        return true
    }
}

private fun FragmentTransaction.replace(content_frame: Int, settingsFragment: SettingsFragment) {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

private fun FragmentTransaction.replace(content_frame: Int, faqFragment: FAQFragment) {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

private fun FragmentTransaction.replace(content_frame: Int, aboutFoodnaFragment: AboutFoodnaFragment) {


}

