package com.example.ubuntu.pbl44;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class takabasiroato extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takabasiroato);

        Button countrypark = (Button) findViewById(R.id.takabasiroatomap);
        countrypark.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplication(), takabasiroatomap.class);
                startActivity(intent);
            }
        });
    }
}
