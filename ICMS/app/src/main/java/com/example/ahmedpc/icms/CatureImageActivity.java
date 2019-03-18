package com.example.ahmedpc.icms;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CatureImageActivity extends AppCompatActivity {

    public static final String TAG = "CatureImageActivity";

    private ImageView resultImage;
    private Button captureBtn;
    private Button reset;
    private static final int RC_Request_code = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cature_image);
        resultImage = (ImageView) findViewById(R.id.iv_result);
        captureBtn = (Button)findViewById(R.id.icms_btn_capture);
        Button done = findViewById (R.id.icms_btn_done);

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent (CatureImageActivity.this,ResultActivity.class);
            }
        });

        captureBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                captureImage();
            }
        });

    }

    private void captureImage() {

        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(takePictureIntent, RC_Request_code);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode,resultCode,data);


        if (requestCode==RC_Request_code){

            if (resultCode==RESULT_OK){


                Bitmap bp = (Bitmap) data.getExtras().get("data");

                resultImage.setScaleType (ImageView.ScaleType.FIT_CENTER);
                resultImage.setImageBitmap(bp);

            }
            else if (resultCode==RESULT_CANCELED){

                Toast.makeText(this, "Cancelled", Toast.LENGTH_SHORT).show();


            }
        }


    }


}
