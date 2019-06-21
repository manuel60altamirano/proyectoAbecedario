package com.mensajeaveloz.androidgit;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;
//Menu integrando CircleMenu creado por
//Luis Esteban Arteaga Vargas
//Anahi Quisbert Canaviri
public class MainActivity extends AppCompatActivity {
    //DIALOG ALERT, SI-NO, Realizado por: Jorge Luis Huarachi Mamani
    public void onBackPressed() {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setMessage("Quieres salir de la aplicacion?");
        builder.setTitle("ABECEDARIO");
        builder.setPositiveButton("SI", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog dialog=builder.create();
        dialog.show();
    }
    //FIN DIALOG ALERT SI-NO
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CircleMenu circleMenu = findViewById(R.id.circlemenu);
        final String[] menus={
                "LETRAS",
                "NUMEROS",
                "SENTIDOS"
        };

        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"), R.drawable.ic_action_name, R.drawable.ic_cancel)
                .addSubMenu(Color.parseColor("#258CFF"), R.drawable.adcd)
                .addSubMenu(Color.parseColor("#30A400"), R.drawable.num)
                .addSubMenu(Color.parseColor("#FF4B32"), R.mipmap.ic_sentidos)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int i) {

                        if(i==1)
                        {
                            Intent intent = new Intent(MainActivity.this, Numeros.class);
                            startActivity(intent);
                        }
                        if(i==0)
                        {
                            //intent a letras
                           /* Intent intent = new Intent(MainActivity.this, Numeros.class);
                            startActivity(intent);*/
                        }
                        if(i==2)
                        {
                            //intent a sentidos
                           Intent intent = new Intent(MainActivity.this, Sentidos.class);
                            startActivity(intent);
                        }
                    }
                });
    }
}
