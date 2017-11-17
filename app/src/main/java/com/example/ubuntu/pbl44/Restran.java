package com.example.ubuntu.pbl44;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Restran extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restran);

        Button countrypark = (Button) findViewById(R.id.orion);//カントリーパーク
        countrypark.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplication(), Orion.class);
                startActivity(intent);
            }
        });

        Button yuparesu = (Button) findViewById(R.id.denden);//弁天
        yuparesu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplication(), Denden.class);
                startActivity(intent);
            }
        });

        Button bentenyama = (Button) findViewById(R.id.hananoya);//弁天山
        bentenyama.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplication(), Hananoya.class);
                startActivity(intent);
            }
        });

        Button kosinoen = (Button) findViewById(R.id.hanadaikon);//高司農園
        kosinoen.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplication(), Hanadaikon.class);
                startActivity(intent);
            }
        });

        Button takabasiroato = (Button) findViewById(R.id.syokusoueno);//竹迫城跡公園
        takabasiroato.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplication(), Syokusoueno.class);
                startActivity(intent);
            }
        });

        Button myosenzi = (Button) findViewById(R.id.torattoria);//妙泉寺公園
        myosenzi.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplication(), Torattoria.class);
                startActivity(intent);
            }
        });

        Button hutago = (Button) findViewById(R.id.cache);//二子山石器製作遺跡
        hutago.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplication(), Cache.class);
                startActivity(intent);
            }
        });

        Button vivre = (Button) findViewById(R.id.itamesi);//ヴィーブル
        vivre.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplication(), Itamesi.class);
                startActivity(intent);
            }
        });

        Button takabahiyosi = (Button) findViewById(R.id.usagi);//竹迫日吉神社
        takabahiyosi.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplication(), Usagi.class);
                startActivity(intent);
            }
        });

        Button genki = (Button) findViewById(R.id.marutetu);//元気の森公園
        genki.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplication(), Marutetu.class);
                startActivity(intent);
            }
        });

        Button hebino = (Button) findViewById(R.id.sichu);//蛇の尾公園
        hebino.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplication(), Sichu.class);
                startActivity(intent);
            }
        });

        Button hankoyama = (Button) findViewById(R.id.hanamizuki);//飯高山公園
        hankoyama.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplication(), Hanamizuki.class);
                startActivity(intent);
            }
        });
    }
}

