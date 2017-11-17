package com.example.ubuntu.pbl44;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Itamesi extends AppCompatActivity {
    String itamesi1 = "https://loco.yahoo.co.jp/place/g-VgBLV-pC82-/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itamesi);

        TextView blogLink = (TextView)findViewById(R.id.linc_itamesi);
        blogLink.setText(itamesi1);
    }
}