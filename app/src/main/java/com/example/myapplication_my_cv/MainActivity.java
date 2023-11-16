package com.example.myapplication_my_cv;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView myNameTextview = findViewById(R.id.my_name);
        ImageView myPhotoView = findViewById(R.id.my_photo);
        TextView myAgetextView = findViewById(R.id.my_age);
        TextView myCityTextView = findViewById(R.id.my_town);
        TextView myJobTextView = findViewById(R.id.my_job);
        TextView myInformation = findViewById(R.id.about_me);



        ScrollView scrollView = findViewById(R.id.scrollView);
        scrollView.post(new Runnable() {
            @Override
            public void run() {
                scrollView.fullScroll(ScrollView.FOCUS_DOWN);



            }

        });

    }
}