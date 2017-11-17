package com.example.ubuntu.pbl44;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Usagi extends AppCompatActivity {
    String usagi1 = "https://tabelog.com/kumamoto/A4301/A430104/43008181/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usagi);

        TextView blogLink = (TextView)findViewById(R.id.linc_usagi);
        blogLink.setText(usagi1);
    }
}