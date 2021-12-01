package com.example.appregistro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private RadioGroup grupo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grupo = (RadioGroup) findViewById(R.id.radioGSexo);
    }

    public void sendInfo(View view) {
        String sexo = "No selecionado";
        Intent intent = new Intent(MainActivity.this, informacion.class);

        try {
            // Selecionando los input
            EditText txtNombre = (EditText) findViewById(R.id.txtNombre);
            if (grupo.getCheckedRadioButtonId() == R.id.radioM) {
                sexo = "Masculino";
            } else {
                sexo = "Femenino";
            }
            EditText txtNacimiento = (EditText) findViewById(R.id.txtNacimiento);
            EditText txtPhone = (EditText) findViewById(R.id.txtPhone);

            // Formato para enviar información
            Bundle b = new Bundle();
            b.putString("nombre", txtNombre.getText().toString());
            b.putString("sexo", sexo);
            b.putString("nacimiento", txtNacimiento.getText().toString());
            b.putString("telefono", txtPhone.getText().toString());

            intent.putExtras(b);

            startActivity(intent);
        } catch (Exception e) {
            System.out.println("Error main activity: " + e);
        }


    }
}