package com.example.ubuntu.pbl44;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Cache extends AppCompatActivity {
    String cache1 = "https://tabelog.com/en/kumamoto/A4301/A430104/43006153/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cache);

        TextView blogLink = (TextView)findViewById(R.id.linc_cache);
        blogLink.setText(cache1);
    }
}