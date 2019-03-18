package com.example.drawerapplication;

import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Bundle;

//import com.google.android.material.floatingactionbutton.FloatingActionButton;
//import com.google.android.material.snackbar.Snackbar;

//import android.view.View;

import com.google.android.material.navigation.NavigationView;

//import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;

//import android.view.Menu;
import android.view.Menu;
import android.view.MenuItem;

//import static com.example.drawerapplication.R.id.drawer_layout;
//import static com.example.drawerapplication.R.id.list_item;
//import static com.example.drawerapplication.R.id.toolbar;

public class MainActivity<override> extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
                setSupportActionBar(toolbar);



        DrawerLayout drawer_layout = findViewById(R.id.drawer_layout);
        DrawerLayout drawer = null;
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer_layout.addDrawerListener(toggle);
        toggle.syncState();


//        FragmentManager fragmentManager = null;
//        fragmentManager.beginTransaction().add(R.id.content_frame, new OneFragment()).commit();

    }
//
//    public MainActivity() {
//        DrawerLayout drawer = findViewById(R.id.drawer_layout);
//        if (drawer.isDrawerOpen(GravityCompat.START)) {
//            drawer.closeDrawer(GravityCompat.START);
//        } else {
//            super.onBackPressed();
//        }
//    }

//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        AdaptiveIconDrawable menuInflater = null;
//        menuInflater.inflate(R.menu.activity_main_drawer, menu);
//        return true;
//    }

//            public boolean onOptionsItemSelected (MenuItem item){
//
//        int id = item.getItemId();
//
//
//        return; if (id == R.id.action_settings) {
//                } else super.onOptionsItemSelected(item);
//
//    }
////        public boolean onNavigationItemSelected() {
////            return onNavigationItemSelected();
////        }
//
//            public boolean onOptionsItemSelected (MenuItem item){
//
//        int id = item.getItemId();
//
//
//        return if (id == R.id.action_settings) {
//            true
//        } else super.onOptionsItemSelected(item)
//
//    }

        public boolean onNavigationItemSelected (MenuItem item) {
        // Handle navigation view item clicks here.
            int id = item.getItemId();
        FragmentManager fragmentManager = null;

        if (id == R.id.nav_one_layout) {
            fragmentManager.beginTransaction().replace(R.id.content_frame, new OneFragment()).commit();

        } else if (id == R.id.nav_second_layout) {
            fragmentManager.beginTransaction().replace(R.id.content_frame, new TwoFragment()).commit();

        } else if (id == R.id.nav_three_layout) {
            fragmentManager.beginTransaction().replace(R.id.content_frame, new ThreeFragment()).commit();

        }

            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            drawer.closeDrawer(GravityCompat.START);
            return true;

    }


}
