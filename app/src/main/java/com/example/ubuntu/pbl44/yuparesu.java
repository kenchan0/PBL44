package com.example.ubuntu.pbl44;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class yuparesu extends AppCompatActivity {
    String yuparesu1 = "http://kumamoto.tabimook.com/page/benten/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yuparesu);

        TextView blogLink = (TextView)findViewById(R.id.linc_yuparesu);
        blogLink.setText(yuparesu1);

        Button countrypark = (Button) findViewById(R.id.yuparesumap);
        countrypark.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplication(), yuparesumap.class);
                startActivity(intent);
            }
        });
    }
}
