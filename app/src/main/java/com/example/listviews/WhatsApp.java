package com.example.listviews;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class WhatsApp extends AppCompatActivity {
    Drawable drawable; ImageView image; TextView info;

    String text = "Whatsapp is an app that was developed by two programmers with a aim of providing a private " +
            "communication between friends" +
            "was acquired by Facebook company and now maintained by them.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whats_app);

        //initialize elements
        image = findViewById(R.id.imageView);
        info = findViewById(R.id.info);

        //load image into image view
        drawable = getResources().getDrawable(R.drawable.wt);
        image.setImageDrawable(drawable);
        info.setText(text);
    }
}