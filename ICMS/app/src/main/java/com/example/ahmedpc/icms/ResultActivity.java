package com.example.ahmedpc.icms;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

public class ResultActivity extends AppCompatActivity {

    int Imageview[] = new int[]{

            R.drawable.icms_result_one,
            R.drawable.icms_result_two,
            R.drawable.icms_result_three,
            R.drawable.icms_result_four,
            R.drawable.icms_result_five,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ListView lvname = findViewById(R.id.icms_results_listview);
        ReultsBaseAdapterListView reultsBaseAdapterListView = new ReultsBaseAdapterListView (ResultActivity.this,Imageview);
        lvname.setAdapter(reultsBaseAdapterListView);

    }

}
