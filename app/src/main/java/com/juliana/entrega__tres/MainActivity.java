package com.juliana.entrega__tres;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    private List<Usuario> mLista = new ArrayList<>();
    ListAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = findViewById(R.id.listView);


        mLista.add(new Usuario("Marcela","marcela.15@gmail.com",
                "¡Te esperamos hoy en el evento para inaugurar el nuevo restaurante!","8:30am",R.drawable.perfil1));
        mLista.add(new Usuario("Camilo","camilo.67@gmail.com",
                "Documento de Autorizacion y tratamiento de datos","10:00am",R.drawable.perfil2));
        mLista.add(new Usuario("Silvia","silvia.32@gmail.com",
                "¡Aprovecha! Jueves de vacantes","10:15am",R.drawable.perfil3));
        mLista.add(new Usuario("Gregorio","gregorio.88@gmail.com",
                "NOTICIA:Inauguro mi nuevo...","11:45am",R.drawable.perfil4));
        mLista.add(new Usuario("Luisa","luisa.73@gmail.com",
                "¡Llegó tu material de estudio de la clase de ayer!","12:00pm",R.drawable.perfil5));
        mLista.add(new Usuario("Yeison","yeison.04@gmail.com",
                "Hola...Sabias que tienes cupones de descuento por redimir en H&M","4:00pm",R.drawable.perfil6));
        mLista.add(new Usuario("Monica","monica.99@gmail.com",
                "¡Estamos en vivo para la clase de pronombres posesivos!","6:00pm",R.drawable.perfil7));
        mLista.add(new Usuario("Diana","diana.11@gmail.com",
                "¡Ha llegado la hora de hablar sobre la entrevista de trabajo!","6:50pm",R.drawable.perfil8));

        mAdapter= new ListAdapter (MainActivity.this,R.layout.item_row,mLista);
        mListView.setAdapter(mAdapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Estas leyendo el correo # "+position, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("nombre", mAdapter.getItem(position).getNombre());
                intent.putExtra("correo", mAdapter.getItem(position).getCorreo());
                intent.putExtra("mensaje", mAdapter.getItem(position).getMensaje());
                intent.putExtra("hora", mAdapter.getItem(position).getHora());
                intent.putExtra("imagen", mAdapter.getItem(position).getImagen());
                startActivity(intent);
            }

        });



    }


}