package com.example.ubuntu.pbl44;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Hanadaikon extends AppCompatActivity {
    String hanadaikon1 = "https://tabelog.com/en/kumamoto/A4301/A430104/43000311/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hanadaikon);

        TextView blogLink = (TextView)findViewById(R.id.linc_hanadaikon);
        blogLink.setText(hanadaikon1);
    }
}