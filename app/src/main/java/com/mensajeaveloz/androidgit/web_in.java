package com.mensajeaveloz.androidgit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class web_in {

    @SerializedName("codigo")
    @Expose
    private Integer codigo;
    @SerializedName("nombre")
    @Expose
    private String nombre;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}