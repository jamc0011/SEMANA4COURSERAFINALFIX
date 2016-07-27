package com.jamc0011.courserasemana3.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.jamc0011.courserasemana3.pojo.Perro;
import com.jamc0011.courserasemana3.R;

import java.util.ArrayList;


public class PerroAdapter extends RecyclerView.Adapter<PerroAdapter.PerroViewHolder>{
    ArrayList<Perro>      perros;
    Activity              activity;

    public PerroAdapter(ArrayList<Perro> perros, Activity activity) {
        this.perros = perros;
        this.activity = activity;
    }

    @Override
    public PerroViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.carview_perro, parent, false);
        return new PerroViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PerroViewHolder perroViewHolder, int position) {
        final Perro perro = perros.get(position);

        perroViewHolder.imageViewFoto.setImageResource(perro.getFoto());
        perroViewHolder.textViewNombre.setText(perro.getNombre());
        perroViewHolder.textViewFavorito.setText(perro.getFavorito());

        perroViewHolder.imagenButtonFavorito.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(activity, "Me gusta " + perro.getNombre(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return perros.size();
    }

    public static class PerroViewHolder extends RecyclerView.ViewHolder {

        private ImageView       imageViewFoto;
        private ImageButton     imagenButtonFavorito;
        private TextView        textViewNombre;
        private TextView        textViewFavorito;

        public PerroViewHolder(View itemView){
            super(itemView);
            imageViewFoto=(ImageView) itemView.findViewById(R.id.imageViewFotoPerroCardView);
            imagenButtonFavorito= (ImageButton) itemView.findViewById(R.id.imagenButtonFavoritosCardView);
            textViewNombre=(TextView) itemView.findViewById(R.id.textViewNombrePerroCardView);
            textViewFavorito= (TextView) itemView.findViewById(R.id.textViewFavoritoCardView);
        }
    }
}
