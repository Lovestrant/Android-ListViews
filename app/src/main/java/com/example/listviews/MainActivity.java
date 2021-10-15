package com.example.listviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listview;
    String[] values = new String[] {
            "facebook", "WhatsApp", "Youtube", "Twitter"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create Array Adapter
        ArrayAdapter <String> adapter = new ArrayAdapter<> (
            this, android.R.layout.simple_list_item_1,
                    android.R.id.text1, values);
        listview = findViewById(R.id.listview);

        listview.setAdapter(adapter);

        //set on item click on the listview
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0) {
                    Intent intent = new Intent(getApplicationContext(), facebook.class);
                    startActivity(intent);
                }else if(i==1) {
                    Intent intent = new Intent(getApplicationContext(), WhatsApp.class);
                    startActivity(intent);
                }else if(i==2) {
                    Intent intent = new Intent(getApplicationContext(), Youtube.class);
                    startActivity(intent);
                }else if(i==3) {
                    Intent intent = new Intent(getApplicationContext(), Twitter.class);
                    startActivity(intent);
                }
            }
        });

    }
}