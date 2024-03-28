package com.juliana.entrega__tres;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        TextView name =findViewById(R.id.nombre_relativo);
        name.setText(getIntent().getStringExtra("nombre"));

        TextView email =findViewById(R.id.correo_relativo);
        email.setText(getIntent().getStringExtra("correo"));

        TextView message =findViewById(R.id.mensaje_relativo);
        message.setText(getIntent().getStringExtra("mensaje"));

        TextView hora =findViewById(R.id.Hora);
        hora.setText(getIntent().getStringExtra("hora"));

        ImageView imagen= findViewById(R.id.perfil_Imagen);
        imagen.setImageResource(getIntent().getIntExtra("imagen",R.drawable.perfil1));
    }
}