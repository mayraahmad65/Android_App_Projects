package com.example.ahmedpc.listviewtask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    int Imageview[] = new int[]{

            R.drawable.blog,
            R.drawable.chikkentikka,
            R.drawable.dutchsausagerolls,
            R.drawable.hotdog,
            R.drawable.meatballs,
            R.drawable.multiplefood,
            R.drawable.pasta,
            R.drawable.samosa,
            R.drawable.specialpizza,
            R.drawable.torrillapizza,
    };

    String stringArrayname[] = new String[]{
            "Shake Shake",
            "IDAM RESTURANT",
            "PAPER MOON",
            "ACCHAN BROTHERS",
            "KFC",
            "MCDONALDS",
            "Munchies",
            "Savor",
            "Yummy 36",
            "Tehzeeb"
    };

    String stringArraytype[] = new String[]{
            "ITALIAN",
            "ITALIAN",
            "ITALIAN",
            "ITALIAN",
            "ITALIAN",
            "ITALIAN",
            "ITALIAN",
            "ITALIAN",
            "ITALIAN",
            "ITALIAN"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvname = findViewById(R.id.lv_name);
        BaseAdapterTask basicExampleAdaptor = new BaseAdapterTask(MainActivity.this,stringArrayname,stringArraytype,Imageview);
        lvname.setAdapter(basicExampleAdaptor);

    }
}
