package com.example.ubuntu.pbl44;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class countrypark extends AppCompatActivity {
    String countrypark1 = "http://www.country-park.jp/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countrypark);

        TextView blogLink = (TextView)findViewById(R.id.linc_countrypark);
        blogLink.setText(countrypark1);

        Button countrypark = (Button) findViewById(R.id.countryparkmap);
        countrypark.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                Intent intent = new Intent(getApplication(), countryparkmap.class);
                startActivity(intent);
            }
        });

    }
}