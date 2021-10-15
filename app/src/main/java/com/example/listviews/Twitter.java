package com.example.listviews;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Twitter extends AppCompatActivity {
    Drawable drawable; TextView info; ImageView image;
    String text = "Twitter is one of the popular social media nowadays. It was created with the aim of sending" +
            "short messages about what is happening. The name came from a sound made by a bird twiitr..";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twitter);

        //initialize
        info = findViewById(R.id.info);
        image = findViewById(R.id.imageView);

        //drawable
        drawable = getResources().getDrawable(R.drawable.tw);
        image.setImageDrawable(drawable);
        info.setText(text);
    }
}