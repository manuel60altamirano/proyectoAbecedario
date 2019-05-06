package com.mensajeaveloz.androidgit;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class usAdapter extends RecyclerView.Adapter<usAdapter.UsuariosViewHolder>{
    public List<web_in> UsuarioLista;

    public usAdapter(List<web_in> lista){
        this.UsuarioLista = lista;
    }

    @Override
    public UsuariosViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.usuario_row,parent,false);
        return new UsuariosViewHolder(v);
    }

    @Override
    public void onBindViewHolder(UsuariosViewHolder holder, int posicion) {
        holder.bUser(UsuarioLista.get(posicion));
    }

    @Override
    public int getItemCount() {
        return UsuarioLista.size();
    }

    public class UsuariosViewHolder extends RecyclerView.ViewHolder{

        TextView vieUs;
        TextView vieCod;
        public UsuariosViewHolder(View itemView) {
            super(itemView);
            vieUs = (TextView) itemView.findViewById(R.id.vieUs);
            vieCod = (TextView) itemView.findViewById(R.id.vieCod);
        }
        public void bUser(web_in usuario){
            String nombre;
            nombre = usuario.getNombre();
            vieUs.setText(nombre);
            vieCod.setText(String.valueOf(usuario.getCodigo()));
        }
    }
}

