package com.example.ubuntu.pbl44;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class kosinoen extends AppCompatActivity {
    String kosinoen1 = "http://www.takaji-nouen.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kosinoen);

        TextView blogLink = (TextView)findViewById(R.id.linc_kosinoen);
        blogLink.setText(kosinoen1);

        Button countrypark = (Button) findViewById(R.id.kosinoenmap);
        countrypark.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplication(), kosinoenmap.class);
                startActivity(intent);
            }
        });
    }
}
