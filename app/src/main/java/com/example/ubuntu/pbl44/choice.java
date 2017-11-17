package com.example.ubuntu.pbl44;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class choice extends AppCompatActivity {

    //private Button event, sightseeig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);

        Button sighseeing = (Button) findViewById(R.id.sightseeing);//観光地を押した時
        sighseeing.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplication(), sightseeing.class);
                startActivity(intent);
            }
        });

        Button event = (Button) findViewById(R.id.event);//イベントを押した時
        event.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplication(), Restran.class);
                startActivity(intent);
            }
        });

    }
}
