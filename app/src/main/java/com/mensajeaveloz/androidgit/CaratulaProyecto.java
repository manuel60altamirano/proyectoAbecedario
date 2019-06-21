package com.mensajeaveloz.androidgit;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//Caratula SplashScream creado por
//Luis Esteban Arteaga Vargas
//Anahi Quisbert Canaviri

public class CaratulaProyecto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caratula_proyecto);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(CaratulaProyecto.this, MainActivity.class);
                startActivity(intent);

            }
        },3000);
    }
}
