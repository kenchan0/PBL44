package com.example.ubuntu.pbl44;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Syokusoueno extends AppCompatActivity {
    String syokusoueno1 = "http://www.syokusou.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syokusoueno);

        TextView blogLink = (TextView)findViewById(R.id.linc_syokusoueno);
        blogLink.setText(syokusoueno1);
    }
}