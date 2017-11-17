package com.example.ubuntu.pbl44;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Hananoya extends AppCompatActivity {
    String hananoya1 = "https://tabelog.com/en/kumamoto/A4301/A430104/43010678/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hananoya);

        TextView blogLink = (TextView)findViewById(R.id.linc_hananoya);
        blogLink.setText(hananoya1);
    }
}