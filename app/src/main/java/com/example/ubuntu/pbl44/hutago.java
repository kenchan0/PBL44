package com.example.ubuntu.pbl44;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class hutago extends AppCompatActivity {
    String hutago1 = "https://www.city.koshi.lg.jp/life/pub/Detail.aspx?c_id=28&id=1198&pg=1&type=list";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hutago);

        TextView blogLink = (TextView)findViewById(R.id.linc_hutago);
        blogLink.setText(hutago1);

        Button countrypark = (Button) findViewById(R.id.hutagomap);
        countrypark.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                Intent intent = new Intent(getApplication(), hutagomap.class);
                startActivity(intent);
            }
        });
    }
}
