package com.example.listviews;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Youtube extends AppCompatActivity {
    Drawable drawable; ImageView image; TextView info;

    String text = "YouTube is a video sharing platform that is owned by google. initially created in the" +
            "year 2006 and acquired by google around 2008" +
            "The main aim of developing it was to enable people share videos";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);

        //initialize elements
        image = findViewById(R.id.imageView);
        info = findViewById(R.id.info);

        //Create drawable and load img to drawable
        drawable = getResources().getDrawable(R.drawable.yt);
        image.setImageDrawable(drawable);

        info.setText(text);
    }
}