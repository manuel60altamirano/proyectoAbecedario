package com.mensajeaveloz.androidgit;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button boton;
    private Context thisContext=this;
    private Button BtnIniciar;
    private Button BtnDetener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton=(Button) findViewById(R.id.button);
        boton.setOnClickListener(this);

        BtnIniciar=(Button) findViewById(R.id.BtnIniciar);
        BtnDetener=(Button) findViewById(R.id.BtnDetener);


        BtnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    onClickListenerBtnIniciar(view);
            }
        });
        BtnDetener.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    onClickListenerBtnDetener(view);
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                Intent intent = new Intent(this,Main2Activity.class);
                startActivity(intent);
                break;

             default:
                 break;
        }
    }
    private void onClickListenerBtnIniciar(View v){
        startService(new Intent(thisContext,Servicio.class));
    }
    private void onClickListenerBtnDetener(View v){
        stopService(new Intent(thisContext,Servicio.class));
    }
}
