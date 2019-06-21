//REALIZADO POR: JORGE LUIS HUARACHI MAMANI
package com.mensajeaveloz.androidgit;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class Sentidos extends AppCompatActivity {
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sentidos);

        ViewPager viewPager=findViewById(R.id.viewPager);
        ImageAdapter adapter = new ImageAdapter(this);
        viewPager.setAdapter(adapter);

    }
}
