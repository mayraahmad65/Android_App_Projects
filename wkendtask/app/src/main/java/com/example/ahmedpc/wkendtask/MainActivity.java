package com.example.ahmedpc.wkendtask;

import android.content.DialogInterface;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int count = 1;
    int total = 28;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView res = findViewById(R.id.tv_res);
        ImageView foodie = findViewById(R.id.iv_image);
        TextView name = findViewById(R.id.tv_name);
        final Button price = findViewById(R.id.btn_price);
        TextView ingredient = findViewById(R.id.tv_ingredients);
        TextView quantity = findViewById(R.id.tvquan);
        Button decrement = findViewById(R.id.btndec);
        final TextView tv1 = findViewById(R.id.tv_1);
        Button increment = findViewById(R.id.btninc);
        Button size = findViewById(R.id.btn_size);
        Button dish = findViewById(R.id.btn_dish);
        Button sauce = findViewById(R.id.btn_sauce);
        Button topping = findViewById(R.id.btn_topping);
        TextView add = findViewById(R.id.tv_add);
        Button need = findViewById(R.id.btn_need);
        Button item = findViewById(R.id.btn_item);

        tv1.setText(String.valueOf(count));

        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tv1.setText(String.valueOf(count--));
                total = count * 28;
                price.setText(String.valueOf("SAR" + "" + total));
                if (count<=1) {
                    count = 1;
                }
            }
        });

        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tv1.setText(String.valueOf(count++));
                total = count * 28;
                price.setText(String.valueOf("SAR" + "" + total));
                if (count >=10) {
                    count = 10;
                }
            }
        });
    }
}