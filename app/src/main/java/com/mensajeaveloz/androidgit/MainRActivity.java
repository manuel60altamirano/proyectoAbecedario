package com.mensajeaveloz.androidgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainRActivity extends AppCompatActivity {

    private final String base_Url = ("http://192.168.0.10:8000/");
    RecyclerView rvUsuarios;

    List<web_in> ListaUsuarios = new ArrayList<>();
    usAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retro_main);
        iniciarControles();

        Retrofit retrofit = new Retrofit.Builder().baseUrl(base_Url).addConverterFactory(GsonConverterFactory.create()).build();

        LinearLayoutManager ln = new LinearLayoutManager(getApplicationContext());
        rvUsuarios.setLayoutManager(ln);

        adapter = new usAdapter(ListaUsuarios);
        rvUsuarios.setAdapter(adapter);

        DividerItemDecoration itemDecoration = new DividerItemDecoration(rvUsuarios.getContext(),ln.getOrientation());
        rvUsuarios.addItemDecoration(itemDecoration);

        Usuario usuario  = retrofit.create(Usuario.class);
        Call<List<web_in>> Lista= usuario.getUsuario();

        Lista.enqueue(new Callback<List<web_in>>() {
            @Override
            public void onResponse(Call<List<web_in>> call, Response<List<web_in>> response) {
                if (response.isSuccessful()){
                    ListaUsuarios = response.body();
                    adapter = new usAdapter(ListaUsuarios);
                    rvUsuarios.setAdapter(adapter);
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<List<web_in>> call, Throwable t) {

            }
        });
        iniciarControles();
    }
    private void iniciarControles(){
        rvUsuarios = (RecyclerView) findViewById(R.id.rvUsuarios);
    }
}

