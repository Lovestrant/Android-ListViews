package com.example.listviews;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class facebook extends AppCompatActivity {
    Drawable drawable; ImageView image; TextView info;

    String text = "Facebook is a site that was started by Mark Zuckerberg and it was started around 2005" +
            "It is now one of the popular social media sites in the world, the main reason it was started " +
            "was to connect long time friends and families";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);

        image = findViewById(R.id.imageView);
        info = findViewById(R.id.info);
        //load Image into ImageView
        drawable = getResources().getDrawable(R.drawable.fb);
        image.setImageDrawable(drawable);
        info.setText(text);

    }
}