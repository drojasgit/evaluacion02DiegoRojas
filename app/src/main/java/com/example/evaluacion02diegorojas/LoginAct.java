package com.example.evaluacion02diegorojas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Esta es la clase principal que representa el login a Sura
 * @author Diego Rojas
 * @version 1.0.0
 */
public class LoginAct extends AppCompatActivity {

    private EditText editUsuario, editContrasena;
    private TextView textError;

    /**
     * Método onCreate
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Capturación del valor de las credenciales
        editUsuario = (EditText)findViewById(R.id.etUsuario);
        editContrasena = (EditText)findViewById(R.id.etContrasena);
        textError = (TextView)findViewById(R.id.tvError);
    }

    /**
     * Este método permite validar e ingresar al portal de Sura
     * @param view
     */
    public void ingresar(View view){

        if (editUsuario.getText().toString().equals("Alan") && editContrasena.getText().toString().equals("123"))
        {
            Intent intent = new Intent(this, MenuAct.class);
            intent.putExtra("pass", editContrasena.getText().toString());
            startActivity(intent);
        }
        else {
            textError.setText("El nombre o la contraseña son incorrectos.");
        }
    }

    /**
     * Método que permite cerrar la aplicación
     * @param view
     */
    public void salir(View view){
        finish();
    }
}
