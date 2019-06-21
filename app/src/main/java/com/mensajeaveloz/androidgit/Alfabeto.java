package com.mensajeaveloz.androidgit;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Alfabeto extends AppCompatActivity {


    Button adelante,atras;
    TextView textMa, textMi ,nombre;
    ImageView foto;
    int contador = 0;

    boolean inicio = true;

    String[]mayu={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    String[]minu={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alf);
        ///texto
        textMa = (TextView)findViewById(R.id.may);
        textMi = (TextView)findViewById(R.id.min);
        ///nombre
        nombre = findViewById(R.id.nom);
        ///botones
        adelante = (Button) findViewById(R.id.ade);
        atras = (Button) findViewById(R.id.atr);
        ///imagen
        foto = findViewById(R.id.imageView);

        adelante.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (contador<27 && inicio){
                    //textMa.setText(mayu[contador]);textMi.setText(minu[contador]);
                    switch (contador){
                        case 0: foto.setImageResource(R.drawable.arbol); nombre.setText("Arbol");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 1: foto.setImageResource(R.drawable.bota); nombre.setText("Bota");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 2: foto.setImageResource(R.drawable.conejo); nombre.setText("Conejo");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 3: foto.setImageResource(R.drawable.dedos); nombre.setText("Dedos");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 4: foto.setImageResource(R.drawable.elefante); nombre.setText("Elefante");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 5: foto.setImageResource(R.drawable.flor); nombre.setText("Flor");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 6: foto.setImageResource(R.drawable.gato); nombre.setText("Gato");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 7: foto.setImageResource(R.drawable.helado); nombre.setText("Helado");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 8: foto.setImageResource(R.drawable.iglesia); nombre.setText("Iglesia");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 9: foto.setImageResource(R.drawable.jirafa); nombre.setText("Jirafa");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 10: foto.setImageResource(R.drawable.koala); nombre.setText("Koala");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 11: foto.setImageResource(R.drawable.luna); nombre.setText("Luna");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 12: foto.setImageResource(R.drawable.motocicleta); nombre.setText("Motocicleta");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 13: foto.setImageResource(R.drawable.nube); nombre.setText("Nube");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 14: foto.setImageResource(R.drawable.nandu); nombre.setText("Ñandu");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 15: foto.setImageResource(R.drawable.oso); nombre.setText("Oso");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 16: foto.setImageResource(R.drawable.pato); nombre.setText("Pato");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 17: foto.setImageResource(R.drawable.quico); nombre.setText("Quico");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 18: foto.setImageResource(R.drawable.raton); nombre.setText("Ratón");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 19: foto.setImageResource(R.drawable.sapo); nombre.setText("Sapo");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 20: foto.setImageResource(R.drawable.taza); nombre.setText("Taza");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 21: foto.setImageResource(R.drawable.uva); nombre.setText("Uva");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 22: foto.setImageResource(R.drawable.vaca); nombre.setText("Vaca");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 23: foto.setImageResource(R.drawable.wafle); nombre.setText("Wafles");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 24: foto.setImageResource(R.drawable.xilofono); nombre.setText("Xilofono");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 25: foto.setImageResource(R.drawable.yoyo); nombre.setText("Yoyo");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 26: foto.setImageResource(R.drawable.zapato); nombre.setText("Zapato");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;

                        default: foto.setImageResource(R.drawable.zapato); textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                    }
                    contador++;
                }else{
                    if (contador>27){
                        contador=26;
                        textMa.setText(mayu[contador]);
                        textMi.setText(minu[contador]);
                        foto.setImageResource(R.drawable.zapato);
                        nombre.setText("Zapato");
                    }else{
                        contador=0;
                        textMa.setText(mayu[contador]);
                        textMi.setText(minu[contador]);
                        foto.setImageResource(R.drawable.arbol);
                        nombre.setText("arbol");
                    }

                }
            }
        });
        atras.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (contador>0 && inicio){
                    //textMa.setText(mayu[contador]);textMi.setText(minu[contador]);
                    switch (contador){
                        case 0: foto.setImageResource(R.drawable.arbol); nombre.setText("Arbol");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 1: foto.setImageResource(R.drawable.bota); nombre.setText("Bota");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 2: foto.setImageResource(R.drawable.conejo); nombre.setText("Conejo");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 3: foto.setImageResource(R.drawable.dedos); nombre.setText("Dedos");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 4: foto.setImageResource(R.drawable.elefante); nombre.setText("Elefante");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 5: foto.setImageResource(R.drawable.flor); nombre.setText("Flor");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 6: foto.setImageResource(R.drawable.gato); nombre.setText("Gato");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 7: foto.setImageResource(R.drawable.helado); nombre.setText("Helado");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 8: foto.setImageResource(R.drawable.iglesia); nombre.setText("Iglesia");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 9: foto.setImageResource(R.drawable.jirafa); nombre.setText("Jirafa");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 10: foto.setImageResource(R.drawable.koala); nombre.setText("Koala");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 11: foto.setImageResource(R.drawable.luna); nombre.setText("Luna");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 12: foto.setImageResource(R.drawable.motocicleta); nombre.setText("Motocicleta");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 13: foto.setImageResource(R.drawable.nube); nombre.setText("Nube");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 14: foto.setImageResource(R.drawable.nandu); nombre.setText("Ñandu");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 15: foto.setImageResource(R.drawable.oso); nombre.setText("Oso");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 16: foto.setImageResource(R.drawable.pato); nombre.setText("Pato");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 17: foto.setImageResource(R.drawable.quico); nombre.setText("Quico");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 18: foto.setImageResource(R.drawable.raton); nombre.setText("Ratón");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 19: foto.setImageResource(R.drawable.sapo); nombre.setText("Sapo");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 20: foto.setImageResource(R.drawable.taza); nombre.setText("Taza");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 21: foto.setImageResource(R.drawable.uva); nombre.setText("Uva");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 22: foto.setImageResource(R.drawable.vaca); nombre.setText("Vaca");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 23: foto.setImageResource(R.drawable.wafle); nombre.setText("Wafles");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 24: foto.setImageResource(R.drawable.xilofono); nombre.setText("Xilofono");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 25: foto.setImageResource(R.drawable.yoyo); nombre.setText("Yoyo");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                        case 26: foto.setImageResource(R.drawable.zapato); nombre.setText("Zapato");textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;

                        default: foto.setImageResource(R.drawable.zapato); textMa.setText(mayu[contador]);textMi.setText(minu[contador]);break;
                    }
                    contador--;
                }else {
                    if (contador==0){
                        textMa.setText(mayu[contador]);
                        textMi.setText(minu[contador]);
                        foto.setImageResource(R.drawable.arbol);
                        nombre.setText("arbol");
                    }
                    else{
                        contador=0;
                        textMa.setText(mayu[contador]);
                        textMi.setText(minu[contador]);
                        foto.setImageResource(R.drawable.arbol);
                        nombre.setText("arbol");
                    }
                }
            }
        });

    }
}
