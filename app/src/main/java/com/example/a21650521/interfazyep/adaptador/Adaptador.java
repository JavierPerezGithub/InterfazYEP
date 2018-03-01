package com.example.a21650521.interfazyep.adaptador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.javier.apppalexamen.R;
import com.example.javier.apppalexamen.model.Lobo;

import java.util.ArrayList;

/**
 * Created by Javier on 28/02/2018.
 */

public class Adaptador extends BaseAdapter {
    private Context context;
    private int idLayout;
    private ArrayList<Object> lista;

    public Adaptador(Context context, int idLayout, ArrayList<Object> lista) {
        this.context = context;
        this.idLayout = idLayout;
        this.lista = lista;
    }

    //Clase privada Item para definir el contenido al mostrar la lista
    private class Item{
        TextView raza;
    }
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int i) {
        return lista.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Item elemento;
        if(view == null){
            view = LayoutInflater.from(context).inflate(idLayout,null);
            elemento = new Item();
            elemento.element = view.findViewById(R.id.tvNombre);
            view.setTag(elemento);
        }else
            elemento = (Item) view.getTag();
        elemento.element.setText(lista.get(i).getAlgo());

        return view;
    }
}
