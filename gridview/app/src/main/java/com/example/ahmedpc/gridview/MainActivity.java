package com.example.ahmedpc.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    String stringArrayname[] = new String[]{
            "Chikken Tikka",
            "Dutch Sausage Rolls",
            "HotDog",
            "MeatBalls",
            "Pasta",
            "Samosas",
            "Special Pizza",
            "Torrilla Pizza",
            "Spegatties"

    };

    String stringArraytype[] = new String[]{
            "Ingredients: Chikken, Onion, Tomato ",
            "Ingredients: Sausages, roll patties, Tomato, Onion" ,
            "Ingredients: Burger, Hotdog, Onion, Mayo, Tomato",
            "Ingredients: MeatBalls, corriender",
            "Ingredients: Pasta, vegetables",
            "Ingredients: All purpose flour, potatoes",
            "Ingredients: pizza, vegetables, Tomato",
            "Ingredients:",
    };

    int[] gridviewimage = {
            R.drawable.chikkentikka,
            R.drawable.dutchsausagerolls,
            R.drawable.hotdog,
            R.drawable.meatballs,
            R.drawable.pasta,
            R.drawable.multiplefood,
            R.drawable.samosa,
            R.drawable.specialpizza,
            R.drawable.torrillapizza,
            R.drawable.spegatties
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gv = findViewById(R.id.grid);
        GridViewAdapter gridViewAdapter = new GridViewAdapter(MainActivity.this,stringArrayname,stringArraytype,gridviewimage);
        gv.setAdapter(gridViewAdapter);


    }
}