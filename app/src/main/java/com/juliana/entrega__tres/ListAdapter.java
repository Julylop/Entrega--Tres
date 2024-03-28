package com.juliana.entrega__tres;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ListAdapter extends ArrayAdapter<Usuario> {

    private List<Usuario> mylist;
    private Context mContext;
    private  int resourseLayout;
    public ListAdapter(@NonNull Context context, int resource, List<Usuario> objects) {
        super(context, resource, objects);
        this.mylist = objects;
        this.mContext= context;
        this.resourseLayout= resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;


        if (view == null)
            view = LayoutInflater.from(mContext).inflate(resourseLayout, null);


        Usuario usuario = mylist.get(position);

        ImageView imagen= view.findViewById(R.id.Imagen_perfil);
        imagen.setImageResource(usuario.getImagen());

        TextView nombre = view.findViewById(R.id.Nombre);
        nombre.setText(usuario.getNombre());

        TextView correo = view.findViewById(R.id.Correo);
        correo.setText(usuario.getCorreo());

        TextView hora = view.findViewById(R.id.Hora);
        hora.setText(usuario.getHora());

        TextView mensaje = view.findViewById(R.id.Mensaje);
        mensaje.setText(usuario.getMensaje());






        return view;
    }
}
