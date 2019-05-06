package com.mensajeaveloz.androidgit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Usuario {

    @GET("usuarios.php")
    Call<List<web_in>> getUsuario();
}

