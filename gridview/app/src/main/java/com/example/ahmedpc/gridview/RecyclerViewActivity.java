package com.example.ahmedpc.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class RecyclerViewActivity extends AppCompatActivity {

    JSONArray arrData = new JSONArray();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        initilaizeJSOnData();
        RecyclerView recycleView = findViewById(R.id.recycleView);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recycleView.setLayoutManager(mLayoutManager);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(this,arrData);
        recycleView.setAdapter(recyclerViewAdapter);

    }

    void initilaizeJSOnData(){
        try {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("name", "Chikken Tikka");
            jsonObject.put("Ingredients", "Chikken, Onion, Tomato");
            jsonObject.put("imageName", R.drawable.chikkentikka);
            arrData.put(jsonObject);

            jsonObject = new JSONObject();
            jsonObject.put("name", "Dutch Sausage Rolls");
            jsonObject.put("Ingredients", "Sausages, roll patties, Tomato, Onion");
            jsonObject.put("imageName", R.drawable.dutchsausagerolls);
            arrData.put(jsonObject);

            jsonObject = new JSONObject();
            jsonObject.put("name", "Chikken Tikka");
            jsonObject.put("Ingredients", "Chikken, Onion, Tomato");
            jsonObject.put("imageName", R.drawable.chikkentikka);
            arrData.put(jsonObject);

            jsonObject = new JSONObject();
            jsonObject.put("name", "HotDog");
            jsonObject.put("Ingredients", "Hotdog, Onion, Mayo, Tomato");
            jsonObject.put("imageName", R.drawable.hotdog);
            arrData.put(jsonObject);

            jsonObject = new JSONObject();
            jsonObject.put("name", "MeatBalls ");
            jsonObject.put("Ingredients", "MeatBalls, corriender");
            jsonObject.put("imageName", R.drawable.meatballs);
            arrData.put(jsonObject);

            jsonObject = new JSONObject();
            jsonObject.put("name", "Pasta");
            jsonObject.put("Ingredients", "Pasta, vegetables");
            jsonObject.put("imageName", R.drawable.pasta);
            arrData.put(jsonObject);

            jsonObject = new JSONObject();
            jsonObject.put("name", "Samosas");
            jsonObject.put("Ingredients", "All purpose flour, potatoes");
            jsonObject.put("imageName", R.drawable.samosa);
            arrData.put(jsonObject);

            jsonObject = new JSONObject();
            jsonObject.put("name", "Special Pizza ");
            jsonObject.put("Ingredients", "pizza, vegetables");
            jsonObject.put("imageName", R.drawable.specialpizza);
            arrData.put(jsonObject);

            jsonObject = new JSONObject();
            jsonObject.put("name", "Torrilla Pizza");
            jsonObject.put("Ingredients", "pizza, vegetables, Tomato");
            jsonObject.put("imageName", R.drawable.torrillapizza);
            arrData.put(jsonObject);


        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
