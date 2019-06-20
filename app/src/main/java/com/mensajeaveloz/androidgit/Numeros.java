package com.mensajeaveloz.androidgit;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Numeros extends AppCompatActivity {

    MediaPlayer mp1,mp2,mp3,mp4,mp5,mp6,mp7,mp8,mp9,mp10;
    Button btnuno,btndos,btntres,btncuatro,btncinco,btnseis,btnsiete,btnocho,btnnueve,btndiez;

    ImageView con1,con2,con3,con4,con5,con6,con7,con8,con9,con10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros);
        con1=(ImageView)findViewById(R.id.imageView);
        btnuno=(Button)findViewById(R.id.btnuno);

        mp1 = MediaPlayer.create(this, R.raw.uno);
        btnuno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             mp1.start();
             con1.setImageResource(R.drawable.mg1);
             }
        });
        con2=(ImageView)findViewById(R.id.imageView);
        btndos=(Button)findViewById(R.id.btndos);
        mp2=MediaPlayer.create(this,R.raw.dos);
        btndos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp2.start();
                con2.setImageResource(R.drawable.mg2);
               }
        });
        con3=(ImageView)findViewById(R.id.imageView);
        btntres=(Button)findViewById(R.id.btntres);
        mp3=MediaPlayer.create(this,R.raw.tres);
        btntres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp3.start();
                con3.setImageResource(R.drawable.mg3);

            }
        });
        con4=(ImageView)findViewById(R.id.imageView);
        btncuatro=(Button)findViewById(R.id.btncuatro);
        mp4=MediaPlayer.create(this,R.raw.cuatro);
        btncuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp4.start();
                con4.setImageResource(R.drawable.mg4);
                }
        });
        con5=(ImageView)findViewById(R.id.imageView);
        btncinco=(Button)findViewById(R.id.btncinco);
        mp5=MediaPlayer.create(this,R.raw.cinco);
        btncinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp5.start();
                con5.setImageResource(R.drawable.mg5);
            }
        });
        con6=(ImageView)findViewById(R.id.imageView);
        btnseis=(Button)findViewById(R.id.btnseis);
        mp6=MediaPlayer.create(this,R.raw.seis);
        btnseis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp6.start();
                con6.setImageResource(R.drawable.mg6);
               }
        });
        con7=(ImageView)findViewById(R.id.imageView);
        btnsiete=(Button)findViewById(R.id.btnsiete);
        mp7=MediaPlayer.create(this,R.raw.siete);
        btnsiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp7.start();
                con7.setImageResource(R.drawable.mg7);
                }
        });
        con8=(ImageView)findViewById(R.id.imageView);
        btnocho=(Button)findViewById(R.id.btnocho);
        mp8=MediaPlayer.create(this,R.raw.ocho);
        btnocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp8.start();
                con8.setImageResource(R.drawable.mg8);
               }
        });
        con9=(ImageView)findViewById(R.id.imageView);
        btnnueve=(Button)findViewById(R.id.btnnueve);
        mp9=MediaPlayer.create(this,R.raw.nueve);
        btnnueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp9.start();
                con9.setImageResource(R.drawable.mg9);
                }
        });
        con10=(ImageView)findViewById(R.id.imageView);
        btndiez=(Button)findViewById(R.id.btndiez);
        mp10=MediaPlayer.create(this,R.raw.diez);
        btndiez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp10.start();
                con10.setImageResource(R.drawable.mg10);
              }
        });
    }
}
