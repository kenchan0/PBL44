package com.example.ubuntu.pbl44;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class vivre extends AppCompatActivity {
    String vivre1 = "http://www.city.koshi.lg.jp/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vivre);

        TextView blogLink = (TextView)findViewById(R.id.linc_vivre);
        blogLink.setText(vivre1);

        Button countrypark = (Button) findViewById(R.id.vivremap);
        countrypark.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                Intent intent = new Intent(getApplication(), vivremap.class);
                startActivity(intent);
            }
        });

    }
}