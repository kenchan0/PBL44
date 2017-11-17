package com.example.ubuntu.pbl44;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Sichu extends AppCompatActivity {
    String sichu1 = "https://tabelog.com/kumamoto/A4301/A430104/43005658/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sichu);

        TextView blogLink = (TextView)findViewById(R.id.linc_sichu);
        blogLink.setText(sichu1);
    }
}