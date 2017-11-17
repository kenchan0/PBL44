package com.example.ubuntu.pbl44;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Hanamizuki extends AppCompatActivity {
    String hanamizuki1 = "https://tabelog.com/kumamoto/A4301/A430104/43005390/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hanamizuki);

        TextView blogLink = (TextView)findViewById(R.id.linc_hanamizuki);
        blogLink.setText(hanamizuki1);
    }
}