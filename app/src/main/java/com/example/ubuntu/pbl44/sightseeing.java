package com.example.ubuntu.pbl44;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sightseeing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sightseeing);

        Button countrypark = (Button) findViewById(R.id.countrypark);//カントリーパーク
        countrypark.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplication(), countrypark.class);
                startActivity(intent);
            }
        });

        Button yuparesu = (Button) findViewById(R.id.yuparesu);//弁天
        yuparesu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplication(), yuparesu.class);
                startActivity(intent);
            }
        });

        Button bentenyama = (Button) findViewById(R.id.bentenyama);//弁天山
        bentenyama.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplication(), bentenyama.class);
                startActivity(intent);
            }
        });

        Button kosinoen = (Button) findViewById(R.id.kosinoen);//高司農園
        kosinoen.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplication(), kosinoen.class);
                startActivity(intent);
            }
        });

        Button takabasiroato = (Button) findViewById(R.id.takabasiroato);//竹迫城跡公園
        takabasiroato.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplication(), takabasiroato.class);
                startActivity(intent);
            }
        });

        Button myosenzi = (Button) findViewById(R.id.myosenzi);//妙泉寺公園
        myosenzi.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplication(), myosenzi.class);
                startActivity(intent);
            }
        });

        Button hutago = (Button) findViewById(R.id.hutago);//二子山石器製作遺跡
        hutago.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplication(), hutago.class);
                startActivity(intent);
            }
        });

        Button vivre = (Button) findViewById(R.id.vivre);//ヴィーブル
        vivre.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplication(), vivre.class);
                startActivity(intent);
            }
        });

        Button takabahiyosi = (Button) findViewById(R.id.takabahiyosi);//竹迫日吉神社
        takabahiyosi.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplication(), takabahiyosi.class);
                startActivity(intent);
            }
        });

        /*Button genki = (Button) findViewById(R.id.genki);//元気の森公園
        genki.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplication(), genki.class);
                startActivity(intent);
            }
        });

        Button hebino = (Button) findViewById(R.id.hebino);//蛇の尾公園
        hebino.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplication(), hebino.class);
                startActivity(intent);
            }
        });

        Button hankoyama = (Button) findViewById(R.id.hankoyama);//飯高山公園
        hankoyama.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplication(), hankoyama.class);
                startActivity(intent);
            }
        });*/
    }
}
