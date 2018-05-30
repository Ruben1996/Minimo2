package com.example.ruben.examen_minimo2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class InfoArrayAdapter extends ArrayAdapter<Libro>{

    public InfoArrayAdapter(@NonNull Context context, List<Libro> resource) {
        super(context, 0,resource);
    }
/*
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Libro u = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.Descripcion_layout, parent, false);
        }
        Picasso.with(super.getContext()).load(u.getImage()).into((ImageView) convertView.findViewById(R.id.libro_image));
        TextView et = (TextView)convertView.findViewById(R.id.autor_txt);
        et.setText(u.getTitle());
        TextView ed = (TextView)convertView.findViewById(R.id.descripcion_txt);
        ed.setText(u.getTitle());
        TextView eh = (TextView)convertView.findViewById(R.id.titulo_txt);
        eh.setText(u.getTitle());
        return convertView;
    }
    */
}

