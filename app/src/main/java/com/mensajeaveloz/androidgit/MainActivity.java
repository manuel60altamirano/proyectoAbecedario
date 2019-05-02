package com.mensajeaveloz.androidgit;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button boton;
    private Context thisContext=this;
    private Button BtnIniciar;
    private Button BtnDetener;
    String JSON_STRING = "{\"usuario\":{\"nombre\":\"Pedro Perez\",\"codigo\":65000}}";
    String nombre, codigo;
    TextView usuarioNombre, usuarioCodigo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Teniendo la informacion de json Carlos Almaraz
        usuarioNombre = (TextView) findViewById(R.id.nombre);
        usuarioCodigo = (TextView) findViewById(R.id.codigo);

        try {
            // Tomando JSONObject desde JSON archivo
            JSONObject obj = new JSONObject(JSON_STRING);
            JSONObject usuario = obj.getJSONObject("usuario");
            // poner nombre usuario y codigo
            usuario = usuario.getString("nombre");
            codigo = usuario.getString("codigo");
            // poner nombre y codigo en el  TextView's
            usuarioNombre.setText("Nombre: "+nombre);
            usuarioCodigo.setText("Codigo: "+codigo);

        } catch (JSONException e) {
            e.printStackTrace();
        }
        //codigo json usuario
        // Botonoes codigo
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
