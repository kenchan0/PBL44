package com.example.ubuntu.pbl44;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Denden extends AppCompatActivity {
    String denden1 = "https://tabelog.com/en/kumamoto/A4301/A430104/43005560/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_denden);

        TextView blogLink = (TextView)findViewById(R.id.linc_denden);
        blogLink.setText(denden1);
    }
}