package com.example.ubuntu.pbl44;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class takabahiyosi extends AppCompatActivity {
    String takabahiyosi1 = "http://www.city.koshi.lg.jp/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takabahiyosi);

        TextView blogLink = (TextView)findViewById(R.id.linc_takabahiyosipark);
        blogLink.setText(takabahiyosi1);

        Button countrypark = (Button) findViewById(R.id.takabahiyosimap);
        countrypark.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                Intent intent = new Intent(getApplication(), takabahiyosimap.class);
                startActivity(intent);
            }
        });

    }
}