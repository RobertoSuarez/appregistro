package com.example.appregistro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class informacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);

        try {
            Bundle bundle = this.getIntent().getExtras();

            TextView txtNombre = (TextView)findViewById(R.id.textNombre);
            txtNombre.setText(bundle.getString("nombre"));

            TextView txtSexo = (TextView)findViewById(R.id.textGenero);
            txtSexo.setText(bundle.getString("sexo"));

            TextView txtNacimiento = (TextView)findViewById(R.id.txtNacimientob);
            txtNacimiento.setText(bundle.getString("nacimiento"));

            TextView txtTelefono = (TextView)findViewById(R.id.txtTelefono);
            txtTelefono.setText(bundle.getString("telefono"));
        } catch (Exception e) {
            System.out.println("Error en información" + e);
        }


    }
}