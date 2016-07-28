package com.jamc0011.courserasemana3.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.GridLayoutManager;
import com.jamc0011.courserasemana3.R;
import com.jamc0011.courserasemana3.adapter.PerroAdapter;
import com.jamc0011.courserasemana3.pojo.Perro;

import java.util.ArrayList;

/**
 * Created by jamc0011 on 26/07/2016.
 */
public class PerfilFragment extends Fragment{
    ArrayList<Perro> perros;
    private RecyclerView listaPerros;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_perfil, container, false);

        listaPerros = (RecyclerView) v.findViewById(R.id.recyclerViewMascotasDos);



        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        listaPerros.setLayoutManager(staggeredGridLayoutManager);
        inicializarListaDePerrosDos();
        inicializarAdapterDos();

        return v;
    }


    public void inicializarListaDePerrosDos(){

        perros = new ArrayList<Perro>();


        perros.add(new Perro("Diente","4", R.drawable.perro2));
        perros.add(new Perro("Canela","4.5", R.drawable.perro3));
        perros.add(new Perro("Chispa","3", R.drawable.perro4));
        perros.add(new Perro("Lucky","3", R.drawable.perro6));
        perros.add(new Perro("Juno","3", R.drawable.perro7));
        perros.add(new Perro("Pepe","4.2", R.drawable.perro8));
        perros.add(new Perro("Dina","5", R.drawable.perro1));
        perros.add(new Perro("Diente","4", R.drawable.perro2));
        perros.add(new Perro("Canela","4.5", R.drawable.perro3));
        perros.add(new Perro("Chispa","3", R.drawable.perro4));
        perros.add(new Perro("Lucky","3", R.drawable.perro6));
        perros.add(new Perro("Juno","3", R.drawable.perro7));
        perros.add(new Perro("Pepe","4.2", R.drawable.perro8));
        perros.add(new Perro("Buzz","4.6", R.drawable.perro9));



    }

    //Metodo para inicializar el adaptador

    public void inicializarAdapterDos(){
        PerroAdapter perroAdapter = new PerroAdapter(perros, getActivity());
        listaPerros.setAdapter(perroAdapter);
    }

}
