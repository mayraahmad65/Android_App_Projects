package com.example.ahmedpc.sidebaractivity

//import android.app.Fragment;
import android.app.FragmentContainer
import android.app.FragmentManager
import android.app.FragmentTransaction
import android.os.Bundle
//import android.support.design.widget.FloatingActionButton;
//import android.support.design.widget.Snackbar;
//import android.view.View;
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem

class SideBar : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_side_bar)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        val drawer = findViewById<DrawerLayout>(R.id.drawer_layout)
        val toggle = ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer.addDrawerListener(toggle)
        toggle.syncState()

        val navigationView = findViewById<NavigationView>(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener(this)


//        val fragmentManager = fragmentManager
//        fragmentManager.beginTransaction().add(R.id.content_frame, FirstFragment()).commit()

    }

    override fun onBackPressed() {
        val drawer = findViewById<DrawerLayout>(R.id.drawer_layout)
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.side_bar, menu)
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

        if (id == R.id.nav_fragment_first) {
            fragmentManager.beginTransaction().replace(R.id.content_frame, FirstFragment())!!.commit()

        } else if (id == R.id.nav_fragment_second) {
            fragmentManager.beginTransaction().replace(R.id.content_frame, SecondFragment())!!.commit()

        } else if (id == R.id.nav_fragment_third) {
            fragmentManager.beginTransaction().replace(R.id.content_frame, ThirdFragment())!!.commit()

        }
        val drawer = findViewById<DrawerLayout>(R.id.drawer_layout)
        drawer.closeDrawer(GravityCompat.START)
        return true

    }
}

private fun FragmentTransaction.add(content_frame: Int, firstFragment: FirstFragment): Any {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

private fun FragmentTransaction.replace(content_frame: Int, thirdFragment: ThirdFragment): FragmentTransaction? {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

private fun FragmentTransaction.replace(content_frame: Int, secondFragment: SecondFragment): FragmentTransaction? {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

private fun FragmentTransaction.replace(content_frame: Int, firstFragment: FirstFragment): FragmentTransaction? {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}
