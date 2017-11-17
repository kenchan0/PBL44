package com.example.ubuntu.pbl44;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Torattoria extends AppCompatActivity {
    String torattoria1 = "https://www.higonavi.net/shop/shop.shtml?s=5225";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_torattoria);

        TextView blogLink = (TextView)findViewById(R.id.linc_torattoria);
        blogLink.setText(torattoria1);
    }
}