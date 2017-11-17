package com.example.ubuntu.pbl44;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Marutetu extends AppCompatActivity {
    String marutetu1 = "https://tabelog.com/kumamoto/A4301/A430104/43005658/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marutetu);

        TextView blogLink = (TextView)findViewById(R.id.linc_marutetu);
        blogLink.setText(marutetu1);
    }
}